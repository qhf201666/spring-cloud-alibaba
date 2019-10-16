package com.dywl.logistics.crm.dto.broker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 窦洋洋
 * @date 2019-10-16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BrokerQueryDTO implements Serializable {

    private Long id;
    /**
     * 车主手机号
     */
    private String brokerTel;

    /**
     * 车主姓名
     */
    private String brokerName;

}
