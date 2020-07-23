
package eval_2020_07_23;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
               
        int nb, nl=5, nc=2, i, j, ppn, pgn, amp;
        int[][] tab;
        
        tab = new int [nl][nc];
        
        
        for(i=0; i<nl; i++){
            for(j=0; j<nc; j++){
                System.out.print("Saisissez un nombre: ");
                tab[i][j]=reader.nextInt();
            }
        }
        
        pgn=tab[0][0];
        ppn=tab[0][0];
        for(i=0; i<nl; i++){
            for(j=0; j<nc; j++){
                if(tab[i][j]<ppn){
                    ppn=tab[i][j];
                }
                else if(pgn<tab[i][j]){
                    pgn=tab[i][j];
                }
            }
        }
          
        amp=pgn-ppn;
      
        System.out.println( amp + " est la plus petite valeur ");
        
    }
    
}
