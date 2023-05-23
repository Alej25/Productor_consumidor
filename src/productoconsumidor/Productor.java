 
package productoconsumidor;

import java.util.logging.Level;
import java.util.logging.Logger;

 
public class Productor extends Thread {
    
    private Buffer  buffer;
    private final  String  letras = "abcdefghijklmnopqrstuvxyz";
    
    public Productor(Buffer b){
      this.buffer = b; 
      
    }
    @Override
    public void run(){
        
    while(true){ 
         
        char c = letras.charAt((int) (Math.random() * letras.length())); // genrar una letra aleatoria
      buffer.producir(c); // toma unaletra
      System.out.println("depositado el caracter \t " + c + " \t del buffer");
         
      
      try { /// manamos a dormir  al productor 
            sleep((int) (Math.random() * 3000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
        }
      } 
    } 
    
    
}
