package com.dywl.logistics.crm;

import com.dywl.base.BaseUserDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.logistics.crm.dto.VehicleDTO;
import java.util.List;

/**
 * @author 陈世峰
 * @date 2019-10-10
 */
public interface IVehicleService {


    /**
     * 创建车辆信息
     *
     * @param vehicleDTO 车辆信息
     * @return ID
     */
    ResponseDTO<Long> create(VehicleDTO vehicleDTO);

    /**
     * 批量 车辆信息
     *
     * @param ids     车辆信息Id列表
     * @param userDTO 用户信息
     * @return 运单Id
     */
    ResponseDTO<Boolean> deletes(List<Long> ids, BaseUserDTO userDTO);

    /**
     * 删除车辆信息
     *
     * @param id      车辆信息Id
     * @param userDTO 用户信息
     * @return 运单Id
     */
    ResponseDTO<Boolean> delete(Long id, BaseUserDTO userDTO);

}
