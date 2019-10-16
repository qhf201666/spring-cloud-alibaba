package com.dywl.logistics.crm.dto.vehicle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 后台修改车辆
 * @author rxl
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class VehicleUptDTO {

    /**
     * id 车辆id
     */
    private Long id;

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
     * 道路运输证
     */
    private String transCard;

    /**
     * 经营许可证号
     */
    private String busiNo;
}
