package misc.misc.pointers;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        int num1 = 11;
//        int num2 = num1;
//
//        num1 = 22;
//    // ^^   examples of not working with a pointer!    ^^
//        System.out.println("num1: " + num1);
//        System.out.println("num2: " + num2);

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value",  11);
        map2 = map1;

        map1.put("value", 22);
//        map1 and map2 are both pointing to value 22.
//        if we had another map called map3 with map2 equalling map3, and you put map1 = map2,
//        now all three point to value of map3 and the value of map1 gets disposed of in garbage collection.

        System.out.println(map1);
        System.out.println(map2);
    }

}
