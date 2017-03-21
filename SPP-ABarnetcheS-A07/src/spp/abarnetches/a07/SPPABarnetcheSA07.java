/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.abarnetches.a07;

/**
 *
 * @author albertobarnetche
 */
public class SPPABarnetcheSA07 {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
        // 
        int num;
        String [] phone = new String [10];
        Scanner tec = new Scanner (System.in);
        for (int i = 0; i < phone.length; i++){
            System.out.println("Digite el número telefonico " + i );
            phone[i] = tec.nextLine();
            
        }
        System.out.println("Introduzca que número quiere");
        num = tec.nextInt();
        if (num< phone.length){
        System.out.println("El numero es " + phone[num]);
        } 
        else System.out.println ("El número esta fuera del rango.");
    }
    
    }
    

