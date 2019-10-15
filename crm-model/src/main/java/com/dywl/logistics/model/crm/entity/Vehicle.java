package com.dywl.logistics.model.crm.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 车辆信息
 * </p>
 *
 * @author 陈世峰
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("crm_vehicle")
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
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


    public static final String ID = "id";

    public static final String VEHICLE_NO = "vehicle_no";

    public static final String VEHICLE_TYPE = "vehicle_type";

    public static final String VEHICLE_LOAD = "vehicle_load";

    public static final String VEHICLE_LEN = "vehicle_len";

    public static final String OWNER = "owner";

    public static final String OWNER_TEL = "owner_tel";

    public static final String TRANS_CARD = "trans_card";

    public static final String BUSI_NO = "busi_no";

    public static final String IDCARD = "idcard";

    public static final String VERIFY_TIME = "verify_time";

    public static final String VERIFY_UID = "verify_uid";

    public static final String VERIFY_UNAME = "verify_uname";

    public static final String VERIFY_STATUS = "verify_status";

    public static final String CREATE_UID = "create_uid";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_UID = "update_uid";

    public static final String UPDATE_TIME = "update_time";

    public static final String DEL = "del";

}
