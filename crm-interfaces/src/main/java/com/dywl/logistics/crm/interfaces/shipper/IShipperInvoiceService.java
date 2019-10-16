package com.dywl.logistics.crm.interfaces.shipper;

import com.dywl.base.BaseUserDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.logistics.crm.dto.shipper.ShipperInvoiceDTO;
import java.util.List;

/**
 * 货主开票公司接口
 * @author 乔海峰
 */
public interface IShipperInvoiceService {

    /**
     * 创建货主开票公司
     *
     * @param shipperInvoiceDTO 货主开票公司
     * @return ID
     */
    ResponseDTO<Long> create(ShipperInvoiceDTO shipperInvoiceDTO);

    /**
     * 批量 货主开票公司
     *
     * @param ids     货主开票公司Id列表
     * @param userDTO 用户信息
     * @return 运单Id
     */
    ResponseDTO<Boolean> deletes(List<Long> ids, BaseUserDTO userDTO);

    /**
     * 删除货主开票公司
     *
     * @param id      货主开票公司Id
     * @param userDTO 用户信息
     * @return 运单Id
     */
    ResponseDTO<Boolean> delete(Long id, BaseUserDTO userDTO);

}
