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
public class Child extends parent{
    int c;
    int r = 6;
    Child(){
        System.out.println("Child");
    }
    void show(){
        System.out.println(super.r);
    }
    Child(int d,int e){
        super(d,e);
    }
   
    
    @Override
    void display(){
        
        System.out.println("d = "+(d-e));
    }
    void dis(){
        super.display();
    }
    void g(double a){
        System.out.println("Child Class");
    }
   
    
}
