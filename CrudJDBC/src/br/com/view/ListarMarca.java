/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

/**
 *
 * @author anderson_feliciano
 */
public class ListarMarca extends javax.swing.JFrame {

    /**
     * Creates new form ListarMarca
     */
    public ListarMarca() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txPesquisa = new javax.swing.JTextField();
        btPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMarca = new javax.swing.JTable();
        btInserir = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setText("Marcas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(61, 41, 34, 14);
        jPanel1.add(txPesquisa);
        txPesquisa.setBounds(60, 70, 430, 20);

        btPesquisa.setText("Pesquisar");
        jPanel1.add(btPesquisa);
        btPesquisa.setBounds(500, 70, 110, 23);

        tbMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbMarca);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 110, 510, 120);

        btInserir.setText("Inserir");
        jPanel1.add(btInserir);
        btInserir.setBounds(90, 410, 63, 23);

        btAtualizar.setText("Atualizar");
        jPanel1.add(btAtualizar);
        btAtualizar.setBounds(200, 410, 80, 23);

        btExcluir.setText("Excluir");
        jPanel1.add(btExcluir);
        btExcluir.setBounds(310, 410, 63, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarMarca().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMarca;
    private javax.swing.JTextField txPesquisa;
    // End of variables declaration//GEN-END:variables
}