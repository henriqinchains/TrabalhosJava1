/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex11;

/*11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex11 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double d, a;
        
        System.out.print("Digite o diâmetro do círculo: ");
        d = scanner.nextDouble();

        a = Math.pow((d/2), 2) * Math.PI;
        
        System.out.print("A área do círculo é: " + a);

    }
    
}