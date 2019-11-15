package br.com.desafiotabelafipe.fipe.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Vehicle {

    private String referencia;
    @JsonProperty("fipe_codigo")
    private String fipeCodigo;
    private String name;
    private String combustivel;
    private String marca;
    @JsonProperty("ano_modelo")
    private String anoModelo;
    private String preco;
    private String key;
    private String time;
    private String veiculo;
    private String id;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(referencia, vehicle.referencia) &&
                Objects.equals(fipeCodigo, vehicle.fipeCodigo) &&
                Objects.equals(name, vehicle.name) &&
                Objects.equals(combustivel, vehicle.combustivel) &&
                Objects.equals(marca, vehicle.marca) &&
                Objects.equals(anoModelo, vehicle.anoModelo) &&
                Objects.equals(preco, vehicle.preco) &&
                Objects.equals(key, vehicle.key) &&
                Objects.equals(time, vehicle.time) &&
                Objects.equals(veiculo, vehicle.veiculo) &&
                Objects.equals(id, vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referencia, fipeCodigo, name, combustivel, marca, anoModelo, preco, key, time, veiculo, id);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "referencia='" + referencia + '\'' +
                ", fipeCodigo='" + fipeCodigo + '\'' +
                ", name='" + name + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", marca='" + marca + '\'' +
                ", anoModelo='" + anoModelo + '\'' +
                ", preco='" + preco + '\'' +
                ", key='" + key + '\'' +
                ", time='" + time + '\'' +
                ", veiculo='" + veiculo + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
