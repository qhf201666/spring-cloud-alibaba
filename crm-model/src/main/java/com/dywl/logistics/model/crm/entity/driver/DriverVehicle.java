package com.dywl.logistics.model.crm.entity.driver;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 司机车辆
 * </p>
 *
 * @author 任雪龙
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("crm_driver_vehicle")
public class DriverVehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 司机id
     */
    private Long driverId;

    /**
     * 车辆id
     */
    private Long vehicleId;


    public static final String DRIVER_ID = "driver_id";

    public static final String VEHICLE_ID = "vehicle_id";

}
