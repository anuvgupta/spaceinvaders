/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class sgui {
/*  6 */   static JLabel ac = new JLabel();
/*  7 */   static JLabel hc = new JLabel();
/*  8 */   static JLabel sc = new JLabel();
/*  9 */   static JFrame frame = new JFrame("Score");
/* 10 */   static JPanel panel = new JPanel();
/*    */   public static void showframe() {
/* 12 */     frame.setSize(100, 100);
/* 13 */     frame.setVisible(true);
/* 14 */     panel.add(ac);
/* 15 */     panel.add(hc);
/* 16 */     panel.add(sc);
/* 17 */     frame.add(panel);
/*    */   }
/*    */   public static void update() {
/* 20 */     ac.setText("Ammo:" + npanel.ammo);
/* 21 */     hc.setText("Health:" + npanel.health);
/* 22 */     sc.setText("Score:" + npanel.score);
/*    */   }
/*    */ }


/* Location:              /Users/anuv/spaceinvaders/space-invaders-beta.jar!/sgui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */