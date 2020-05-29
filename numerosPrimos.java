import java.util.Scanner;
public class numerosPrimos {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long primos [] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
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
