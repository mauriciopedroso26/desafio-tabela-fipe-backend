package br.com.desafiotabelafipe.fipe.service;

import br.com.desafiotabelafipe.fipe.domain.Vehicle;
import br.com.desafiotabelafipe.fipe.util.HeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.GET;

@Service
public class VehicleService {

    @Value("${fipe.url}")
    private String url;

    private final RestTemplate restTemplate;

    @Autowired
    public VehicleService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<Vehicle> consultVehicle(String brand, String vehicleId, String vehicleYear){
        ResponseEntity<Vehicle> response =
                this.restTemplate.exchange(this.url + "/" + vehicleYear + ".json",
                        GET,
                        HeadersService.getHeaders(),
                        Vehicle.class,
                        brand,
                        vehicleId);

        return response;
    }
}
