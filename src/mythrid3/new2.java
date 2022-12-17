/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mythrid3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nehal
 */
public class new2 implements Runnable{
    char c;
    int num;
    new2(char ch ,int n){
    c=ch;
    n=num;
    }

    new2() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public void run(){
         try {
        for(int i=0;i<num;i++){
            System.out.print(c);
            if(i>=50)
                Thread.sleep(2);
            } 
         }
            catch (InterruptedException ex) {
                Logger.getLogger(new2.class.getName()).log(Level.SEVERE, null, ex);
        
    
}
}
