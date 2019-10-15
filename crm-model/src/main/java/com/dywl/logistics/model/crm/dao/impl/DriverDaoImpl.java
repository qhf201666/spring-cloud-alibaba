package com.dywl.logistics.model.crm.dao.impl;

import com.dywl.logistics.model.crm.entity.Driver;
import com.dywl.logistics.model.crm.mapper.DriverMapper;
import com.dywl.logistics.model.crm.dao.IDriverDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 司机信息 服务实现类
 * </p>
 *
 * @author 陈世峰
 * @since 2019-10-15
 */
@Service
public class DriverDaoImpl extends ServiceImpl<DriverMapper, Driver> implements IDriverDao {

}
