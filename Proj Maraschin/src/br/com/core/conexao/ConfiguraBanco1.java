package br.com.core.conexao;

import java.awt.Color;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Core System™
 * @version v1.0
 */
public class ConfiguraBanco1 extends javax.swing.JFrame {

    public ConfiguraBanco1() {
        initComponents();
        pegaCaminhoArquivoXML();
        getContentPane().setBackground(new Color(250, 250, 250));
        setLocationRelativeTo(getOwner());
    }

    @SuppressWarnings("CallToThreadDumpStack")
    private void pegaCaminhoArquivoXML() {
        try {
            File xml = new File("config.xml");
            boolean x = false;
            while (x != true) {
                if (xml.isFile() && xml.exists()) {
                    txtCaminhoArquivoXML.setBackground(new java.awt.Color(50, 255, 50));
                    txtCaminhoArquivoXML.setText(xml.getAbsolutePath());
                    FileReader fileR = new FileReader(xml);
                    try (BufferedReader buffR = new BufferedReader(fileR)) {
                        String ip = buffR.readLine();
                        txtIPServidor.setText(ip.substring((ip.indexOf("<ipServidor>") + 12), ip.lastIndexOf("</ipServidor>")));
                        String banco = buffR.readLine();
                        txtCaminhoBanco.setText(banco.substring((banco.lastIndexOf("<caminhoBanco>") + 14), banco.lastIndexOf("</caminhoBanco>")));
                    }
                    x = true;
                } else if (JOptionPane.showConfirmDialog(null, "Arquivo de configuração não encontrado!\nDeseja criar?", "Atenção!", JOptionPane.YES_NO_OPTION) == 0) {
                    criaXML("[IP DO SERVIDOR]", "[CAMINHO DO BANCO DE DADOS]");
                } else {
                    txtCaminhoArquivoXML.setBackground(new java.awt.Color(255, 40, 40));
                    txtCaminhoArquivoXML.setText("O arquivo de configuração ainda não foi criado!");
                    x = true;
                }
            }
        } catch (IOException | HeadlessException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIPServidor = new javax.swing.JTextField();
        txtCaminhoBanco = new javax.swing.JTextField();
        txtCaminhoArquivoXML = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSelecionaBanco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configurar caminho do Banco de Dados");
        setBackground(new java.awt.Color(250, 250, 250));
        setMinimumSize(new java.awt.Dimension(503, 197));
        setResizable(false);

        txtIPServidor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIPServidorFocusGained(evt);
            }
        });

        txtCaminhoArquivoXML.setEditable(false);
        txtCaminhoArquivoXML.setBackground(new java.awt.Color(245, 245, 245));
        txtCaminhoArquivoXML.setDisabledTextColor(new java.awt.Color(250, 250, 250));
        txtCaminhoArquivoXML.setDoubleBuffered(true);
        txtCaminhoArquivoXML.setFocusable(false);

        jLabel1.setBackground(new java.awt.Color(178, 178, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText(" Informe o caminho do banco de dados!");
        jLabel1.setOpaque(true);

        jLabel2.setText("IP do Servidor:");

        jLabel3.setText("Caminho do Banco:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSelecionaBanco.setText("Selecionar Banco");
        btnSelecionaBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionaBancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCaminhoArquivoXML)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIPServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaminhoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelecionaBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIPServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaminhoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelecionaBanco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCaminhoArquivoXML, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtCaminhoBanco.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSelecionaBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaBancoActionPerformed
        JFileChooser flc = new JFileChooser();
        flc.setMultiSelectionEnabled(false);
        flc.setFileFilter(new FileNameExtensionFilter("Banco de Dados \".gdb\" e \".fdb\"", new String[]{"gdb", "fdb"}));
        flc.setDialogTitle("Selecionar Banco de Dados");

        boolean stop = false;
        while (stop != true) {
            if (flc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                if (!flc.getSelectedFile().getName().toLowerCase().endsWith(".gdb") && !flc.getSelectedFile().getName().toLowerCase().endsWith(".fdb")) {
                    JOptionPane.showMessageDialog(null, "Arquivo não suportado!");
                } else {
                    txtCaminhoBanco.setText(flc.getSelectedFile().getAbsolutePath());
                    stop = true;
                }
            } else {
                stop = true;
            }
        }
    }//GEN-LAST:event_btnSelecionaBancoActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        if (!txtCaminhoBanco.getText().isEmpty() && (txtCaminhoBanco.getText().contains(":/") || txtCaminhoBanco.getText().contains(":\\"))) {

            JTextField pwd = new JPasswordField(10);
            JLabel label = new JLabel("Digite a senha:");
            pwd.requestFocus();
            JOptionPane.showConfirmDialog(null, new Object[]{label, pwd},"Senha:", JOptionPane.OK_CANCEL_OPTION);

            if (pwd.getText().equals("123")) {
                criaXML(txtIPServidor.getText(), txtCaminhoBanco.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtIPServidorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIPServidorFocusGained
        txtIPServidor.selectAll();
    }//GEN-LAST:event_txtIPServidorFocusGained

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ConfiguraBanco1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfiguraBanco1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfiguraBanco1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfiguraBanco1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConfiguraBanco1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSelecionaBanco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtCaminhoArquivoXML;
    private javax.swing.JTextField txtCaminhoBanco;
    private javax.swing.JTextField txtIPServidor;
    // End of variables declaration//GEN-END:variables

    private void criaXML(String ip, String caminho) {
        try {
            File db = new File("config.xml");
            db.createNewFile();
            FileWriter fileW = new FileWriter(db.getAbsolutePath());
            BufferedWriter buffW = new BufferedWriter(fileW);
            buffW.write("<ipServidor>" + ip + "</ipServidor>");
            buffW.newLine();
            buffW.write("<caminhoBanco>" + caminho + "</caminhoBanco>");
            buffW.close();
        } catch (IOException | HeadlessException e) {
        }
    }
}
