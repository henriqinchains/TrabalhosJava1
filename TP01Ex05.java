/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex05;

/*5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex05 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double diametro, volume, raio;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o diametro da esfera: ");
        diametro = ler.nextDouble();
        
        raio = diametro/2;
        volume = ((4*Math.PI) * Math.pow(raio, 3))/3;
        System.out.println("O volume da esfera é: " + volume);        
    }
    
}