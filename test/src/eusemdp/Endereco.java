/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eusemdp;

/**
 *
 * @author Hs
 */
public class Endereco {
    protected String logradouro;
    protected String numero;
    protected String completento;
    protected String bairro;
    protected String cidade;
    protected String siglaUf;
    protected String numeroCEP;
    
    
    public Endereco(){}
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCompletento() {
        return completento;
    }

    public void setCompletento(String completento) {
        this.completento = completento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSiglaUf() {
        return siglaUf;
    }

    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }

    public String getNumeroCEP() {
        return numeroCEP;
    }

    public void setNumeroCEP(String numeroCEP) {
        this.numeroCEP = numeroCEP;
    }
    
}
