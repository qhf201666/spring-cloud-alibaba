package com.dywl.logistics.crm.dto.shipper;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author 乔海峰
 * 货主开票公司
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShipperInvoiceDTO implements Serializable {

    private Long id;

    /**
     * 公司id
     */
    private Long coId;

    /**
     * 名称
     */
    private String name;

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
