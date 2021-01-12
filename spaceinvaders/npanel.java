/*     */ import java.awt.Graphics;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.Timer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class npanel
/*     */   extends JPanel
/*     */   implements KeyListener, ActionListener
/*     */ {
/* 120 */   private Timer time = new Timer(5, this);
/* 121 */   static int cx = 1000000;
/* 122 */   static int cy = 1000000;
/* 123 */   static int x = 250;
/* 124 */   static int y = 350;
/* 125 */   static int x2 = x + 63;
/* 126 */   static int y2 = y;
/* 127 */   static int bx1 = 10000;
/* 128 */   static int by1 = 10000;
/* 129 */   static int bx2 = 10000;
/* 130 */   static int by2 = 10000;
/* 131 */   static int ammo = 10;
/* 132 */   static int health = 10;
/* 133 */   static int score = 0;
/* 134 */   static int ex = 320;
/* 135 */   static int ey = -35;
/* 136 */   static int ex2 = 200;
/* 137 */   static int ey2 = -35;
/*     */   static boolean e1d = false;
/*     */   static boolean e2d = false;
/* 140 */   static int dx = 10000000;
/* 141 */   static int dy = 10000000;
/* 142 */   static int dx2 = 10000000; static boolean left = true; static boolean right = false; static boolean ifspace = false;
/* 143 */   static int dy2 = 10000000;
/*     */   
/*     */   static boolean ifwave = false;
/*     */   
/*     */   static boolean ifwave2 = false;
/*     */   
/*     */   public npanel() {
/* 150 */     addKeyListener(this);
/*     */   }
/*     */   public void paint(Graphics g) {
/* 153 */     super.paint(g);
/* 154 */     g.drawImage(game.bg, 0, 0, this);
/* 155 */     g.drawImage(game.sprite, x, y, this);
/* 156 */     g.drawImage(game.shoot, x2, y2, this);
/* 157 */     g.drawImage(game.enemy2, ex2, ey2, this);
/* 158 */     g.drawImage(game.enemy, ex, ey, this);
/* 159 */     g.drawImage(game.die, dx, dy, this);
/* 160 */     g.drawImage(game.die, dx2, dy2, this);
/* 161 */     g.drawImage(game.eshoot, bx1, by1, this);
/* 162 */     g.drawImage(game.eshoot2, bx2, by2, this);
/* 163 */     g.drawImage(game.cdie, cx, cy, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void keyPressed(KeyEvent e) {
/* 168 */     this.time.start();
/* 169 */     switch (e.getKeyCode()) {
/*     */       case 37:
/* 171 */         System.out.println("LEFT");
/* 172 */         x -= 10;
/*     */         break;
/*     */       case 39:
/* 175 */         System.out.println("RIGHT");
/* 176 */         x += 10;
/*     */         break;
/*     */       case 32:
/* 179 */         y2 = y;
/* 180 */         if (ammo != 0) {
/* 181 */           if (y2 == y) {
/* 182 */             y2 = y;
/* 183 */             x2 = x + 63;
/* 184 */             ammo--;
/* 185 */             System.out.println("FIRE!");
/* 186 */             ifspace = true;
/*     */           }  break;
/*     */         } 
/* 189 */         if (ammo == 0 && !game.win) {
/* 190 */           JOptionPane.showMessageDialog(null, "You ran out of ammo. You lost! Click ok to play again.");
/* 191 */           x = 250;
/* 192 */           y = 350;
/* 193 */           ifwave = false;
/* 194 */           x2 = x + 63;
/* 195 */           y2 = y;
/* 196 */           ammo = 10;
/* 197 */           health = 10;
/* 198 */           score = 0;
/* 199 */           ex = 320;
/* 200 */           ey = -35;
/* 201 */           dx = 1000000;
/* 202 */           dy = 1000000;
/* 203 */           dx2 = 1000000;
/* 204 */           dy2 = 1000000;
/* 205 */           ex2 = 200;
/* 206 */           ey2 = -35;
/* 207 */           e1d = false;
/* 208 */           e2d = false;
/* 209 */           ifwave2 = false;
/* 210 */           ifspace = false;
/* 211 */           this.time.stop();
/*     */         } 
/*     */         break;
/*     */     } 
/* 215 */     sgui.update();
/* 216 */     repaint();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void keyReleased(KeyEvent e) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void keyTyped(KeyEvent e) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent e) {
/* 232 */     if (health < 1) {
/* 233 */       JOptionPane.showMessageDialog(null, "You engines have been shot down. You lost! Click ok to play again.");
/* 234 */       x = 250;
/* 235 */       y = 350;
/* 236 */       ifwave = false;
/* 237 */       x2 = x + 63;
/* 238 */       y2 = y;
/* 239 */       ammo = 10;
/* 240 */       health = 10;
/* 241 */       score = 0;
/* 242 */       ex = 320;
/* 243 */       ey = -35;
/* 244 */       dx = 1000000;
/* 245 */       dy = 1000000;
/* 246 */       dx2 = 1000000;
/* 247 */       dy2 = 1000000;
/* 248 */       ex2 = 200;
/* 249 */       ey2 = -35;
/* 250 */       e1d = false;
/* 251 */       e2d = false;
/* 252 */       ifwave2 = false;
/* 253 */       ifspace = false;
/* 254 */       this.time.stop();
/* 255 */       game.win = false;
/*     */     } 
/* 257 */     if (!e1d) {
/* 258 */       if (by1 < y + 100) {
/* 259 */         by1 += 5;
/*     */       } else {
/*     */         
/* 262 */         by1 = ey - 1;
/* 263 */         bx1 = ex;
/*     */       } 
/*     */     } else {
/*     */       
/* 267 */       bx1 = 10000;
/* 268 */       by1 = 10000;
/*     */     } 
/* 270 */     if (!e2d) {
/* 271 */       if (by2 < y + 100) {
/* 272 */         by2 += 5;
/*     */       } else {
/*     */         
/* 275 */         by2 = ey2 - 1;
/* 276 */         bx2 = ex2;
/*     */       } 
/*     */     } else {
/*     */       
/* 280 */       bx2 = 10000;
/* 281 */       by2 = 10000;
/*     */     } 
/* 283 */     dy--;
/* 284 */     dy2--;
/* 285 */     cy++;
/* 286 */     if (by1 > y && bx1 > x && bx1 < x + 150) {
/* 287 */       health--;
/* 288 */       bx1 = 1000000;
/* 289 */       by1 = 1000000;
/* 290 */       cx = x;
/* 291 */       cy = y;
/* 292 */       sgui.update();
/*     */     } 
/* 294 */     if (by2 > y && bx2 > x && bx2 < x + 150) {
/* 295 */       health--;
/* 296 */       bx2 = 1000000;
/* 297 */       by2 = 100000;
/* 298 */       cx = x + 63;
/* 299 */       cy = y - 63;
/* 300 */       sgui.update();
/*     */     } 
/* 302 */     if (y2 > 0) {
/* 303 */       if (x2 > ex && x2 < ex + 150 && !e1d && y2 < 6) {
/* 304 */         e1d = true;
/* 305 */         score++;
/* 306 */         sgui.update();
/* 307 */         dx = ex;
/* 308 */         dy = ey;
/* 309 */         repaint();
/* 310 */         ex = 100000;
/*     */       }
/* 312 */       else if (x2 > ex2 && x2 < ex2 + 150 && !e2d && y2 < 6) {
/* 313 */         e2d = true;
/* 314 */         score++;
/* 315 */         sgui.update();
/* 316 */         dx2 = ex2;
/* 317 */         dy2 = ey2;
/* 318 */         repaint();
/* 319 */         ex2 = 100000;
/*     */       }
/* 321 */       else if (score == 2 && !ifwave) {
/* 322 */         JOptionPane.showMessageDialog(null, "Wave Two.");
/* 323 */         game.win = false;
/* 324 */         ex = 320;
/* 325 */         x2 = x + 63;
/* 326 */         y2 = y;
/* 327 */         ifwave = true;
/* 328 */         ey = -35;
/* 329 */         ex2 = 200;
/* 330 */         ey2 = -35;
/* 331 */         e1d = false;
/* 332 */         e2d = false;
/* 333 */         dx = 1000000;
/* 334 */         dy = 1000000;
/* 335 */         dx2 = 1000000;
/* 336 */         dy2 = 1000000;
/* 337 */         bx1 = 1000000;
/* 338 */         by1 = 1000000;
/* 339 */         bx2 = 1000000;
/* 340 */         by2 = 100000;
/* 341 */         cx = 10000000;
/* 342 */         cy = 10000000;
/* 343 */         ifspace = false;
/* 344 */         this.time.stop();
/*     */       }
/* 346 */       else if (score == 4 && !ifwave2) {
/* 347 */         JOptionPane.showMessageDialog(null, "Wave Three.");
/* 348 */         game.win = false;
/* 349 */         ex = 100000;
/* 350 */         x2 = x + 63;
/* 351 */         y2 = y;
/* 352 */         ifwave2 = true;
/* 353 */         ey = 100000;
/* 354 */         ex2 = 200;
/* 355 */         ey2 = -35;
/* 356 */         e1d = true;
/* 357 */         e2d = false;
/* 358 */         dx = 1000000;
/* 359 */         dy = 1000000;
/* 360 */         dx2 = 1000000;
/* 361 */         dy2 = 1000000;
/* 362 */         bx1 = 1000000;
/* 363 */         by1 = 1000000;
/* 364 */         bx2 = 1000000;
/* 365 */         by2 = 100000;
/* 366 */         cx = 10000000;
/* 367 */         cy = 10000000;
/* 368 */         ifspace = false;
/* 369 */         this.time.stop();
/* 370 */         repaint();
/*     */       }
/* 372 */       else if (score == 5) {
/* 373 */         game.win = true;
/* 374 */         JOptionPane.showMessageDialog(null, "You Won! click ok to play again.");
/* 375 */         game.win = false;
/* 376 */         x = 250;
/* 377 */         y = 350;
/* 378 */         x2 = x + 63;
/* 379 */         y2 = y;
/* 380 */         ammo = 10;
/* 381 */         health = 10;
/* 382 */         score = 0;
/* 383 */         ex = 320;
/* 384 */         ey = -35;
/* 385 */         ex2 = 200;
/* 386 */         ey2 = -35;
/* 387 */         e1d = false;
/* 388 */         e2d = false;
/* 389 */         dx = 1000000;
/* 390 */         dy = 1000000;
/* 391 */         dx2 = 1000000;
/* 392 */         dy2 = 1000000;
/* 393 */         bx1 = 1000000;
/* 394 */         ifwave = false;
/* 395 */         by1 = 1000000;
/* 396 */         bx2 = 1000000;
/* 397 */         by2 = 100000;
/* 398 */         cx = 10000000;
/* 399 */         cy = 10000000;
/* 400 */         ifspace = false;
/* 401 */         this.time.stop();
/*     */       }
/* 403 */       else if (health == 0) {
/* 404 */         JOptionPane.showMessageDialog(null, "You engines have been shot down. You lost! Click ok to play again.");
/* 405 */         x = 250;
/* 406 */         y = 350;
/* 407 */         x2 = 1000000;
/* 408 */         y2 = 1000000;
/* 409 */         ammo = 10;
/* 410 */         health = 10;
/* 411 */         score = 0;
/* 412 */         ex = 320;
/* 413 */         ey = -35;
/* 414 */         ex2 = 200;
/* 415 */         ey2 = -35;
/* 416 */         e1d = false;
/* 417 */         e2d = false;
/* 418 */         dx = 1000000;
/* 419 */         dy = 1000000;
/* 420 */         dx2 = 1000000;
/* 421 */         dy2 = 1000000;
/* 422 */         bx1 = 1000000;
/* 423 */         by1 = 1000000;
/* 424 */         bx2 = 1000000;
/* 425 */         ifwave = false;
/* 426 */         by2 = 100000;
/* 427 */         cx = 10000000;
/* 428 */         cy = 10000000;
/* 429 */         ifspace = false;
/* 430 */         this.time.stop();
/*     */       } else {
/*     */         
/* 433 */         if (!e1d) {
/* 434 */           if (ex == 500) {
/* 435 */             ex -= 3;
/* 436 */             left = true;
/* 437 */             right = false;
/*     */           }
/* 439 */           else if (ex == 2) {
/* 440 */             ex += 3;
/* 441 */             left = false;
/* 442 */             right = true;
/*     */           }
/* 444 */           else if (ex > 2 && ex < 500) {
/* 445 */             if (left) {
/* 446 */               ex -= 3;
/*     */             }
/* 448 */             else if (right) {
/* 449 */               ex += 3;
/*     */             } 
/*     */           } 
/*     */         }
/* 453 */         if (!e2d) {
/* 454 */           if (ex2 == 500) {
/* 455 */             ex2 -= 3;
/* 456 */             left = true;
/* 457 */             right = false;
/*     */           }
/* 459 */           else if (ex2 == 2) {
/* 460 */             ex2 += 3;
/* 461 */             left = false;
/* 462 */             right = true;
/*     */           }
/* 464 */           else if (ex2 > 2 && ex2 < 500) {
/* 465 */             if (left) {
/* 466 */               ex2 -= 3;
/*     */             }
/* 468 */             else if (right) {
/* 469 */               ex2 += 3;
/*     */             } 
/*     */           } 
/*     */         }
/* 473 */         if (ifspace) {
/* 474 */           y2 -= 5;
/*     */         }
/*     */       } 
/*     */     } else {
/*     */       
/* 479 */       y2 = y;
/* 480 */       x2 = 10000;
/* 481 */       ifspace = false;
/*     */     } 
/* 483 */     repaint();
/*     */   }
/*     */ }


/* Location:              /Users/anuv/spaceinvaders/space-invaders-beta.jar!/npanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */