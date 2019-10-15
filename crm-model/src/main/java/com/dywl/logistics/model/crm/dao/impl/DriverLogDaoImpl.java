package com.dywl.logistics.model.crm.dao.impl;

import com.dywl.logistics.model.crm.entity.DriverLog;
import com.dywl.logistics.model.crm.mapper.DriverLogMapper;
import com.dywl.logistics.model.crm.dao.IDriverLogDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 司机操作日志 服务实现类
 * </p>
 *
 * @author 陈世峰
 * @since 2019-10-15
 */
@Service
public class DriverLogDaoImpl extends ServiceImpl<DriverLogMapper, DriverLog> implements IDriverLogDao {

}
