import java.util.ArrayList;
import java.util.Scanner;

public class Desafio2ArrayList {

    public static void main(String[] args){
        boolean sair = false;
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        while(!sair){
            System.out.println("Adicione um nome a lista: ");
            String nome = input.nextLine();
            if(nome.equalsIgnoreCase("sair")){
                break;
            }
            nomes.add(nome);
        }
        for(String nome: nomes){
            System.out.println(nome);
        }


    }

}
