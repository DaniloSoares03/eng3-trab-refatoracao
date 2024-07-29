/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.poo.biblioteca.Interface;

import br.edu.ifpb.ads.poo.biblioteca.Controllers.AdicionarExemplarControl;
import br.edu.ifpb.ads.poo.biblioteca.Dao.BibliotecaDAO;
import br.edu.ifpb.ads.poo.biblioteca.Entidades.Exemplares;
import br.edu.ifpb.ads.poo.biblioteca.Entidades.Livro;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class AdicionarExemplarFrame extends javax.swing.JFrame {

    AdicionarExemplarControl adicionarExemplarControl;
    BibliotecaDAO bibliotecaDAO;

    /**
     * Creates new form AddLivroFrame
     */
    /**
     *
     * @throws IOException error de arquivo
     */
    public AdicionarExemplarFrame() throws IOException {
        initComponents();
        this.adicionarExemplarControl = new AdicionarExemplarControl();
        this.bibliotecaDAO = new BibliotecaDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        titulojTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        editorajTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ISBNjTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        numero_De_ExemplaresjLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        altoresjTextArea = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        descricaojTextArea = new javax.swing.JTextArea();
        cancelarjButton = new javax.swing.JButton();
        adicionarjButton = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        numero_De_PginasjFormattedTextField = new javax.swing.JFormattedTextField();
        numero_De_ExemplaresjFormattedTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Novo Livro");
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Titulo");

        titulojTextField.setFocusCycleRoot(true);
        titulojTextField.setFocusTraversalPolicyProvider(true);
        titulojTextField.setNextFocusableComponent(editorajTextField);

        jLabel16.setText("Editora");

        editorajTextField.setNextFocusableComponent(ISBNjTextField);
        editorajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorajTextFieldjTextField5ActionPerformed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("ISBN");

        ISBNjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISBNjTextFieldjTextField1ActionPerformed(evt);
            }
        });

        jLabel18.setText("Número de Páginas");

        numero_De_ExemplaresjLabel.setText("Número de Exemplares");

        altoresjTextArea.setColumns(20);
        altoresjTextArea.setRows(5);
        altoresjTextArea.setText("Entre cada autor coloque ponto e \nvirgula\n");
        altoresjTextArea.setNextFocusableComponent(adicionarjButton);
        altoresjTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                altoresjTextAreaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                altoresjTextAreaMouseExited(evt);
            }
        });
        altoresjTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                altoresjTextAreaKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(altoresjTextArea);

        jLabel20.setText("Autores");

        jLabel21.setText("Descrição");

        descricaojTextArea.setColumns(20);
        descricaojTextArea.setRows(5);
        descricaojTextArea.setNextFocusableComponent(altoresjTextArea);
        jScrollPane6.setViewportView(descricaojTextArea);

        cancelarjButton.setText("Cancelar");
        cancelarjButton.setNextFocusableComponent(titulojTextField);
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        adicionarjButton.setText("Adicionar");
        adicionarjButton.setNextFocusableComponent(cancelarjButton);
        adicionarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarjButtonActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setPreferredSize(new java.awt.Dimension(111, 111));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        try {
            numero_De_PginasjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            numero_De_ExemplaresjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editorajTextField)
                            .addComponent(titulojTextField)
                            .addComponent(ISBNjTextField)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(numero_De_ExemplaresjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numero_De_ExemplaresjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(adicionarjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarjButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numero_De_PginasjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(titulojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editorajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ISBNjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(numero_De_PginasjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero_De_ExemplaresjLabel)
                            .addComponent(numero_De_ExemplaresjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarjButton)
                            .addComponent(cancelarjButton)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editorajTextFieldjTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorajTextFieldjTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editorajTextFieldjTextField5ActionPerformed

    private void ISBNjTextFieldjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISBNjTextFieldjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ISBNjTextFieldjTextField1ActionPerformed

    private void adicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarjButtonActionPerformed
        if (this.ISBNjTextField.getText() == null || this.ISBNjTextField.getText().equals("")
                || this.numero_De_ExemplaresjFormattedTextField.getText() == null || this.numero_De_ExemplaresjFormattedTextField.getText().equals("")
                || this.numero_De_PginasjFormattedTextField.getText() == null || this.numero_De_PginasjFormattedTextField.getText().equals("")
                || this.titulojTextField.getText() == null || this.titulojTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os Campos Título, ISBN, Numero de Exemplares e Numero de Paginas são Obrigatorios");
        } else {
            try {
                List<String> autores = 
                        this.adicionarExemplarControl.separar_Altores(this.altoresjTextArea.getText());
                int numeroDePaginas = 
                        Integer.parseInt(this.numero_De_PginasjFormattedTextField.getText());
                Livro novoLivro = 
                        new Livro(this.ISBNjTextField.getText(), 
                                this.titulojTextField.getText(), autores,
                                this.editorajTextField.getText(), 
                                this.descricaojTextArea.getText(), numeroDePaginas);
                int numeroDeExemplares = 
                        Integer.parseInt(this.numero_De_ExemplaresjFormattedTextField.getText());
                Exemplares novoExemplar = new Exemplares(novoLivro, numeroDeExemplares);
                this.bibliotecaDAO.addExemplares(novoExemplar);
                this.ISBNjTextField.setText("");
                this.titulojTextField.setText("");
                this.descricaojTextArea.setText("");
                this.altoresjTextArea.setText("");
                this.editorajTextField.setText("");
                this.numero_De_ExemplaresjFormattedTextField.setText("");
                this.numero_De_PginasjFormattedTextField.setText("");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Exite Númericos Inválidos", "Error Type", JOptionPane.ERROR_MESSAGE);
                this.numero_De_ExemplaresjFormattedTextField.setText("");
                this.numero_De_PginasjFormattedTextField.setText("");
            }
        }
    }//GEN-LAST:event_adicionarjButtonActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void altoresjTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_altoresjTextAreaMouseClicked
        if (this.altoresjTextArea.getText().equals("Entre cada autor coloque ponto e \n" + "virgula\n" + "")) {
            this.altoresjTextArea.setText("");
        }
    }//GEN-LAST:event_altoresjTextAreaMouseClicked

    private void altoresjTextAreaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_altoresjTextAreaMouseExited
        if (this.altoresjTextArea.getText().equals("")) {
            this.altoresjTextArea.setText("Entre cada autor coloque ponto e \n" + "virgula\n" + "");
        }
    }//GEN-LAST:event_altoresjTextAreaMouseExited

    private void altoresjTextAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_altoresjTextAreaKeyPressed
        if (this.altoresjTextArea.getText().equals("Entre cada autor coloque ponto e \n" + "virgula\n" + "")) {
            this.altoresjTextArea.setText("");
        }
    }//GEN-LAST:event_altoresjTextAreaKeyPressed

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
            java.util.logging.Logger.getLogger(AdicionarExemplarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarExemplarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarExemplarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarExemplarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdicionarExemplarFrame().setVisible(true);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ISBNjTextField;
    private javax.swing.JButton adicionarjButton;
    private javax.swing.JTextArea altoresjTextArea;
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JTextArea descricaojTextArea;
    private javax.swing.JTextField editorajTextField;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JFormattedTextField numero_De_ExemplaresjFormattedTextField;
    private javax.swing.JLabel numero_De_ExemplaresjLabel;
    private javax.swing.JFormattedTextField numero_De_PginasjFormattedTextField;
    private javax.swing.JTextField titulojTextField;
    // End of variables declaration//GEN-END:variables
}
