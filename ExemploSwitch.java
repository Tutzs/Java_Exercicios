import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String [] args){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 3");
        num = entrada.nextInt();
        switch (num){
            case 1:
                System.out.println("Voce digitou 1");
                break;
            case 2:
                System.out.println("Voce digitou 2");
                break;
            case 3:
                System.out.println("Voce digitou 3");
                break;
            default:
                System.out.println("Voce nao digitou 1, 2 ou 3");
                break;
        }
    }
}
