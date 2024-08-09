import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add
        list.add(10);
        list.add(1);
        list.add(2);
        System.out.println(list);
        //get
        System.out.println(list.get(0));
        //add ele in b/w
        list.add(1,9);
        System.out.println(list);
        //set
        list.set(0,8);
        System.out.println(list);
        //delete or remove
        list.remove(1);
        System.out.println(list);
        //size
        int len = list.size();
        System.out.println(len);
        //loops
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
