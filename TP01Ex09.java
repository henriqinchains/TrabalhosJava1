/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex09;

/*9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex09 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double resistencia;
        double corrente;
        double tensao;

        // Entrada de dados
        System.out.print("Digite o valor da resistência (em ohms): ");
        resistencia = scanner.nextDouble();

        System.out.print("Digite o valor da corrente (em amperes): ");
        corrente = scanner.nextDouble();

        // Cálculo usando a Lei de Ohm
        tensao = resistencia * corrente;

        // Saída de dados
        System.out.println("A tensão do circuito é: " + tensao + " volts");

        scanner.close();     
    }
    
}