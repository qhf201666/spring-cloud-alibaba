package com.dywl.logistics.crm.service;

import com.dywl.base.BaseUserDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.logistics.crm.IVehicleService;
import com.dywl.logistics.crm.dto.VehicleDTO;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 陈世峰
 */
@Slf4j
@Service
public class VehicleServiceImpl implements IVehicleService {

    @Override
    public ResponseDTO<Long> create(VehicleDTO vehicleDTO) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> deletes(List<Long> ids, BaseUserDTO userDTO) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> delete(Long id, BaseUserDTO userDTO) {
        return null;
    }
}
