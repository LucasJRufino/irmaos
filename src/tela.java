import javax.swing.JOptionPane;

public class tela extends javax.swing.JFrame {

    Usuario currentuser;
    Login auth;
    Empresa empresa;
    String[] arraypermissoes;
    public tela(Usuario user, Login auth, Empresa empresa) {
        currentuser = user;
        this.auth = auth;
        this.empresa = empresa;
        ListaAcesso.add(auth.getNome(currentuser), "Login");
        initComponents();
        setSize(570, 500);
        setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle(empresa.getNome());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barramenu = new javax.swing.JMenuBar();
        menubusca = new javax.swing.JMenu();
        menubi = new javax.swing.JMenu();
        menufi = new javax.swing.JMenu();
        menuadministracao = new javax.swing.JMenu();
        menuadministracaomanutencao = new javax.swing.JMenu();
        menuadministracaomanutencaoassociado = new javax.swing.JMenuItem();
        menuconfiguracao = new javax.swing.JMenu();
        menuconfiguracaoagendador = new javax.swing.JMenu();
        menuconfiguracaoagendadorfi = new javax.swing.JMenuItem();
        menuferramenta = new javax.swing.JMenu();
        menuferramentaemail = new javax.swing.JMenuItem();
        menuferramentasms = new javax.swing.JMenuItem();
        menurelatorio = new javax.swing.JMenu();
        menurelatorioassociado = new javax.swing.JMenuItem();
        menurelatoriosegurado = new javax.swing.JMenuItem();
        menurelatoriodependente = new javax.swing.JMenuItem();
        menuseguranca = new javax.swing.JMenu();
        menusegurancaempresa = new javax.swing.JMenuItem();
        menusegurancausuario = new javax.swing.JMenuItem();
        menusegurancapermissao = new javax.swing.JMenuItem();
        menusegurancalista = new javax.swing.JMenuItem();
        menusegurancasenha = new javax.swing.JMenuItem();
        menusegurancasair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Os Irmãos");
        setResizable(false);

        jPanel1.setBackground(empresa.getCor());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bem vindo(a) "+ currentuser.getNickname());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        menubusca.setText("Busca Rápida");
        barramenu.add(menubusca);

        menubi.setText("BI");
        barramenu.add(menubi);

        menufi.setText("FI");
        barramenu.add(menufi);

        menuadministracao.setText("Administração");

        menuadministracaomanutencao.setText("Manutenção");

        menuadministracaomanutencaoassociado.setText("Associado");
        menuadministracaomanutencao.add(menuadministracaomanutencaoassociado);

        menuadministracao.add(menuadministracaomanutencao);

        barramenu.add(menuadministracao);

        menuconfiguracao.setText("Configuração");

        menuconfiguracaoagendador.setText("Agendador de Tarefa");

        menuconfiguracaoagendadorfi.setText("FI");
        menuconfiguracaoagendador.add(menuconfiguracaoagendadorfi);

        menuconfiguracao.add(menuconfiguracaoagendador);

        barramenu.add(menuconfiguracao);

        menuferramenta.setText("Ferramenta");

        menuferramentaemail.setText("Gerenciador de e-mail");
        menuferramenta.add(menuferramentaemail);

        menuferramentasms.setText("Gerenciador de SMS");
        menuferramentasms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuferramentasmsActionPerformed(evt);
            }
        });
        menuferramenta.add(menuferramentasms);

        barramenu.add(menuferramenta);

        menurelatorio.setText("Relatório");

        menurelatorioassociado.setText("Associado");
        menurelatorioassociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menurelatorioassociadoActionPerformed(evt);
            }
        });
        menurelatorio.add(menurelatorioassociado);

        menurelatoriosegurado.setText("Segurado");
        menurelatorio.add(menurelatoriosegurado);

        menurelatoriodependente.setText("Dependente");
        menurelatorio.add(menurelatoriodependente);

        barramenu.add(menurelatorio);

        menuseguranca.setText("Segurança");

        menusegurancaempresa.setBackground(empresa.getCor());
        menusegurancaempresa.setText("Empresa");
        menusegurancaempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusegurancaempresaActionPerformed(evt);
            }
        });
        menuseguranca.add(menusegurancaempresa);
        menusegurancaempresa.setVisible(currentuser.temPermissao("Empresa"));

        menusegurancausuario.setText("Usuário");
        menusegurancausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusegurancausuarioActionPerformed(evt);
            }
        });
        menuseguranca.add(menusegurancausuario);
        menusegurancausuario.setVisible(currentuser.temPermissao("Usuário"));

        menusegurancapermissao.setText("Permissão");
        menuseguranca.add(menusegurancapermissao);
        menusegurancapermissao.setVisible(currentuser.temPermissao("Permissão"));

        menusegurancalista.setText("Lista de Acesso");
        menusegurancalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusegurancalistaActionPerformed(evt);
            }
        });
        menuseguranca.add(menusegurancalista);
        menusegurancalista.setVisible(currentuser.temPermissao("Lista de Acesso"));

        menusegurancasenha.setText("Alterar Senha");
        menusegurancasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusegurancasenhaActionPerformed(evt);
            }
        });
        menuseguranca.add(menusegurancasenha);
        menusegurancasenha.setVisible(currentuser.temPermissao("Alterar Senha"));

        menusegurancasair.setText("Sair");
        menusegurancasair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusegurancasairActionPerformed(evt);
            }
        });
        menuseguranca.add(menusegurancasair);
        menusegurancasair.setVisible(currentuser.temPermissao("Sair"));

        barramenu.add(menuseguranca);
        arraypermissoes = new String[] {"Empresa", "Usuário", "Permissão", "Lista de Acesso", "Alterar Senha", "Sair"};
        menuseguranca.setVisible(currentuser.checapermissaocategoria(arraypermissoes));

        setJMenuBar(barramenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menusegurancaempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusegurancaempresaActionPerformed
        new telaempresa(empresa, auth, currentuser).setVisible(true);
        setVisible(false);
        dispose();

    }//GEN-LAST:event_menusegurancaempresaActionPerformed

    private void menusegurancasairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusegurancasairActionPerformed
        ListaAcesso.add(auth.getNome(currentuser), "Logout");
        setVisible(false);
        dispose();
        new telalogin(currentuser, auth, empresa).setVisible(true);
    }//GEN-LAST:event_menusegurancasairActionPerformed

    private void menusegurancasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusegurancasenhaActionPerformed
        new telaalterarsenha(currentuser, auth).setVisible(true);
    }//GEN-LAST:event_menusegurancasenhaActionPerformed

    private void menusegurancalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusegurancalistaActionPerformed
        JOptionPane.showMessageDialog(null, ListaAcesso.read(), "Lista de Acesso", 1);
    }//GEN-LAST:event_menusegurancalistaActionPerformed

    private void menusegurancausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusegurancausuarioActionPerformed
        new telausuario(currentuser, auth).setVisible(true);
    }//GEN-LAST:event_menusegurancausuarioActionPerformed

    private void menurelatorioassociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menurelatorioassociadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menurelatorioassociadoActionPerformed

    private void menuferramentasmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuferramentasmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuferramentasmsActionPerformed

    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barramenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuadministracao;
    private javax.swing.JMenu menuadministracaomanutencao;
    private javax.swing.JMenuItem menuadministracaomanutencaoassociado;
    private javax.swing.JMenu menubi;
    private javax.swing.JMenu menubusca;
    private javax.swing.JMenu menuconfiguracao;
    private javax.swing.JMenu menuconfiguracaoagendador;
    private javax.swing.JMenuItem menuconfiguracaoagendadorfi;
    private javax.swing.JMenu menuferramenta;
    private javax.swing.JMenuItem menuferramentaemail;
    private javax.swing.JMenuItem menuferramentasms;
    private javax.swing.JMenu menufi;
    private javax.swing.JMenu menurelatorio;
    private javax.swing.JMenuItem menurelatorioassociado;
    private javax.swing.JMenuItem menurelatoriodependente;
    private javax.swing.JMenuItem menurelatoriosegurado;
    private javax.swing.JMenu menuseguranca;
    private javax.swing.JMenuItem menusegurancaempresa;
    private javax.swing.JMenuItem menusegurancalista;
    private javax.swing.JMenuItem menusegurancapermissao;
    private javax.swing.JMenuItem menusegurancasair;
    private javax.swing.JMenuItem menusegurancasenha;
    private javax.swing.JMenuItem menusegurancausuario;
    // End of variables declaration//GEN-END:variables
}
