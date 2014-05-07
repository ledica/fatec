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
public enum TipoPessoaJuridica {
    Cliente,
    UnidadeFilial;
    
    private TipoPessoaJuridica tipo;

    public TipoPessoaJuridica getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoaJuridica tipo) {
        this.tipo = tipo;
    }


}
