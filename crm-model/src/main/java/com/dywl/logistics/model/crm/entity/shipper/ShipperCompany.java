package com.dywl.logistics.model.crm.entity.shipper;

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
 * 货主公司
 * </p>
 *
 * @author 乔海峰
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("crm_shipper_company")
public class ShipperCompany implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 统一社会信用代码
     */
    private String creditCode;

    /**
     * 公司地址
     */
    private String addr;

    /**
     * 公司详细地址
     */
    private String addrDetail;

    /**
     * 公司管理员姓名
     */
    private String adminName;

    /**
     * 公司管理员手机号
     */
    private String adminTel;

    /**
     * 受票方发票抬头
     */
    private String invoiceTitle;

    /**
     * 纳税人识别号
     */
    private String taxerId;

    /**
     * 电话
     */
    private String telepone;

    /**
     * 开户行
     */
    private String bank;

    /**
     * 账号
     */
    private String account;

    /**
     * 收件人姓名
     */
    private String receiver;

    /**
     * 收件人地址
     */
    private String receiverAddr;

    /**
     * 收件人手机
     */
    private String receiverTel;

    /**
     * 客户经理id
     */
    private Long customerId;

    /**
     * 客户经理电话
     */
    private String customerTel;

    /**
     * 客户经理名称
     */
    private String customerName;

    /**
     * 所属事业部id
     */
    private Long departId;

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

    public static final String NAME = "name";

    public static final String CREDIT_CODE = "credit_code";

    public static final String ADDR = "addr";

    public static final String ADDR_DETAIL = "addr_detail";

    public static final String ADMIN_NAME = "admin_name";

    public static final String ADMIN_TEL = "admin_tel";

    public static final String INVOICE_TITLE = "invoice_title";

    public static final String TAXER_ID = "taxer_id";

    public static final String TELEPONE = "telepone";

    public static final String BANK = "bank";

    public static final String ACCOUNT = "account";

    public static final String RECEIVER = "receiver";

    public static final String RECEIVER_ADDR = "receiver_addr";

    public static final String RECEIVER_TEL = "receiver_tel";

    public static final String CUSTOMER_ID = "customer_id";

    public static final String CUSTOMER_TEL = "customer_tel";

    public static final String CUSTOMER_NAME = "customer_name";

    public static final String DEPART_ID = "depart_id";

    public static final String CREATE_UID = "create_uid";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_UID = "update_uid";

    public static final String UPDATE_TIME = "update_time";

    public static final String DEL = "del";

}
