package br.com.desafiotabelafipe.service;

import br.com.desafiotabelafipe.converter.VehicleToVehicleDomainConveter;
import br.com.desafiotabelafipe.domain.VehicleDomain;
import br.com.desafiotabelafipe.fipe.domain.Vehicle;
import br.com.desafiotabelafipe.fipe.domain.VehicleYear;
import br.com.desafiotabelafipe.fipe.service.VehicleService;
import br.com.desafiotabelafipe.fipe.service.VehicleYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class VehicleDomainService {

    private final VehicleYearService vehicleYearService;
    private final VehicleService vehicleService;
    private final VehicleToVehicleDomainConveter vehicleToVehicleDomainConveter;

    @Autowired
    public VehicleDomainService(VehicleYearService vehicleYearService, VehicleService vehicleService, VehicleToVehicleDomainConveter vehicleToVehicleDomainConveter) {
        this.vehicleYearService = vehicleYearService;
        this.vehicleService = vehicleService;
        this.vehicleToVehicleDomainConveter = vehicleToVehicleDomainConveter;
    }

    public List<VehicleDomain> consultFipeValues(String brand, String vehicleId) {
        VehicleYear[] vehicleYearList = vehicleYearService.consultVehicleYear(brand, vehicleId).getBody();
        List<Vehicle> vehicleList = getVehicles(brand, vehicleId, vehicleYearList);

        List<VehicleDomain> vehicleDomainList = getVehicleDomains(vehicleList);

        Collections.reverse(vehicleDomainList);
        return vehicleDomainList;
    }

    private List<VehicleDomain> getVehicleDomains(List<Vehicle> vehicleList) {
        List<VehicleDomain> vehicleDomainList = new ArrayList<>();
        HashMap<String, String> parameters = new HashMap<>();

        AtomicInteger i = new AtomicInteger();
        Collections.reverse(vehicleList);

        vehicleList.forEach(vehicle -> {
            if(i.get() < vehicleList.size() - 1){
                Vehicle vehicleGet = vehicleList.get(i.incrementAndGet());
                parameters.put("alteracao_de", vehicleGet.getPreco());
                parameters.put("em_relacao", vehicleGet.getAnoModelo());
            }

            vehicleDomainList.add(vehicleToVehicleDomainConveter.vehicleToVehicleDomainConverte(vehicle, parameters));
            parameters.clear();
        });
        return vehicleDomainList;
    }

    private List<Vehicle> getVehicles(String brand, String vehicleId, VehicleYear[] vehicleYearList) {
        List<Vehicle> vehicleList = new ArrayList<>();

        Arrays.stream(vehicleYearList).forEach(vehicleYear -> vehicleList.add(vehicleService
                .consultVehicle(brand, vehicleId, vehicleYear.getId()).getBody()));

        return vehicleList;
    }
}
