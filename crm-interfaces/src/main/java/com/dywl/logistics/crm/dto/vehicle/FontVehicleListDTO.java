package com.dywl.logistics.crm.dto.vehicle;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 前台车辆列表
 * @author 任雪龙
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FontVehicleListDTO implements Serializable {

    /**
     * id
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
     * 车辆照片
     */
    private String carImg;

    /**
     * 出车次数
     */
    private Long billNum;

    /**
     * 车辆空闲状态
     */
    private Byte isFree;


}
