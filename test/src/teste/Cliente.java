/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import javax.swing.JOptionPane;

/**
 *
 * @author Hs
 */
public class Cliente {
    int idCliente;
    String nome;
    int numeroCartao;
    String logradouro;
    String numeroEndereco;
    String bairro;
    String cidade;
    String telfone;

    public Cliente(int idCliente, String nome, int numeroCartao, String logradouro, String numeroEndereco, String bairro, String cidade, String telfone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.numeroCartao = numeroCartao;
        this.logradouro = logradouro;
        this.numeroEndereco = numeroEndereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telfone = telfone;
    }

    Cliente() {

    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
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

    public String getTelfone() {
        return telfone;
    }

    public void setTelfone(String telfone) {
        this.telfone = telfone;
    }

    void imprimirCliente(){
        JOptionPane.showMessageDialog(null,"A criatura é:" 
                + "\n Código:" + idCliente 
                + "\n Nome:" + nome 
                + "\n Cartao:" + numeroCartao 
                + "\n Logradouro:" + logradouro 
                + "\n Numero:" + numeroEndereco 
                + "\n Bairro:" + bairro 
                + "\n Cidade:" + cidade 
                + "\n Telefone:" + telfone
        );
    }
}
