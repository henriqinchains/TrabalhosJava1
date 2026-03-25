/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex12;

/*12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex12 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double volume, h, r;
        
        System.out.print("Digite a altura do cone: ");
        h = scanner.nextDouble();
        
        System.out.print("Digite o raio do cone: ");
        r = scanner.nextDouble();

        volume = (Math.PI * (Math.pow(r, 2)) * h) / 3;
        
        System.out.print("O volume do cone é: " + volume);

    }
    
}