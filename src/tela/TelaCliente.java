/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import controller.ControllerCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelCliente;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author igork
 */
public class TelaCliente extends javax.swing.JFrame {

    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList <ModelCliente> listaModelCliente = new ArrayList<>();
    String salvarAlteracao;
    /**
     * Creates new form TelaCliente
     */
    public TelaCliente() {
        initComponents();
        setLocationRelativeTo(null);
        carregarClientes();
        habilitarCampos(false);
        funcoesDoPrograma();
        jbSalvar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/istockphoto-1088991646-170667a.jpg"));
        Image image = icon.getImage();
        uJPanelImagem1 = new componentes.UJPanelImagem(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(), this);
            }

        };
        uJPanelImagem1 = new componentes.UJPanelImagem();
        jlClienteCodigo = new javax.swing.JLabel();
        jtfClienteEndereco = new javax.swing.JTextField();
        jcClienteEstado = new javax.swing.JComboBox<>();
        jtfClienteNome = new javax.swing.JTextField();
        jtfClienteCodigo = new javax.swing.JTextField();
        jtfClienteCidade = new javax.swing.JTextField();
        jtfClienteBairro = new javax.swing.JTextField();
        jtfClienteCEP = new javax.swing.JFormattedTextField();
        jtfClienteNumeroCasa = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jtfPesquisar = new javax.swing.JTextField();
        jtfClienteTelefone = new javax.swing.JFormattedTextField();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jlClienteCodigo1 = new javax.swing.JLabel();
        jlClienteCodigo2 = new javax.swing.JLabel();
        jlClienteCodigo3 = new javax.swing.JLabel();
        jlClienteCodigo4 = new javax.swing.JLabel();
        jlClienteCodigo5 = new javax.swing.JLabel();
        jlClienteCodigo6 = new javax.swing.JLabel();
        jlClienteCodigo7 = new javax.swing.JLabel();
        jlClienteCodigo8 = new javax.swing.JLabel();
        jlClienteCodigo9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        uJPanelImagem1.setImagem(new java.io.File("C:\\Users\\Igor\\OneDrive\\Documentos\\NetBeansProjects\\SoftwareLoyal\\src\\imagens\\loyalstorebranco.png"));

        jlClienteCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlClienteCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlClienteCodigo.setText("C??digo:");

        jtfClienteEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClienteEnderecoActionPerformed(evt);
            }
        });

        jcClienteEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));
        jcClienteEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcClienteEstadoActionPerformed(evt);
            }
        });

        jtfClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClienteNomeActionPerformed(evt);
            }
        });

        jtfClienteCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClienteCodigoActionPerformed(evt);
            }
        });

        jtfClienteCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClienteCidadeActionPerformed(evt);
            }
        });

        try {
            jtfClienteCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfClienteCEP.setMinimumSize(new java.awt.Dimension(4, 24));

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jtfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisarActionPerformed(evt);
            }
        });

        try {
            jtfClienteTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfClienteTelefone.setMinimumSize(new java.awt.Dimension(4, 24));

        jbAlterar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/lapis (1).png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/excluir (1).png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/cancelar (1).png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbNovo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/novo-documento (1).png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbSalvar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/salve- (1).png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Cidade", "Estado", "Bairro", "Endere??o", "Telefone", "CEP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtClientes);
        if (jtClientes.getColumnModel().getColumnCount() > 0) {
            jtClientes.getColumnModel().getColumn(0).setMinWidth(15);
            jtClientes.getColumnModel().getColumn(0).setPreferredWidth(15);
            jtClientes.getColumnModel().getColumn(1).setMinWidth(50);
            jtClientes.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtClientes.getColumnModel().getColumn(3).setMinWidth(10);
            jtClientes.getColumnModel().getColumn(3).setPreferredWidth(10);
            jtClientes.getColumnModel().getColumn(4).setMinWidth(20);
            jtClientes.getColumnModel().getColumn(4).setPreferredWidth(20);
            jtClientes.getColumnModel().getColumn(6).setMinWidth(35);
            jtClientes.getColumnModel().getColumn(6).setPreferredWidth(35);
            jtClientes.getColumnModel().getColumn(7).setMinWidth(30);
            jtClientes.getColumnModel().getColumn(7).setPreferredWidth(30);
        }

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/24x24/de-volta (1).png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlClienteCodigo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlClienteCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        jlClienteCodigo1.setText("Telefone:");

        jlClienteCodigo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlClienteCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        jlClienteCodigo2.setText("Cidade:");

        jlClienteCodigo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlClienteCodigo3.setForeground(new java.awt.Color(255, 255, 255));
        jlClienteCodigo3.setText("Nome:");

        jlClienteCodigo4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlClienteCodigo4.setForeground(new java.awt.Color(255, 255, 255));
        jlClienteCodigo4.setText("Bairro:");

        jlClienteCodigo5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlClienteCodigo5.setForeground(new java.awt.Color(255, 255, 255));
        jlClienteCodigo5.setText("N.??:");

        jlClienteCodigo6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlClienteCodigo6.setForeground(new java.awt.Color(255, 255, 255));
        jlClienteCodigo6.setText("CEP:");

        jlClienteCodigo7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlClienteCodigo7.setForeground(new java.awt.Color(255, 255, 255));
        jlClienteCodigo7.setText("Endere??o:");

        jlClienteCodigo8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlClienteCodigo8.setForeground(new java.awt.Color(255, 255, 255));
        jlClienteCodigo8.setText("UF:");

        jlClienteCodigo9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlClienteCodigo9.setForeground(new java.awt.Color(255, 255, 255));
        jlClienteCodigo9.setText("Pesquisar Clientes:");

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addComponent(jtfClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlClienteCodigo3))
                        .addGap(18, 18, 18)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlClienteCodigo1))
                        .addGap(18, 18, 18)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlClienteCodigo2)
                            .addComponent(jtfClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbPesquisar))
                            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlClienteCodigo7))
                                .addGap(18, 18, 18)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlClienteCodigo4))
                                .addGap(18, 18, 18)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfClienteNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlClienteCodigo5))
                                .addGap(18, 18, 18)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfClienteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlClienteCodigo6))
                                .addGap(18, 18, 18)
                                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlClienteCodigo8)
                                    .addComponent(jcClienteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlClienteCodigo9)))
                    .addComponent(jlClienteCodigo))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addGap(18, 18, 18)
                .addComponent(jbExcluir)
                .addGap(18, 18, 18)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNovo)
                .addGap(18, 18, 18)
                .addComponent(jbSalvar)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlClienteCodigo)
                    .addComponent(jlClienteCodigo1)
                    .addComponent(jlClienteCodigo2)
                    .addComponent(jlClienteCodigo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfClienteCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlClienteCodigo5)
                    .addComponent(jlClienteCodigo6)
                    .addComponent(jlClienteCodigo4)
                    .addComponent(jlClienteCodigo7)
                    .addComponent(jlClienteCodigo8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfClienteBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfClienteNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfClienteCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcClienteEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlClienteCodigo9)
                .addGap(3, 3, 3)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbNovo)
                    .addComponent(jButton1)
                    .addComponent(jbCancelar)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterar))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void funcoesDoPrograma(){
        jtfClienteCodigo.setEnabled(false);
        jtfClienteCodigo.setToolTipText("Preenchimento autom??tico.");
    }
    private void limparCampos(){
        jtfClienteBairro.setText("");
        jtfClienteNome.setText("");
        jtfClienteEndereco.setText("");
        jtfClienteCEP.setText("");
        jtfClienteCidade.setText("");
        jtfClienteTelefone.setText("");
        jtfClienteNumeroCasa.setText("");
    }
    private void habilitarCampos(boolean condicao){
        jtfClienteNome.setEnabled(condicao);
        jtfClienteBairro.setEnabled(condicao);
        jtfClienteCEP.setEnabled(condicao);
        jtfClienteCidade.setEnabled(condicao);
        jtfClienteTelefone.setEnabled(condicao);
        jtfClienteEndereco.setEnabled(condicao);
        jcClienteEstado.setEnabled(condicao);
        jtfClienteNumeroCasa.setEnabled(condicao);
    }
    private void jtfClienteCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClienteCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfClienteCodigoActionPerformed

    private void jtfClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClienteNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfClienteNomeActionPerformed

    private void jtfClienteEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClienteEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfClienteEnderecoActionPerformed

    private void jtfClienteCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClienteCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfClienteCidadeActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        habilitarCampos(false);
        jtfPesquisar.setEnabled(true);
        jbPesquisar.setEnabled(true);
        limparCampos();
        jbAlterar.setEnabled(true);
        jbExcluir.setEnabled(true);
        jbSalvar.setEnabled(false);
    }//GEN-LAST:event_jbCancelarActionPerformed
    
    private void alterarClientes(){
        modelCliente.setCliente_nome(this.jtfClienteNome.getText()); 
        modelCliente.setCliente_endereco(this.jtfClienteEndereco.getText()); 
        modelCliente.setCliente_bairro(this.jtfClienteBairro.getText()); 
        modelCliente.setCliente_cidade(this.jtfClienteCidade.getText());
        modelCliente.setCliente_estado((String) this.jcClienteEstado.getSelectedItem());
        modelCliente.setCliente_telefone(this.jtfClienteTelefone.getText());
        modelCliente.setCliente_cep(this.jtfClienteCEP.getText());
        modelCliente.setCliente_numero(this.jtfClienteNumeroCasa.getText());
        if (controllerCliente.atualizarClienteController(modelCliente)) {
            JOptionPane.showMessageDialog(this, " Os dados do cliente foram alterados com sucesso.");
            carregarClientes();
            limparCampos();
            habilitarCampos(false);
            
        }else{
            JOptionPane.showMessageDialog(this, " Erro ao alterar os dados do cliente.");
        }
    }
    
    private void salvarClientes() {
        modelCliente.setCliente_nome(this.jtfClienteNome.getText());
        modelCliente.setCliente_endereco(this.jtfClienteEndereco.getText());
        modelCliente.setCliente_bairro(this.jtfClienteBairro.getText());
        modelCliente.setCliente_cidade(this.jtfClienteCidade.getText());
        modelCliente.setCliente_estado((String) this.jcClienteEstado.getSelectedItem());
        modelCliente.setCliente_telefone(this.jtfClienteTelefone.getText());
        modelCliente.setCliente_cep(this.jtfClienteCEP.getText());
        modelCliente.setCliente_numero(this.jtfClienteNumeroCasa.getText());
        
        if (controllerCliente.salvarClienteController(modelCliente)>0) {
            JOptionPane.showMessageDialog(this, "Cadastro de cliente feito com sucesso!", "ATEN????O", JOptionPane.WARNING_MESSAGE); 
            carregarClientes(); 
            jbSalvar.setEnabled(false);
            jbAlterar.setEnabled(true);
            jbExcluir.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void carregarClientes(){
        listaModelCliente = controllerCliente.getListaClienteController(); //chama as listas de clientes cadastradas
        DefaultTableModel model = (DefaultTableModel) jtClientes.getModel(); 
        model.setNumRows(0); //Remover todos os dados da tabela para carregar denovo
        int cont = listaModelCliente.size();
        for (int i = 0; i < cont; i++) {
            model.addRow(new Object[] {
            listaModelCliente.get(i).getId_cliente(),
            listaModelCliente.get(i).getCliente_nome(),
            listaModelCliente.get(i).getCliente_cidade(),
            listaModelCliente.get(i).getCliente_estado(),
            listaModelCliente.get(i).getCliente_bairro(),
            listaModelCliente.get(i).getCliente_endereco(),
            listaModelCliente.get(i).getCliente_telefone(),
            listaModelCliente.get(i).getCliente_cep(),
        });
        }
}
    
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // TODO add your handling code here:
        jtfClienteCodigo.setText("");
        if (salvarAlteracao=="salvar") {
            this.salvarClientes();
        }else if(salvarAlteracao=="alterar") {
            this.alterarClientes();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jcClienteEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcClienteEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcClienteEstadoActionPerformed

    private void jtfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) this.jtClientes.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jtClientes.setRowSorter(classificador);
        String textoPesquisado = jtfPesquisar.getText();
        classificador.setRowFilter(RowFilter.regexFilter(textoPesquisado, 1));
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        habilitarCampos(true);
        jtfPesquisar.setEnabled(false);
        jbPesquisar.setEnabled(false);
        limparCampos();
        salvarAlteracao = "salvar";
        jbSalvar.setEnabled(true);
        jbAlterar.setEnabled(false);
        jbExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = jtClientes.getSelectedRow();
        int codigoProduto =(int) jtClientes.getValueAt(linhaSelecionada, 0);
        if (controllerCliente.excluirClienteController(codigoProduto)) {
            JOptionPane.showMessageDialog(this, " O cliente foi excluido com sucesso.");
            carregarClientes();
        }else{
            JOptionPane.showMessageDialog(this, " Erro ao excluir o cliente.");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        int linhaSelecionada = this.jtClientes.getSelectedRow();
        salvarAlteracao = "alterar";
        habilitarCampos(true);
        try {
             int codigoCliente = (int) this.jtClientes.getValueAt(linhaSelecionada, 0);
            modelCliente = controllerCliente.getClienteController(codigoCliente);
            this.jtfClienteCodigo.setText(String.valueOf(modelCliente.getId_cliente()));
            this.jtfClienteNome.setText(modelCliente.getCliente_nome());
            this.jtfClienteEndereco.setText(modelCliente.getCliente_endereco());
            this.jtfClienteBairro.setText(modelCliente.getCliente_bairro());
            this.jtfClienteCidade.setText(modelCliente.getCliente_cidade());
            this.jtfClienteTelefone.setText(modelCliente.getCliente_telefone());
            this.jtfClienteCEP.setText(modelCliente.getCliente_cep());
            this.jcClienteEstado.setSelectedItem(modelCliente.getCliente_estado());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " Erro ao alterar o produto.");
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcClienteEstado;
    private javax.swing.JLabel jlClienteCodigo;
    private javax.swing.JLabel jlClienteCodigo1;
    private javax.swing.JLabel jlClienteCodigo2;
    private javax.swing.JLabel jlClienteCodigo3;
    private javax.swing.JLabel jlClienteCodigo4;
    private javax.swing.JLabel jlClienteCodigo5;
    private javax.swing.JLabel jlClienteCodigo6;
    private javax.swing.JLabel jlClienteCodigo7;
    private javax.swing.JLabel jlClienteCodigo8;
    private javax.swing.JLabel jlClienteCodigo9;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTextField jtfClienteBairro;
    private javax.swing.JFormattedTextField jtfClienteCEP;
    private javax.swing.JTextField jtfClienteCidade;
    private javax.swing.JTextField jtfClienteCodigo;
    private javax.swing.JTextField jtfClienteEndereco;
    private javax.swing.JTextField jtfClienteNome;
    private javax.swing.JTextField jtfClienteNumeroCasa;
    private javax.swing.JFormattedTextField jtfClienteTelefone;
    private javax.swing.JTextField jtfPesquisar;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
