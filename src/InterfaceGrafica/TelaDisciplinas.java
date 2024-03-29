/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import gerenciadordeaulas.ControleDisciplina;
import gerenciadordeaulas.DiaDeAula;
import gerenciadordeaulas.Disciplina;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class TelaDisciplinas extends javax.swing.JInternalFrame {
    private Disciplina umaDisciplina;
    private boolean modoAlteracao;
    private boolean novoRegistro;
    protected static DefaultListModel horariosListModel;
    
    protected static ControleDisciplina controleDisciplina = new ControleDisciplina();
    
    /**
     * Creates new form TelaDisciplinas
     */
    public TelaDisciplinas() {
        initComponents();
        this.habilitarDesabilitarCampos();
        this.horariosListModel = new DefaultListModel();
        this.jListHorarios.setModel(horariosListModel);
        TelaDisciplinas.jTableListaDisciplinas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaDisciplinas = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextTurma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextProfessor = new javax.swing.JTextField();
        jTextSala = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListHorarios = new javax.swing.JList();
        jButtonAdicionarHorario = new javax.swing.JButton();
        jButtonRemoverHorario = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Disciplinas");

        jTableListaDisciplinas.setModel(new javax.swing.table.DefaultTableModel 
            (
                null,
                new String [] {
                    "Disciplina", "Turma"
                }
            )
            {
                @Override    
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                    return false;
                }
            });
            jTableListaDisciplinas.setToolTipText("");
            jTableListaDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableListaDisciplinasMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableListaDisciplinas);

            jButtonNovo.setText("Nova");
            jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonNovoActionPerformed(evt);
                }
            });

            jButtonExcluir.setText("Excluir");
            jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonExcluirActionPerformed(evt);
                }
            });

            jButtonAlterar.setText("Alterar");
            jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonAlterarActionPerformed(evt);
                }
            });

            jButtonCancelar.setText("Cancelar");
            jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonCancelarActionPerformed(evt);
                }
            });

            jButtonSalvar.setText("Salvar");
            jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonSalvarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jButtonNovo)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonExcluir)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonAlterar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonCancelar))
                .addComponent(jScrollPane1)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNovo)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonAlterar)
                        .addComponent(jButtonCancelar)
                        .addComponent(jButtonSalvar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addContainerGap())
            );

            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Disciplina"));
            jPanel2.setLayout(new java.awt.GridLayout(1, 2));

            jLabel1.setText("* Nome da disciplina:");

            jTextNome.setEnabled(false);

            jTextTurma.setEnabled(false);

            jLabel2.setText("   Turma:");

            jLabel3.setText("   Sala:");

            jLabel4.setText("   Professor:");

            jTextProfessor.setEnabled(false);

            jTextSala.setEnabled(false);

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextSala, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addComponent(jTextNome))
                    .addGap(35, 35, 35))
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
            );

            jPanel2.add(jPanel5);

            jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Horários"));

            jScrollPane2.setViewportView(jListHorarios);

            jButtonAdicionarHorario.setText("+");
            jButtonAdicionarHorario.setEnabled(false);
            jButtonAdicionarHorario.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonAdicionarHorarioActionPerformed(evt);
                }
            });

            jButtonRemoverHorario.setText("-");
            jButtonRemoverHorario.setEnabled(false);
            jButtonRemoverHorario.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonRemoverHorarioActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonAdicionarHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemoverHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jButtonAdicionarHorario)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButtonRemoverHorario)
                    .addGap(0, 57, Short.MAX_VALUE))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            );

            jPanel2.add(jPanel4);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        umaDisciplina = null;
        modoAlteracao = true;
        novoRegistro = true;
        this.limparCampos();
        this.habilitarDesabilitarCampos();
        this.jTextNome.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAdicionarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarHorarioActionPerformed
        TelaInicial.diaDeAula.setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarHorarioActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        modoAlteracao = true;
        novoRegistro = false;
        this.habilitarDesabilitarCampos();
        this.jTextNome.requestFocus();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        this.controleDisciplina.remover(umaDisciplina);
        umaDisciplina = null;
        this.limparCampos();
        this.carregarListaDisciplinas();
        this.habilitarDesabilitarCampos();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        this.salvarRegistro();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if (novoRegistro == true) {
            this.limparCampos();
        } else {
            this.preencherCampos();
        }
        modoAlteracao = false;
        novoRegistro = false;
        this.habilitarDesabilitarCampos();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonRemoverHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverHorarioActionPerformed
        if(jListHorarios.getSelectedIndex() != -1){
            horariosListModel.removeElementAt(jListHorarios.getSelectedIndex());
        }
    }//GEN-LAST:event_jButtonRemoverHorarioActionPerformed

    private void jTableListaDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaDisciplinasMouseClicked
    if (jTableListaDisciplinas.isEnabled()) {
        DefaultTableModel model = (DefaultTableModel) jTableListaDisciplinas.getModel();
        String nome = (String) model.getValueAt(jTableListaDisciplinas.getSelectedRow(), 0);
        this.pesquisarDisciplina(nome);
    }
    }//GEN-LAST:event_jTableListaDisciplinasMouseClicked

    public static void carregarListaDisciplinas() {
        ArrayList<Disciplina> listaDisciplinas = controleDisciplina.getListaDisciplinas();
        DefaultTableModel model = (DefaultTableModel) jTableListaDisciplinas.getModel();
        model.setRowCount(0);
        for (Disciplina b : listaDisciplinas) {
            model.addRow(new String[]{b.getNome(), b.getTurma()});
        }
        jTableListaDisciplinas.setModel(model);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarHorario;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonRemoverHorario;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jListHorarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTableListaDisciplinas;
    private static javax.swing.JTextField jTextNome;
    private static javax.swing.JTextField jTextProfessor;
    private static javax.swing.JTextField jTextSala;
    private static javax.swing.JTextField jTextTurma;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        jTextNome.setText(null);
        jTextTurma.setText(null);
        jTextSala.setText(null);
        jTextProfessor.setText(null);
        horariosListModel.clear();
    }

    private void habilitarDesabilitarCampos() {
        boolean registroSelecionado = (umaDisciplina != null);
        jTextNome.setEnabled(modoAlteracao);
        jTextTurma.setEnabled(modoAlteracao);
        jTextSala.setEnabled(modoAlteracao);
        jTextProfessor.setEnabled(modoAlteracao);
        jButtonNovo.setEnabled(modoAlteracao == false);
        jButtonAlterar.setEnabled(modoAlteracao == false && registroSelecionado == true);
        jButtonExcluir.setEnabled(modoAlteracao == false && registroSelecionado == true);
        jButtonSalvar.setEnabled(modoAlteracao);
        jButtonCancelar.setEnabled(modoAlteracao);
        jButtonAdicionarHorario.setEnabled(modoAlteracao);
        jButtonRemoverHorario.setEnabled(modoAlteracao);
    }

    private void salvarRegistro() {
        ArrayList<DiaDeAula> horarios;
        
        if (this.validarCampos() == false) {
            return;
        }
        
        horarios = new ArrayList<>();
        for (int i = 0; i < horariosListModel.size(); i++) {
            DiaDeAula horario = (DiaDeAula) horariosListModel.getElementAt(i);
            horarios.add(horario);
        }
        
        if (novoRegistro == true) {
            umaDisciplina = new Disciplina(jTextNome.getText());
        } else {
            umaDisciplina.setNome(jTextNome.getText());
        }
        umaDisciplina = new Disciplina();
        umaDisciplina.setNome(jTextNome.getText());
        umaDisciplina.setTurma(jTextTurma.getText());
        umaDisciplina.setSala(jTextSala.getText());
        umaDisciplina.setProfessor(jTextProfessor.getText());
        umaDisciplina.setDiasDeAula(horarios);
        
        if (novoRegistro == true) {
            controleDisciplina.adicionar(umaDisciplina);
        }
        modoAlteracao = false;
        novoRegistro = false;
        this.carregarListaDisciplinas();
        this.habilitarDesabilitarCampos();
        
        
    }

    private void exibirInformacao(String info) {
        JOptionPane.showMessageDialog(this, info, "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void pesquisarDisciplina(String nome) {
        Disciplina disciplinaPesquisada = controleDisciplina.pesquisar(nome);

        if (disciplinaPesquisada == null) {
            exibirInformacao("Disciplina não encontrada.");
        } else {
            this.umaDisciplina = disciplinaPesquisada;
            this.preencherCampos();
            this.habilitarDesabilitarCampos();
        }
    }
    
    private void preencherCampos() {
        
        ArrayList<DiaDeAula> horarios;

        jTextNome.setText(umaDisciplina.getNome());
        jTextTurma.setText(umaDisciplina.getTurma());
        jTextSala.setText(umaDisciplina.getSala());
        jTextProfessor.setText(umaDisciplina.getProfessor());
        
        horariosListModel.clear();
        horarios = umaDisciplina.getDiasDeAula();
        for (DiaDeAula p : horarios) {
            horariosListModel.addElement(p);
        }
    }

    private boolean validarCampos() {
        if (validarNome(jTextNome.getText())){
            this.exibirInformacao("O valor do campo 'Nome' não foi informado.");
            jTextNome.requestFocus();
            return false;
        }
        return true;
    }
   
    public static boolean validarNome(String nome) {
        if (nome.trim().length() == 0) {
            return true;
        }
        return false;
    }
    
}
