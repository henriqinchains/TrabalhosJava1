/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex15;

/*15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex15 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cd, d, r;

        
        System.out.print("Digite a cotação atual do dólar: ");
        cd = scanner.nextDouble();

        System.out.println("Digite quantos dólares: ");
        d = scanner.nextDouble();
        
        r = d*cd;

        System.out.println("O valor em reais é: R$" + r);

    }
    
}