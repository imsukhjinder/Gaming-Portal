
package brick_breaker;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JFrame;

public class Frame1 extends javax.swing.JFrame {
   
    
    public Frame1() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gameing Portal");
        setBackground(new java.awt.Color(240, 231, 114));
        setPreferredSize(new java.awt.Dimension(987, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Aclonica", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 17, 9));
        jLabel1.setText("GAMEING PORTAL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 30, 627, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sweet Sardaar\\Documents\\NetBeansProjects\\Brick_Breaker\\src\\images\\unnamed.png")); // NOI18N
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snake_game(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 120, 271, 271);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sweet Sardaar\\Documents\\NetBeansProjects\\Brick_Breaker\\src\\images\\1.jpg")); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(530, 110, 271, 297);

        jLabel5.setFont(new java.awt.Font("Aclonica", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("Created By-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 430, 257, 42);

        jLabel6.setFont(new java.awt.Font("Aclonica", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 17, 9));
        jLabel6.setText("Sukhjinder Singh");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 490, 366, 42);

        jLabel7.setFont(new java.awt.Font("Aclonica", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 17, 9));
        jLabel7.setText("Ankush Rana");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 540, 281, 42);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sweet Sardaar\\Documents\\NetBeansProjects\\Brick_Breaker\\src\\images\\Jareds Wallpaper Wrap-Up Day 11  Rebel Gaming.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 1718, 1050);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1010, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
    Cursor cur1=new Cursor(Cursor.HAND_CURSOR);
    jLabel2.setCursor(cur1);
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
      Cursor cur1=new Cursor(Cursor.HAND_CURSOR);
    jLabel3.setCursor(cur1);      
    }//GEN-LAST:event_jLabel3MouseMoved

   
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       
        this.hide();
        JFrame obj = new JFrame(); 
        Gameplay gameplay=new Gameplay();
        obj.setBounds(10,10,992,700);
        obj.setTitle("Bricks Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        obj.add(gameplay); 
    }//GEN-LAST:event_jLabel3MouseClicked

    private void snake_game(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snake_game
        this.hide();
        JFrame obj2 = new JFrame("Snake"); 
        Gameplay2 game=new Gameplay2();
        obj2.setBounds(10, 10, 905, 700);
        obj2.setBackground(Color.yellow);
        obj2.setResizable(false);
        obj2.setVisible(true);
        obj2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        obj2.add(game);
        
        /* obj2.setContentPane(new GamePanel());
        obj2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        obj2.setResizable(false);
        obj2.pack();
       
        obj2.setPreferredSize(new Dimension (GamePanel.WIDTH1,GamePanel.HEIGHT2));
        obj2.setLocationRelativeTo(null);
        obj2.setVisible(true); */
        
    }//GEN-LAST:event_snake_game

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        Frame1 f=new Frame1();
        f.setVisible(true);
        
        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
              
                
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
