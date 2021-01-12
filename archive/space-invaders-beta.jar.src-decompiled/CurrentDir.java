/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class CurrentDir
/*    */ {
/*    */   public static void getDir() {
/*  7 */     File f1 = new File("./bin/");
/*    */     try {
/*  9 */       dir = f1.getCanonicalPath();
/* 10 */     } catch (IOException e) {
/*    */       
/* 12 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static String dir;
/*    */ }


/* Location:              /Users/anuv/spaceinvaders/space-invaders-beta.jar!/CurrentDir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */