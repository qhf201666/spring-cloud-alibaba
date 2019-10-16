package com.dywl.logistics.crm.dto.driver;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 后台司机列表
 * @author rxl
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DriverListDTO implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 司机手机号
     */
    private String driverTel;

    /**
     * 司机姓名
     */
    private String driverName;

    /**
     * 联系方式
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
     * 实名认证时间
     */
    private LocalDateTime realTime;

    /**
     * 实名认证审核时间
     */
    private LocalDateTime realVerifyTime;

    /**
     * 实名认证状态(1-待校验，2-未通过，3-通过)
     */
    private Integer realStatus;

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
     * 绑定车辆数
     */
    private Long carNum;
}
