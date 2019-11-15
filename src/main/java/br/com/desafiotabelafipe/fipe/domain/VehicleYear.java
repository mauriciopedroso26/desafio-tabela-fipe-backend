package br.com.desafiotabelafipe.fipe.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class VehicleYear {

    @JsonProperty("fipe_marca")
    private String fipeMarca;
    @JsonProperty("fipe_codigo")
    private String fipeCodigo;
    private String name;
    private String marca;
    private String key;
    private String veiculo;
    private String id;

    public String getFipeMarca() {
        return fipeMarca;
    }

    public void setFipeMarca(String fipeMarca) {
        this.fipeMarca = fipeMarca;
    }

    public String getFipeCodigo() {
        return fipeCodigo;
    }

    public void setFipeCodigo(String fipeCodigo) {
        this.fipeCodigo = fipeCodigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleYear vehicleYear = (VehicleYear) o;
        return Objects.equals(fipeMarca, vehicleYear.fipeMarca) &&
                Objects.equals(fipeCodigo, vehicleYear.fipeCodigo) &&
                Objects.equals(name, vehicleYear.name) &&
                Objects.equals(marca, vehicleYear.marca) &&
                Objects.equals(key, vehicleYear.key) &&
                Objects.equals(veiculo, vehicleYear.veiculo) &&
                Objects.equals(id, vehicleYear.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fipeMarca, fipeCodigo, name, marca, key, veiculo, id);
    }

    @Override
    public String toString() {
        return "CarYear{" +
                "fipeMarca='" + fipeMarca + '\'' +
                ", fipeCodigo='" + fipeCodigo + '\'' +
                ", name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", key='" + key + '\'' +
                ", veiculo='" + veiculo + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
