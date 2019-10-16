package com.dywl.logistics.crm.dto.shipper;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 乔海峰
 * 货主公司查询参数
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShipperCompanyQueryDTO implements Serializable {

    /**
     * 公司信息（公司名称/统一社会信用代码）
     */
    private String name;
    /**
     * 公司联系人（姓名/手机号）
     */
    private String adminName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 客户经理名称
     */
    private String customerName;

}
