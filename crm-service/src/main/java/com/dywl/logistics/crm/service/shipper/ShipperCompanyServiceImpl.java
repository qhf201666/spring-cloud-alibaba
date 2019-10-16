package com.dywl.logistics.crm.service.shipper;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dywl.base.BasePageDTO;
import com.dywl.base.BaseUserDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.base.web.Message;
import com.dywl.logistics.crm.dto.shipper.ShipperCompanyContractDTO;
import com.dywl.logistics.crm.dto.shipper.ShipperCompanyQueryDTO;
import com.dywl.logistics.crm.interfaces.shipper.IShipperCompanyService;
import com.dywl.logistics.model.crm.dao.shipper.IShipperCompanyDao;
import com.dywl.logistics.model.crm.entity.shipper.ShipperCompany;
import com.dywl.utils.BeanUtil;
import com.dywl.utils.StringUtil;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * 货主公司
 * @author 乔海峰
 * @description returnFilter 是对结果进行处理
 */
@Slf4j
@Service(filter = {"resultFilter"})
public class ShipperCompanyServiceImpl implements IShipperCompanyService {
    @Autowired
    IShipperCompanyDao shipperCompanyDao;

    @Override
    public ResponseDTO<ShipperCompanyContractDTO> pageList(BasePageDTO pageDTO,
        ShipperCompanyQueryDTO pageQueryDTO) {
        if (pageDTO == null || pageQueryDTO == null) {
            log.info("[ShipperCompanyServiceImpl] pageList params is null, return empty.");

        }
        log.info("[ShipperCompanyServiceImpl] pageList start. BasePageDTO = {}, OrderQueryDTO = {}",
            JSON.toJSONString(pageDTO), JSON.toJSONString(pageQueryDTO));

        Page<ShipperCompany> page = new Page<ShipperCompany>(pageDTO.getPageIndex(), pageDTO.getPageSize());

        Map<String, Object> params = new HashMap<>();
        //todo 转换?
        if (StringUtil.isNotEmpty(pageQueryDTO.getName())) {

        }

        log.info("[ShipperCompanyServiceImpl] pageList query params = {}", JSON.toJSONString(params));
        IPage<ShipperCompany> result = shipperCompanyDao.page(page, new QueryWrapper<ShipperCompany>().allEq(params));
        //设备Total
        pageDTO.setTotal(result.getTotal());

        pageDTO.setList(BeanUtil.beanCopyPropertiesForList(result.getRecords(), ShipperCompanyContractDTO.class));
 //       return ResponseDTO.success();
        return null;
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public ResponseDTO<ShipperCompanyContractDTO> getShipperCompanyDetail(Long id) {
        ShipperCompany shipperCompany =  shipperCompanyDao.getById(id);

        return null;
    }

    @Override
    public ResponseDTO<Long> createShipperCompany(
        ShipperCompanyContractDTO shipperCompanyContractDTO,
        BaseUserDTO userDTO) {
        return null;
    }

    @Override
    public ResponseDTO<Long> updateShipperCompany(
        ShipperCompanyContractDTO shipperCompanyContractDTO,
        BaseUserDTO userDTO) {
        return null;
    }
}
