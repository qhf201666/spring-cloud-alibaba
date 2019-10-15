package com.dywl.logistics.model.crm.dao.impl.driver;

import com.dywl.logistics.model.crm.entity.driver.DriverLog;
import com.dywl.logistics.model.crm.mapper.driver.DriverLogMapper;
import com.dywl.logistics.model.crm.dao.driver.IDriverLogDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 司机操作日志 服务实现类
 * </p>
 *
 * @author 任雪龙
 * @since 2019-10-15
 */
@Service
public class DriverLogDaoImpl extends ServiceImpl<DriverLogMapper, DriverLog> implements IDriverLogDao {

}
