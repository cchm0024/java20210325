package p12.textbook.s120201;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	Thread thread = new Thread(new Runnable() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        @Override
        public void run() {
           for (int i = 0; i < 5; i++) {
              toolkit.beep();
              try {
                 Thread.sleep(500);
              } catch (InterruptedException e) {
                 e.printStackTrace();
              }
           }
        }         
     });
     
		toolkit.start();
     
     for (int i = 0; i < 5; i++)   {
        System.out.println("띵");
        try {
           Thread.sleep(500);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
     }
}
}