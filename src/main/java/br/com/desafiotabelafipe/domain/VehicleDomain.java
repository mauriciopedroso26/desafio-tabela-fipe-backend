package br.com.desafiotabelafipe.domain;

import java.util.Objects;

public class VehicleDomain {

    private String valorEm;
    private String valor;
    private String alteracaoDe;
    private String emRelacao;

    public String getValorEm() {
        return valorEm;
    }

    public void setValorEm(String valorEm) {
        this.valorEm = valorEm;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getAlteracaoDe() {
        return alteracaoDe;
    }

    public void setAlteracaoDe(String alteracaoDe) {
        this.alteracaoDe = alteracaoDe;
    }

    public String getEmRelacao() {
        return emRelacao;
    }

    public void setEmRelacao(String emRelacao) {
        this.emRelacao = emRelacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleDomain that = (VehicleDomain) o;
        return Objects.equals(valorEm, that.valorEm) &&
                Objects.equals(valor, that.valor) &&
                Objects.equals(alteracaoDe, that.alteracaoDe) &&
                Objects.equals(emRelacao, that.emRelacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valorEm, valor, alteracaoDe, emRelacao);
    }

    @Override
    public String toString() {
        return "VehicleDomain{" +
                "valorEm='" + valorEm + '\'' +
                ", valor='" + valor + '\'' +
                ", alteracaoDe='" + alteracaoDe + '\'' +
                ", emRelacao='" + emRelacao + '\'' +
                '}';
    }
}
