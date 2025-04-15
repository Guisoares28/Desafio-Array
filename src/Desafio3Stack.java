import java.util.Scanner;
import java.util.Stack;

public class Desafio3Stack {

    public static void main(String[] args){
        Stack<String> pilha = new Stack<>();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Digite seu comando: ");
            String comando = input.nextLine();
            if(comando.contains("colocar")){
                pilha.push(comando);
            }
            if(comando.contains("retirar")){
                pilha.pop();
            }
            if(comando.contains("sair")){
                break;
            }
        }
        String frase = pilha.peek();
        String[] palavras = frase.split(" ");
        String resultado = palavras[1];
        System.out.println("Topo da pilha: " + resultado);
    }

}
