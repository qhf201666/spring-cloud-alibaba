package com.dywl.logistics.model.crm.dao.impl.vehicle;

import com.dywl.logistics.model.crm.entity.vehicle.Vehicle;
import com.dywl.logistics.model.crm.mapper.vehicle.VehicleMapper;
import com.dywl.logistics.model.crm.dao.vehicle.IVehicleDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车辆信息 服务实现类
 * </p>
 *
 * @author 任雪龙
 * @since 2019-10-15
 */
@Service
public class VehicleDaoImpl extends ServiceImpl<VehicleMapper, Vehicle> implements IVehicleDao {

}
