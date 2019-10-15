package com.dywl.logistics.crm.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

/**
 * @author 陈世峰
 */
@Data
@Builder
public class VehicleDTO implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 车牌号
     */
    private String vehicleNo;

    /**
     * 车型
     */
    private String vehicleType;

    /**
     * 载重
     */
    private String vehicleLoad;

    /**
     * 长度
     */
    private String vehicleLen;

    /**
     * 所有人姓名
     */
    private String owner;

    /**
     * 所有人联系方式
     */
    private String ownerTel;

    /**
     * 道路运输证
     */
    private String transCard;

    /**
     * 经营许可证号
     */
    private String busiNo;

    /**
     * 身份证号
     */
    private String idcard;

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
