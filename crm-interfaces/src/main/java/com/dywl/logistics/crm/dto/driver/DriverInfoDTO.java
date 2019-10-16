package com.dywl.logistics.crm.dto.driver;

import com.dywl.logistics.crm.dto.vehicle.VehicleListDTO;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 后台司机详情
 * @author rxl
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DriverInfoDTO implements Serializable {
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
     * 身份证号
     */
    private String idcard;

    /**
     * 联系方式
     */
    private String contactsTel;

    /**
     * 实名认证状态(1-待校验，2-未通过，3-通过)
     */
    private Integer realStatus;

    /**
     * 审核状态(1-待审核，2-审核不通过，3-审核通过)
     */
    private Integer verifyStatus;

    /**
     * 是否启用
     */
    private Boolean enabled;

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

    /**
     * 操作日志
     */
    private List<DriverLogDTO> logList;

    /**
     * 绑定车辆信息
     */
    private List<VehicleListDTO> vehicleList;
}
