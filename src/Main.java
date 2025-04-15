import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Adicione um número a lista: ");
            int numeroDigitado = input.nextInt();
            numeros[i] = numeroDigitado;
        }
        for (int numero : numeros) {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        }

    }
}