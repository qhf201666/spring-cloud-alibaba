package com.dywl.logistics.crm.dto.vehicle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rxl
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDriverDTO {

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
     * 是否启用
     */
    private Boolean enabled;
}
