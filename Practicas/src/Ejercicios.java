import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int num = 0;
        int num1 = 0;
        int num2 = 0;
        int select = a.nextInt();
        int count = 0;
        int accumulator = 0;

        switch (select) {
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

                for (int i = 0; i < num; i++) {
                    count = 0;
                    if (num % (i + 1) == 0) {
                        for (int j = 0; j < (i + 1); j++) {
                            if ((i + 1) % (j + 1) == 0) {
                                count++;
                            }
                        }
                        if (count == 2) {
                            primos.add((i + 1));
                        }
                    }
                }
                System.out.println(primos);
                break;
            case 4:
                System.out.println("Introduce la cantidad y precio de los productos. Cuando quieras parar, introduce un 0.");
                count = 1;
                do {
                    System.out.print("\n" + count + "º producto\n------------------\nCantidad:  ");
                    num = a.nextInt();
                    System.out.print("Precio de 1 unidad: ");
                    if(num!=0){
                        num1 = a.nextInt();
                    }
                    accumulator = (num*num1) + accumulator;
                    count++;
                } while (num != 0);

                System.out.println("El precio total del pedido es de " + accumulator + "€");
                break;

            case 5:
                System.out.println("Introduce un frase.");
                Scanner b = new Scanner(System.in);
                String boo = b.nextLine();
                String[] sentence = boo.split("\\s+");

                for (int i=0;i<sentence.length;i++) {
                    System.out.print(sentence[(sentence.length-1)-i] + " ");
                }
                break;

            case 6:
                int more = 0;
                int less = 0;
                double accumulator2 = 0;
                System.out.print("Introduce el número de personas: ");
                num = a.nextInt();
                ArrayList<Double> heights = new ArrayList<>();

                for(int i=0;i<num;i++){
                    System.out.print("Altura de la " + (i+1) + " persona: ");
                    double height = a.nextDouble();
                    heights.add(height);
                    accumulator2 =  height + accumulator2;
                }

                for(int j=0;j<heights.size();j++){
                    if(heights.get(j) < (accumulator2/heights.size())){
                        less++;
                    }else{
                        more++;
                    }
                }

                System.out.println("Número de personas: " + num + "\nMedia registrada: " + (accumulator2/num) + "\nPersonas con la altura por encima del promedio: " + more + "\nPersonas con la altura por debajo del promedio: " + less);
                break;

            case 7:
                int even= 0;
                int odd = 0;

                System.out.println("Introduce un número positivo (Si es muy grande mejor).");
                num = a.nextInt();

                while(num < 0){
                    if(num< 0){
                        System.out.println("El número introducido es negativo, vuelve a intentarlo.");
                    }
                }
                String nu = String.valueOf(Integer.toString(num));

                for(int i=0;i<nu.length();i++) {

                    if(Integer.parseInt(String.valueOf(nu.charAt(i)))%2==0){
                        even++;
                    }else{
                        odd++;
                    }
                }
                System.out.println(num + " tiene " + even + " números pares y " + odd + " número impares.");

            case 8:
                
        }
    }
}
