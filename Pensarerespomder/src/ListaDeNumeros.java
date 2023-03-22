import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números deseja armazenar na lista? ");
        int quantidade = scanner.nextInt();
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        
        System.out.println("Números armazenados na lista: " + numeros);
        
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        
        System.out.println("Soma total dos números: " + soma);
    }
}
