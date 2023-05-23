 
package productoconsumidor;
 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Buffer {
     private char[] buffer;
 
     private int siguiente;
     private boolean estaVacia;
     private boolean estaLlena;
     private JLabel [] botella;
     
      public Buffer(int tamanio, JLabel[] botella  ) {
        this.buffer =  new char [tamanio];
        this.siguiente=0;
        this.estaVacia =true;
        this.estaLlena=false;  
        this.botella= botella;
    }
    public synchronized void producir(char c){ // 
        while(this.estaLlena)   // si esta llena se espera hasta que alguien te vuelva a consumir
       {
           try {
               wait(); // se espera el hilo
           } catch (InterruptedException ex) {
               Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
           }
           
         }
       buffer[siguiente] = c ; // posicion 0
          for(int i = 0; i <= botella.length - 1; i++) {
                if(!botella[i].isVisible()) { 
                    botella[i].setVisible(true);
                      break;
        } } 
       siguiente ++; // como se aumenta , el siguente productor es 1
         
       this.estaVacia=false; // al momento de pasar  un valor a siguiente , ya no esta vacio
       if(siguiente == this.buffer.length){ // si la variable siguiente es del mismo tamaño que el array de buffer
           this.estaLlena= true; // se cambia la variable esta llena
        }
       
       notifyAll(); // notifico que continuen los demas 
      }
      public synchronized char consumir(){ //funciones sincornizadas 
      
          while(this.estaVacia){ // si esta vacia
              try {
                  wait();
                  
              } catch (InterruptedException ex) {
                  Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
          
          siguiente --;
           for(int i = 5; i >=  0; i--){
            if(botella[i].isVisible()){
            botella[i].setVisible(false);
            }
          }
          
           if (siguiente ==0){ // si mi variable siguente esta en 0 significa que
            this.estaVacia= true; // el array esta vacio y activamos el true
           }
           
           notifyAll();
           return this.buffer[this.siguiente];
      }
      
       
     
}
/*
for(int i = 0; i <= botella.length - 1; i++) {

    if(!botella[i].isVisible()) {

        botella[i].setVisible(true);
        break;

    }

}

  

*/