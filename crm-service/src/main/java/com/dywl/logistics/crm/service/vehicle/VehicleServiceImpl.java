package com.dywl.logistics.crm.service.vehicle;

import com.dywl.base.BasePageDTO;
import com.dywl.base.BaseUserDTO;
import com.dywl.base.ResponseDTO;
import com.dywl.logistics.crm.dto.vehicle.FontVehicleCreateDTO;
import com.dywl.logistics.crm.dto.vehicle.FontVehicleInfoDTO;
import com.dywl.logistics.crm.dto.vehicle.FontVehicleListDTO;
import com.dywl.logistics.crm.dto.vehicle.VehicleInfoDTO;
import com.dywl.logistics.crm.dto.vehicle.VehicleListDTO;
import com.dywl.logistics.crm.dto.vehicle.VehicleUptDTO;
import com.dywl.logistics.crm.interfaces.vehicle.IVehicleService;
import com.dywl.logistics.model.crm.dao.driver.IDriverDao;
import com.dywl.logistics.model.crm.dao.driver.IDriverVehicleDao;
import com.dywl.logistics.model.crm.dao.vehicle.IVehicleDao;
import com.dywl.logistics.model.crm.dao.vehicle.IVehicleDocDao;
import com.dywl.logistics.model.crm.dao.vehicle.IVehicleLogDao;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 任雪龙
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements IVehicleService {

    private final IDriverDao driverDao;
    private final IVehicleDao vehicleDao;
    private final IDriverVehicleDao driverVehicleDao;
    private final IVehicleLogDao vehicleLogDao;
    private final IVehicleDocDao vehicleDocDao;


    @Override
    public ResponseDTO<BasePageDTO<FontVehicleListDTO>> findMyCars(Long id) {
        return null;
    }

    @Override
    public ResponseDTO<FontVehicleInfoDTO> findOneCar(Long id) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> create(FontVehicleCreateDTO fontVehicleCreateDTO) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> delete(Long id) {
        return null;
    }

    @Override
    public ResponseDTO<BasePageDTO<VehicleListDTO>> findAllCars(VehicleListDTO vehicleListDTO) {
        return null;
    }

    @Override
    public ResponseDTO<VehicleInfoDTO> findOne(Long id) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> adjustCar(Long id, Boolean flag) {
        return null;
    }

    @Override
    public ResponseDTO<Boolean> uptCar(VehicleUptDTO vehicleUptDTO) {
        return null;
    }
}
