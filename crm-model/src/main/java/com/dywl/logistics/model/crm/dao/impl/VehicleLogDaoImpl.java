package com.dywl.logistics.model.crm.dao.impl;

import com.dywl.logistics.model.crm.entity.VehicleLog;
import com.dywl.logistics.model.crm.mapper.VehicleLogMapper;
import com.dywl.logistics.model.crm.dao.IVehicleLogDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 车辆操作日志 服务实现类
 * </p>
 *
 * @author 陈世峰
 * @since 2019-10-15
 */
@Service
public class VehicleLogDaoImpl extends ServiceImpl<VehicleLogMapper, VehicleLog> implements IVehicleLogDao {

}
