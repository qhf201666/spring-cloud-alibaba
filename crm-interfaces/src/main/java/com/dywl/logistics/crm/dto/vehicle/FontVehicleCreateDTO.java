package com.dywl.logistics.crm.dto.vehicle;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 创建车辆
 * @author 任雪龙
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FontVehicleCreateDTO implements Serializable {

    /**
     * 车牌号
     */
    private String vehicleNo;

    /**
     * 车型
     */
    private String vehicleType;

    /**
     * 载重
     */
    private String vehicleLoad;

    /**
     * 长度
     */
    private String vehicleLen;

    /**
     * 所有人姓名
     */
    private String owner;

    /**
     * 道路运输证号
     */
    private String transCard;

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
