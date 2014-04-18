package br.com.core.visao;

import javax.swing.JOptionPane;
import br.com.core.controle.Validacoes;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 * @author Core System™
 * @version v1.0
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(getOwner());
        this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("/_imgs/logo_empresa.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskPane = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mCadastros = new javax.swing.JMenu();
        miMaterial = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mMovimentacao = new javax.swing.JMenu();
        miRecebimento = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mConfiguracoes = new javax.swing.JMenu();
        miEmpresa = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maraschin - Móveis Rústicos");
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setName("jFramePrincipal"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 30));
        jPanel1.setLayout(null);

        mCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Cadastrar.png"))); // NOI18N
        mCadastros.setText("Cadastros");

        miMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Meus Icones/Material.png"))); // NOI18N
        miMaterial.setText("Material");
        miMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMaterialActionPerformed(evt);
            }
        });
        mCadastros.add(miMaterial);

        jMenuItem3.setText("Fornecedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mCadastros.add(jMenuItem3);

        jMenuBar1.add(mCadastros);

        mMovimentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Movimentacoes.png"))); // NOI18N
        mMovimentacao.setText("Movimentação");

        miRecebimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Meus Icones/Recebimento.png"))); // NOI18N
        miRecebimento.setText("Recebimento");
        miRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRecebimentoActionPerformed(evt);
            }
        });
        mMovimentacao.add(miRecebimento);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Meus Icones/Retirada.png"))); // NOI18N
        jMenuItem1.setText("Retirada");
        mMovimentacao.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Meus Icones/Graphic.png"))); // NOI18N
        jMenuItem2.setText("Balanço");
        mMovimentacao.add(jMenuItem2);

        jMenuBar1.add(mMovimentacao);

        mConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Configurar.png"))); // NOI18N
        mConfiguracoes.setText("Configurações");

        miEmpresa.setText("Empresa");
        miEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEmpresaActionPerformed(evt);
            }
        });
        mConfiguracoes.add(miEmpresa);

        jMenuBar1.add(mConfiguracoes);

        mSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Logout.png"))); // NOI18N
        mSair.setText("Sair");
        mSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(mSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3069, Short.MAX_VALUE))
            .addComponent(deskPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(deskPane, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void miRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRecebimentoActionPerformed
        FrmRecebimento rec = new FrmRecebimento(this);
        Validacoes valida = new Validacoes();
        valida.posicao(this, rec);
        if (valida.isInstanceIn(deskPane, rec) == true) {
            JOptionPane.showMessageDialog(null, "Já está aberto");
            valida.selecionaFrame(rec);
        } else {
            deskPane.add(rec);
            valida.selecionaFrame(rec);
        }
    }//GEN-LAST:event_miRecebimentoActionPerformed

    @SuppressWarnings("empty-statement")
    private void miMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMaterialActionPerformed
        FrmCadMaterial cad = new FrmCadMaterial(this);
        Validacoes valida = new Validacoes();
        valida.posicao(this, cad);
        if (valida.isInstanceIn(deskPane, cad) == true) {
            JOptionPane.showMessageDialog(null, "Já está aberto"); // Este comentário seria substituído por algum método para colocar o iFrame na frente dos outros que estivessem abertos
            valida.selecionaFrame(cad);
            cad.toFront();
        } else {
            deskPane.add(cad);
            valida.selecionaFrame(cad);
        }
    }//GEN-LAST:event_miMaterialActionPerformed

    private void miEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmpresaActionPerformed
        JInternalFrame emp = new FrmCadEmpresa();
        Validacoes valida = new Validacoes();
        valida.posicao(this, emp);
        if (valida.isInstanceIn(deskPane, emp) == true) {
            JOptionPane.showMessageDialog(null, "Já está aberto"); // Este comentário seria substituído por algum método para colocar o iFrame na frente dos outros que estivessem abertos
           
            emp.moveToFront();
        } else {
            deskPane.add(emp);
            valida.selecionaFrame(emp);
        }
    }//GEN-LAST:event_miEmpresaActionPerformed

    private void mSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSairMouseClicked
        if(JOptionPane.showConfirmDialog(this, "Deseja realmente sair?","Sair",JOptionPane.YES_NO_OPTION) == 0){
            System.exit(0);
        }else{}
    }//GEN-LAST:event_mSairMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     
     deskPane.add(FrmFornecedor.getInstancia());

        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mCadastros;
    private javax.swing.JMenu mConfiguracoes;
    private javax.swing.JMenu mMovimentacao;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenuItem miEmpresa;
    private javax.swing.JMenuItem miMaterial;
    private javax.swing.JMenuItem miRecebimento;
    // End of variables declaration//GEN-END:variables
}
