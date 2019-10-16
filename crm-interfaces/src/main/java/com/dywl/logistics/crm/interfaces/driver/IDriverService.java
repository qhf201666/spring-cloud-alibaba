package com.dywl.logistics.crm.interfaces.driver;

import com.dywl.base.BasePageDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.logistics.crm.dto.driver.DriverBackListDTO;
import com.dywl.logistics.crm.dto.driver.DriverDocDTO;
import com.dywl.logistics.crm.dto.driver.DriverInfoDTO;
import com.dywl.logistics.crm.dto.driver.DriverListDTO;

/**
 * @author rxl
 */
public interface IDriverService {

    /**
     * 获取手机验证码
     * @param cellphone 手机号
     * @return 验证码
     */
    ResponseDTO<String> getCode(String cellphone);

    /**
     * 校验验证码
     * @param cellphone 手机号
     * @param code 验证码
     * @return 校验结果
     */
    ResponseDTO<Boolean> checkCode(String cellphone, String code);

    /**
     * 保存司机信息提交后台审核
     * @param driverDocDTO 照片信息
     * @return 操作结果
     */
    ResponseDTO<Boolean> saveDriverImg(DriverDocDTO driverDocDTO);

    /**
     * 前台查询个人信息
     * @param id 司机id
     * @return 个人信息
     */
    ResponseDTO<DriverDocDTO> findMyMsg(Long id);

    /**
     * 分页查询司机列表
     * @param driverListDTO 查询条件
     * @return 司机列表
     */
    ResponseDTO<BasePageDTO<DriverListDTO>> findAll(DriverListDTO driverListDTO);

    /**
     * 后台查询司机详情
     * @param id 司机id
     * @return 司机详情信息
     */
    ResponseDTO<DriverInfoDTO> findOne(Long id);

    /**
     * 启用/禁用司机账户
     * @param id 司机id
     * @return 操作结果
     */
    ResponseDTO<Boolean> isUserAccount(Long id);

    /**
     * 加入黑名单
     * @param id 司机id
     * @return 操作结果
     */
    ResponseDTO<Boolean> inBlackList(Long id);

    /**
     * 司机审核
     * @param id 司机id
     * @param flag 是否审核通过
     * @return 审核结果
     */
    ResponseDTO<Boolean> adjustDriver(Long id, Boolean flag);

    /**
     * 分页查询司机黑名单
     * @param driverBackListDTO 查询条件
     * @return 分页数据
     */
    ResponseDTO<BasePageDTO<DriverBackListDTO>> findBackList(DriverBackListDTO driverBackListDTO);

}
