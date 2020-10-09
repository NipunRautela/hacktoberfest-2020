
package mangement;

import mangement.panel.Request_panel;
import mangement.panel.Home_panel;
import mangement.panel.Home_LogIn_panel;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import mangement.panel.About_panel;
import mangement.panel.Contact_panel;
import mangement.panel.Help_desk;


public class Home extends javax.swing.JFrame {
    
    int xMousedrag;
    int yMousedrag;
    
    private ImageIcon image;
    private Cursor hand_cursor, move_cursor;
    
    // Create all panel that will be connect with Home 
    
    Home_panel panel1 = new Home_panel();
    Request_panel panel2 = new Request_panel();
    Home_LogIn_panel panel3 = new Home_LogIn_panel();
    Contact_panel panel4 = new Contact_panel();
    Help_desk panel5 = new Help_desk();
    About_panel panel6 = new About_panel();
    
    
    
    /**
     * Creates new form Home
     */
     public Home() {
        initComponents();
        this.setBounds(100,90,1131, 590);
        this.setTitle("Home");
        this.setVisible(true);
        
        image = new ImageIcon(getClass().getResource("Blood logo.png"));
        this.setIconImage(image.getImage());
        
        hand_cursor = new Cursor(Cursor.HAND_CURSOR);
        move_cursor = new Cursor(Cursor.MOVE_CURSOR);
        
        dynamicPanel.add(panel1);
        
        
        
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_panel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        request = new javax.swing.JLabel();
        logIn = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        home_panel = new javax.swing.JPanel();
        request_panel = new javax.swing.JPanel();
        logIn_panel = new javax.swing.JPanel();
        contact_panel = new javax.swing.JPanel();
        admin_panel = new javax.swing.JPanel();
        help_desk = new javax.swing.JLabel();
        about_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        dynamicPanel = new javax.swing.JPanel();
        frameDrag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        menu_panel.setBackground(new java.awt.Color(41, 39, 40));
        menu_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        menu_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 170, 10));
        menu_panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 150, 10));
        menu_panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 110, 10));

        request.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        request.setForeground(new java.awt.Color(255, 255, 255));
        request.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homeIcon/icons8_Drop_of_Blood_32px.png"))); // NOI18N
        request.setText("         Request");
        request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                requestMouseEntered(evt);
            }
        });
        menu_panel.add(request, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 60));

        logIn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        logIn.setForeground(new java.awt.Color(255, 255, 255));
        logIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homeIcon/icons8_Male_User_32px.png"))); // NOI18N
        logIn.setText("         Log In");
        logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logInMouseEntered(evt);
            }
        });
        menu_panel.add(logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 60));

        contact.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        contact.setForeground(new java.awt.Color(255, 255, 255));
        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homeIcon/icons8_Speech_Bubble_32px.png"))); // NOI18N
        contact.setText("         Contacts");
        contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactMouseEntered(evt);
            }
        });
        menu_panel.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 60));

        about.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        about.setForeground(new java.awt.Color(255, 255, 255));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homeIcon/icons8_Info_32px.png"))); // NOI18N
        about.setText("         About");
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutMouseEntered(evt);
            }
        });
        menu_panel.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 170, 50));

        home.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homeIcon/icons8_Home_32px.png"))); // NOI18N
        home.setText("         Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
        });
        menu_panel.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 170, 60));

        home_panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout home_panelLayout = new javax.swing.GroupLayout(home_panel);
        home_panel.setLayout(home_panelLayout);
        home_panelLayout.setHorizontalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        home_panelLayout.setVerticalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        menu_panel.add(home_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 10, -1));

        request_panel.setBackground(new java.awt.Color(41, 39, 40));

        javax.swing.GroupLayout request_panelLayout = new javax.swing.GroupLayout(request_panel);
        request_panel.setLayout(request_panelLayout);
        request_panelLayout.setHorizontalGroup(
            request_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        request_panelLayout.setVerticalGroup(
            request_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        menu_panel.add(request_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        logIn_panel.setBackground(new java.awt.Color(41, 39, 40));

        javax.swing.GroupLayout logIn_panelLayout = new javax.swing.GroupLayout(logIn_panel);
        logIn_panel.setLayout(logIn_panelLayout);
        logIn_panelLayout.setHorizontalGroup(
            logIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        logIn_panelLayout.setVerticalGroup(
            logIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        menu_panel.add(logIn_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        contact_panel.setBackground(new java.awt.Color(41, 39, 40));

        javax.swing.GroupLayout contact_panelLayout = new javax.swing.GroupLayout(contact_panel);
        contact_panel.setLayout(contact_panelLayout);
        contact_panelLayout.setHorizontalGroup(
            contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        contact_panelLayout.setVerticalGroup(
            contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        menu_panel.add(contact_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        admin_panel.setBackground(new java.awt.Color(41, 39, 40));

        javax.swing.GroupLayout admin_panelLayout = new javax.swing.GroupLayout(admin_panel);
        admin_panel.setLayout(admin_panelLayout);
        admin_panelLayout.setHorizontalGroup(
            admin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        admin_panelLayout.setVerticalGroup(
            admin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        menu_panel.add(admin_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        help_desk.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        help_desk.setForeground(new java.awt.Color(255, 255, 255));
        help_desk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homeIcon/Support.png"))); // NOI18N
        help_desk.setText("         Help Desk ");
        help_desk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                help_deskMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help_deskMouseEntered(evt);
            }
        });
        menu_panel.add(help_desk, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 170, 60));

        about_panel.setBackground(new java.awt.Color(41, 39, 40));

        javax.swing.GroupLayout about_panelLayout = new javax.swing.GroupLayout(about_panel);
        about_panel.setLayout(about_panelLayout);
        about_panelLayout.setHorizontalGroup(
            about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        about_panelLayout.setVerticalGroup(
            about_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        menu_panel.add(about_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mangement/Donate Blood.png"))); // NOI18N
        menu_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, 70));

        jLabel2.setBackground(new java.awt.Color(41, 39, 40));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BLOOD MANAGER");
        menu_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 20));
        menu_panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 102, 160, 10));

        getContentPane().add(menu_panel);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homeIcon/icons8_Cancel_20px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
        });
        jPanel5.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 40, 40));

        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/homeIcon/icons8_Minimize_Window_20px.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
        });
        jPanel5.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 30, 40));

        dynamicPanel.setBackground(new java.awt.Color(255, 255, 255));
        dynamicPanel.setLayout(new java.awt.CardLayout());
        jPanel5.add(dynamicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 950, 560));

        frameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDragMouseDragged(evt);
            }
        });
        frameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                frameDragMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDragMousePressed(evt);
            }
        });
        jPanel5.add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 40));

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure to exit ?", "Close", JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
        
        if (choice==JOptionPane.YES_OPTION){
            
            System.exit(0);      // close the window
        }
        
        
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        
        close.setToolTipText("close");
        close.setCursor(hand_cursor);
        
    }//GEN-LAST:event_closeMouseEntered

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        
        minimize.setToolTipText("minimize");
        minimize.setCursor(hand_cursor);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked
    
    // customize side menu effect
    
    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        
        this.setTitle("Home");
        
        // change color of selected panel 
        
        home_panel.setBackground(new Color(255, 255, 255));
        
        request_panel.setBackground(new Color(41, 39, 40));
        logIn_panel.setBackground(new Color(41, 39, 40));
        contact_panel.setBackground(new Color(41, 39, 40));
        admin_panel.setBackground(new Color(41, 39, 40));
        about_panel.setBackground(new Color(41, 39, 40));
        
        
        // To call home_panel
        
        dynamicPanel.removeAll();
        dynamicPanel.add(panel1);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
        
        
        
        
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
      
        home.setCursor(hand_cursor);
    }//GEN-LAST:event_homeMouseEntered

    private void requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseClicked
        
        this.setTitle("Request for Blood");
        
        //Change color of selected panel
        
        request_panel.setBackground(new Color(255, 255, 255));
        
        home_panel.setBackground(new Color(41, 39, 40));
        logIn_panel.setBackground(new Color(41, 39, 40));
        contact_panel.setBackground(new Color(41, 39, 40));
        admin_panel.setBackground(new Color(41, 39, 40));
        about_panel.setBackground(new Color(41, 39, 40));
        
        // To call Request Panel
        
        dynamicPanel.removeAll();
        dynamicPanel.add(panel2);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_requestMouseClicked

    private void requestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseEntered
        
        request.setCursor(hand_cursor);
    }//GEN-LAST:event_requestMouseEntered

    private void logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseClicked
        
        this.setTitle("Log In");
        
        //Change color of selected panel
        
        logIn_panel.setBackground(new Color(255, 255, 255));
        
        home_panel.setBackground(new Color(41, 39, 40));
        request_panel.setBackground(new Color(41, 39, 40));
        contact_panel.setBackground(new Color(41, 39, 40));
        admin_panel.setBackground(new Color(41, 39, 40));
        about_panel.setBackground(new Color(41, 39, 40));
        
        dynamicPanel.removeAll();
        dynamicPanel.add(panel3);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    
    }//GEN-LAST:event_logInMouseClicked

    private void logInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseEntered
        
        logIn.setCursor(hand_cursor);
    }//GEN-LAST:event_logInMouseEntered

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked
       
        this.setTitle("Contacts");

        // change color of Selected Panel
       
        contact_panel.setBackground(new Color(255, 255, 255));
        
        home_panel.setBackground(new Color(41, 39, 40));
        request_panel.setBackground(new Color(41, 39, 40));
        logIn_panel.setBackground(new Color(41, 39, 40));
        admin_panel.setBackground(new Color(41, 39, 40));
        about_panel.setBackground(new Color(41, 39, 40));
        
        // Add panel
        
        dynamicPanel.removeAll();
        dynamicPanel.add(panel4);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_contactMouseClicked

    private void contactMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseEntered
        
        contact.setCursor(hand_cursor);
    }//GEN-LAST:event_contactMouseEntered

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
       
        this.setTitle("About");
        
        //Change color of selected panel
        
        about_panel.setBackground(new Color(255, 255, 255));
        
        home_panel.setBackground(new Color(41, 39, 40));
        request_panel.setBackground(new Color(41, 39, 40));
        logIn_panel.setBackground(new Color(41, 39, 40));
        contact_panel.setBackground(new Color(41, 39, 40));
        admin_panel.setBackground(new Color(41, 39, 40));
        
         // Add panel
        
        dynamicPanel.removeAll();
        dynamicPanel.add(panel6);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
    }//GEN-LAST:event_aboutMouseClicked

    private void aboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseEntered
      
        about.setCursor(hand_cursor);
    }//GEN-LAST:event_aboutMouseEntered

    private void help_deskMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_deskMouseEntered

        help_desk.setCursor(hand_cursor);
    }//GEN-LAST:event_help_deskMouseEntered

    private void help_deskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_deskMouseClicked

        this.setTitle("Help Desk");

        //Change color of selected panel

        admin_panel.setBackground(new Color(255, 255, 255));

        home_panel.setBackground(new Color(41, 39, 40));
        request_panel.setBackground(new Color(41, 39, 40));
        logIn_panel.setBackground(new Color(41, 39, 40));
        contact_panel.setBackground(new Color(41, 39, 40));
        about_panel.setBackground(new Color(41, 39, 40));
        
        
        // Adding Help_desk panle5 to Home
        
        dynamicPanel.removeAll();
        dynamicPanel.add(panel5);
        dynamicPanel.repaint();
        dynamicPanel.revalidate();
        

    }//GEN-LAST:event_help_deskMouseClicked

    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMousedrag, y - yMousedrag);
    }//GEN-LAST:event_frameDragMouseDragged

    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        
        xMousedrag = evt.getX();
        yMousedrag = evt.getY();
    }//GEN-LAST:event_frameDragMousePressed

    private void frameDragMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseEntered
        
        frameDrag.setCursor(move_cursor);
    }//GEN-LAST:event_frameDragMouseEntered

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JPanel about_panel;
    private javax.swing.JPanel admin_panel;
    private javax.swing.JLabel close;
    private javax.swing.JLabel contact;
    private javax.swing.JPanel contact_panel;
    private javax.swing.JPanel dynamicPanel;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JLabel help_desk;
    private javax.swing.JLabel home;
    private javax.swing.JPanel home_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logIn;
    private javax.swing.JPanel logIn_panel;
    private javax.swing.JPanel menu_panel;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel request;
    private javax.swing.JPanel request_panel;
    // End of variables declaration//GEN-END:variables

    static class ABORT {

        public ABORT() {
        }
    }
}