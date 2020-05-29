
package javaapplication25;

import java.util.Scanner;


public class numerosPrimos {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long primos [] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        boolean primo = false;
        
        long teste = sc.nextLong();
        int contador = 0;
        int contador2 = 0;
        
        for(int i = 0; i<primos.length; i++){
            if(teste>primos[i]){
                contador++;
            }
        }
        
        for(int i = 0; i<contador; i++){
            if(teste%primos[i]==0){
                contador2++;
            }
        }

        if(contador2==0){
            System.out.println(teste + " é primo");
        }else{
            System.out.println(teste + " não é primo");
        }
        
    }
    
}
