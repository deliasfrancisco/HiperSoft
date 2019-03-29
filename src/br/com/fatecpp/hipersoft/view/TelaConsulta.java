package br.com.fatecpp.hipersoft.view;

//import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class TelaConsulta extends javax.swing.JFrame {

    public TelaConsulta() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    
    /* private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(".../Hiper_Soft_logo.png")));
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnProduto = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Consulta");
        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(204, 255, 255));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 180, 0, 0);
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153)));
        jPanel1.setLayout(null);

        btnProduto.setForeground(new java.awt.Color(0, 102, 102));
        btnProduto.setText("Produtos");
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProduto);
        btnProduto.setBounds(180, 70, 391, 60);

        btnFornecedor.setForeground(new java.awt.Color(0, 102, 102));
        btnFornecedor.setText("Fornecedores");
        btnFornecedor.setMaximumSize(new java.awt.Dimension(83, 25));
        btnFornecedor.setMinimumSize(new java.awt.Dimension(83, 25));
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnFornecedor);
        btnFornecedor.setBounds(180, 140, 391, 60);

        btnVendas.setForeground(new java.awt.Color(0, 102, 102));
        btnVendas.setText("Vendas");
        btnVendas.setMaximumSize(new java.awt.Dimension(83, 25));
        btnVendas.setMinimumSize(new java.awt.Dimension(83, 25));
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVendas);
        btnVendas.setBounds(180, 210, 391, 60);

        btnUsuarios.setForeground(new java.awt.Color(0, 102, 102));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setMaximumSize(new java.awt.Dimension(83, 25));
        btnUsuarios.setMinimumSize(new java.awt.Dimension(83, 25));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuarios);
        btnUsuarios.setBounds(180, 350, 391, 60);

        btnClientes.setForeground(new java.awt.Color(0, 102, 102));
        btnClientes.setText("Clientes");
        btnClientes.setMaximumSize(new java.awt.Dimension(83, 25));
        btnClientes.setMinimumSize(new java.awt.Dimension(83, 25));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes);
        btnClientes.setBounds(180, 280, 391, 58);

        btnSair.setForeground(new java.awt.Color(0, 102, 102));
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(83, 25));
        btnSair.setMinimumSize(new java.awt.Dimension(83, 25));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair);
        btnSair.setBounds(180, 420, 391, 60);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 759;
        gridBagConstraints.ipady = 559;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 32, 30);
        getContentPane().add(jPanel1, gridBagConstraints);

        setSize(new java.awt.Dimension(820, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        ProdutoView consultaProduto = new ProdutoView();
        consultaProduto.setVisible(true);
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        FornecedorView consultaFornecedor = new FornecedorView();
        consultaFornecedor.setVisible(true);
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        UsuarioView consultaUsuario = new UsuarioView();
        consultaUsuario.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        ClienteView consultaCliente = new ClienteView();
        consultaCliente.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        JOptionPane.showMessageDialog(null, "Função disponivel em breve");
    }//GEN-LAST:event_btnVendasActionPerformed
                        
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
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVendas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
