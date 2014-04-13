package br.com.core.visao;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import br.com.core.controle.TamanhoFixo;
import br.com.core.controle.UpperCaseDocument;
import br.com.core.controle.Validacoes;
import javax.swing.JOptionPane;

/**
 * @author Core System™
 * @version v1.0
 */
public final class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.getContentPane().setBackground(Color.BLUE);
        lblLogo.setIcon(GeraThumbnail(lblLogo.getWidth(), lblLogo.getHeight()));
        setLocationRelativeTo(getOwner());
        this.getContentPane().setBackground(new Color(0, 0, 0));
        this.setIconImage(new ImageIcon(getClass().getResource("/_imgs/logo_empresa.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogar = new javax.swing.JButton();
        btnLogar1 = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mararschin - Móveis Rústicos");
        setUndecorated(true);

        pnlLogin.setBackground(new java.awt.Color(0, 0, 255));
        pnlLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlLogin.setAlignmentX(0.0F);
        pnlLogin.setAlignmentY(0.0F);
        pnlLogin.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(159, 205, 250));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlLogin.add(jSeparator1);
        jSeparator1.setBounds(330, 0, 1, 220);

        jSeparator2.setForeground(new java.awt.Color(159, 205, 250));
        pnlLogin.add(jSeparator2);
        jSeparator2.setBounds(0, 220, 500, 1);

        btnLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Meus Icones/Logar.png"))); // NOI18N
        btnLogar.setBorderPainted(false);
        btnLogar.setContentAreaFilled(false);
        btnLogar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLogar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogar);
        btnLogar.setBounds(360, 180, 60, 40);

        btnLogar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Meus Icones/Logout.png"))); // NOI18N
        btnLogar1.setBorderPainted(false);
        btnLogar1.setContentAreaFilled(false);
        btnLogar1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLogar1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnLogar1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnLogar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogar1ActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogar1);
        btnLogar1.setBounds(426, 180, 60, 40);

        lblUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuário:");
        pnlLogin.add(lblUsuario);
        lblUsuario.setBounds(360, 90, 60, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha:");
        pnlLogin.add(jLabel1);
        jLabel1.setBounds(360, 130, 60, 20);

        txtUsuario.setDocument(new UpperCaseDocument());
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
        });
        pnlLogin.add(txtUsuario);
        txtUsuario.setBounds(360, 110, 126, 22);

        txtSenha.setDocument(new TamanhoFixo(15));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
        });
        pnlLogin.add(txtSenha);
        txtSenha.setBounds(360, 150, 126, 22);

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setMaximumSize(new java.awt.Dimension(430, 290));
        lblLogo.setMinimumSize(new java.awt.Dimension(430, 290));
        lblLogo.setPreferredSize(new java.awt.Dimension(430, 290));
        pnlLogin.add(lblLogo);
        lblLogo.setBounds(0, 0, 328, 220);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Lock.png"))); // NOI18N
        pnlLogin.add(jLabel2);
        jLabel2.setBounds(330, 20, 170, 60);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/backgroundLogin.jpg"))); // NOI18N
        pnlLogin.add(lblFundo);
        lblFundo.setBounds(0, 0, 500, 240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        if (txtSenha.getText() != null) {
            txtSenha.selectAll();
        }
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        if (txtUsuario.getText() != null) {
            txtUsuario.selectAll();
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void btnLogar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLogar1ActionPerformed

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed

        if (!txtUsuario.getText().isEmpty() && !txtSenha.getText().isEmpty()) {
            Validacoes valida = new Validacoes();
            boolean valido = valida.isValidLogin(txtUsuario.getText(), txtSenha.getText());
            if (valido == true) {
                Principal principal = new Principal();
                principal.setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para efetuar o login!", "Atenção", JOptionPane.WARNING_MESSAGE);
            txtUsuario.requestFocus();
        }

    }//GEN-LAST:event_btnLogarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtSenha.requestFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        btnLogarActionPerformed(evt);
    }//GEN-LAST:event_txtSenhaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public ImageIcon GeraThumbnail(int labelWidth, int labelHeight) {
        ImageIcon imagem = new ImageIcon(getClass().getResource("/_imgs/logo.png"));
        @SuppressWarnings("UnusedAssignment")
        ImageIcon thumbnail = null;
        if (imagem.getIconWidth() > labelWidth) {
            thumbnail = new ImageIcon(
                    imagem.getImage().getScaledInstance(labelWidth, labelHeight, Image.SCALE_DEFAULT));
        } else {
            thumbnail = imagem;
        }

        return thumbnail;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton btnLogar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
