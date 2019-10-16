package com.dywl.logistics.crm.dto.shipper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class ShipperCompanyContractDTO implements Serializable {

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
     * 合同名称
     */
    private String cName;

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
     * 合同文档id
     */
    private Long contractsId;

    /**
     * 合同id
     */
    private Long contractId;

    /**
     * 文档
     */
    private String doc;
    /**
     * 合同图片地址list集合
     */
    private List<String> imageids;



}
