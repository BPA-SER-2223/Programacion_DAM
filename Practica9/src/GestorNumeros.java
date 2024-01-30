import java.util.ArrayList;
import java.util.Scanner;

public class GestorNumeros {
    private ArrayList<Integer> list_num;

    public GestorNumeros(ArrayList<Integer> list_num){
        this.list_num = list_num;
    }

    public ArrayList<Integer> get_list_num(){return this.list_num;}

    public void set_list_num(ArrayList<Integer> list_num){this.list_num = list_num;}

    public void add_num(){
        Scanner a = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = a.nextInt();

        this.list_num.add(num);

    }
    public Integer sumar_nums(){
        int addition = 0;

        for(int i=0;i<this.list_num.size();i++){
            addition = addition + this.list_num.get(i);
        }
        return addition;
    }
}
