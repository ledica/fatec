package teste;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myWindow extends JFrame
{
    JLabel rotulo1; 
    JTextField texto1;
    JButton b1,b2;
      
    // construtor
    public myWindow()
    {
        super("Minha janela de cadastro");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1=new JLabel("Digite seu nome:");

        texto1 = new JTextField(50);

        b1=new JButton("OK");
        b2=new JButton("Cancelar");

        
        // 50 - Coluna, 20 - linha, 70 - largura, 20 - altura
        rotulo1.setBounds(50,20,100,20);

        texto1.setBounds(150,20,150,20);

        b1.setBounds(50,150,200,40);
        b2.setBounds(260,150,200,40);

        
        tela.add(rotulo1);

        tela.add(texto1);

        
        // Sair e fechar o programa
        b2.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
              System.exit(0);
          }
        }
        );
         
        tela.add(b1);
        tela.add(b2);

        
        this.setSize(500,300); // largura x altura
        this.setVisible(true);
        
        this.setLocationRelativeTo(null); // janela centralizada
    }
}

