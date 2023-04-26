/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Utils.Utils;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class frmCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form frmCadastroUsuario
     */
    public frmCadastroUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        txtNomeUsuarioCadastro = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenhaCadastro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmarSenhaCadastro = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        botaoRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome do Usuário");

        txtNomeUsuarioCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioCadastroActionPerformed(evt);
            }
        });

        jLabel2.setText("Cpf");

        jLabel3.setText("Senha");

        jLabel4.setText("Confirmar Senha");

        txtGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Estoquista", "Cliente" }));
        txtGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoActionPerformed(evt);
            }
        });

        jLabel5.setText("Grupo");

        botaoRegistrar.setText("Registrar");
        botaoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        txtEmailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(175, 175, 175)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botaoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(txtConfirmarSenhaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                        .addComponent(txtGrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNomeUsuarioCadastro)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(89, 89, 89)
                                            .addComponent(jLabel1))))))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeUsuarioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmarSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(botaoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoActionPerformed

    }//GEN-LAST:event_txtGrupoActionPerformed

    private void botaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarActionPerformed
        UsuarioDAO usuarioDao = new UsuarioDAO();
        UsuarioDTO usuarioDto = new UsuarioDTO();

        String emailUsuario = txtEmailUsuario.getText();
        String nomeUsuario = txtNomeUsuarioCadastro.getText();
        String senhaUsuario = txtSenhaCadastro.getText();
        String confirmarSenha = txtConfirmarSenhaCadastro.getText();
        String cpf = txtCpf.getText();
        String grupo = txtGrupo.getSelectedItem().toString();

        if (nomeUsuario.isEmpty() || senhaUsuario.isEmpty() || confirmarSenha.isEmpty() || cpf.isEmpty() || grupo.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "É necessário preencher todos os campos. ");
            return;
        }

        if (!Utils.validarCPF(cpf)) {
            JOptionPane.showMessageDialog(rootPane, "cpf inválido");
            return;
        }

        if (!Utils.validarSenha(senhaUsuario, confirmarSenha)) {
            JOptionPane.showMessageDialog(rootPane, "Senha inválida");
            return;

        }

        usuarioDao.buscarUsuarios().forEach(u -> {
            if (u.getEmail_usuario().equals(emailUsuario)) {
                JOptionPane.showMessageDialog(rootPane, "Usuário já cadastrado");
                return;
            }
        }
        );
        
        try {
            usuarioDto.setEmail_usuario(emailUsuario);
            usuarioDto.setNome_usuario(nomeUsuario);
            usuarioDto.setSenha_usuario(senhaUsuario);
            usuarioDto.setGrupo_usuario(grupo.substring(0,1));
            usuarioDto.setCpf_usuario(cpf);
            usuarioDao.create(usuarioDto);
            JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao acessar banco");
        }
    }//GEN-LAST:event_botaoRegistrarActionPerformed

    private void txtNomeUsuarioCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioCadastroActionPerformed

    private void txtEmailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtConfirmarSenhaCadastro;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JComboBox<String> txtGrupo;
    private javax.swing.JTextField txtNomeUsuarioCadastro;
    private javax.swing.JTextField txtSenhaCadastro;
    // End of variables declaration//GEN-END:variables
}