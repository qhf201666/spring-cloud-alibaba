package com.dywl.logistics.crm.interfaces.vehicle;

import com.dywl.base.BasePageDTO;
import com.dywl.base.BaseUserDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.logistics.crm.dto.vehicle.FontVehicleCreateDTO;
import com.dywl.logistics.crm.dto.vehicle.FontVehicleInfoDTO;
import com.dywl.logistics.crm.dto.vehicle.FontVehicleListDTO;
import com.dywl.logistics.crm.dto.vehicle.VehicleInfoDTO;
import com.dywl.logistics.crm.dto.vehicle.VehicleListDTO;
import com.dywl.logistics.crm.dto.vehicle.VehicleUptDTO;
import java.util.List;

/**
 * @author 任雪龙
 * @date 2019-10-15
 */
public interface IVehicleService {


    /**
     * 前台司机查询自己所有车辆
     * @param id 司机id
     * @return 车辆列表
     */
    ResponseDTO<BasePageDTO<FontVehicleListDTO>> findMyCars(Long id);

    /**
     * 前台查询车辆信息详情
     * @param id 车辆id
     * @return 车辆信息
     */
    ResponseDTO<FontVehicleInfoDTO> findOneCar(Long id);

    /**
     * 创建车辆信息
     * @param fontVehicleCreateDTO 车辆信息
     * @return 操作结果
     */
    ResponseDTO<Boolean> create(FontVehicleCreateDTO fontVehicleCreateDTO);

    /**
     * 删除车辆信息
     * @param id      车辆信息Id
     * @return 运单Id
     */
    ResponseDTO<Boolean> delete(Long id);

    /**
     * 后台分页查询车辆
     * @param vehicleListDTO 查询条件
     * @return 车辆列表
     */
    ResponseDTO<BasePageDTO<VehicleListDTO>> findAllCars(VehicleListDTO vehicleListDTO);

    /**
     * 后台查询单个车辆信息
     * @param id 车辆id
     * @return 车辆信息
     */
    ResponseDTO<VehicleInfoDTO> findOne(Long id);

    /**
     * 车辆审核
     * @param id 车辆id
     * @param flag 车辆是否通过审核
     * @return 操作结果
     */
    ResponseDTO<Boolean> adjustCar(Long id, Boolean flag);

    /**
     * 修改车辆信息
     * @param vehicleUptDTO 车辆信息
     * @return 修改结果
     */
    ResponseDTO<Boolean> uptCar(VehicleUptDTO vehicleUptDTO);

}
