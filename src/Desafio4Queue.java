import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Desafio4Queue {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Queue<String> clientes = new LinkedList<>();
        while(true){
            System.out.println("Digite o nome do cliente: ");
            String nome = input.nextLine();
            if(nome.equalsIgnoreCase("fim")){
                break;
            }
            clientes.add(nome);
        }
        for (int i = clientes.size(); i > 0; i--) {
            System.out.println("Atendendo: " + clientes.poll());
        }
    }

}
