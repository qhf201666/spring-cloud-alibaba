package com.dywl.logistics.model.crm.dao.impl;

import com.dywl.logistics.model.crm.entity.WorkLog;
import com.dywl.logistics.model.crm.mapper.WorkLogMapper;
import com.dywl.logistics.model.crm.dao.IWorkLogDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工单操作日志 服务实现类
 * </p>
 *
 * @author 陈世峰
 * @since 2019-10-15
 */
@Service
public class WorkLogDaoImpl extends ServiceImpl<WorkLogMapper, WorkLog> implements IWorkLogDao {

}
