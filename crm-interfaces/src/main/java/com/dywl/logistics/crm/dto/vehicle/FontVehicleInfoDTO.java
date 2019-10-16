package com.dywl.logistics.crm.dto.vehicle;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 前台车辆详情
 * @author 任雪龙
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FontVehicleInfoDTO implements Serializable {

    /**
     * 车辆id
     */
    private Long id;

    /**
     * 行驶证照片
     */
    private String licenseImg;

    /**
     * 道路运输许可证照片
     */
    private String roadImg;

    /**
     * 车辆照片
     */
    private String carImg;
}
