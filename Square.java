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
public class Square extends Quad {
    Square(double len){
        super(len,len);
    } 
   void Area(){
        double area = len*len;
        System.out.println("Square = "+area);
    } 
}
