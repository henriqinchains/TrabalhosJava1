package tp01ex16;

/*16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções trigonométricas: seno, cosseno, 
tangente e secante deste ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.
integrantes: Emerson Oliveira(cb303853x), Henrique Meira(cb3038939)
*/
import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) 
    {
        double anguloGraus, anguloRad;
        double seno, cosseno, tangente, secante;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do ângulo em graus: ");
        anguloGraus = scanner.nextDouble();
        
        
        anguloRad = Math.toRadians(anguloGraus);
        
        
        seno = Math.sin(anguloRad);
        cosseno = Math.cos(anguloRad);
        tangente = Math.tan(anguloRad);
        
        
        secante = 1 / cosseno;
        
        
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante); 
    }
}