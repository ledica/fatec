package teste;

import javax.swing.JOptionPane;

public class Main {
        public static void main(String args[]){
        String saida="n";
        int operacao=0;
        
        
        while (saida.equals("n")){
            operacao++;
            int menuPrincipal= Integer.parseInt(JOptionPane.showInputDialog("Digite:"
                + "\n 1 venda"
                + "\n 2 consulta"
                + "\n 3 cadastrar cliente"
                + "\n 4 cadastrar produto"
                + "\n 5 sair"
                + ""));
        switch (menuPrincipal) {
            case 1:
                Cliente cliente=new Cliente();
                int numeroCartao= Integer.parseInt(JOptionPane.showInputDialog("Digite nunero do cartao:"));
                cliente.setNumeroCartao(numeroCartao);
                int idCliente= Integer.parseInt(JOptionPane.showInputDialog("Digite nunero do código do cliente:"));
                cliente.setNumeroCartao(idCliente);
                String nome=JOptionPane.showInputDialog("Digite nome:");
                cliente.setNome(nome);
                cliente.imprimirCliente();
                
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            
            default:
                System.out.println("Este não é um dia válido!");

        }saida=JOptionPane.showInputDialog("Digite S - para sair ou N - para continuar");
        }
        
}
}
