package teste;
import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class ProgramaIngresso {
    public static void main(String args[]){
        String saida="n";
        while (saida.equals("n")){
        EntradaCinema entrada=new EntradaCinema();
            
        int sala= Integer.parseInt(JOptionPane.showInputDialog("Digite número da Sala:"));
        entrada.setSala(sala);
        
        float valor= Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da Entrada:"));
        entrada.setValor(valor);
       
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat("dd/MM/yyyy");

        String dataDoFilm=JOptionPane.showInputDialog("Digite a data do Filme:");
        Date dataDoFilme = null;
            try {
                dataDoFilme = formatoBrasileiro.parse(dataDoFilm);
            } catch (ParseException ex) {
                Logger.getLogger(ProgramaIngresso.class.getName()).log(Level.SEVERE, null, ex);
            }
        entrada.setDataDoFilme(dataDoFilme);

        int carteiraEstudante=Integer.parseInt(JOptionPane.showInputDialog("Digite o número da Carteira:"));  
        entrada.setCarteira(carteiraEstudante);
        
        float horario=Float.parseFloat(JOptionPane.showInputDialog("Digite o horário do filme:"));
        entrada.setHorario(horario);
       
        String dataDeNasc=JOptionPane.showInputDialog("Digite a data de nascimento:");
        Date dataNasc = null;
            try {
                dataNasc = formatoBrasileiro.parse(dataDeNasc);
            } catch (ParseException ex) {
                Logger.getLogger(ProgramaIngresso.class.getName()).log(Level.SEVERE, null, ex);
            }
        entrada.setDataNascimento(dataNasc);
         
        entrada.CalculoDesconto();
        entrada.CalculoDescontoHorario();
        
        
 
  
        entrada.ImprimirPropriedades();
        saida=JOptionPane.showInputDialog("Digite S - para sair ou N - para continuar");
        }
    }
}
