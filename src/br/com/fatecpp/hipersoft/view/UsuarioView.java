package br.com.fatecpp.hipersoft.view;

import br.com.fatecpp.hipersoft.model.dao.UsuarioDAO;
import br.com.fatecpp.hipersoft.model.domain.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioView extends javax.swing.JFrame {
    
    private DefaultTableModel tabelaUsuarios = new DefaultTableModel();
    private List<Usuario> lista;
    
    public UsuarioView() {
        initComponents();
        atualizarTabela();
        setExtendedState(MAXIMIZED_BOTH);
        btnConsultar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
     private void atualizarTabela(){
        
        String codigo = txtCodigo.toString();
        String nome = txtNome.toString();
        
        if (codigo.equals(codigo)) {
            lista = UsuarioDAO.getUnicaInstancia().consultar("consultarPorId", txtCodigo.getText());
        } else if (nome.equals("Nome")) {
            lista = UsuarioDAO.getUnicaInstancia().consultar("consultarPorNome", txtNome.getText());
        }
        
        lista =  UsuarioDAO.getUnicaInstancia().consultar("consultarPorId", txtNome.getText());
        if(lista != null){
            tabelaUsuarios = (DefaultTableModel) tblUsuarios.getModel();
            while(tabelaUsuarios.getRowCount()>0){
                tabelaUsuarios.removeRow(0);
            }
            for(Usuario u : lista){
                tabelaUsuarios.addRow(new Object[]{u.getUsuCod(),u.getUsuNome(),});
            }
        }
        txtNome.setText("");
        txtCodigo.setText("");
        txtSenha.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Usuarios");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 20, 140, 35);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 819;
        gridBagConstraints.ipady = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        btnConsultar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(0, 102, 102));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 61;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 42, 0);
        getContentPane().add(btnConsultar, gridBagConstraints);

        btnAlterar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 102, 102));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 42, 0);
        getContentPane().add(btnAlterar, gridBagConstraints);

        btnExcluir.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 102, 102));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 42, 0);
        getContentPane().add(btnExcluir, gridBagConstraints);

        btnCadastrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 102, 102));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 61;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 42, 0);
        getContentPane().add(btnCadastrar, gridBagConstraints);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 27, 598, -1));
        jPanel9.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 58, 114, -1));

        txtCodigo.setEnabled(false);
        jPanel9.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 58, 105, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setText("Codígo");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 61, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setText("Nome");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setText("Senha");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 61, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 30, 0, 0);
        getContentPane().add(jPanel9, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 153, 153)));
        jPanel2.setToolTipText("Dados Gerais");
        jPanel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jPanel2.setName("Dados Gerais"); // NOI18N
        jPanel2.setLayout(null);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 730, 200);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 749;
        gridBagConstraints.ipady = 219;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        getContentPane().add(jPanel2, gridBagConstraints);

        btnVoltar.setForeground(new java.awt.Color(51, 51, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 120, 0, 0);
        getContentPane().add(btnVoltar, gridBagConstraints);

        btnFiltrar.setForeground(new java.awt.Color(51, 51, 255));
        btnFiltrar.setText("Filtrar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        getContentPane().add(btnFiltrar, gridBagConstraints);

        btnLimpar.setForeground(new java.awt.Color(51, 51, 255));
        btnLimpar.setText("Limpar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 6, 0, 0);
        getContentPane().add(btnLimpar, gridBagConstraints);

        setSize(new java.awt.Dimension(820, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int linha = tblUsuarios.getSelectedRow();
        txtCodigo.setText(String.valueOf(lista.get(linha).getUsuCod()));
        txtNome.setText(lista.get(linha).getUsuNome());
        txtSenha.setText(lista.get(linha).getUsuSenha());
        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Usuario usuario = new Usuario(txtNome.getText(), txtSenha.getText());
        UsuarioDAO.getUnicaInstancia().inserir(usuario);
        JOptionPane.showMessageDialog(null, "Registro Inserido");
        this.setupInit();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Usuario usuario = new Usuario(txtNome.getText(), txtSenha.getText());

        UsuarioDAO.getUnicaInstancia().alterar(usuario);
        JOptionPane.showMessageDialog(null, "Registro Alterado!");
        this.setupInit();
        
        atualizarTabela();
        btnCadastrar.setEnabled(true);//habilita o botão
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
     tabelaUsuarios = (DefaultTableModel) tblUsuarios.getModel();

        String id = txtCodigo.toString();

        if (!(id.equals(""))) {
            lista = UsuarioDAO.getUnicaInstancia().consultar("consultarPorId", txtNome.getText());
        }

        if (lista.size() > 0) {
            while (tabelaUsuarios.getRowCount() > 0) {
                tabelaUsuarios.removeRow(0);
            }
            for (Usuario u : lista) {
                tabelaUsuarios.addRow(
                        new Object[]{
                            u.getUsuCod(),
                            u.getUsuNome()
                        });
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum resgistro encontrado!");
        }                                            
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Usuario usuario = new Usuario(Integer.parseInt(txtCodigo.getText()));
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Excluir Registro", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION){
			UsuarioDAO.getUnicaInstancia().excluir(usuario);
			JOptionPane.showMessageDialog(null, "Registro Excluído!");
		}
        this.setupInit();
        atualizarTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void setupInit() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtSenha.setText("");
        btnCadastrar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        while (tabelaUsuarios.getRowCount() > 0) {
            tabelaUsuarios.removeRow(0);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
