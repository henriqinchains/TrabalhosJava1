/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex13;

/*13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex13 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double velocidadeInicial, aceleracao, tempo, velocidadeFinal, velocidadeFinalKm;

        
        System.out.print("Digite a velocidade inicial (m/s): ");
        velocidadeInicial = scanner.nextDouble();

        System.out.print("Digite a aceleração (m/s²): ");
        aceleracao = scanner.nextDouble();

        System.out.print("Digite o tempo de percurso (s): ");
        tempo = scanner.nextDouble();

        velocidadeFinal = velocidadeInicial + (aceleracao * tempo);

        velocidadeFinalKm = velocidadeFinal * 3.6;

        System.out.println("A velocidade final é: " + velocidadeFinalKm + " km/h");

    }
    
}