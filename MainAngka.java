/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus Laptop
 */
import java.util.*;
public class MainAngka {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double pecahan,bulat;
        Angka s = new Angka ();
        System.out.print(" Angka : ");
        double a= in.nextDouble ();
        if((a%2!=0)&&(a%2!=1)&&(a%2 != -1)){ 
              pecahan= a;
              s.D1();
           }
           else{
              bulat= a;
              s.I1();
           }
    }
}
