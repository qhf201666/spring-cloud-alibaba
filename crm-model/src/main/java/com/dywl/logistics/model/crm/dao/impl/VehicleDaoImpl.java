package com.dywl.logistics.model.crm.dao.impl;

import com.dywl.logistics.model.crm.entity.Vehicle;
import com.dywl.logistics.model.crm.mapper.VehicleMapper;
import com.dywl.logistics.model.crm.dao.IVehicleDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车辆信息 服务实现类
 * </p>
 *
 * @author 陈世峰
 * @since 2019-10-15
 */
@Service
public class VehicleDaoImpl extends ServiceImpl<VehicleMapper, Vehicle> implements IVehicleDao {

}
