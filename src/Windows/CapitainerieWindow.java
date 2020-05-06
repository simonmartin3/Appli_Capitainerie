/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Classes.*;
import Exception.SailorWithoutIdentificationException;
import Exception.ShipWithoutIdentificationException;
import java.io.File;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import network.*;

/**
 *
 * @author Simon
 */
public class CapitainerieWindow extends javax.swing.JFrame {

    /**
     * Creates new form CapitainerieWindow
     */
    
    LoginWindow LW;
    Hashtable<String, String> hmap = new Hashtable<>();
    Vector <Bateau> vBateauAmarré = new Vector<>();
    Vector <Quai> vQuai = new Vector<>();
    Vector <Ponton> vPonton = new Vector<>();
    Bateau tmp;
    
    private NetworkBasicServer nbs;
    private int PORT = 50000;
    
    
    // Format current date
    private static int formatDate;
    private static int formatHeure;
    private static Locale formatPays;
    
    public static void setFormatDate(int tmp){formatDate = tmp;}
    public static void setFormatHeure(int tmp){formatHeure = tmp;}   
    public static void setFormatLocale(Locale tmp){formatPays = tmp;}
    
    public CapitainerieWindow(java.awt.Frame parent, Hashtable tmp) throws ShipWithoutIdentificationException, SailorWithoutIdentificationException {
        
        // Initialisation JFrame -----------------------------------------------
        
        initComponents();
        this.setLocation(1920-this.getWidth(), 0);
        this.setResizable(false);
        this.setTitle("Capitainerie d'Inpres-Harbour");
        
        // ---------------------------------------------------------------------

        
        // Initialisation variables --------------------------------------------
        
        LW = (LoginWindow) parent;
        hmap = tmp;
        
        // ---------------------------------------------------------------------
        
        
        // Création de 4 bateaux -----------------------------------------------
        
        Bateau b1 = null, b2 = null, b3 = null, b4 = null;
        try{
            b1 = new BateauPeche("Marie Gueulante", "", 0, 0, "FR", "Q2*4", new Equipage(), "", "", 0, false); //Q2*4
            b2 = new BateauPlaisance("Aigle des mers", "", 0, 0, "FR", "P11*4", new Equipage(), "", "", 0, false);
            b3 = new BateauPlaisance("Victory", "", 0, 0, "UK", "P22*1", new Equipage(), "", "", 0, false);
            b4 = new BateauPlaisance("Schweinhund", "", 0, 0, "DE", "P21*1", new Equipage(), "", "", 0, false);
        }
        catch(ShipWithoutIdentificationException msg)
        {
            msg.Affiche();
        }
 
        vBateauAmarré.add(b1);
        vBateauAmarré.add(b2);
        vBateauAmarré.add(b3);
        vBateauAmarré.add(b4);
        
        // ---------------------------------------------------------------------
        
        
        // Création du Quai 2 et des pontons P1 et P2 --------------------------
        
        Quai Q1 = new Quai("Q1");
        Quai Q2 = new Quai("Q2");
        Ponton P1 = new Ponton("P1");
        Ponton P2 = new Ponton("P2");
        
        for(int i = 0; i < Q2.getCapacite(); i++)
        {
            Q1.getListe().add(i, new BateauPeche());
            Q2.getListe().add(i, new BateauPeche());
            P1.getListe(1).add(i, new BateauPlaisance());
            P1.getListe(2).add(i, new BateauPlaisance());
            P2.getListe(1).add(i, new BateauPlaisance());
            P2.getListe(2).add(i, new BateauPlaisance());
        }
        
        // Ajout de bateau dans emplacement quai et ponton
        Q2.getListe().add(3, b1);
        P1.getListe(1).add(3, b2);
        P2.getListe(2).add(0, b3);
        P2.getListe(1).add(0, b4);
        
        vQuai.add(Q1);
        vQuai.add(Q2);
        vPonton.add(P1);
        vPonton.add(P2);
        
        // ---------------------------------------------------------------------
        
        
        // Insertion images ----------------------------------------------------
        
        String image = "images" + File.separator + "image1.jpg";
                
        ImageIcon image1 = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(Image1.getWidth(), Image1.getHeight(), 20));
        Image1.setText(null);
        Image1.setIcon(image1);
        
        image = "images" + File.separator + "image2.jpg";
        
        ImageIcon image2 = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(Image2.getWidth(), Image2.getHeight(), 20));
        Image2.setText(null);
        Image2.setIcon(image2);
        
        // ---------------------------------------------------------------------
        
        
        // Disable component -------------------------------------------------------
        
        MenuItem_Login.setEnabled(false);
        Button_EnoyerConfirmation.setEnabled(false);
        
        //----------------------------------------------------------------------
        
        // Display current date ------------------------------------------------
        
        setFormatDate(DateFormat.SHORT);
        setFormatHeure(DateFormat.SHORT);
        setFormatLocale(Locale.FRANCE);
        displayDate();
        
        // ---------------------------------------------------------------------
        
        // Insertion vector dans JList -----------------------------------------
        
        insertListBateau();
        
        // ---------------------------------------------------------------------
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button_ServeurOn = new javax.swing.JButton();
        CheckBox_RequeteAttente = new javax.swing.JCheckBox();
        Button_Lire = new javax.swing.JButton();
        TextField_Requete = new javax.swing.JTextField();
        Label_AmarragePossible = new javax.swing.JLabel();
        Button_Choisir = new javax.swing.JButton();
        TextField_ChoixAmarage = new javax.swing.JTextField();
        Button_EnvoyerChoix = new javax.swing.JButton();
        TextField_Confirmation = new javax.swing.JTextField();
        Button_EnoyerConfirmation = new javax.swing.JButton();
        Label_BateauxEnEntree = new javax.swing.JLabel();
        Button_BatteauAmarre = new javax.swing.JButton();
        Button_ServeurOff = new javax.swing.JButton();
        Image2 = new javax.swing.JLabel();
        Image1 = new javax.swing.JLabel();
        Label_CurrentDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        List_Bateau = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Utilisateurs = new javax.swing.JMenu();
        MenuItem_Login = new javax.swing.JMenuItem();
        MenuItem_Logout = new javax.swing.JMenuItem();
        MenuItem_Nouveau = new javax.swing.JMenuItem();
        Menu_Amarrages = new javax.swing.JMenu();
        MenuItem_Plaisance = new javax.swing.JMenuItem();
        MenuItem_Peche = new javax.swing.JMenuItem();
        Menu_Bateaux = new javax.swing.JMenu();
        MenuItem_Liste = new javax.swing.JMenuItem();
        MenuItem_RechercheBateau = new javax.swing.JMenuItem();
        Menu_Personnel = new javax.swing.JMenu();
        MenuItem_Equipage = new javax.swing.JMenuItem();
        MenuItem_RechecrheMarin = new javax.swing.JMenuItem();
        Menu_Parametres = new javax.swing.JMenu();
        MenuItem_FormatDate = new javax.swing.JMenuItem();
        MenuItem_Log = new javax.swing.JMenuItem();
        CheckBoxMenuItem_AffichageDate = new javax.swing.JCheckBoxMenuItem();
        Menu_APropos = new javax.swing.JMenu();
        MenuItem_Auteurs = new javax.swing.JMenuItem();
        MenuItem_Aide = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Button_ServeurOn.setText("Démarrer le serveur");
        Button_ServeurOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ServeurOnActionPerformed(evt);
            }
        });

        CheckBox_RequeteAttente.setText("Requête en attente");
        CheckBox_RequeteAttente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBox_RequeteAttenteStateChanged(evt);
            }
        });

        Button_Lire.setText("Lire");
        Button_Lire.setEnabled(false);
        Button_Lire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LireActionPerformed(evt);
            }
        });

        TextField_Requete.setText("??");

        Label_AmarragePossible.setText("Amarrage possible :");

        Button_Choisir.setText("Choisir");
        Button_Choisir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ChoisirActionPerformed(evt);
            }
        });

        TextField_ChoixAmarage.setText("??");

        Button_EnvoyerChoix.setText("Envoyer choix");
        Button_EnvoyerChoix.setEnabled(false);
        Button_EnvoyerChoix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EnvoyerChoixActionPerformed(evt);
            }
        });

        TextField_Confirmation.setText("??");

        Button_EnoyerConfirmation.setText("Envoyer confirmation");
        Button_EnoyerConfirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EnoyerConfirmationActionPerformed(evt);
            }
        });

        Label_BateauxEnEntree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_BateauxEnEntree.setText("Bateaux en entrée");

        Button_BatteauAmarre.setText("Bateau amarré");
        Button_BatteauAmarre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BatteauAmarreActionPerformed(evt);
            }
        });

        Button_ServeurOff.setText("Arrêter le serveur");
        Button_ServeurOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ServeurOffActionPerformed(evt);
            }
        });

        Label_CurrentDate.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label_CurrentDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Label_CurrentDate.setText("/");

        jScrollPane2.setViewportView(List_Bateau);

        Menu_Utilisateurs.setText("Utilisateurs");

        MenuItem_Login.setText("Login");
        MenuItem_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_LoginActionPerformed(evt);
            }
        });
        Menu_Utilisateurs.add(MenuItem_Login);

        MenuItem_Logout.setText("Logout");
        MenuItem_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_LogoutActionPerformed(evt);
            }
        });
        Menu_Utilisateurs.add(MenuItem_Logout);

        MenuItem_Nouveau.setText("Nouveau");
        MenuItem_Nouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_NouveauActionPerformed(evt);
            }
        });
        Menu_Utilisateurs.add(MenuItem_Nouveau);

        jMenuBar1.add(Menu_Utilisateurs);

        Menu_Amarrages.setText("Amarrages");

        MenuItem_Plaisance.setText("Plaisance");
        MenuItem_Plaisance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_PlaisanceActionPerformed(evt);
            }
        });
        Menu_Amarrages.add(MenuItem_Plaisance);

        MenuItem_Peche.setText("Pêche");
        MenuItem_Peche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_PecheActionPerformed(evt);
            }
        });
        Menu_Amarrages.add(MenuItem_Peche);

        jMenuBar1.add(Menu_Amarrages);

        Menu_Bateaux.setText("Bateaux");

        MenuItem_Liste.setText("Liste complète");
        MenuItem_Liste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ListeActionPerformed(evt);
            }
        });
        Menu_Bateaux.add(MenuItem_Liste);

        MenuItem_RechercheBateau.setText("Rechercher un bateau");
        MenuItem_RechercheBateau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_RechercheBateauActionPerformed(evt);
            }
        });
        Menu_Bateaux.add(MenuItem_RechercheBateau);

        jMenuBar1.add(Menu_Bateaux);

        Menu_Personnel.setText("Personnel");

        MenuItem_Equipage.setText("Equipage d'un bateau");
        MenuItem_Equipage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_EquipageActionPerformed(evt);
            }
        });
        Menu_Personnel.add(MenuItem_Equipage);

        MenuItem_RechecrheMarin.setText("Rechercher un marin");
        MenuItem_RechecrheMarin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_RechecrheMarinActionPerformed(evt);
            }
        });
        Menu_Personnel.add(MenuItem_RechecrheMarin);

        jMenuBar1.add(Menu_Personnel);

        Menu_Parametres.setText("Paramètres");

        MenuItem_FormatDate.setText("Format date");
        MenuItem_FormatDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_FormatDateActionPerformed(evt);
            }
        });
        Menu_Parametres.add(MenuItem_FormatDate);

        MenuItem_Log.setText("Fichier Log");
        MenuItem_Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_LogActionPerformed(evt);
            }
        });
        Menu_Parametres.add(MenuItem_Log);

        CheckBoxMenuItem_AffichageDate.setSelected(true);
        CheckBoxMenuItem_AffichageDate.setText("Affichage date-heure courante");
        CheckBoxMenuItem_AffichageDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxMenuItem_AffichageDateActionPerformed(evt);
            }
        });
        Menu_Parametres.add(CheckBoxMenuItem_AffichageDate);

        jMenuBar1.add(Menu_Parametres);

        Menu_APropos.setText("A Propos");

        MenuItem_Auteurs.setText("Auteurs");
        MenuItem_Auteurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_AuteursActionPerformed(evt);
            }
        });
        Menu_APropos.add(MenuItem_Auteurs);

        MenuItem_Aide.setText("Aide");
        MenuItem_Aide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_AideActionPerformed(evt);
            }
        });
        Menu_APropos.add(MenuItem_Aide);

        jMenuBar1.add(Menu_APropos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckBox_RequeteAttente)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Lire)
                        .addGap(18, 18, 18)
                        .addComponent(TextField_Requete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Image2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_BatteauAmarre, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                            .addComponent(Button_ServeurOff, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                            .addComponent(Label_BateauxEnEntree, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_ServeurOn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Label_CurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_AmarragePossible)
                                .addGap(18, 18, 18)
                                .addComponent(Button_Choisir)
                                .addGap(18, 18, 18)
                                .addComponent(TextField_ChoixAmarage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_EnvoyerChoix)
                                .addGap(18, 18, 18)
                                .addComponent(TextField_Confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Button_EnoyerConfirmation)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_ServeurOn)
                    .addComponent(Label_CurrentDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBox_RequeteAttente)
                    .addComponent(Button_Lire)
                    .addComponent(TextField_Requete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_AmarragePossible)
                    .addComponent(Button_Choisir)
                    .addComponent(TextField_ChoixAmarage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_EnvoyerChoix)
                    .addComponent(TextField_Confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_EnoyerConfirmation))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_BateauxEnEntree)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button_BatteauAmarre)
                        .addGap(18, 18, 18)
                        .addComponent(Button_ServeurOff))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Image2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**********************************************************************/
    /*                          Menu Utilisateur                          */
    /**********************************************************************/
    
    private void MenuItem_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_LoginActionPerformed
        // TODO add your handling code here:
        LW.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuItem_LoginActionPerformed

    private void MenuItem_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_LogoutActionPerformed
        // TODO add your handling code here:
        MenuItem_Login.setEnabled(true);
        IsEnable(false);
    }//GEN-LAST:event_MenuItem_LogoutActionPerformed

    private void MenuItem_NouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_NouveauActionPerformed
        // TODO add your handling code here:
        NewLoginWindow nw = new NewLoginWindow(this, true);
        nw.setVisible(true);
    }//GEN-LAST:event_MenuItem_NouveauActionPerformed
    
    
    /**********************************************************************/
    /*                            Menu Amarrages                          */
    /**********************************************************************/

    private void MenuItem_PlaisanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_PlaisanceActionPerformed
        // TODO add your handling code here:
        PlaisanceWindow pw = new PlaisanceWindow(this, true, vPonton);
        pw.setVisible(true);
    }//GEN-LAST:event_MenuItem_PlaisanceActionPerformed

    private void MenuItem_PecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_PecheActionPerformed
        // TODO add your handling code here:
        PecheWindow pw = new PecheWindow(this, true, vQuai);
        pw.setVisible(true);
    }//GEN-LAST:event_MenuItem_PecheActionPerformed


    /**********************************************************************/
    /*                            Menu Bateaux                            */
    /**********************************************************************/

    private void MenuItem_ListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ListeActionPerformed
        // TODO add your handling code here:
        ListBateauWindow lbw = new ListBateauWindow(this, true, vBateauAmarré);
        lbw.setVisible(true);
    }//GEN-LAST:event_MenuItem_ListeActionPerformed
    
    private void MenuItem_RechercheBateauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_RechercheBateauActionPerformed
        // TODO add your handling code here:
        SearchBateauWindow sbw = new SearchBateauWindow(this, true);
        sbw.setVisible(true);
    }//GEN-LAST:event_MenuItem_RechercheBateauActionPerformed
    

    /**********************************************************************/
    /*                           Menu Personnel                           */
    /**********************************************************************/
    
    private void MenuItem_EquipageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_EquipageActionPerformed
        // TODO add your handling code here:
        ListEquipageWindow lew = new ListEquipageWindow(this, true, vBateauAmarré);
        lew.setVisible(true);
    }//GEN-LAST:event_MenuItem_EquipageActionPerformed


    /**********************************************************************/
    /*                           Menu Paramètres                          */
    /**********************************************************************/
    
    private void MenuItem_FormatDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_FormatDateActionPerformed
        // TODO add your handling code here:
        DateWindow dw = new DateWindow(this, true);
        dw.setVisible(true);
    }//GEN-LAST:event_MenuItem_FormatDateActionPerformed
    
    private void MenuItem_LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_LogActionPerformed
        // TODO add your handling code here:
        LogWindow lw = new LogWindow(this, true);
        lw.setVisible(true);
    }//GEN-LAST:event_MenuItem_LogActionPerformed

    private void CheckBoxMenuItem_AffichageDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxMenuItem_AffichageDateActionPerformed
        // TODO add your handling code here:
        if(CheckBoxMenuItem_AffichageDate.isSelected())
        {
            Label_CurrentDate.setVisible(true);
        }
        else
        {
            Label_CurrentDate.setVisible(false);
        }
    }//GEN-LAST:event_CheckBoxMenuItem_AffichageDateActionPerformed


    /**********************************************************************/
    /*                            Menu A Propos                           */
    /**********************************************************************/
    
    private void MenuItem_AuteursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AuteursActionPerformed
        // TODO add your handling code here:
        String message = "Copyright 2020\nMARTIN Simon"; 
        JOptionPane.showMessageDialog(null,message, "A Propos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MenuItem_AuteursActionPerformed

    private void MenuItem_AideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_AideActionPerformed
        // TODO add your handling code here:
        HelpWindow hw = new HelpWindow(this, true);
        hw.setVisible(true);
    }//GEN-LAST:event_MenuItem_AideActionPerformed
    
    
    /**********************************************************************/
    /*                              Buttons                               */
    /**********************************************************************/
    
    private void Button_ServeurOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ServeurOnActionPerformed
        nbs = new NetworkBasicServer(PORT, CheckBox_RequeteAttente);
    }//GEN-LAST:event_Button_ServeurOnActionPerformed
    
    private void Button_ServeurOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ServeurOffActionPerformed
        // TODO add your handling code here:
        
        // création de marins
        Marin c1 = null, c2 = null, c3 = null, c4 = null, s1 = null, s2 = null, s3 = null, b1 = null, b2 = null, b3 = null, m1 = null, m2 = null, m3 = null, m4 = null;
        try {
            c1 = new Marin("MARTIN", "Simon", "07-10-1998", "Capitaine");
            c2 = new Marin("CAHAY", "Aurélie", "01-01-2001", "Capitaine");
            c3 = new Marin("NEUFCOUR", "Sean", "10-09-1997", "Capitaine");
            c4 = new Marin("DEFAWES", "Corentin", "29-09-1998", "Capitaine");
            
            s1 = new Marin("MERLO", "Cyril", "06-06-1995", "Second");
            s2 = new Marin("BOUCHU", "Bryan", "21-10-1991", "Second");
            s3 = new Marin("BOUCHU", "Salomé", "21-10-1993", "Second");
            
            b1 = new Marin("VOTION", "Hugo", "11-12-1995", "Bosco");
            b2 = new Marin("CLAES", "Gustave", "25-04-1997", "Bosco");
            b3 = new Marin("LIZIN", "Alexandre", "14-08-1992", "Bosco");
            
            m1 = new Marin("RICCARDO", "Adrien", "31-08-1998", "Matelot");
            m2 = new Marin("GENOT", "Benoit", "18-02-1998", "Matelot");
            m3 = new Marin("ERNOTTE", "Benoit", "13-03-1990", "Matelot");
            m4 = new Marin("SIMONS", "Michel", "20-07-1995", "Matelot");
        } catch (SailorWithoutIdentificationException ex) {
            ex.Affiche();
        }
        
        // Création d'equipage
        Equipage e1, e2, e3, e4;
        ArrayList<Marin> p1, p2, p3, p4;
        
        // Insertion equipage b1
        p1 = new ArrayList<Marin>();
        p1.add(b1);
        p1.add(m1);
        p1.add(m2);
        e1 = new Equipage(c1, s1, p1);
           
        vBateauAmarré.get(0).setEquipage(e1);
        vBateauAmarré.get(0).getEquipage().setAUnEquipage(true);
        
        // Insertion equipage b2
        p2 = new ArrayList<Marin>();
        p2.add(b2);
        p2.add(m3);
        e2 = new Equipage(c2, s2, p2);
           
        vBateauAmarré.get(1).setEquipage(e2);
        vBateauAmarré.get(1).getEquipage().setAUnEquipage(true);
        
        // Insertion equipage b3
        p3 = new ArrayList<Marin>();
        p3.add(m4);
        e3 = new Equipage(c3, s3, p3);
           
        vBateauAmarré.get(2).setEquipage(e3);
        vBateauAmarré.get(2).getEquipage().setAUnEquipage(true);
        
        // Insertion equipage b4
        p4 = new ArrayList<Marin>();
        p4.add(b3);
        e4 = new Equipage(c4, null, p4);
           
        vBateauAmarré.get(3).setEquipage(e4);
        vBateauAmarré.get(3).getEquipage().setAUnEquipage(true);
        
        System.err.println("Insertion des données");
    }//GEN-LAST:event_Button_ServeurOffActionPerformed

    private void Button_BatteauAmarreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BatteauAmarreActionPerformed
        // TODO add your handling code here:
        if(List_Bateau.getSelectedValue() == null)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Pas de bateau sélectionné !", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        else
        {            
            InfoBateauWindow ifw = new InfoBateauWindow(this, vBateauAmarré.get(List_Bateau.getSelectedIndex()), List_Bateau.getSelectedIndex(), true);
            ifw.setVisible(true);
        }
    }//GEN-LAST:event_Button_BatteauAmarreActionPerformed

    private void MenuItem_RechecrheMarinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_RechecrheMarinActionPerformed
        // TODO add your handling code here:
        SearchMarinWindow smw = new SearchMarinWindow(this, true);
        smw.setVisible(true);
    }//GEN-LAST:event_MenuItem_RechecrheMarinActionPerformed

    private void Button_LireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LireActionPerformed
        String req = nbs.getMessage();

        if(!req.equals("RIEN"))
        {
            TextField_Requete.setText(req);
        }
    }//GEN-LAST:event_Button_LireActionPerformed

    private void Button_ChoisirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ChoisirActionPerformed
        StringTokenizer req = new StringTokenizer(this.TextField_Requete.getText(), " / ");
        
        String nomBateau = req.nextToken();
        String longueur = req.nextToken();
        String type = req.nextToken();
        String pavillon = req.nextToken();        
        try {
            if(type.equals("Peche"))
            {
                tmp = new BateauPeche(nomBateau, "", 0, Integer.parseInt(longueur), pavillon, "", new Equipage(), "", "", 0, false);
                ChoixPecheWindow cpw = new ChoixPecheWindow(this, true, vQuai);
                cpw.setVisible(true);
                TextField_ChoixAmarage.setText(tmp.getEmplacement());
                System.err.println("Bateau " + nomBateau + " créé");
            }
            else if(type.equals("Plaisance"))
            {
                tmp = new BateauPlaisance(nomBateau, "", 0, Integer.parseInt(longueur), pavillon, "", new Equipage(), "", "", 0, false); 
                ChoixPlaisanceWindow cpw = new ChoixPlaisanceWindow(this, true, vPonton);
                cpw.setVisible(true);
                TextField_ChoixAmarage.setText(tmp.getEmplacement());
                
                System.err.println("Bateau " + nomBateau + " créé");
            }
            else
            {
                System.err.println("error !!!!");
            }
        } catch (ShipWithoutIdentificationException ex) {
                ex.Affiche();
        }
        Button_EnvoyerChoix.setEnabled(true);
    }//GEN-LAST:event_Button_ChoisirActionPerformed

    private void Button_EnvoyerChoixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EnvoyerChoixActionPerformed
        String confirmation = tmp.getNom() + "<--" + this.TextField_ChoixAmarage.getText();
        
        TextField_Confirmation.setText(confirmation);
        Button_EnoyerConfirmation.setEnabled(true);
        
        String rep = this.TextField_ChoixAmarage.getText();
        nbs.sendMessage(rep);
        
        Button_EnvoyerChoix.setEnabled(false);
    }//GEN-LAST:event_Button_EnvoyerChoixActionPerformed

    private void Button_EnoyerConfirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EnoyerConfirmationActionPerformed
        String rep = this.TextField_Confirmation.getText();
        nbs.sendMessage(rep);
        Button_EnoyerConfirmation.setEnabled(false);
        
        vBateauAmarré.add(tmp);
        insertAmarrage(tmp);
        insertListBateau();
    }//GEN-LAST:event_Button_EnoyerConfirmationActionPerformed

    private void CheckBox_RequeteAttenteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckBox_RequeteAttenteStateChanged
        if(CheckBox_RequeteAttente.isSelected())
        {
            Button_Lire.setEnabled(true);
        }
        else
        {
            Button_Lire.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBox_RequeteAttenteStateChanged


    /**********************************************************************/
    /*                            Mes fonctions                           */
    /**********************************************************************/

    public void IsEnable(boolean tmp)
    {
        MenuItem_Logout.setEnabled(tmp);
        MenuItem_Nouveau.setEnabled(tmp);
        Menu_APropos.setEnabled(tmp);
        Menu_Amarrages.setEnabled(tmp);
        Menu_Bateaux.setEnabled(tmp);
        Menu_Personnel.setEnabled(tmp);
        Menu_Parametres.setEnabled(tmp);
        Button_BatteauAmarre.setEnabled(tmp);
        Button_Choisir.setEnabled(tmp);
        Button_EnoyerConfirmation.setEnabled(tmp);
        Button_EnvoyerChoix.setEnabled(tmp);
        Button_Lire.setEnabled(tmp);
        Button_ServeurOff.setEnabled(tmp);
        Button_ServeurOn.setEnabled(tmp);
        CheckBox_RequeteAttente.setEnabled(tmp);
        List_Bateau.setEnabled(tmp);
        TextField_ChoixAmarage.setEnabled(tmp);
        TextField_Confirmation.setEnabled(tmp);
        TextField_Requete.setEnabled(tmp);
        Image1.setEnabled(tmp);
        Image2.setEnabled(tmp);
        Label_AmarragePossible.setEnabled(tmp);
        Label_BateauxEnEntree.setEnabled(tmp);
    }
    
    public static String getCurrentDate()
    {
        
        Date date = new Date();
        String currentDate = DateFormat.getDateTimeInstance(formatDate,formatHeure,formatPays).format(date);
        return currentDate;
    }
    
    private void displayDate()
    {
        Thread thread = new Thread()
        {
            public void run()
            {
               while(true)
               {
                   Label_CurrentDate.setText(getCurrentDate());
                   try 
                   {
                       sleep(1000);
                   } 
                   catch (InterruptedException ex) 
                   {
                       ex.getMessage();
                   }
               }     
            }
        };
        thread.start();
    }
    
    public void insertListBateau()
    {
        DefaultListModel model = new DefaultListModel();
        
        for(int i = 0; i < vBateauAmarré.size(); i++)
        {
            if(vBateauAmarré.get(i).getTonnage() == 0 || vBateauAmarré.get(i).getPortAttache() == "" || vBateauAmarré.get(i).getEquipage().getAUnEquipage() == false )
            {
                model.addElement(vBateauAmarré.get(i).display() + " - Non enregistré");
            }
            else
            {
                model.addElement(vBateauAmarré.get(i).display() + " - Enregistré");
            }
            
        }
        List_Bateau.setModel(model);
    }
    
    public void insertAmarrage(Bateau tmp)
    {
        String emplacement = tmp.getEmplacement();
        char typeEmplacement = emplacement.charAt(0);
        int id = Character.getNumericValue(emplacement.charAt(1));
        
        
        if(typeEmplacement == 'Q')
        {
            int i = Character.getNumericValue(emplacement.charAt(3));
            Quai quaiTmp = vQuai.get(id-1);
            quaiTmp.getListe().add(i-1, (BateauPeche)tmp);
            vQuai.removeElementAt(id-1);
            vQuai.insertElementAt(quaiTmp, id-1);
            
        }
        else if(typeEmplacement == 'P')
        {
            int i = Character.getNumericValue(emplacement.charAt(2));
            int j = Character.getNumericValue(emplacement.charAt(4));
            Ponton pontonTmp = vPonton.get(id-1);
            pontonTmp.getListe(i).add(j-1, (BateauPlaisance)tmp);
            vPonton.removeElementAt(id-1);
            vPonton.insertElementAt(pontonTmp, id-1);
        }
        else
        {
            System.err.println("error insert amarrage");
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
            java.util.logging.Logger.getLogger(CapitainerieWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapitainerieWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapitainerieWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapitainerieWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CapitainerieWindow(null, null).setVisible(true);
                } catch (ShipWithoutIdentificationException ex) {
                    ex.Affiche();
                } catch (SailorWithoutIdentificationException ex) {
                    ex.Affiche();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_BatteauAmarre;
    private javax.swing.JButton Button_Choisir;
    private javax.swing.JButton Button_EnoyerConfirmation;
    private javax.swing.JButton Button_EnvoyerChoix;
    private javax.swing.JButton Button_Lire;
    private javax.swing.JButton Button_ServeurOff;
    private javax.swing.JButton Button_ServeurOn;
    private javax.swing.JCheckBoxMenuItem CheckBoxMenuItem_AffichageDate;
    private javax.swing.JCheckBox CheckBox_RequeteAttente;
    private javax.swing.JLabel Image1;
    private javax.swing.JLabel Image2;
    private javax.swing.JLabel Label_AmarragePossible;
    private javax.swing.JLabel Label_BateauxEnEntree;
    private javax.swing.JLabel Label_CurrentDate;
    private javax.swing.JList<String> List_Bateau;
    private javax.swing.JMenuItem MenuItem_Aide;
    private javax.swing.JMenuItem MenuItem_Auteurs;
    private javax.swing.JMenuItem MenuItem_Equipage;
    private javax.swing.JMenuItem MenuItem_FormatDate;
    private javax.swing.JMenuItem MenuItem_Liste;
    private javax.swing.JMenuItem MenuItem_Log;
    private javax.swing.JMenuItem MenuItem_Login;
    private javax.swing.JMenuItem MenuItem_Logout;
    private javax.swing.JMenuItem MenuItem_Nouveau;
    private javax.swing.JMenuItem MenuItem_Peche;
    private javax.swing.JMenuItem MenuItem_Plaisance;
    private javax.swing.JMenuItem MenuItem_RechecrheMarin;
    private javax.swing.JMenuItem MenuItem_RechercheBateau;
    private javax.swing.JMenu Menu_APropos;
    private javax.swing.JMenu Menu_Amarrages;
    private javax.swing.JMenu Menu_Bateaux;
    private javax.swing.JMenu Menu_Parametres;
    private javax.swing.JMenu Menu_Personnel;
    private javax.swing.JMenu Menu_Utilisateurs;
    private javax.swing.JTextField TextField_ChoixAmarage;
    private javax.swing.JTextField TextField_Confirmation;
    private javax.swing.JTextField TextField_Requete;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
