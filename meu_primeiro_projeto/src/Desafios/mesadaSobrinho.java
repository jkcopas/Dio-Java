package Desafios;
import java.util.Scanner; 
public class mesadaSobrinho {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Numero de meses: ");
        int entrada = leitor.nextInt();
        int mesada = 50;
        
        int rendimento = entrada * mesada;

        System.out.println("Voce tera " + rendimento + " reais");


    }
}

