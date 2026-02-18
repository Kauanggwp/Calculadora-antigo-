import java.sql.SQLOutput;
import java.util.*;

public class Calculate {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque a operaçao matematica:");
        String calc = scanner.nextLine();

        double res = 0;

        if (calc.equals("divide")){
            System.out.println("Primeiro numero:");
            double a = scanner.nextDouble();
            System.out.println("Segundo numero:");
            double b = scanner.nextDouble();

            res = a / b;

            System.out.println("O resultado é: " + res);
        }else{

            System.out.println("Primeiro numero:");
            int a = scanner.nextInt();
            System.out.println("Segundo numero:");
            int b = scanner.nextInt();


            if (calc.equals("soma")) {
                res = a + b;
            } else if (calc.equals("subtrai")) {
                res = a - b;
            } else if (calc.equals("multiplica")) {
                res = a * b;
            } else {
                System.out.println("Voce nao colocou nada");
            }

            System.out.println("O resultado é: " + res);

            if (res % 2 == 0){
                System.out.println("o numero é par");
            } else {
                System.out.println("o numero é impar");
            }

            if (res > 0){
                System.out.println("O numero é positivo");
            } else if (res < 0){
                System.out.println("O numero é negativo");
            } else {
                System.out.println("O numero é o mesmo que 0");
            }
        }



        scanner.close();
    }

}