package br.com.senai.infob.padariabaltar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="localidade")
    private String localidade;

    @Column(name="uf")
    private String uf;

    @Column(name="cep")
    private String cep;

    @Column(name="bairro")
    private String bairro;

    @Column(name="numero")
    private String numero;

    public Endereco() {
    }

    public Endereco(String bairro, String cep, int id, String localidade, String logradouro, String numero, String uf) {
        this.bairro = bairro;
        this.cep = cep;
        this.id = id;
        this.localidade = localidade;
        this.logradouro = logradouro;
        this.numero = numero;
        this.uf = uf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


}
