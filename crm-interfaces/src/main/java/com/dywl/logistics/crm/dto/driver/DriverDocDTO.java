package com.dywl.logistics.crm.dto.driver;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 前台司机信息
 * @author rxl
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DriverDocDTO {

    /**
     * 文档id
     */
    private Long id;

    /**
     * 司机id
     */
    private Long driverId;

    /**
     * 驾驶证照片
     */
    private String licenseImg;

    /**
     * 身份证正面照片
     */
    private String fontCardImg;

    /**
     * 身份证反面照片
     */
    private String resCardImg;

}
