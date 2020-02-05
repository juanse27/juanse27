/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.suma.impares;

/**
 *
 * @author juan sebastian colmenares
 */
public class AlgoritmoSumaImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa te permite saber el resultado de la suma de todos los numeros impares entre 1 y 100.000.000");
        long r = 0;
        for(int i=0; i<100000000 ; i++)
        {
            if(i%2 == 1)
            {
                r=r+i;
            }
        };
        System.out.println("La suma de los numeros impares da como resultado "+r);
    }
    
}
