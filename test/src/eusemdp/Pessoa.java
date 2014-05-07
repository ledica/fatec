package eusemdp;

import java.util.Objects;

public class Pessoa extends Contato {
    private int idPessoa;
    private Endereco endereco;
    private Contato contato;
    private String nome;
    private int numeroCartao;  

    public Pessoa(int idPessoa, Endereco endereco, Contato contato, String nome, int numeroCartao) {
        this.idPessoa = idPessoa;
        this.endereco = endereco;
        this.contato = contato;
        this.nome = nome;
        this.numeroCartao = numeroCartao;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.idPessoa;
        hash = 29 * hash + Objects.hashCode(this.endereco);
        hash = 29 * hash + Objects.hashCode(this.contato);
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + this.numeroCartao;
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
        final Pessoa other = (Pessoa) obj;
        if (this.idPessoa != other.idPessoa) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.contato, other.contato)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.numeroCartao != other.numeroCartao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", endereco=" + endereco + ", contato=" + contato + ", nome=" + nome + ", numeroCartao=" + numeroCartao + '}';
    }
    
    
    
    
}
