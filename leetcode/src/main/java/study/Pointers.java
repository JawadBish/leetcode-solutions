package study;

import java.util.HashMap;

public class Pointers {

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("value", 11);
        map2 = map1;
        map1.put("value", 12);
        System.out.println(map2);
        System.out.println(map1);
        /* both objects pointing at same place */


        int a = 11;
        int b = a;
        a = 12;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        /* no pointers in primitive */
    }


}
