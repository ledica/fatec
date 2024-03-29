package teste;

/*
 * ExemploJTable.java
 *
 * Created on 25 de Maio de 2004, 08:30
 */

/**
 *
 * @author  Almedson Ferreira
 */
public class ExemploJTable extends javax.swing.JFrame {
    
    /** Creates new form ExemploJTable */
    public ExemploJTable() {
        
        String[] sexos = {"M","F"};
        scmbSexo = new javax.swing.JComboBox(sexos);
        initComponents();
        /**
        * Este evento adiciona uma linha vazia na tabela
        *
        */
        bMais.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
                javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)table.getModel();
                dtm.addRow(new Object[]{"","","","",""});
          }
        });

        /**
        * Este evento exclui as linhas vazias que foram selecionadas na tabela
        *
        */
        bMenos.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent e) {
                int[] l = table.getSelectedRows();
                javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)table.getModel();

                for(int i = (l.length-1); i >= 0; --i) {
                  if("".equals(table.getValueAt(l[i],1).toString().trim())) {
                    dtm.removeRow(l[i]);

                  }
                }
          }
        });         
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAdd = new javax.swing.JPanel();
        pnTable = new javax.swing.JPanel();
        scrollTable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bMenos = new javax.swing.JButton();
        bMais = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();

        setTitle("Exemplo JTable imasters");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        bAdd.setLayout(null);

        pnTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Exemplo de JTable"));
        pnTable.setLayout(new java.awt.GridLayout(1, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] { },
            new String [] {
                " ","Nome", "Telefone","email","Sexo"
            }
        )
        {}
    );
    table.getColumnModel().getColumn(0).setPreferredWidth(10);
    table.getColumnModel().getColumn(0).setResizable(false);
    table.getColumnModel().getColumn(1).setPreferredWidth(150);
    table.getColumnModel().getColumn(1).setResizable(true);
    table.getColumnModel().getColumn(2).setPreferredWidth(60);
    table.getColumnModel().getColumn(2).setResizable(true);
    table.getColumnModel().getColumn(3).setPreferredWidth(160);
    table.getColumnModel().getColumn(3).setResizable(true);
    table.getColumn(table.getColumnName(4)).setCellEditor(new javax.swing.DefaultCellEditor(scmbSexo));
    table.getColumnModel().getColumn(4).setPreferredWidth(30);
    table.getColumnModel().getColumn(4).setResizable(true);
    table.getTableHeader().setReorderingAllowed(false);
    table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    scrollTable.setViewportView(table);

    pnTable.add(scrollTable);

    bAdd.add(pnTable);
    pnTable.setBounds(10, 10, 370, 230);

    bMenos.setText("-");
    bAdd.add(bMenos);
    bMenos.setBounds(400, 110, 40, 40);

    bMais.setText("+");
    bAdd.add(bMais);
    bMais.setBounds(400, 60, 40, 40);

    jButton1.setText("Add");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    bAdd.add(jButton1);
    jButton1.setBounds(390, 180, 60, 23);

    bDelete.setText("Del");
    bDelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            bDeleteActionPerformed(evt);
        }
    });
    bAdd.add(bDelete);
    bDelete.setBounds(390, 210, 60, 23);

    getContentPane().add(bAdd, java.awt.BorderLayout.CENTER);

    setSize(new java.awt.Dimension(474, 283));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        int[] l = table.getSelectedRows();
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)table.getModel();

        for(int i = (l.length-1); i >= 0; --i)
            dtm.removeRow(l[i]);
    }//GEN-LAST:event_bDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)table.getModel();
        dtm.addRow(new Object[]{" ","Almedson Ferreira","1111111","aferreira@agrovale.com","M"});
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new ExemploJTable().show();
    }
    
    private javax.swing.JComboBox scmbSexo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bMais;
    private javax.swing.JButton bMenos;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pnTable;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    
}
