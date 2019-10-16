package com.dywl.logistics.crm.dto.driver;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 后台司机黑名单列表
 * @author rxl
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverBackListDTO {

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
     * 联系方式
     */
    private String contactsTel;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 是否黑名单
     */
    private Boolean black;

    /**
     * 加入黑名单时间
     */
    private LocalDateTime blackTime;

    /**
     * 加入黑名单人名称
     */
    private String blackUname;
}
