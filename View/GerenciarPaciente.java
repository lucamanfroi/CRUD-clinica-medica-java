package View;

import Control.PacienteControl;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GerenciarPaciente extends javax.swing.JFrame {

    private PacienteControl controlador;

    public GerenciarPaciente() {
        initComponents();
        this.controlador = new PacienteControl();
        this.carregaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePacientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        camponome = new javax.swing.JTextField();
        camponascimento = new javax.swing.JTextField();
        campoendereco = new javax.swing.JTextField();
        campotelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaocancelar = new javax.swing.JButton();
        botaoapagar = new javax.swing.JButton();
        botaoeditar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínica Médica Bonzina - Gerenciar Paciente");

        jTablePacientes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTablePacientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePacientes);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("Nome Completo:");

        camponome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponomeActionPerformed(evt);
            }
        });

        camponascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponascimentoActionPerformed(evt);
            }
        });

        campotelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotelefoneActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Endereço:");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Idade");

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 51));
        jLabel8.setText("Pacientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(botaocancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(botaoapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(botaoeditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(35, 35, 35)
                                .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(camponascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campotelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(camponascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campotelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaocancelar)
                    .addComponent(botaoeditar)
                    .addComponent(botaoapagar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void camponascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponascimentoActionPerformed

    private void campotelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotelefoneActionPerformed

    private void camponomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponomeActionPerformed

    private void botaoeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoeditarActionPerformed
        try {
            int id = 0;
            int nascimento = 0;
            String nome = "";
            String endereco = "";
            String telefone = "";

            if (this.camponome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.camponome.getText();
            }
            if (this.camponascimento.getText().length() <= 0) {
                throw new Mensagens("A data de nascimento deve ser maior que zero.");
            } else {
                nascimento = Integer.parseInt(this.camponascimento.getText());
            }
            if (this.campoendereco.getText().length() < 2) {
                throw new Mensagens("O endereço deve conter ao menos 2 caracteres.");
            } else {
                endereco = this.campoendereco.getText();
            }
            if (this.campotelefone.getText().length() < 0) {
                throw new Mensagens("Favor incluir um número de telefone válido.");
            } else {
                telefone = (this.campotelefone.getText());
            }
            if (this.jTablePacientes.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Paciente para Editar");
            } else {
                id = Integer.parseInt(this.jTablePacientes.getValueAt(this.jTablePacientes.getSelectedRow(), 0).toString());
            }
            if (this.controlador.Cadastrar(nome, WIDTH, endereco, telefone, nome)) {

            }

            {
                JOptionPane.showMessageDialog(rootPane, "Paciente Editado com sucesso!");
                this.camponome.setText("");
                this.camponascimento.setText("");
                this.campotelefone.setText("");
                this.campoendereco.setText("");
            }
            System.out.println(this.controlador.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            carregaTabela();
        }


    }//GEN-LAST:event_botaoeditarActionPerformed

    private void jTablePacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacientesMouseClicked
        if (this.jTablePacientes.getSelectedRow() != -1) {

            String nome = this.jTablePacientes.getValueAt(this.jTablePacientes.getSelectedRow(), 1).toString();
            String nascimento = this.jTablePacientes.getValueAt(this.jTablePacientes.getSelectedRow(), 2).toString();
            String endereco = this.jTablePacientes.getValueAt(this.jTablePacientes.getSelectedRow(), 3).toString();
            String telefone = this.jTablePacientes.getValueAt(this.jTablePacientes.getSelectedRow(), 4).toString();

            this.camponome.setText(nome);
            this.campotelefone.setText(telefone);
            this.campoendereco.setText(endereco);
            this.camponascimento.setText(nascimento);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTablePacientesMouseClicked

    private void botaoapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoapagarActionPerformed
        try {
            int id = 0;
            if (this.jTablePacientes.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro selecione um paciente para APAGAR.");
            } else {
                id = Integer.parseInt(this.jTablePacientes.getValueAt(jTablePacientes.getSelectedRow(), 0).toString());
            }
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Paciente?");
            if (resposta_usuario == 0) {
                if (this.controlador.Apagar(id)) {
                    this.camponascimento.setText("");
                    this.camponome.setText("");
                    this.campoendereco.setText("");
                    this.campotelefone.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Paciente APAGADO com sucesso!");
                }
            }
            System.out.println(this.controlador.getMinhaLista().toString());

        } catch (Mensagens ex) {
            Logger.getLogger(GerenciarPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // atualiza a tabela.
            carregaTabela();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_botaoapagarActionPerformed

    private void botaocancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_botaocancelarActionPerformed

    @SuppressWarnings("unchecked")
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.jTablePacientes.getModel();
        modelo.setNumRows(0);

        String linhasMatriz[][] = controlador.getMinhaMatrizTexto();
        for (int i = 0; i < linhasMatriz.length; i++) {
            modelo.addRow(new Object[]{
                linhasMatriz[i][0],
                linhasMatriz[i][1],
                linhasMatriz[i][2],
                linhasMatriz[i][3],
                linhasMatriz[i][4],});

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
            java.util.logging.Logger.getLogger(GerenciarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoapagar;
    private javax.swing.JButton botaocancelar;
    private javax.swing.JButton botaoeditar;
    private javax.swing.JTextField campoendereco;
    private javax.swing.JTextField camponascimento;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField campotelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePacientes;
    // End of variables declaration//GEN-END:variables
}
