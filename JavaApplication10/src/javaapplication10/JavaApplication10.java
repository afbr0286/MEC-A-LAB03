/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class JavaApplication10 {

    public static void main(String[] args) {
         Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String hora = sdf.format(calendar.getTime());
        System.out.println("son las: " + hora);
       
        Scanner read= new Scanner(System.in);
        System.out.print("Cuantos segundos desea para la alarma: ");
        int tiempo = read.nextInt();
        System.out.print("Sonara en : " + tiempo/60 +":"+tiempo%60);
       
       
        TimerTask timertask = new TimerTask() {
            @Override
            
            public void run() {
                System.out.println("WAKE UP");
               
            }
        };
       
        /*TimerTask timertask1 = new TimerTask() {
            int i=0;
            @Override
            public void run() {
                System.out.println("WAKE UP");
               
            }
        };*/
        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timertask, tiempo*1000 , 10000);  
    }
    
}
