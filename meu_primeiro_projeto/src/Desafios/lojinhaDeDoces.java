package Desafios;
import java.util.Scanner;
public class lojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        int numDoces = doce*2;
        System.out.println("O cliente obteve " + numDoces + " doces");
    }
}
