/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eusemdp;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Hs
 */
public class PessoaFisica extends Pessoa{
    
    private String numeroRg;
    private TipoSexo sexo;
    private char numeroCpf;
    private Date dataNascimeto;   

    public PessoaFisica(String numeroRg, TipoSexo sexo, char numeroCpf, Date dataNascimeto, int idPessoa, Endereco endereco, Contato contato, String nome, int numeroCartao) {
        super(idPessoa, endereco, contato, nome, numeroCartao);
        this.numeroRg = numeroRg;
        this.sexo = sexo;
        this.numeroCpf = numeroCpf;
        this.dataNascimeto = dataNascimeto;
    }
       @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.numeroRg);
        hash = 73 * hash + Objects.hashCode(this.sexo);
        hash = 73 * hash + this.numeroCpf;
        hash = 73 * hash + Objects.hashCode(this.dataNascimeto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaFisica other = (PessoaFisica) obj;
        if (!Objects.equals(this.numeroRg, other.numeroRg)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.numeroCpf != other.numeroCpf) {
            return false;
        }
        if (!Objects.equals(this.dataNascimeto, other.dataNascimeto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "numeroRg=" + numeroRg + ", sexo=" + sexo + ", numeroCpf=" + numeroCpf + ", dataNascimeto=" + dataNascimeto + '}';
    }

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        this.numeroRg = numeroRg;
    }

    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }

    public char getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(char numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public Date getDataNascimeto() {
        return dataNascimeto;
    }

    public void setDataNascimeto(Date dataNascimeto) {
        this.dataNascimeto = dataNascimeto;
    }

 
        

}
