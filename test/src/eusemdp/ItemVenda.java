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
public class ItemVenda {
    private Produto idProduto;
    private int qtd;
    private Produto valor;
    private float valorItem;

    public ItemVenda(Produto idProduto, int qtd, Produto valor, float totalItem) {
        this.idProduto = idProduto;
        this.qtd = qtd;
        this.valor = valor;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto getValor() {
        
        return valor;
    }

    public void setValor(Produto valor) {
        this.valor = valor;
    }

   public void calculoTotalItem(){

   }

    @Override
    public String toString() {
        return "ItemVenda{" + "valor=" + valor + ", valorItem=" + valorItem + '}';
    }
    

}
