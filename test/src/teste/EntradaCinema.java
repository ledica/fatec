package teste;
import java.util.Calendar;
import java.util.Date;
public class EntradaCinema {
   private int sala,carteiraEstudante,idade;
   private float horario,valor;
   private double valord;
   Date dataNasc,dataDoFilme;
   public void setDataDoFilme(Date dataDoFilme){this.dataDoFilme=dataDoFilme;}
   public Date getDataDoFilme(){return dataDoFilme;}
   public void setSala(int sala){this.sala=sala;}
   public int getSala(){return sala;}
   public void setDataNascimento(Date dataNasc){this.dataNasc=dataNasc;}
   public Date getDataNascimento(){return dataNasc;}
   public void setValor(float valor){this.valor=valor;}
   public float getValor(){return valor;}
   public void setCarteira(int carteiraEstudante){this.carteiraEstudante=carteiraEstudante;}
   public int getCarteira(){return carteiraEstudante;}
   public void setHorario(float horario){this.horario=horario;}
   public float getHorario(){return horario;}
   
   public void CalculoDesconto(){
    Calendar dataNascimento = Calendar.getInstance();  
    dataNascimento.setTime(dataNasc);  
    Calendar dataAtual = Calendar.getInstance();  
       
    idade = (dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR)); 
      
       valord = (double)valor;
       
       if (idade>20){valord=valor*0.8;}
       if(idade<21 & idade>16){valord=valor*0.7;}
       if(idade<16 & idade>12){valord=valor*0.6;}
       if(idade<12){valord=valor*0.5;}
       valor=(float)valord;
   }
   public void CalculoDescontoHorario(){
       if (horario<16){valord=valord*0.9;}
       valor=(float)valord;
   }
  void dataNasc(Date dataNasc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  } 
  public void ImprimirPropriedades(){
      System.out.println(
              "\n Sala:"+sala+
              "\n Data:"+dataDoFilme+
              "\n Horário:"+horario+
              "\n Número da Carteira Do Estudante:"+carteiraEstudante+
              "\n Valor Entrada:"+valor);
      System.out.println("----------------------------");
        }
  
}