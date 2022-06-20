package View;

import CONTROL.FuncionarioControl;
import java.awt.Component;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciarFuncionario extends javax.swing.JPanel {
    
    private FuncionarioControl controlador;
    private Component rootPane;

    public GerenciarFuncionario() {
        initComponents();
        this.controlador = new FuncionarioControl();
        this.carregaTabela();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaocancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botaoapagar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botaoeditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        camponumero = new javax.swing.JTextField();
        camponome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoidade = new javax.swing.JTextField();
        campocep = new javax.swing.JTextField();
        campoendereco = new javax.swing.JTextField();
        campotelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        campocpf = new javax.swing.JTextField();
        camporeferencia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        botaocancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaocancelar.setText("Voltar");
        botaocancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        botaoapagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoapagar.setText("Apagar");
        botaoapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoapagarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Idade:");

        botaoeditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoeditar.setText("Editar");
        botaoeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoeditarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Endereco:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Funcionario");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Telefone:");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Numero da residencia:");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("CPF:");

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("CEP:");

        campoendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoenderecoActionPerformed(evt);
            }
        });

        jTableFuncionarios.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTableFuncionarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Endereco", "Telefone", "CPF", "Numero", "CEP", "Referencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFuncionarios);

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setText("Referencia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel11))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(camponome, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(campoidade)
                                    .addComponent(campoendereco)
                                    .addComponent(campotelefone)
                                    .addComponent(campocpf)
                                    .addComponent(camponumero)
                                    .addComponent(campocep)
                                    .addComponent(camporeferencia)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaocancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(botaoapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(botaoeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campotelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campocpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(camponumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campocep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(camporeferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaocancelar)
                    .addComponent(botaoeditar)
                    .addComponent(botaoapagar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaocancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaocancelarActionPerformed


    private void botaoapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoapagarActionPerformed
try {
            int id = 0;
            if (this.jTableFuncionarios.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro selecione um médico para APAGAR.");
            } else {
                id = Integer.parseInt(this.jTableFuncionarios.getValueAt(jTableFuncionarios.getSelectedRow(), 0).toString());
            }
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este médico?");
            if (resposta_usuario == 0) {
                if (this.controlador.Apagar(id)) {
                    this.campocpf.setText("");
                    this.camponome.setText("");
                    this.campoidade.setText("");
                    this.campotelefone.setText("");
                    this.campocep.setText("");
                    this.camponumero.setText("");
                    this.camporeferencia.setText("");
                    this.campoendereco.setText("");

                    JOptionPane.showMessageDialog(rootPane, "Médico APAGADO com sucesso!");
                }
            }
            System.out.println(this.controlador.getMinhaLista().toString());

        } catch (Mensagens ex) {
            Logger.getLogger(GerenciarMedico.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }
    }//GEN-LAST:event_botaoapagarActionPerformed

    private void botaoeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoeditarActionPerformed
        try {
            String cpf = "";
            String nome = "";
            String referencia = "";
            String telefone = "";
            String cep = "";
            int idade = 0;
            String endereco = "";
            int numero = 0;

            if (this.camponome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.camponome.getText();
            }
            if (this.campocpf.getText().length() <= 0) {
                throw new Mensagens("O CRM deve ser maior que zero.");
            } else {
                cpf = this.campocpf.getText();
            }
            if (this.camporeferencia.getText().length() < 2) {
                throw new Mensagens("A especialidade deve conter ao menos 2 caracteres.");
            } else {
                referencia = this.camporeferencia.getText();
            }
            if (this.campotelefone.getText().length() < 0) {
                throw new Mensagens("Favor incluir um número de telefone válido.");
            } else {
                telefone = this.campotelefone.getText();
            }
            if (this.campocep.getText().length() < 2) {
                throw new Mensagens("Insira um CEP valido.");
            } else {
                cep = this.campocep.getText();
            }
            if (this.camponumero.getText().length() < 0) {
                throw new Mensagens("Insira um numero valido.");
            } else {
                numero = Integer.parseInt(this.camponumero.getText());
            }
            if (this.campoendereco.getText().length() < 2) {
                throw new Mensagens("O período de atendimento deve conter ao menos dois caracteres.");
            } else {
                endereco = this.campoendereco.getText();
            }
            if (this.campoidade.getText().length() < 2) {
                throw new Mensagens("O período de atendimento deve conter ao menos dois caracteres.");
            } else {
                idade = Integer.parseInt(this.campoidade.getText());
            }

            if (this.controlador.Cadastrar(nome, idade, telefone, endereco, cpf, numero, cep, referencia)) {
                JOptionPane.showMessageDialog(rootPane, "Funcionario cadastrado com sucesso!");
                this.camponome.setText("");
                this.camporeferencia.setText("");
                this.campotelefone.setText("");
                this.campocep.setText("");
                this.campocpf.setText("");
                this.camponumero.setText("");
                this.campoidade.setText("");
                this.campoendereco.setText("");

            }
            System.out.println(this.controlador.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } catch (SQLException ex) {
            Logger.getLogger(GerenciarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoeditarActionPerformed

    private void campoenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoenderecoActionPerformed
    }//GEN-LAST:event_campoenderecoActionPerformed

    private void jTableFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionariosMouseClicked
        if (this.jTableFuncionarios.getSelectedRow() != -1) {

            String nome = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 1).toString();
            String idade = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 2).toString();
            String endereco = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 3).toString();
            String telefone = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 4).toString();
            String cpf = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 5).toString();
            String numero = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 6).toString();
            String cep = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 7).toString();
            String referencia = this.jTableFuncionarios.getValueAt(this.jTableFuncionarios.getSelectedRow(), 8).toString();




            this.camponome.setText(nome);
            this.campotelefone.setText(telefone);
            this.campocpf.setText(cpf);
            this.campoidade.setText(idade);
            this.campocep.setText(cep);
            this.camporeferencia.setText(referencia);
            this.campoendereco.setText(endereco);
            this.camponumero.setText(numero);

        }
    }//GEN-LAST:event_jTableFuncionariosMouseClicked
 @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableFuncionarios.getModel();
        modelo.setNumRows(0);

        String linhasMatriz[][] = controlador.getMinhaMatrizTexto();
        for (int i = 0; i < linhasMatriz.length; i++) {
            modelo.addRow(new Object[]{
                linhasMatriz[i][0],
                linhasMatriz[i][1],
                linhasMatriz[i][2],
                linhasMatriz[i][3],
                linhasMatriz[i][4],
                linhasMatriz[i][5],
                linhasMatriz[i][6],
                linhasMatriz[i][7],
                linhasMatriz[i][8],});

        }
    }

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
            java.util.logging.Logger.getLogger(GerenciarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarFuncionario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoapagar;
    private javax.swing.JButton botaocancelar;
    private javax.swing.JButton botaoeditar;
    private javax.swing.JTextField campocep;
    private javax.swing.JTextField campocpf;
    private javax.swing.JTextField campoendereco;
    private javax.swing.JTextField campoidade;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField camponumero;
    private javax.swing.JTextField camporeferencia;
    private javax.swing.JTextField campotelefone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFuncionarios;
    // End of variables declaration//GEN-END:variables
}
