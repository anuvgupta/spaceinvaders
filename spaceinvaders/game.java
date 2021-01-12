/*     */ import java.awt.Container;
/*     */ import java.awt.Image;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JOptionPane;
/*     */ 
/*     */ 
import java.io.InputStream;
import java.io.OutputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class game
/*     */ {
/*  17 */   static npanel panel = new npanel();
/*  18 */   static Image sprite = null;
/*     */   
/*     */   static Container pane;
/*     */   
/*     */   static Image shoot;
/*     */   
/*     */   static String dir;
/*     */   
/*     */   static Image enemy;
/*     */   
/*     */   static Image enemy2;
/*     */   
/*     */   public static void main(String[] args) {
/*  31 */     JOptionPane.showMessageDialog(null, "Move the main window over a bit to see the scores window.");
/*  32 */     sgui.showframe();
/*  33 */     sgui.update();
/*  34 */     JFrame gui = new JFrame("Space Invaders!");
/*  35 */     gui.setSize(600-10, 500-10);
/*  36 */     gui.setDefaultCloseOperation(3);
/*  37 */     gui.setVisible(true);
/*  38 */     panel.setFocusable(true);
/*  39 */     pane = gui.getContentPane();
/*     */     try {
/*  43 */       // File file = new File("/spaceinvaders/ship.png");
/*     */         InputStream file = game.class.getClassLoader().getResourceAsStream("ship.png");
/*     */
/*  44 */       sprite = ImageIO.read(file);
/*     */     }
/*  46 */     catch (IOException e) {
/*  47 */       e.printStackTrace();
/*     */     } 
/*     */     try {
/*  51 */       InputStream file2 = game.class.getClassLoader().getResourceAsStream("shoot.png");
/*  52 */       shoot = ImageIO.read(file2);
/*     */     }
/*  54 */     catch (IOException e1) {
/*  55 */       e1.printStackTrace();
/*     */     } 
/*     */     try {
/*  59 */       InputStream file3 = game.class.getClassLoader().getResourceAsStream("enemy.png");
/*  60 */       enemy = ImageIO.read(file3);
/*     */     }
/*  62 */     catch (IOException e) {
/*  63 */       e.printStackTrace();
/*     */     } 
/*     */     try {
/*  67 */       InputStream file4 = game.class.getClassLoader().getResourceAsStream("enemy.png");
/*  68 */       enemy2 = ImageIO.read(file4);
/*     */     }
/*  70 */     catch (IOException e) {
/*  71 */       e.printStackTrace();
/*     */     } 
/*     */     try {
/*  75 */       InputStream file5 = game.class.getClassLoader().getResourceAsStream("bg.jpg");
/*  76 */       bg = ImageIO.read(file5);
/*     */     }
/*  78 */     catch (IOException e) {
/*  79 */       e.printStackTrace();
/*     */     } 
/*     */     try {
/*  83 */       InputStream file6 = game.class.getClassLoader().getResourceAsStream("die.png");
/*  84 */       die = ImageIO.read(file6);
/*     */     }
/*  86 */     catch (IOException e) {
/*  87 */       e.printStackTrace();
/*     */     } 
/*     */     try {
/*  91 */       InputStream file7 = game.class.getClassLoader().getResourceAsStream("eshoot.png");
/*  92 */       eshoot = ImageIO.read(file7);
/*     */     }
/*  94 */     catch (IOException e) {
/*  95 */       e.printStackTrace();
/*     */     } 
/*     */     try {
/*  99 */       InputStream file8 = game.class.getClassLoader().getResourceAsStream("eshoot.png");
/* 100 */       eshoot2 = ImageIO.read(file8);
/*     */     }
/* 102 */     catch (IOException e) {
/* 103 */       e.printStackTrace();
/*     */     } 
/*     */     try {
/* 107 */       InputStream file9 = game.class.getClassLoader().getResourceAsStream("cdie.png");
/* 108 */       cdie = ImageIO.read(file9);
/*     */     }
/* 110 */     catch (IOException e) {
/* 111 */       e.printStackTrace();
/*     */     } 
              gui.setSize(600, 518);
/* 114 */     pane.add(panel);
              gui.setSize(600, 518);
/* 115 */     panel.requestFocus();
/*     */   }
/*     */   
/*     */   static Image bg;
/*     */   static Image die;
/*     */   static Image eshoot;
/*     */   static Image eshoot2;
/*     */   static Image cdie;
/*     */   static boolean win;
/*     */ }


/* Location:              /Users/anuv/spaceinvaders/space-invaders-beta.jar!/game.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */