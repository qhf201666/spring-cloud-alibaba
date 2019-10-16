package com.dywl.logistics.crm.dto.vehicle;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 后台车辆详情
 * @author 任雪龙
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehicleInfoDTO implements Serializable {

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
     * 所有人联系方式
     */
    private String ownerTel;

    /**
     * 道路运输证号
     */
    private String transCard;

    /**
     * 经营许可证号
     */
    private String busiNo;

    /**
     * 审核状态(1-待审核，2-审核不通过，3-审核通过)
     */
    private Integer verifyStatus;

    /**
     * 行驶证照片
     */
    private String licenseImg;

    /**
     * 道路运输许可证照片
     */
    private String roadImg;

    /**
     * 车辆操作日志
     */
    private List<VehicleLogDTO> vehicleLogList;

    /**
     * 车辆绑定司机列表
     */
    private List<VehicleDriverDTO> driverList;
}
