/*     */ import java.awt.Container;
/*     */ import java.awt.Image;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JOptionPane;
/*     */ 
/*     */ 
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
/*  31 */     JOptionPane.showMessageDialog(null, "The main window will be blank. Resize it until you can fully see the background.\nAlso, move the main window over a bit until you can fully see the scores window.");
/*  32 */     sgui.showframe();
/*  33 */     sgui.update();
/*  34 */     JFrame gui = new JFrame("Space Invaders!");
/*  35 */     gui.setSize(600, 500);
/*  36 */     gui.setDefaultCloseOperation(3);
/*  37 */     gui.setVisible(true);
/*  38 */     panel.setFocusable(true);
/*  39 */     pane = gui.getContentPane();
/*  40 */     CurrentDir.getDir();
/*  41 */     dir = CurrentDir.dir;
/*     */     try {
/*  43 */       File file = new File("/spaceinvaders/ship.png");
/*  44 */       sprite = ImageIO.read(file);
/*     */     }
/*  46 */     catch (IOException e) {
/*  47 */       e.printStackTrace();
/*  48 */       System.out.println("\n" + dir);
/*     */     } 
/*     */     try {
/*  51 */       File file2 = new File("/spaceinvaders/shoot.png");
/*  52 */       shoot = ImageIO.read(file2);
/*     */     }
/*  54 */     catch (IOException e1) {
/*  55 */       e1.printStackTrace();
/*  56 */       System.out.println("\n" + dir);
/*     */     } 
/*     */     try {
/*  59 */       File file3 = new File("/spaceinvaders/enemy.png");
/*  60 */       enemy = ImageIO.read(file3);
/*     */     }
/*  62 */     catch (IOException e) {
/*  63 */       e.printStackTrace();
/*  64 */       System.out.println("\n" + dir);
/*     */     } 
/*     */     try {
/*  67 */       File file4 = new File("/spaceinvaders/enemy.png");
/*  68 */       enemy2 = ImageIO.read(file4);
/*     */     }
/*  70 */     catch (IOException e) {
/*  71 */       e.printStackTrace();
/*  72 */       System.out.println("\n" + dir);
/*     */     } 
/*     */     try {
/*  75 */       File file5 = new File("/spaceinvaders/bg.jpg");
/*  76 */       bg = ImageIO.read(file5);
/*     */     }
/*  78 */     catch (IOException e) {
/*  79 */       e.printStackTrace();
/*  80 */       System.out.println("\n" + dir);
/*     */     } 
/*     */     try {
/*  83 */       File file6 = new File("/spaceinvaders/die.png");
/*  84 */       die = ImageIO.read(file6);
/*     */     }
/*  86 */     catch (IOException e) {
/*  87 */       e.printStackTrace();
/*  88 */       System.out.println("\n" + dir);
/*     */     } 
/*     */     try {
/*  91 */       File file7 = new File("/spaceinvaders/eshoot.png");
/*  92 */       eshoot = ImageIO.read(file7);
/*     */     }
/*  94 */     catch (IOException e) {
/*  95 */       e.printStackTrace();
/*  96 */       System.out.println("\n" + dir);
/*     */     } 
/*     */     try {
/*  99 */       File file8 = new File("/spaceinvaders/eshoot.png");
/* 100 */       eshoot2 = ImageIO.read(file8);
/*     */     }
/* 102 */     catch (IOException e) {
/* 103 */       e.printStackTrace();
/* 104 */       System.out.println("\n" + dir);
/*     */     } 
/*     */     try {
/* 107 */       File file9 = new File("/spaceinvaders/cdie.png");
/* 108 */       cdie = ImageIO.read(file9);
/*     */     }
/* 110 */     catch (IOException e) {
/* 111 */       e.printStackTrace();
/* 112 */       System.out.println("\n" + dir);
/*     */     } 
/* 114 */     pane.add(panel);
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