import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double r = entrada.nextDouble();
        double p = 3.14159;
        double a = p *(r*r);

        System.out.println("A="+a);
    }
}
