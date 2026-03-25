/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex14;

/*14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex14 {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r, a, vl, vc, ve;

        
        System.out.print("Digite o raio da esfera: ");
        r = scanner.nextDouble();

        System.out.print("Digite a aresta: ");
        a = scanner.nextDouble();

        vc = Math.pow(a, 3);
        
        ve = ((4*3.14)*Math.pow(r, 3) / 3);

        vl = vc - ve;

        System.out.println("O volume livre é: " + vl);

    }
    
}