package View;

import Control.MedicoControl;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciarMedico extends javax.swing.JFrame {

    private MedicoControl controlador;

    public GerenciarMedico() {
        initComponents();
        this.controlador = new MedicoControl();
        this.carregaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campocrm = new javax.swing.JTextField();
        camponome = new javax.swing.JTextField();
        campoidade = new javax.swing.JTextField();
        campotelefone = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        botaocancelar = new javax.swing.JButton();
        botaoapagar = new javax.swing.JButton();
        botaoeditar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoperiodo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoendereco = new javax.swing.JTextField();

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("Pacientes");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínica Médica Bonzia - Gerenciar Médico");

        jTableMedicos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTableMedicos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Endereco", "Telefone", "CRM", "Especialidade", "Periodo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Idade:");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Endereco:");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("CRM:");

        campoidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoidadeActionPerformed(evt);
            }
        });

        botaocancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaocancelar.setText("Voltar");
        botaocancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocancelarActionPerformed(evt);
            }
        });

        botaoapagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoapagar.setText("Apagar");
        botaoapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoapagarActionPerformed(evt);
            }
        });

        botaoeditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoeditar.setText("Editar");
        botaoeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoeditarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Médicos");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Especialidade:");

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("Periodo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaocancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(botaoapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(botaoeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campocrm, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(camponome)
                                    .addComponent(campoidade)
                                    .addComponent(campotelefone)
                                    .addComponent(b)
                                    .addComponent(campoperiodo)
                                    .addComponent(campoendereco)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(campocrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campotelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaocancelar)
                    .addComponent(botaoeditar)
                    .addComponent(botaoapagar)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoidadeActionPerformed

    private void botaocancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocancelarActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_botaocancelarActionPerformed

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicosMouseClicked
        if (this.jTableMedicos.getSelectedRow() != -1) {

            String crm = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 1).toString();
            String nome = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 2).toString();
            String especialidade = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 3).toString();
            String telefone = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 4).toString();
            String periodo = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 5).toString();
            String idade = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 6).toString();
            String endereco = this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 7).toString();



            this.camponome.setText(nome);
            this.campotelefone.setText(telefone);
            this.campocrm.setText(crm);
            this.campoidade.setText(especialidade);
            this.b.setText(periodo);
            this.campoperiodo.setText(idade);
            this.campoendereco.setText(endereco);

        }
    }//GEN-LAST:event_jTableMedicosMouseClicked

    private void botaoeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoeditarActionPerformed
        try {
            int id = 0;
            String crm = "";
            String nome = "";
            String especialidade = "";
            String telefone = "";
            String periodo = "";
            int idade = 0;
            String endereco = "";

            if (this.camponome.getText().length() > 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.camponome.getText();
            }
            if (this.campocrm.getText().length() <= 0) {
                throw new Mensagens("O CRM deve ser maior que zero.");
            } else {
                crm = this.campocrm.getText();
            }
            if (this.campoidade.getText().length() <= 2) {
                throw new Mensagens("A especialidade deve conter ao menos 2 caracteres.");
            } else {
                especialidade = this.campoidade.getText();
            }
            if (this.campotelefone.getText().length() < 0) {
                throw new Mensagens("Favor incluir um número de telefone válido.");
            } else {
                telefone = this.campotelefone.getText();
            }
            if (this.b.getText().length() <= 2) {
                throw new Mensagens("O período de atendimento deve conter ao menos dois caracteres.");
            } else {
                periodo = this.b.getText();
            }
            if (this.campoendereco.getText().length() <= 2) {
                throw new Mensagens("O endereco deve conter ao menos dois caracteres.");
            } else {
                endereco = this.campoendereco.getText();
            }
            if (this.campoperiodo.getText().length() < 0) {
                throw new Mensagens("Insira uma idade valida.");
            } else {
                especialidade = this.campoperiodo.getText();
            }
            if (this.jTableMedicos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Médico para Editar");
            } else {
                id = Integer.parseInt(this.jTableMedicos.getValueAt(this.jTableMedicos.getSelectedRow(), 0).toString());
            }

            if (this.controlador.Cadastrar(nome, idade, endereco, telefone, crm, especialidade, periodo)) {
                JOptionPane.showMessageDialog(rootPane, "Médico Editado com sucesso!");

                this.campocrm.setText("");
                this.campoidade.setText("");
                this.campotelefone.setText("");
                this.b.setText("");
                this.camponome.setText("");
                this.campoperiodo.setText("");
                this.campoendereco.setText("");
            }
            System.out.println(this.controlador.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(GerenciarMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoeditarActionPerformed

    private void botaoapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoapagarActionPerformed
        try {
            int id = 0;
            if (this.jTableMedicos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro selecione um médico para APAGAR.");
            } else {
                id = Integer.parseInt(this.jTableMedicos.getValueAt(jTableMedicos.getSelectedRow(), 0).toString());
            }
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este médico?");
            if (resposta_usuario == 0) {
                if (this.controlador.Apagar(id)) {
                    this.campocrm.setText("");
                    this.camponome.setText("");
                    this.campoidade.setText("");
                    this.campotelefone.setText("");
                    this.b.setText("");
                    this.campoperiodo.setText("");
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
    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTableMedicos.getModel();
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
                linhasMatriz[i][7],});

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
                new GerenciarMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b;
    private javax.swing.JButton botaoapagar;
    private javax.swing.JButton botaocancelar;
    private javax.swing.JButton botaoeditar;
    private javax.swing.JTextField campocrm;
    private javax.swing.JTextField campoendereco;
    private javax.swing.JTextField campoidade;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField campoperiodo;
    private javax.swing.JTextField campotelefone;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    // End of variables declaration//GEN-END:variables

}