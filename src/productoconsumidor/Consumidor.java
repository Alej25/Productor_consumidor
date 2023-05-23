 
package productoconsumidor;
 
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Consumidor  extends Thread{
    private  JFrame etiqueta;
    private   ventana personaje ;
        
    private Buffer  buffer; 
    public Consumidor(JFrame etiqueta, ventana personaje ) {
        this.etiqueta = etiqueta;
        this.personaje = personaje;
          
    }
   
    
    public Consumidor(Buffer b){
      this.buffer = b; 
      
    }
    public void run(){
         int consumidor1=0;
         int consumidor2=0;
        
    while(true){ 
          
         char c = this.buffer.consumir();
         System.out.println("recogiendo el caracter \t " + c +" \t del buffer");
         
         
        try {  // se manda  adormir el consumidor 
            sleep((int) (Math.random() * 4000));
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
        }
         
      } 
    } 
    
    
}
