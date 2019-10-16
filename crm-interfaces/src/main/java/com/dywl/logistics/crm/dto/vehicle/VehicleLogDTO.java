package com.dywl.logistics.crm.dto.vehicle;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rxl
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class VehicleLogDTO {

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
