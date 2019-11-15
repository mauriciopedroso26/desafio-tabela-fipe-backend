package br.com.desafiotabelafipe.rest;

import br.com.desafiotabelafipe.domain.VehicleDomain;
import br.com.desafiotabelafipe.service.VehicleDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/fipe")
public class VehicleDomainServiceRest {

    private final VehicleDomainService vehicleDomainService;

    @Autowired
    public VehicleDomainServiceRest(VehicleDomainService vehicleDomainService) {
        this.vehicleDomainService = vehicleDomainService;
    }

    @GetMapping("/{brand}/{vehicle_id}")
    public ResponseEntity<List<VehicleDomain>> consultFipeValues(@PathVariable("brand") String brand,
                                                                @PathVariable("vehicle_id") String vehicleId){

        return new ResponseEntity<>(vehicleDomainService.consultFipeValues(brand, vehicleId), HttpStatus.OK);
    }
}
