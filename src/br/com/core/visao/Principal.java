package br.com.core.visao;

import javax.swing.JOptionPane;
import br.com.core.predefinido.Validacoes;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
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

        jPanel1 = new javax.swing.JPanel();
        deskPane = new javax.swing.JLayeredPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mCadastros = new javax.swing.JMenu();
        miMaterial = new javax.swing.JMenuItem();
        miFornecedor = new javax.swing.JMenuItem();
        mTabelas = new javax.swing.JMenu();
        miCidade = new javax.swing.JMenuItem();
        miUF = new javax.swing.JMenuItem();
        mMovimentacao = new javax.swing.JMenu();
        miRecebimento = new javax.swing.JMenuItem();
        miVenda = new javax.swing.JMenuItem();
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

        miMaterial.setText("Material");
        miMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMaterialActionPerformed(evt);
            }
        });
        mCadastros.add(miMaterial);

        miFornecedor.setText("Fornecedor");
        miFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        mCadastros.add(miFornecedor);

        mTabelas.setText("Tabelas");

        miCidade.setText("Cidade");
        miCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCidadeActionPerformed(evt);
            }
        });
        mTabelas.add(miCidade);

        miUF.setText("UF");
        mTabelas.add(miUF);

        mCadastros.add(mTabelas);

        jMenuBar1.add(mCadastros);

        mMovimentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_imgs/Movimentacoes.png"))); // NOI18N
        mMovimentacao.setText("Movimentação");

        miRecebimento.setText("Recebimento");
        miRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRecebimentoActionPerformed(evt);
            }
        });
        mMovimentacao.add(miRecebimento);

        miVenda.setText("Venda");
        miVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        mMovimentacao.add(miVenda);

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
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(deskPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(deskPane, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings({"empty-statement", "CallToThreadDumpStack"})
    private void miRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRecebimentoActionPerformed
        if (recebimento != null && !recebimento.isVisible()) {
            deskPane.remove(recebimento);
            recebimento = null;
        }
        if (recebimento == null) {
            recebimento = new FrmRecebimento(this);
            Validacoes v = new Validacoes();
            v.posicao(this, recebimento);
            deskPane.add(recebimento);
            try {
                recebimento.setSelected(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
        } else {
            recebimento.toFront();
        }
    }//GEN-LAST:event_miRecebimentoActionPerformed

    @SuppressWarnings({"empty-statement", "CallToThreadDumpStack"})
    private void miMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMaterialActionPerformed

        if (getCadMaterial() != null && !cadMaterial.isVisible()) {
            deskPane.remove(getCadMaterial());
            setCadMaterial(null);
        }
        if (getCadMaterial() == null) {
            setCadMaterial(new FrmCadMaterial(this));
            Validacoes v = new Validacoes();
            v.posicao(this, getCadMaterial());
            deskPane.add(getCadMaterial());
            try {
                getCadMaterial().setSelected(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
        } else {
            getCadMaterial().toFront();
        }

    }//GEN-LAST:event_miMaterialActionPerformed

    @SuppressWarnings("CallToThreadDumpStack")
    private void miEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEmpresaActionPerformed
        if (getCadEmpresa() != null && !cadEmpresa.isVisible()) {
            deskPane.remove(getCadEmpresa());
            setCadEmpresa(null);
        }
        if (getCadEmpresa() == null) {
            setCadEmpresa(new FrmCadEmpresa());
            Validacoes v = new Validacoes();
            v.posicao(this, getCadEmpresa());
            deskPane.add(getCadEmpresa());
            try {
                getCadEmpresa().setSelected(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
        } else {
            getCadEmpresa().toFront();
        }
    }//GEN-LAST:event_miEmpresaActionPerformed

    private void mSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSairMouseClicked
        int x = JOptionPane.showConfirmDialog(this, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_mSairMouseClicked

    @SuppressWarnings("CallToThreadDumpStack")
    private void miFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFornecedorActionPerformed
        if (getCadFornecedor() != null && !cadFornecedor.isVisible()) {
            deskPane.remove(getCadFornecedor());
            setCadFornecedor(null);
        }
        if (getCadFornecedor() == null) {
            setCadFornecedor(new FrmFornecedor());
            Validacoes v = new Validacoes();
            v.posicao(this, getCadFornecedor());
            deskPane.add(getCadFornecedor());
            try {
                getCadFornecedor().setSelected(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
        } else {
            getCadFornecedor().toFront();
        }
    }//GEN-LAST:event_miFornecedorActionPerformed

    @SuppressWarnings("CallToThreadDumpStack")
    private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaActionPerformed
         //Validacoes v = new Validacoes();
         //v.a(deskPane, this, new FrmUnidadeMedida());
        
    }//GEN-LAST:event_miVendaActionPerformed

    private void miCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCidadeActionPerformed
        if (getCadCidade() != null && !cadCidade.isVisible()) {
            deskPane.remove(getCadCidade());
            setCadCidade(null);
        }
        if (getCadCidade() == null) {
            setCadCidade(new FrmCidade());
            Validacoes v = new Validacoes();
            v.posicao(this, getCadCidade());
            deskPane.add(getCadCidade());
            try {
                getCadCidade().setSelected(true);
            } catch (PropertyVetoException ex) {
                ex.printStackTrace();
            }
        } else {
            getCadCidade().toFront();
        }
    }//GEN-LAST:event_miCidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane deskPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mCadastros;
    private javax.swing.JMenu mConfiguracoes;
    private javax.swing.JMenu mMovimentacao;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenu mTabelas;
    private javax.swing.JMenuItem miCidade;
    private javax.swing.JMenuItem miEmpresa;
    private javax.swing.JMenuItem miFornecedor;
    private javax.swing.JMenuItem miMaterial;
    private javax.swing.JMenuItem miRecebimento;
    private javax.swing.JMenuItem miUF;
    private javax.swing.JMenuItem miVenda;
    // End of variables declaration//GEN-END:variables
    private JInternalFrame cadMaterial;
    private JInternalFrame cadEmpresa;
    private JInternalFrame cadFornecedor;
    private JInternalFrame unidadeMedida;
    private JInternalFrame recebimento;
    private JInternalFrame cadCidade;

    
    public JInternalFrame getCadMaterial() {
        return cadMaterial;
    }

    public void setCadMaterial(JInternalFrame cadMaterial) {
        this.cadMaterial = cadMaterial;
    }

    public JInternalFrame getCadEmpresa() {
        return cadEmpresa;
    }

    public void setCadEmpresa(JInternalFrame cadEmpresa) {
        this.cadEmpresa = cadEmpresa;
    }

    public JInternalFrame getCadFornecedor() {
        return cadFornecedor;
    }

    public void setCadFornecedor(JInternalFrame cadFornecedor) {
        this.cadFornecedor = cadFornecedor;
    }

    public JInternalFrame getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(JInternalFrame unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public JLayeredPane getDeskPane() {
        return deskPane;
    }

    public void setDeskPane(JLayeredPane deskPane) {
        this.deskPane = deskPane;
    }

    public JInternalFrame getCadCidade() {
        return cadCidade;
    }

    public void setCadCidade(JInternalFrame cadCidade) {
        this.cadCidade = cadCidade;
    }
}
