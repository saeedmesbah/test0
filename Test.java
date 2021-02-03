import java.awt.*;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*; 
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
  
// A directed graph using 
// adjacency list representation 
public class Test { 
    
    public static void main(String[] args) throws InterruptedException 
    { 
//        try{
//            pool.execute(new hello());
//        }
//        catch(Exception e){}
        ExecutorService pool = Executors.newCachedThreadPool();
        try {
            pool.execute(new hello());
            pool.execute(new hello());
            
        }
        finally{
            pool.shutdown();
        }
        
    } 
} 
class hello implements Runnable{
    public void draw() throws InterruptedException{
        System.out.println("hello");
        Thread.sleep(5000);
        System.out.println("hello2");
        
    }
  
  
  // test 1
    
    public void hello(){
        System.out.println("test1");
    }

    @Override
    public void run() {
        try {
            draw();
            hello();
        } catch (Exception ex) {
        }
    }
}
