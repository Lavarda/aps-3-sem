package interfaces;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import Connections.ConnectionDB;

public class clientesCadastro extends javax.swing.JInternalFrame {

    public clientesCadastro() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Cadastro de Clientes");
        this.setVisible(true);
    }
                        
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPrincipalClientesCadastro = new javax.swing.JPanel();
        txtClientesCadastro = new javax.swing.JLabel();
        txtDataClientesCadastro = new javax.swing.JLabel();
        txtEmailClientesCadastro = new javax.swing.JLabel();
        txtCpfClientesCadastro = new javax.swing.JLabel();
        txtRgClientesCadastro = new javax.swing.JLabel();
        txtTelClientesCadastro = new javax.swing.JLabel();
        txtCidadeClientesCadastro = new javax.swing.JLabel();
        txtEstadoClientesCadastro = new javax.swing.JLabel();
        txtCepClientesCadastro = new javax.swing.JLabel();
        txtRuaClientesCadastro = new javax.swing.JLabel();
        inputNomeClienteCadastro = new javax.swing.JTextField();
        inputEmailClienteCadastro = new javax.swing.JTextField();
        inputCidadeClientesCadastro = new javax.swing.JTextField();
        inputRuaClientesCadastro = new javax.swing.JTextField();
        botaoLimparClientesCadastro = new javax.swing.JButton();
        botaoSalvarClientesCadastro = new javax.swing.JButton();
        comboBoxSexoClientesCadastro = new javax.swing.JComboBox<>();
        comboBoxEstadoCivilClientesCadastro = new javax.swing.JComboBox<>();
        txtSexoClientesCadastro = new javax.swing.JLabel();
        txtEstadoCivilClientesCadastro = new javax.swing.JLabel();
        comboBoxEstadoClientesCadastro = new javax.swing.JComboBox<>();
        inputDataClientes = new javax.swing.JFormattedTextField();
        inputCpfClientesCadastro = new javax.swing.JFormattedTextField();
        inputTelClientesCadastro = new javax.swing.JFormattedTextField();
        inputCepClientesCadastro = new javax.swing.JFormattedTextField();
        inputRgClientesCadastro = new javax.swing.JFormattedTextField();
        inputBairroClientesCadastro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNumeroResidencialClienteCadastro = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setTitle("Cadastro Cliente");
        setMaximumSize(new java.awt.Dimension(620, 550));
        setMinimumSize(new java.awt.Dimension(620, 550));
        setName(""); 
        setPreferredSize(new java.awt.Dimension(620, 550));
        setVisible(false);

        painelPrincipalClientesCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelPrincipalClientesCadastro.setMaximumSize(new java.awt.Dimension(620, 500));
        painelPrincipalClientesCadastro.setMinimumSize(new java.awt.Dimension(620, 500));
        painelPrincipalClientesCadastro.setPreferredSize(new java.awt.Dimension(620, 500));

        txtClientesCadastro.setText("Nome");

        txtDataClientesCadastro.setText("Data Nascimento");

        txtEmailClientesCadastro.setText("E-mail");

        txtCpfClientesCadastro.setText("CPF");

        txtRgClientesCadastro.setText("RG");

        txtTelClientesCadastro.setText("Telefone");

        txtCidadeClientesCadastro.setText("Cidade");

        txtEstadoClientesCadastro.setText("Estado");

        txtCepClientesCadastro.setText("CEP");

        txtRuaClientesCadastro.setText("Rua");

        botaoLimparClientesCadastro.setBackground(new java.awt.Color(254, 59, 55));
        botaoLimparClientesCadastro.setText("Limpar");
        botaoLimparClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparClientesCadastroActionPerformed(evt);
            }
        });

        botaoSalvarClientesCadastro.setBackground(new java.awt.Color(43, 82, 253));
        botaoSalvarClientesCadastro.setText("Salvar");
        botaoSalvarClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarClientesCadastroActionPerformed(evt);
            }
        });

        comboBoxSexoClientesCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        comboBoxSexoClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSexoClientesCadastroActionPerformed(evt);
            }
        });

        comboBoxEstadoCivilClientesCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "viuvo" }));
        comboBoxEstadoCivilClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEstadoCivilClientesCadastroActionPerformed(evt);
            }
        });

        txtSexoClientesCadastro.setText("Sexo");

        txtEstadoCivilClientesCadastro.setText("Estado Civil");

        comboBoxEstadoClientesCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        comboBoxEstadoClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEstadoClientesCadastroActionPerformed(evt);
            }
        });

        try {
            inputDataClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputCpfClientesCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputTelClientesCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputCepClientesCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCepClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepClientesCadastroActionPerformed(evt);
            }
        });

        jLabel1.setText("Bairro");

        jLabel2.setText("Numero residencial");

        javax.swing.GroupLayout painelPrincipalClientesCadastroLayout = new javax.swing.GroupLayout(painelPrincipalClientesCadastro);
        painelPrincipalClientesCadastro.setLayout(painelPrincipalClientesCadastroLayout);
        painelPrincipalClientesCadastroLayout.setHorizontalGroup(
            painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                        .addComponent(inputBairroClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                        .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoLimparClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoSalvarClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtRgClientesCadastro)
                                    .addComponent(txtEmailClientesCadastro)
                                    .addComponent(txtClientesCadastro)
                                    .addComponent(txtDataClientesCadastro)
                                    .addComponent(inputDataClientes)
                                    .addComponent(inputEmailClienteCadastro)
                                    .addComponent(txtCpfClientesCadastro)
                                    .addComponent(inputNomeClienteCadastro)
                                    .addComponent(txtTelClientesCadastro)
                                    .addComponent(inputCpfClientesCadastro)
                                    .addComponent(inputTelClientesCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(inputRgClientesCadastro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCidadeClientesCadastro)
                                    .addComponent(txtEstadoClientesCadastro)
                                    .addComponent(txtCepClientesCadastro)
                                    .addComponent(txtRuaClientesCadastro)
                                    .addComponent(txtSexoClientesCadastro)
                                    .addComponent(inputRuaClientesCadastro)
                                    .addComponent(comboBoxEstadoClientesCadastro, 0, 1, Short.MAX_VALUE)
                                    .addComponent(inputCidadeClientesCadastro)
                                    .addComponent(comboBoxSexoClientesCadastro, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEstadoCivilClientesCadastro)
                                    .addComponent(comboBoxEstadoCivilClientesCadastro, 0, 200, Short.MAX_VALUE)
                                    .addComponent(inputCepClientesCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(inputNumeroResidencialClienteCadastro))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelPrincipalClientesCadastroLayout.setVerticalGroup(
            painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientesCadastro)
                    .addComponent(txtCidadeClientesCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeClienteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCidadeClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataClientesCadastro)
                    .addComponent(txtEstadoClientesCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDataClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEstadoClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailClientesCadastro)
                    .addComponent(txtCepClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEmailClienteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCepClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                        .addComponent(txtRuaClientesCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputRuaClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSexoClientesCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxSexoClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                        .addComponent(txtCpfClientesCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCpfClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRgClientesCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputRgClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelClientesCadastro)
                    .addComponent(txtEstadoCivilClientesCadastro))
                .addGap(10, 10, 10)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxEstadoCivilClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTelClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputBairroClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNumeroResidencialClienteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarClientesCadastro)
                    .addComponent(botaoLimparClientesCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalClientesCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                     

    private void comboBoxEstadoCivilClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                                    
    }                                                                   

    private void inputCepClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                         
    }                                                        

    private void botaoLimparClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    inputCepClientesCadastro.setText("");
    inputCidadeClientesCadastro.setText("");
    inputCpfClientesCadastro.setText("");
    inputDataClientes.setText("");
    inputEmailClienteCadastro.setText("");
    inputNomeClienteCadastro.setText("");
    inputRgClientesCadastro.setText("");
    inputRuaClientesCadastro.setText("");
    inputTelClientesCadastro.setText("");
        
    }                                                           

    private void botaoSalvarClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    	String nome;
    	String dtNasc;
    	String email;
    	String sexo;
    	String rgString;
    	String cidade;
    	String estado;
    	String cepString;
    	String rua;
    	String estadoCivil;
    	String telefone;
    	String cpf;
    	String bairro;
    	String numero;
    	java.util.Date dataAtual = new Date();
    	String dataFormatada = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(dataAtual);
    	
    	try {
    		numero = inputNumeroResidencialClienteCadastro.getText();
    		bairro = inputBairroClientesCadastro.getText();
    		nome = inputNomeClienteCadastro.getText();
    		dtNasc = inputDataClientes.getText();
    		email = inputEmailClienteCadastro.getText();
    		cpf = inputCpfClientesCadastro.getText();
    		rgString = inputRgClientesCadastro.getText();
    		cidade = inputCidadeClientesCadastro.getText();
            estado = (String) comboBoxEstadoClientesCadastro.getSelectedItem();		
    		cepString = inputCepClientesCadastro.getText();		
    		rua = inputRuaClientesCadastro.getText();		
    		telefone = inputTelClientesCadastro.getText();   		
            estadoCivil = (String) comboBoxEstadoCivilClientesCadastro.getSelectedItem();
            sexo = (String) comboBoxSexoClientesCadastro.getSelectedItem();

            ConnectionDB.Conectar();
            String sql = "insert into usuario_table(nome_usuario,dt_nascimento,email_usuario,sexo_usuario,estado_civil,cpf_usuario,rg_usuario,dt_cadastro,telefone_usuario,cep_usuario,cidade_usuario,bairro_usuario,estado_usuario,numero_residencia_usuario) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement stm = ConnectionDB.preparedStament(sql);
            stm.setString(1, nome);
            stm.setString(2, dtNasc);
            stm.setString(3, email);
            stm.setString(4, sexo);
            stm.setString(5, estadoCivil);
            stm.setString(6, cpf);
            stm.setString(7, rgString);
            stm.setString(8, dataFormatada);
            stm.setString(9, telefone);
            stm.setString(10, cepString);
            stm.setString(11, cidade);
            stm.setString(12, bairro);
            stm.setString(13, estado);
            stm.setString(14, numero);
            ConnectionDB.runPreparedStatment(stm);
            ConnectionDB.Desconectar();
            
    	}catch(NumberFormatException e) {
    		System.out.println(e);
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }                                                           

    private void comboBoxSexoClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                             

    }                                                            

    private void comboBoxEstadoClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                               
    }                                                              

               
    private javax.swing.JButton botaoLimparClientesCadastro;
    private javax.swing.JButton botaoSalvarClientesCadastro;
    private javax.swing.JComboBox<String> comboBoxEstadoCivilClientesCadastro;
    private javax.swing.JComboBox<String> comboBoxEstadoClientesCadastro;
    private javax.swing.JComboBox<String> comboBoxSexoClientesCadastro;
    private javax.swing.JTextField inputBairroClientesCadastro;
    private javax.swing.JFormattedTextField inputCepClientesCadastro;
    private javax.swing.JTextField inputCidadeClientesCadastro;
    private javax.swing.JFormattedTextField inputCpfClientesCadastro;
    private javax.swing.JFormattedTextField inputDataClientes;
    private javax.swing.JTextField inputEmailClienteCadastro;
    private javax.swing.JTextField inputNomeClienteCadastro;
    private javax.swing.JTextField inputNumeroResidencialClienteCadastro;
    private javax.swing.JFormattedTextField inputRgClientesCadastro;
    private javax.swing.JTextField inputRuaClientesCadastro;
    private javax.swing.JFormattedTextField inputTelClientesCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelPrincipalClientesCadastro;
    private javax.swing.JLabel txtCepClientesCadastro;
    private javax.swing.JLabel txtCidadeClientesCadastro;
    private javax.swing.JLabel txtClientesCadastro;
    private javax.swing.JLabel txtCpfClientesCadastro;
    private javax.swing.JLabel txtDataClientesCadastro;
    private javax.swing.JLabel txtEmailClientesCadastro;
    private javax.swing.JLabel txtEstadoCivilClientesCadastro;
    private javax.swing.JLabel txtEstadoClientesCadastro;
    private javax.swing.JLabel txtRgClientesCadastro;
    private javax.swing.JLabel txtRuaClientesCadastro;
    private javax.swing.JLabel txtSexoClientesCadastro;
    private javax.swing.JLabel txtTelClientesCadastro;              
}
