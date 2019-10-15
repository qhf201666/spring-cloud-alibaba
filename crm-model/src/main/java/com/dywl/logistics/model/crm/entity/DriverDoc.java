package com.dywl.logistics.model.crm.entity;

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
 * 司机证件文档
 * </p>
 *
 * @author 陈世峰
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("crm_driver_doc")
public class DriverDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 司机id
     */
    private Long driverId;

    /**
     * 类型(1-驾驶证正面，2-身份证正面，3-身份证反面)
     */
    private String type;

    /**
     * 文档
     */
    private String doc;

    /**
     * 创建人id
     */
    private Long createUid;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新人id
     */
    private Long updateUid;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 是否删除
     */
    private Boolean del;


    public static final String ID = "id";

    public static final String DRIVER_ID = "driver_id";

    public static final String TYPE = "type";

    public static final String DOC = "doc";

    public static final String CREATE_UID = "create_uid";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_UID = "update_uid";

    public static final String UPDATE_TIME = "update_time";

    public static final String DEL = "del";

}
