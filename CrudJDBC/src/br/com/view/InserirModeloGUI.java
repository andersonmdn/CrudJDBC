/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.modelo.controller.ModeloController;
import br.com.modelo.negocio.Modelo;

/**
 *
 * @author anderson_feliciano
 */
public class InserirModeloGUI extends javax.swing.JFrame {

    private ModeloTableModel modelo;

    /**
     * Creates new form ModeloGUI
     */
    public InserirModeloGUI(ModeloTableModel md) {
        initComponents();
        modelo = md;
        
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
        txId = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        txNome1 = new javax.swing.JTextField();
        txNome2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txNome3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(txId);
        txId.setBounds(100, 40, 250, 30);
        jPanel1.add(txNome);
        txNome.setBounds(100, 80, 250, 30);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Descrição:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 80, 80, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Id:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 40, 60, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setText(" Atualizar Modelo");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 20, 110, 15);

        btLimpar.setText("Limpar");
        btLimpar.setBorder(null);
        jPanel1.add(btLimpar);
        btLimpar.setBounds(210, 250, 60, 50);

        btSalvar.setText("Salvar");
        btSalvar.setBorder(null);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar);
        btSalvar.setBounds(290, 250, 60, 50);
        jPanel1.add(txNome1);
        txNome1.setBounds(100, 80, 250, 30);
        jPanel1.add(txNome2);
        txNome2.setBounds(100, 120, 250, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Potencia:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 120, 70, 30);
        jPanel1.add(txNome3);
        txNome3.setBounds(100, 170, 250, 30);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Marca:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 170, 60, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        ModeloController mc = new ModeloController();
        Modelo m = new Modelo();
        m.setDescrição(txNome.getText());
        mc.inserir(m);
        
        modelo.addModelo(buscarModelo(m.getDescrição()));
        dispose();
        
    }//GEN-LAST:event_btSalvarActionPerformed
    private Modelo buscarModelo(String nome) {
        ModeloController mc = new ModeloController();        
        return mc.getMarcByNome(nome);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNome1;
    private javax.swing.JTextField txNome2;
    private javax.swing.JTextField txNome3;
    // End of variables declaration//GEN-END:variables
}
