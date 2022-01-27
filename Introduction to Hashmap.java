import java.util.*;

public class Main {

  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();

    // put function use to embed elements into hashmap

    hm.put("India", 140);
    hm.put("China", 160);
    hm.put("Pakistan", 30);
    hm.put("USA", 37);
    hm.put("Bangaladesh",7);


    System.out.println(hm);

    // update hashmap using put function
    hm.put("India", 145);
    System.out.println(hm);


    // get function provides a particular element in hashmap
    Integer ipop = hm.get("India");// we have used Integer instead of int because it will provide null if you have nothing in Hashmap but if you will use int then you will get Null Point exception error.

    System.out.println(ipop);

    // containsKey function will give true if element present in hasmap and it will give false if it doesn't have element
    System.out.println(hm.containsKey("Bandgladesh"));
    System.out.println(hm.containsKey("Nepal"));


    // Set function

    Set<String> Keys = hm.keySet();
    System.out.println(Keys);

    for(String Key : hm.keySet())
    {
      Integer val = hm.get(Key);
      System.out.println(Key + " " + val);
    }

  }
}
