package com.dywl.logistics.crm.interfaces.broker;

import com.dywl.base.BasePageDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.logistics.crm.dto.broker.BrokerDTO;
import com.dywl.logistics.crm.dto.broker.BrokerQueryDTO;

/**
 * @author 窦洋洋
 * @date 2019-10-16
 */
public interface IBrokerService {

    /**
     * 车主注册
     *
     * @param brokerDTO 车主
     * @return 车主id
     */
    ResponseDTO<Long> createBroker(BrokerDTO brokerDTO);

    /**
     * 车主身份认证
     *
     * @param brokerDTO 车主
     * @return
     */
    ResponseDTO<Boolean> identityBroker(BrokerDTO brokerDTO);

    /**
     * 启用/禁用车主账号
     *
     * @param brokerDTO 车主
     * @return
     */
    ResponseDTO<Boolean> enabledBroker(BrokerDTO brokerDTO);

    /**
     * 加入黑名单
     *
     * @param brokerDTO 车主
     * @return
     */
    ResponseDTO<Boolean> blackBroker(BrokerDTO brokerDTO);

    /**
     * 审核
     *
     * @param brokerDTO 车主
     * @return
     */
    ResponseDTO<Boolean> verifyBroker(BrokerDTO brokerDTO);

    /**
     * 分页查询全部车主
     *
     * @param pageDTO 分页信息
     * @param brokerQueryDTO 查询条件
     * @return
     */
    ResponseDTO<BasePageDTO<BrokerDTO>> pageListBroker(BasePageDTO<?> pageDTO,BrokerQueryDTO brokerQueryDTO);

    /**
     * 车主详情
     *
     * @param brokerId
     * @param pageDTO 车主账号日志分页信息
     * @return
     */
    ResponseDTO<BrokerDTO> getBroker(Long brokerId,BasePageDTO<?> pageDTO);
}
