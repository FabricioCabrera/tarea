/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author IDEAPAD 330
 */
public class Serie {
     public int fibonaci(int n){
        if (n == 1  ){
           // System.out.println(" " + n );
            return 0;
            
        }
        if(n == 2){
        return 1;
        }else{
            
            int a = fibonaci(n-1) + fibonaci(n-2);
            
            //System.out.print(" " + a);
            return a;
        }
    }
     public static void main(String[] args) {
        Serie s = new Serie();
         System.out.println(s.fibonaci(7));
        
        
       
         
    }
    
}
