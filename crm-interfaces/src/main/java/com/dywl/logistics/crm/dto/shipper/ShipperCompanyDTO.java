package com.dywl.logistics.crm.dto.shipper;

import java.time.LocalDateTime;

public class ShipperCompanyDTO {
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

}
