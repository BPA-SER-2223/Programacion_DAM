import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    private List<Integer> list;

    public Lista(List<Integer> list){
        this.list = list;
    }
    public List<Integer> getlist(){return this.list;}
    public void setlist(List<Integer> list){
        this.list = list;
    }

    public static List<Integer> generateList(){

        List<Integer> list = new ArrayList<Integer>();
        Lista ejr1list = new Lista(list);

        System.out.print("Introduce un número: ");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();

        for(int i=0;i<=100;i++){
            if(i%num == 0){
                ejr1list.getlist().add(i);
            }
        }
        return ejr1list.getlist();
    }

    @Override
    public String toString() {
        return "list=" + list;
    }
}

