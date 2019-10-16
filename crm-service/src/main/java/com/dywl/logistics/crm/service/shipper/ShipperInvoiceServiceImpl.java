package com.dywl.logistics.crm.service.shipper;

import com.alibaba.fastjson.JSON;
import com.dywl.base.BaseUserDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.base.web.Message;
import com.dywl.logistics.crm.dto.shipper.ShipperInvoiceDTO;
import com.dywl.logistics.crm.interfaces.shipper.IShipperInvoiceService;
import com.dywl.logistics.model.crm.dao.shipper.IShipperInvoiceDao;
import com.dywl.logistics.model.crm.entity.shipper.ShipperInvoice;
import com.dywl.utils.BeanUtil;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * 货主开票公司
 * @author 乔海峰
 * @description returnFilter 是对结果进行处理
 */
@Slf4j
@Service(filter = {"resultFilter"})
public class ShipperInvoiceServiceImpl implements IShipperInvoiceService {
    @Autowired
    IShipperInvoiceDao shipperInvoiceDao;

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public ResponseDTO<Long> create(ShipperInvoiceDTO shipperInvoiceDTO) {
        log.info("[ShipperInvoiceServiceImpl] create start. params = {}", JSON.toJSONString(shipperInvoiceDTO));
        ShipperInvoice ShipperInvoice = BeanUtil.beanCopyProperties(shipperInvoiceDTO, ShipperInvoice.class);
        if (shipperInvoiceDao.save(ShipperInvoice)) {
            log.info("[ShipperInvoiceServiceImpl] create success. id = {}", ShipperInvoice.getId());

            return ResponseDTO.success(ShipperInvoice.getId());
        } else {
            log.error("[ShipperInvoiceServiceImpl] create fail.");
            return ResponseDTO.unsuccess(
                Message.builder().subCode("222222").message("shipperInvoice.add.fail").build(),
                ShipperInvoice.getId());
        }
    }

    @Override
    public ResponseDTO<Boolean> deletes(List<Long> ids, BaseUserDTO userDTO) {
        log.info("[ShipperInvoiceServiceImpl] deletes start. params = {}", JSON.toJSONString(ids));
        if (shipperInvoiceDao.removeByIds(ids)) {
            return ResponseDTO.success(true);
        } else {
            return ResponseDTO.unsuccess(
                Message.builder().subCode("111111").message("shipperInvoice.delete.fail").build(),
                false);
        }
    }

    @Override
    public ResponseDTO<Boolean> delete(Long id, BaseUserDTO userDTO) {
        log.info("[ShipperInvoiceServiceImpl] deletes start. params = {}", JSON.toJSONString(id));
        if (shipperInvoiceDao.removeById(id)) {
            return ResponseDTO.success(true);
        } else {
            return ResponseDTO.unsuccess(
                Message.builder().subCode("111111").message("shipperInvoice.delete.fail").build(),
                false);
        }
    }
}
