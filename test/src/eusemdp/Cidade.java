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
public enum Cidade {

aparecida ("Aparecida")
,cacapava("Caçapava");
/*
3 - Canas
4 - Cruzeiro
5 - Igaratá
6 - Guaratinguetá
7 - Lavrinhas
8 - Lorena
9 - Jacareí
10 - Cachoeira Paulista
11 - Potim
12 - Roseira
13 - Pindamonhangaba
14 - São José dos Campos
15 - Santa Branca
16 - Tremembé
17 - Taubaté
Litoral Norte
18 - Caraguatatuba
19 - Ilhabela
20 - São Seastião
21 - Ubatuba
Serra da Mantiqueira
22 - Campos do Jordão
23 - Monteiro Lobato
24 - Piquete
25 - Santo Antônio do Pinhal
26 - São Bento do Sapucaí
Serra do Mar
27 - Cunha
28 - Lagoinha
29 - Jambeiro
30 - Natividade da Serra
31 - Paraibuna
32 - Redenção da Serra
33 - São Luiz do Paraitinga
Vale Histórico
34 - Arapeí
35 - Areias
36 - Bananal
37 - Queluz
38 - São José do Barreiro
39 - Silveiras
  */  
private String nomeCidade;
private Cidade(String nomeCidade){
this.nomeCidade=nomeCidade;

}

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

}
