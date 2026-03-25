/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex08;

/*8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;
public class TP01Ex08 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double mm, converter, resultado;
        
        Scanner ler = new Scanner(System.in);
        
        mm = 1852;
        
        
        System.out.println("Digite quantas milhas marítimas: ");
        converter = ler.nextDouble();
        
        
        resultado = (mm*converter)/1000;
        
        System.out.println("A conversão das milhas em quilometros é de: " + resultado + "km");        
    }
    
}