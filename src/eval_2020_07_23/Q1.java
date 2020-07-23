
package eval_2020_07_23;

import java.util.Scanner;

/**
 *
 * @author LR
 */
public class Q1 {

  
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        final int n=5;
        int[] tab;
        int i;
        tab = new int [n];
        
        for(i=0; i<n; i++){
            System.out.print("Saisissez un nombre: ");
            tab[i]=reader.nextInt();   
        }
        
        for(i=0; i<n/2; i++){
            int newtab = tab[i];
            tab[i] = tab[n-i-1];
            tab[n-i-1] = newtab;
        }
        
        for(i=0; i<n; i++){
            System.out.print(tab[i] + "\t");
        }
        
    }
    
}
