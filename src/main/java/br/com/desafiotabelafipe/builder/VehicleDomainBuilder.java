package br.com.desafiotabelafipe.builder;

import br.com.desafiotabelafipe.domain.VehicleDomain;

public class VehicleDomainBuilder {

    private VehicleDomain entity = new VehicleDomain();

    public VehicleDomainBuilder withValorEm(String valorEm){
        this.entity.setValorEm(valorEm);
        return this;
    }

    public VehicleDomainBuilder withValor(String valor){
        this.entity.setValor(valor);
        return this;
    }

    public VehicleDomainBuilder withAlteracaoDe(String alteracaoDe){
        this.entity.setAlteracaoDe(alteracaoDe);
        return this;
    }

    public VehicleDomainBuilder withEmRelacao(String emRelacao){
        this.entity.setEmRelacao(emRelacao);
        return this;
    }

    public VehicleDomain build(){
        return this.entity;
    }
}
