package com.dywl.logistics.model.crm.dao.impl.driver;

import com.dywl.logistics.model.crm.entity.driver.Driver;
import com.dywl.logistics.model.crm.mapper.driver.DriverMapper;
import com.dywl.logistics.model.crm.dao.driver.IDriverDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 司机信息 服务实现类
 * </p>
 *
 * @author 任雪龙
 * @since 2019-10-15
 */
@Service
public class DriverDaoImpl extends ServiceImpl<DriverMapper, Driver> implements IDriverDao {

}
