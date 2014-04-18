
package br.com.core.visao;

import java.awt.Color;

/**
 *
 * @author Anderson Carlos
 */
public class CadastroCliente1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmPessoa
     */
    public CadastroCliente1() {
       initComponents();
    getContentPane().setBackground(new Color(242, 242, 242));
    
    }

    //contrutor initConponents abaixo
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GtoupButtonSexo = new javax.swing.ButtonGroup();
        pnlPrincipal = new javax.swing.JPanel();
        pnlEndereco = new javax.swing.JPanel();
        lblLogradouro = new javax.swing.JLabel();
        lblMunicipio = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        lblComplemento = new javax.swing.JLabel();
        cmbMunicipio = new javax.swing.JComboBox();
        cmbUF = new javax.swing.JComboBox();
        txtBairro = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        pnlCContato = new javax.swing.JPanel();
        txtCelular = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelRef = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        lblTelRef = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        painelIdentificacao = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblDataNascimento = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        pnlSexo = new javax.swing.JPanel();
        RdbMasculino = new javax.swing.JRadioButton();
        rbdFeminino = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        ScrlPaneTableClientes = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        tlbAçoes = new javax.swing.JToolBar();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        GtoupButtonSexo.add(rbdFeminino);
        GtoupButtonSexo.add(RdbMasculino);

        setBackground(new java.awt.Color(242, 242, 242));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Cliente");
        setNormalBounds(new java.awt.Rectangle(0, 0, 6, 0));
        setPreferredSize(new java.awt.Dimension(1076, 582));
        setVisible(true);

        pnlPrincipal.setBackground(new java.awt.Color(242, 242, 242));
        pnlPrincipal.setToolTipText("");

        pnlEndereco.setBackground(new java.awt.Color(242, 242, 242));
        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        pnlEndereco.setMinimumSize(new java.awt.Dimension(200, 200));

        lblLogradouro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLogradouro.setText("Logradouro:");

        lblMunicipio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMunicipio.setText("Município:");

        lblUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUF.setText("UF:");

        lblCep.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCep.setText("CEP:");

        lblNumero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumero.setText("Número:");

        txtCep.setText("00000-000");

        lblComplemento.setText("Complemento:");

        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblBairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBairro.setText("Bairro:");

        pnlCContato.setBackground(new java.awt.Color(242, 242, 242));
        pnlCContato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        txtCelular.setText("(99)9999-9999");

        txtTelefone.setText("(99)9999-9999");

        lblTelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelefone.setText("Telefone:");

        txtTelRef.setText("(99)9999-9999");

        lblCelular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCelular.setText("Celular:");

        lblTelRef.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelRef.setText("Telefone Ref.:");

        txtEmail.setText("Cliente@CoreSystems");

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email:");

        javax.swing.GroupLayout pnlCContatoLayout = new javax.swing.GroupLayout(pnlCContato);
        pnlCContato.setLayout(pnlCContatoLayout);
        pnlCContatoLayout.setHorizontalGroup(
            pnlCContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlCContatoLayout.createSequentialGroup()
                            .addComponent(lblTelRef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelRef, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCContatoLayout.createSequentialGroup()
                            .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCContatoLayout.createSequentialGroup()
                            .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCContatoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCContatoLayout.setVerticalGroup(
            pnlCContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCContatoLayout.createSequentialGroup()
                .addGroup(pnlCContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelRef, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblTelRef, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(pnlCContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbMunicipio)
                        .addComponent(lblMunicipio))
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbUF)
                        .addComponent(lblUF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep)
                    .addComponent(lblCep))
                .addGap(8, 8, 8)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogradouro)
                    .addComponent(lblLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumero)
                        .addComponent(lblNumero))
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtComplemento)
                        .addComponent(lblComplemento)))
                .addGap(4, 4, 4)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro)
                    .addComponent(lblBairro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        painelIdentificacao.setBackground(new java.awt.Color(242, 242, 242));
        painelIdentificacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Identificação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(228, 228, 228));

        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código:");

        lblCpf.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCpf.setText("Cpf:");

        txtCpf.setText("000.000.000-00");

        lblDataNascimento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDataNascimento.setText("Data Nascimento:");

        txtDataNascimento.setText("__/__/____");

        pnlSexo.setBackground(new java.awt.Color(242, 242, 242));
        pnlSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        RdbMasculino.setText("Masculino");

        rbdFeminino.setText("Feminino");

        javax.swing.GroupLayout pnlSexoLayout = new javax.swing.GroupLayout(pnlSexo);
        pnlSexo.setLayout(pnlSexoLayout);
        pnlSexoLayout.setHorizontalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
                .addGroup(pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RdbMasculino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbdFeminino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSexoLayout.setVerticalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
                .addComponent(RdbMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbdFeminino)
                .addContainerGap())
        );

        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome:");

        javax.swing.GroupLayout painelIdentificacaoLayout = new javax.swing.GroupLayout(painelIdentificacao);
        painelIdentificacao.setLayout(painelIdentificacaoLayout);
        painelIdentificacaoLayout.setHorizontalGroup(
            painelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelIdentificacaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(painelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelIdentificacaoLayout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelIdentificacaoLayout.setVerticalGroup(
            painelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelIdentificacaoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(painelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelIdentificacaoLayout.createSequentialGroup()
                        .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(painelIdentificacaoLayout.createSequentialGroup()
                        .addGroup(painelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(painelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(painelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCpf)
                                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelIdentificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDataNascimento)
                                .addComponent(lblDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Title 3", "Title 4", "Título 5", "Título 6", "Título 7", "Título 8", "Título 9", "Título 10", "Título 11", "Título 12", "Título 13"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, false, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ScrlPaneTableClientes.setViewportView(tblClientes);
        tblClientes.getColumnModel().getColumn(0).setPreferredWidth(60);
        tblClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblClientes.getColumnModel().getColumn(5).setResizable(false);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelIdentificacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ScrlPaneTableClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
            .addComponent(pnlEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(painelIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(ScrlPaneTableClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
        );

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);
        getContentPane().setBackground(new Color(242,242,242));

        tlbAçoes.setRollover(true);

        btnPrimeiro.setText("<<");
        tlbAçoes.add(btnPrimeiro);

        btnAnterior.setText("<");
        btnAnterior.setFocusable(false);
        btnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbAçoes.add(btnAnterior);

        btnProximo.setText(">");
        btnProximo.setFocusable(false);
        btnProximo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProximo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbAçoes.add(btnProximo);

        btnUltimo.setText(">>");
        btnUltimo.setFocusable(false);
        btnUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbAçoes.add(btnUltimo);

        btnNovo.setText("+ Novo");
        btnNovo.setFocusable(false);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbAçoes.add(btnNovo);

        btnExcluir.setText("Excluir");
        btnExcluir.setFocusable(false);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tlbAçoes.add(btnExcluir);

        getContentPane().add(tlbAçoes, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GtoupButtonSexo;
    private javax.swing.JRadioButton RdbMasculino;
    private javax.swing.JScrollPane ScrlPaneTableClientes;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cmbMunicipio;
    private javax.swing.JComboBox cmbUF;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTelRef;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JPanel painelIdentificacao;
    private javax.swing.JPanel pnlCContato;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSexo;
    private javax.swing.JRadioButton rbdFeminino;
    private javax.swing.JTable tblClientes;
    private javax.swing.JToolBar tlbAçoes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTelRef;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
