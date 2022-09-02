import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         byte int double float int char boolean long short -> Stack -> Primitive Data type
//         Integer Charakter Long Short Double Float Byte Boolean -> Heap -> Wrapper Class
//         Integer.ParseInt(123); -> String>>Int;
//         Long.PArseLong;
//         Byte.ParseByte;
//         Short.compare((short)1,(short)5);  1-5=(-4);

        ArrayList <Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        arrayList.add(213);
        arrayList.add(1223);
        arrayList.add(3842);
        arrayList.add(321);
        //arrayList.remove(0);
        //arrayList.clear();
        //arrayList.size();
        //arrayList.set(0,123);
          arrayList.add(2,2);
        arrayList.add(2,2);
        System.out.println(arrayList);

//        Iterator <Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (Integer i : arrayList) {
//            System.out.println(i);
//        }
    }
}