package com.dywl.logistics.model.crm.entity.vehicle;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 车辆操作日志
 * </p>
 *
 * @author 任雪龙
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("crm_vehicle_log")
public class VehicleLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 车辆id
     */
    private Long vehicleId;

    /**
     * 操作人id
     */
    private Long operateUid;

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


    public static final String ID = "id";

    public static final String VEHICLE_ID = "vehicle_id";

    public static final String OPERATE_UID = "operate_uid";

    public static final String OPERATE_UNAME = "operate_uname";

    public static final String OPERATE_TYPE = "operate_type";

    public static final String OPERATE_TIME = "operate_time";

    public static final String DESCRIPTION = "description";

    public static final String REMARK = "remark";

}
