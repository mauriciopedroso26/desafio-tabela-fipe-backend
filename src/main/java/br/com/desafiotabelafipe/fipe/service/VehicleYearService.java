package br.com.desafiotabelafipe.fipe.service;

import br.com.desafiotabelafipe.fipe.domain.VehicleYear;
import br.com.desafiotabelafipe.fipe.util.HeadersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpMethod.GET;

@Service
public class VehicleYearService {

    @Value("${fipe.url}")
    private String url;

    private final RestTemplate restTemplate;

    @Autowired
    public VehicleYearService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<VehicleYear[]> consultVehicleYear(String brand, String vehicleId){
        ResponseEntity<VehicleYear[]> response =
                this.restTemplate.exchange(this.url + ".json",
                        GET,
                        HeadersService.getHeaders(),
                        VehicleYear[].class,
                        brand,
                        vehicleId);

        return response;
    }
}
