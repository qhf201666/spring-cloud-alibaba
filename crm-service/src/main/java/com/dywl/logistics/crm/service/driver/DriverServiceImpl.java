package com.dywl.logistics.crm.service.driver;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dywl.base.BasePageDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.logistics.crm.dto.driver.DriverBackListDTO;
import com.dywl.logistics.crm.dto.driver.DriverDocDTO;
import com.dywl.logistics.crm.dto.driver.DriverInfoDTO;
import com.dywl.logistics.crm.dto.driver.DriverListDTO;
import com.dywl.logistics.crm.dto.driver.DriverLogDTO;
import com.dywl.logistics.crm.exception.SysException;
import com.dywl.logistics.crm.interfaces.driver.IDriverService;
import com.dywl.logistics.model.crm.dao.driver.IDriverDao;
import com.dywl.logistics.model.crm.dao.driver.IDriverDocDao;
import com.dywl.logistics.model.crm.dao.driver.IDriverLogDao;
import com.dywl.logistics.model.crm.dao.driver.IDriverVehicleDao;
import com.dywl.logistics.model.crm.dao.vehicle.IVehicleDao;
import com.dywl.logistics.model.crm.entity.driver.Driver;
import com.dywl.logistics.model.crm.entity.driver.DriverDoc;
import com.dywl.utils.BeanUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author rxl
 */

@Slf4j
@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements IDriverService {

    private final IDriverDao driverDao;
    private final IVehicleDao vehicleDao;
    private final IDriverVehicleDao driverVehicleDao;
    private final IDriverLogDao driverLogDao;
    private final IDriverDocDao driverDocDao;


    @Override
    public ResponseDTO<String> getCode(String cellphone) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> checkCode(String cellphone, String code) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> saveDriverImg(DriverDocDTO driverDocDTO) {
        return null;
    }

    @Override
    public ResponseDTO<DriverDocDTO> findMyMsg(Long id) {
        return null;
    }

    @Override
    public ResponseDTO<BasePageDTO<DriverListDTO>> findAll(DriverListDTO driverListDTO) {
        return null;
    }

    @Override
    public ResponseDTO<DriverInfoDTO> findOne(Long id) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> isUserAccount(Long id) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> inBlackList(Long id) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> adjustDriver(Long id, Boolean flag) {
        return null;
    }

    @Override
    public ResponseDTO<BasePageDTO<DriverBackListDTO>> findBackList(
        DriverBackListDTO driverBackListDTO) {
        return null;
    }
}
