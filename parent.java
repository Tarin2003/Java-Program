/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Hp
 */
public class parent {
    int a ;
    int d,e;
    private int b =10;
    int r = 10;
    parent(){
        System.out.println("Parent");
    }
    parent(int d,int e){
        this.d = d;
        this.e= e;
    }

   
    void display(){
        System.out.println("d = "+(d+e));
    }
void g (int a){
    System.out.println("parent Class");
}
  
    
    
}
