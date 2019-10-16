package com.dywl.logistics.crm.dto.broker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author 窦洋洋
 * @date 2019-10-16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BrokerDTO implements Serializable {

    private Long id;
    /**
     * 车主手机号
     */
    private String brokerTel;

    /**
     * 车主姓名
     */
    private String brokerName;

    /**
     * 负责人联系方式
     */
    private String contactsTel;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 注册时间
     */
    private LocalDateTime regTime;

    /**
     * 认证类型(1-企业，2-个人)
     */
    private Integer type;

    /**
     * 审核时间
     */
    private LocalDateTime verifyTime;

    /**
     * 审核人id
     */
    private Long verifyUid;

    /**
     * 审核人名称
     */
    private String verifyUname;

    /**
     * 审核状态(1-待审核，2-审核不通过，3-审核通过)
     */
    private Integer verifyStatus;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 是否黑名单
     */
    private Boolean black;

    /**
     * 加入黑名单时间
     */
    private LocalDateTime blackTime;

    /**
     * 加入黑名单人id
     */
    private Long blackUid;

    /**
     * 加入黑名单人名称
     */
    private String blackUname;

    /**
     * 创建人id
     */
    private Long createUid;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新人id
     */
    private Long updateUid;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 是否删除
     */
    private Boolean del;
}
