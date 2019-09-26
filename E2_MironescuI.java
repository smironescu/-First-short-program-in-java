/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipaquete;

/**
 *
 * @author crist
 */
public class E2_MironescuI {
    public static void main (String[]args){
        //Algoritme piscina 1
        int llarg = 300;
        int ample = 150;
        int profunditat = 20;
        
        //Algoritme piscina 2
        int llarg2 = 300;
        int ample2 = 80;
        int profunditat2 = 35;
        
        //1. Càlcul àrea piscina 1 i 2
        System.out.println(llarg*ample);
        System.out.println(llarg2*ample2);
        
        //2. Algoritme volum de les dues piscines
        System.out.println (llarg*ample+profunditat);
        System.out.println (llarg2*ample2+profunditat2);
        
        //3. Amplada i llargada de les dues piscines juntes.
        System.out.println (ample+ample2);
        
        //4. Àrea de les dues piscines juntes
        System.out.println (llarg*(ample+ample2));
        
        //5. Volum de les dues piscines juntes
        System.out.println (llarg*(ample+ample2)+(profunditat+profunditat2));
        
        /*Algoritme per calcular el volum de la piscina 1 i 2
        intercanviant la seva profunditat. */
        
        System.out.println (llarg*ample+profunditat2);
        System.out.println (llarg2*ample2+profunditat);
        
        
        
        
        
        
    }

    private static void println(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
       
