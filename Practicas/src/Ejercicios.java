import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num;
        int num1 = 0;
        int num2 = 0;
        int select = a.nextInt();
        int count = 0;

        switch (select){
            case 1:
                count = 0;
                do {
                    System.out.print((count + 1) + "-. " + num2 + " + ");
                    num1 = a.nextInt();
                    num2 = num2 + num1;
                    count++;

                    if (num2 >= 1000) {
                        break;
                    }
                } while (num2 <= 1000);
                System.out.println("Total: " + num2 + "\nNúmeros introducidos: " + count + "\nMedia: " + (num2 / count));
                break;

            case 2:
                count = 0;
                num1 = (int) (Math.random() * 100);

                for (int i = 0; i < 10; i++) {
                    System.out.print("Intento " + (i + 1) + ": ");
                    num2 = a.nextInt();

                    if (num2 < num1) {
                        System.out.println("El número es mayor.");
                        count++;
                    }
                    if (num2 > num1) {
                        System.out.println("El número es menor.");
                        count++;
                    }
                    if (num2 == num1) {
                        System.out.println("¡Correcto!");
                        break;
                    }
                }
                if (count == 10) {
                    System.out.println("No has sido capaz de adivinarlo. El número correcto era " + num1);
                }
                break;

            case 3:
                num = a.nextInt();
                ArrayList<Integer> primos = new ArrayList<>();

                for(int i = 0;i<num;i++){
                    count = 0;
                    if(num % (i+1) == 0) {
                        for(int j=0;j<(i+1);j++){
                            if((i+1) % (j+1) == 0){
                                count++;
                            }
                        }
                        if(count == 2){
                            primos.add((i+1));
                        }
                    }
                }
                System.out.println(primos);
            case 4:

        }
    }
}
