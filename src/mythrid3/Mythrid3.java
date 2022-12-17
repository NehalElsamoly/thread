/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mythrid3;

/**
 *
 * @author nehal
 */
public class Mythrid3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable a=new NewClass(9,4);
        Runnable b=new new2('a',10);
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();

    }
    
}
