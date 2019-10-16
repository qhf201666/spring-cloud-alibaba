package com.dywl.logistics.crm.dto.driver;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 司机操作日志
 * @author rxl
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DriverLogDTO {

    /**
     * 操作人名称
     */
    private String operateUname;

    /**
     * 操作类型
     */
    private String operateType;

    /**
     * 操作时间
     */
    private LocalDateTime operateTime;

    /**
     * 详细描述
     */
    private String description;

    /**
     * 备注
     */
    private String remark;
}
