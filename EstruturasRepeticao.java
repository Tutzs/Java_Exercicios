import java.util.Scanner;

public class EstruturasRepeticao {
    public static void main(String[] args){
        int vetIint[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i <10; i++){
            System.out.println("Digite um numero inteiro: ");
            vetIint[i] = entrada.nextInt();
        }
        entrada.close();
        for (int i = 0; i<10; i++){
            System.out.println(vetIint[i] + " ");
        }
    }
}
