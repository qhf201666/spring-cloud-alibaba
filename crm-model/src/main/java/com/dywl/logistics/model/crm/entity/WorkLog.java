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
 * 工单操作日志
 * </p>
 *
 * @author 陈世峰
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("crm_work_log")
public class WorkLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 工单id
     */
    private Long workId;

    /**
     * 操作人id
     */
    private Long operateUid;

    /**
     * 操作人角色
     */
    private String operateRole;

    /**
     * 操作人名称
     */
    private String operateUname;

    /**
     * 操作类型（1-创建，2-流转，3-完结）
     */
    private String operateType;

    /**
     * 操作时间
     */
    private LocalDateTime operateTime;

    /**
     * 备注
     */
    private String remark;


    public static final String ID = "id";

    public static final String WORK_ID = "work_id";

    public static final String OPERATE_UID = "operate_uid";

    public static final String OPERATE_ROLE = "operate_role";

    public static final String OPERATE_UNAME = "operate_uname";

    public static final String OPERATE_TYPE = "operate_type";

    public static final String OPERATE_TIME = "operate_time";

    public static final String REMARK = "remark";

}
