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
 * 司机信息
 * </p>
 *
 * @author 陈世峰
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("crm_driver")
public class Driver implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
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
     * 是否删除
     */
    private Boolean del;


    public static final String ID = "id";

    public static final String DRIVER_TEL = "driver_tel";

    public static final String DRIVER_NAME = "driver_name";

    public static final String CONTACTS_TEL = "contacts_tel";

    public static final String IDCARD = "idcard";

    public static final String REG_TIME = "reg_time";

    public static final String REAL_TIME = "real_time";

    public static final String REAL_VERIFY_TIME = "real_verify_time";

    public static final String REAL_STATUS = "real_status";

    public static final String VERIFY_TIME = "verify_time";

    public static final String VERIFY_UID = "verify_uid";

    public static final String VERIFY_UNAME = "verify_uname";

    public static final String VERIFY_STATUS = "verify_status";

    public static final String ENABLED = "enabled";

    public static final String BLACK = "black";

    public static final String BLACK_TIME = "black_time";

    public static final String BLACK_UID = "black_uid";

    public static final String BLACK_UNAME = "black_uname";

    public static final String CREATE_UID = "create_uid";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_UID = "update_uid";

    public static final String UPDATE_TIME = "update_time";

    public static final String DEL = "del";

}
