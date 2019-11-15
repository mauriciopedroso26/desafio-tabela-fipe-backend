package br.com.desafiotabelafipe.converter;

import br.com.desafiotabelafipe.builder.VehicleDomainBuilder;
import br.com.desafiotabelafipe.domain.VehicleDomain;
import br.com.desafiotabelafipe.fipe.domain.Vehicle;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class VehicleToVehicleDomainConveter {

    public VehicleDomain vehicleToVehicleDomainConverte(Vehicle vehicle, HashMap<String, String> parameters) {
        return new VehicleDomainBuilder()
                .withValorEm(vehicle.getAnoModelo())
                .withValor(vehicle.getPreco())
                .withAlteracaoDe(this.calculateDevaluation(vehicle.getPreco(), parameters.get("alteracao_de")))
                .withEmRelacao(parameters.get("em_relacao"))
                .build();
    }

    private String calculateDevaluation(String currentValue, String valueNextYear) {
        double discountAmount = 0;
        double discountPercentage = 0;

        if (currentValue != null && valueNextYear != null) {
            currentValue = currentValue.substring(3, currentValue.length() - 3).replace(".", "");
            valueNextYear = valueNextYear.substring(3, valueNextYear.length() - 3).replace(".", "");
            discountAmount = Double.parseDouble(valueNextYear) - Double.parseDouble(currentValue);
            discountPercentage = (discountAmount * 100) / Double.parseDouble(valueNextYear);
        }

        return "R$ " + this.round(discountAmount, 2) + "(" + this.round(discountPercentage, 2) + "%)";
    }

    private double round(double valor, int decimalPlaces) {
        double verif, rounded = valor;
        int multp = 1;

        for (int i = 0; i < decimalPlaces; i++) multp *= 10;
        rounded *= multp;
        verif = rounded;
        rounded = Math.floor(rounded);
        verif -= rounded;
        verif = Math.floor(verif * 10);
        if (verif > 4) rounded++;
        rounded /= multp;
        return rounded;
    }
}
