/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.poo.biblioteca.Interface;

import br.edu.ifpb.ads.poo.biblioteca.Dao.BibliotecaDAO;
import br.edu.ifpb.ads.poo.biblioteca.Entidades.Aluno;
import br.edu.ifpb.ads.poo.biblioteca.Entidades.Constans;
import br.edu.ifpb.ads.poo.biblioteca.Entidades.Funcionario;
import br.edu.ifpb.ads.poo.biblioteca.Entidades.Usuario;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class AlterarSenhaFrame extends javax.swing.JFrame {

    private Usuario funcionario;
    BibliotecaDAO bibliotecaDAO;

    /**
     * Creates new form AlterarSenhaFrame
     */
    public AlterarSenhaFrame() {
        initComponents();
    }

    AlterarSenhaFrame(Usuario funcionario_Logado) throws IOException {
        this.funcionario = funcionario_Logado;
        bibliotecaDAO = new BibliotecaDAO();
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        senhaAntigajPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        novaSenhajPasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        confirmNovaSenhajPasswordField = new javax.swing.JPasswordField();
        salvarjButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trocar Senha");
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Senha Antiga");

        senhaAntigajPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaAntigajPasswordFieldActionPerformed(evt);
            }
        });
        senhaAntigajPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                senhaAntigajPasswordFieldKeyTyped(evt);
            }
        });

        jLabel2.setText("Nova Senha");

        novaSenhajPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaSenhajPasswordFieldActionPerformed(evt);
            }
        });
        novaSenhajPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                novaSenhajPasswordFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Repita a Nova Senha");

        confirmNovaSenhajPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmNovaSenhajPasswordFieldActionPerformed(evt);
            }
        });
        confirmNovaSenhajPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confirmNovaSenhajPasswordFieldKeyTyped(evt);
            }
        });

        salvarjButton.setText("Salvar");
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salvarjButton)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmNovaSenhajPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(novaSenhajPasswordField)
                            .addComponent(senhaAntigajPasswordField))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(senhaAntigajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(novaSenhajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(confirmNovaSenhajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarjButton)
                    .addComponent(jButton2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private boolean validarSenhaAntiga(Funcionario funcionario) {
        return this.senhaAntigajPasswordField.getText().equals(funcionario.getSenha());
    }

    private boolean validarSenhasIguais() {
        return this.novaSenhajPasswordField.getText().equals(this.confirmNovaSenhajPasswordField.getText());
    }
    

    private boolean camposNovaSenhaVazios() {
    	return this.novaSenhajPasswordField.getText().isEmpty() || this.confirmNovaSenhajPasswordField.getText().isEmpty();
	}

	private boolean validarSenhaAntiga() {
    	return this.senhaAntigajPasswordField.getText().equals(this.funcionario.getSenha());
	}

	private void processarMudancaSenha() {
		if (validarSenhasIguais()) {
			try {
				this.funcionario.setSenha(this.confirmNovaSenhajPasswordField.getText());
				if (this.funcionario instanceof Funcionario) {
					bibliotecaDAO.editFuncionarios((Funcionario) this.funcionario);
				} else if (this.funcionario instanceof Aluno) {
					bibliotecaDAO.editAlunos((Aluno) this.funcionario);
					JOptionPane.showMessageDialog(null, "Senha Alterada Com Sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
				}
				this.dispose();
			} catch (IOException | ClassNotFoundException ex) {
				mostrarErro("Arquivo não encontrado");
			}
		} else {
			mostrarErro("Campos de Nova Senha Diferentes!");
		}
	}

	private void mostrarErro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Error", JOptionPane.ERROR_MESSAGE);
	}
    
	private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {
	    if (this.senhaAntigajPasswordField.getText() == null || this.senhaAntigajPasswordField.getText().equals("")) {
	        mostrarErro("Campo de Antiga Senha Vazio");
	    } else if (camposNovaSenhaVazios()) {
	        mostrarErro("Campos de Nova Senha Vazios");
	    } else if (validarSenhaAntiga()) {
	        processarMudancaSenha();
	    } else {
	        mostrarErro("Senha Antiga Incorreta!");
	    }
	}//GEN-LAST:event_salvarjButtonActionPerformed

    private void novaSenhajPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaSenhajPasswordFieldActionPerformed
        this.salvarjButton.doClick();
    }//GEN-LAST:event_novaSenhajPasswordFieldActionPerformed

    private void senhaAntigajPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaAntigajPasswordFieldKeyTyped
        int tamanho = senhaAntigajPasswordField.getText().length();
        if (tamanho > Constans.TAMANHO_DE_SENHA) {
            evt.consume();
        }
    }//GEN-LAST:event_senhaAntigajPasswordFieldKeyTyped

    private void novaSenhajPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novaSenhajPasswordFieldKeyTyped
        int tamanho = novaSenhajPasswordField.getText().length();
        if (tamanho > Constans.TAMANHO_DE_SENHA) {
            evt.consume();
        }
    }//GEN-LAST:event_novaSenhajPasswordFieldKeyTyped

    private void confirmNovaSenhajPasswordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmNovaSenhajPasswordFieldKeyTyped
        int tamanho = confirmNovaSenhajPasswordField.getText().length();
        if (tamanho > Constans.TAMANHO_DE_SENHA) {
            evt.consume();
        }
    }//GEN-LAST:event_confirmNovaSenhajPasswordFieldKeyTyped

    private void confirmNovaSenhajPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmNovaSenhajPasswordFieldActionPerformed
        this.salvarjButton.doClick();
    }//GEN-LAST:event_confirmNovaSenhajPasswordFieldActionPerformed

    private void senhaAntigajPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaAntigajPasswordFieldActionPerformed
        this.salvarjButton.doClick();
    }//GEN-LAST:event_senhaAntigajPasswordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarSenhaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarSenhaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarSenhaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarSenhaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarSenhaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmNovaSenhajPasswordField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField novaSenhajPasswordField;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JPasswordField senhaAntigajPasswordField;
    // End of variables declaration//GEN-END:variables
}
