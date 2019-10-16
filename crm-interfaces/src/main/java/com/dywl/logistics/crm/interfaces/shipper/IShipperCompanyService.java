package com.dywl.logistics.crm.interfaces.shipper;


import com.dywl.base.BasePageDTO;
import com.dywl.base.BaseUserDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.logistics.crm.dto.shipper.ShipperCompanyContractDTO;
import com.dywl.logistics.crm.dto.shipper.ShipperCompanyQueryDTO;

/**
 * 货主公司接口
 * @author 乔海峰
 * @date 2019-10-15
 */
public interface IShipperCompanyService {

    /**
     * 分页查询
     *
     * @param pageDTO      分页信息
     * @param pageQueryDTO 查询条件和分页器
     * @return 分页信息和运单列表
     */
    ResponseDTO<ShipperCompanyContractDTO> pageList(BasePageDTO pageDTO, ShipperCompanyQueryDTO pageQueryDTO);

    /**
     * 获取货主公司详情
     *
     * @param id
     * @return 货主公司详情
     */
    ResponseDTO<ShipperCompanyContractDTO> getShipperCompanyDetail(Long id);


    /**
     * 创建货主公司
     *
     * @param shipperCompanyContractDTO 货主公司信息，合同信息
     * @param userDTO 当前用户
     * @return 货主公司id
     */
    ResponseDTO<Long> createShipperCompany(ShipperCompanyContractDTO shipperCompanyContractDTO, BaseUserDTO userDTO);


    /**
     * 创建货主公司
     *
     * @param shipperCompanyContractDTO 货主公司信息，合同信息
     * @param userDTO 当前用户
     * @return 货主公司id
     */
    ResponseDTO<Long> updateShipperCompany(ShipperCompanyContractDTO shipperCompanyContractDTO, BaseUserDTO userDTO);

}
