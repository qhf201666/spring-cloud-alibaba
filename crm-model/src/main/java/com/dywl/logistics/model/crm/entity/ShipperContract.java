package com.dywl.logistics.model.crm.entity;

import java.math.BigDecimal;
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
 * 货主合同
 * </p>
 *
 * @author 陈世峰
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("crm_shipper_contract")
public class ShipperContract implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 公司id
     */
    private Long coId;

    /**
     * 合同名称
     */
    private String name;

    /**
     * 服务税率
     */
    private BigDecimal serviceRate;

    /**
     * 是否自动签收
     */
    private Boolean autoSign;

    /**
     * 是否自动申请付款
     */
    private Boolean autoApply;

    /**
     * 是否轨迹校验
     */
    private Boolean checkTrack;

    /**
     * 是否付款开票
     */
    private Boolean checkPay;

    /**
     * 油卡授信额度
     */
    private BigDecimal oilQuota;

    /**
     * 保险授信额度
     */
    private BigDecimal insQuota;

    /**
     * 是否强制购买保险
     */
    private Boolean buyIns;

    /**
     * 保险税率
     */
    private BigDecimal insRate;

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

    public static final String CO_ID = "co_id";

    public static final String NAME = "name";

    public static final String SERVICE_RATE = "service_rate";

    public static final String AUTO_SIGN = "auto_sign";

    public static final String AUTO_APPLY = "auto_apply";

    public static final String CHECK_TRACK = "check_track";

    public static final String CHECK_PAY = "check_pay";

    public static final String OIL_QUOTA = "oil_quota";

    public static final String INS_QUOTA = "ins_quota";

    public static final String BUY_INS = "buy_ins";

    public static final String INS_RATE = "ins_rate";

    public static final String CREATE_UID = "create_uid";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_UID = "update_uid";

    public static final String UPDATE_TIME = "update_time";

    public static final String DEL = "del";

}
