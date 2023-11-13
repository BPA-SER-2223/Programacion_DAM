import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Elige una opción:\n1 Iniciar sesión\n2 Registrarse");//Mensaje
        Scanner eleccion = new Scanner(System.in);//Inicializamos una Scanner el cual usaremos para elegir entre dos opciones
        int num = eleccion.nextInt();//Guardamos la elección en una variable llamada "num"


        if (num < 1 || num > 2) {//Este if solo permitirá que el usuario elija la opción 1 o 2
            while (num < 1 || num > 2) {
                System.out.println("Introduce un 1 o un 2.");
                Scanner eleccion2 = new Scanner(System.in);
                num = eleccion2.nextInt();
            }
        }

        if (num == 1) {//Si se elije la opción 1, se iniciará sesión con el usuario ya creado
            Usuario user1 = new Usuario("Alejandro", "Bulnes", 41020, "sevilla este", "abp0025@gmail.com", 345);//Creación del usuario

            System.out.print("Usuario: ");//Mensaje
            Scanner usuario = new Scanner(System.in);//Se inicializa un Scanner para guardar el nombre del usuario
            String name = usuario.next();//Se guarda el contenido del Scanner anterior en una variable de tipo palabra llamada "name"
            System.out.print("Contraseña: ");//Mensaje
            Scanner password = new Scanner(System.in);//Se inicializa un Scanner para guardar la contraseña del usuario
            Integer pass = password.nextInt();//Se guarda el contenido del Scanner anterior en una variable de tipo palabra llamada "pass"

                System.out.println("----------------------------------------------------------");//Estético
                user1.check(name, pass);//método que utlizaremos para comprobar si el usuario y la contraseña introducida por el usuario coinciden con los registros
                System.out.println("----------------------------------------------------------\nINFORMACIÓN DEL USUARIO:");//Estético

                    System.out.println("Nombre: " + user1.getName());//Mensaje con el nombre del usuario
                    System.out.println("Apellido: " + user1.getSecond_name());//Mensaje con el primer apellido del usuario
                    System.out.println("Codigo postal: " + user1.getCodigo_postal());//Mensaje con el código postal del usuario
                    System.out.println("Dirección: " + user1.getAddress());//Mensaje con la dirección del usuario
                    System.out.println("Email: " + user1.getEmail());//Mensaje con el email del usuario


        }else {//Si se ha elegido la opción 2, se pedirán los datos al usuario y después se iniciará sesión

            String[] array=new String[4];//Array que guardará la información de tipo palabra
            int[] array2=new int[2];//Array que guardará la información de tipo número
            String[] info={"el nombre","el primer apellido","la dirección","el email","el código postal","la contraseña"};//Array con la información necesaria para el usuario

            for(int i=0;i< array.length;i++){//for que pedirá la infomación para el array llamado "array"
                System.out.println("Introduce "+info[i]+" del nuevo usuario.");//Mensaje
                Scanner data=new Scanner(System.in);//Scanner que almacenará lo escrito por teclado
                array[i]= data.nextLine();//Se guarda en la posición correspondiente del array el contenido del Scanner anterior
            }

            for(int j=0;j< array2.length;j++){//for que pedirá la infomación para el array llamado "array2"
                System.out.println("Introduce "+info[j+4]+" del nuevo usuario.");//Mensaje
                Scanner data=new Scanner(System.in);//Scanner que almacenará lo escrito por teclado
                array2[j]= data.nextInt();//Se guarda en la posición correspondiente del array el contenido del Scanner anterior
            }

            Usuario user2=new Usuario(""+array[0],""+array[1],array2[0],""+array[2],""+array[3],array2[1]);//Creación del segundo usuarior con sus parametros correspondientes

            System.out.print("Vamos a probar a iniciar sesión con el nuevo usuario.\nUsuario: ");//Mensaje
            Scanner usuario = new Scanner(System.in);//Se inicializa un Scanner para guardar el nombre del usuario
            String name = usuario.next();//Se guarda el contenido del Scanner anterior en una variable de tipo palabra llamada "name"
            System.out.print("Contraseña: ");//Mensaje
            Scanner password = new Scanner(System.in);//Se inicializa un Scanner para guardar la contraseña del usuario
            Integer pass = password.nextInt();//Se guarda el contenido del Scanner anterior en una variable de tipo palabra llamada "pass"

            System.out.println("----------------------------------------------------------");//Estético
            user2.check2(name, pass);//método que utlizaremos para comprobar si el usuario y la contraseña introducida por el usuario coinciden con los registros
            System.out.println("----------------------------------------------------------\nINFORMACIÓN DEL USUARIO:");//Estético
            System.out.println("Nombre: " + user2.getName());//Mensaje con el nombre del usuario
            System.out.println("Apellido: " + user2.getSecond_name());//Mensaje con el primer apellido del usuario
            System.out.println("Codigo postal: " + user2.getCodigo_postal());//Mensaje con el código postal del usuario
            System.out.println("Dirección: " + user2.getAddress());//Mensaje con la dirección del usuario
            System.out.println("Email: " + user2.getEmail());//Mensaje con el email del usuario
        }

    }
}
