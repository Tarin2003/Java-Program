/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;




/**
 *
 * @author Hp
 */
public class Formatespecifier {
    void show1(){
        System.out.println("bb");
    }
    public static void main(String[] args) {
        boolean a = true;
        char b = 'a';
        int c = 12;
        short d = 1;
        float e = 1.2f;
        double f =1.44;
        System.out.printf("a = %b\n",a);
        System.out.printf("b = %c\n",b);
        System.out.printf("c = %d\n",c);
         System.out.printf("d = %d\n",d);
          System.out.printf("e = %.1f\n",e);
           System.out.printf("f = %.2f\n",f);
        
    }
    
}
