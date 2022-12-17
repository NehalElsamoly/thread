package mythrid3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nehal
 */
public class NewClass  implements Runnable{
    int time;
    int num;
    NewClass(int n,int t){
        num=n;
        time=t;
    }
    @Override
    public void run(){
        for(int i=0;i<time;i++){
            System.out.print(num);
            Thread.yield();
            new2 c=new new2();
           if(i==50){
               
           }
        }
}}
