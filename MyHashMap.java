import java.util.*;
public class MyHashMap {
    
    public static void HashMapMethod() {

        // syntax
        HashMap<String, Integer> mp = new HashMap<>();

        // adding elements
        mp.put("Yash", 25);
        mp.put("Akash", 31);
        mp.put("Harsh", 22);
        mp.put("Aman", 21);
        mp.put("Keshav", 24);
        mp.put("Naman", 11);
        System.out.println(mp);

        // getting value of a key from the HashMap
        System.out.println(mp.get("Yash"));     // 25
        System.out.println(mp.get("Harsh"));    // 22
        System.out.println(mp.get("Rahul"));    /// null (because "Rahul doesn't exist")

        // update value of the key in the hashMap
        mp.put("Yash", 55);
        System.out.println(mp.get("Yash"));     // 55

        // remove a pari from the hashMap
        mp.remove("Naman");     // remove the key0-value pair in the hashMap
        System.out.println(mp.remove("Raman"));     // null (because key doesn't exist)
        System.out.println(mp);     // {Yash=55, Keshav=24, Aman=21, Akash=31, Harsh=22}
        
        // checking if a key in the hashMap
        System.out.println(mp.containsKey("Naman"));    // false
        System.out.println(mp.containsKey("Keshav"));   // true

        // adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 30);  // agr ye key present(exist) nhi h to add kr dega otherwise will not add.
        mp.putIfAbsent("Yash", 30);     // ye key present(exist) h to is pair ko add nhi kregaa
        
        System.out.println(mp);        

        // Get all keys in the HashMap 
        System.out.println("All keys : " + mp.keySet());    // All keys : [Yash, Keshav, Yashika, Aman, Akash, Harsh]

        // Get all values in the HashMap 
        System.out.println("All values : " + mp.values()); // All values : [55, 24, 30, 21, 31, 22]

        // Get all entries in the HashMap 
        System.out.println("All entries : " + mp.entrySet()); // All entries : [Yash=55, Keshav=24, Yashika=30, Aman=21, Akash=31, Harsh=22]
        System.out.println();

        // Traversing all the entries of HashMap - multiple methods : 
        // method -     1
        for(var key : mp.keySet()) {
            System.out.println("Age of "+key+" is "+mp.get(key));
        }
        System.out.println();

        // method - 2
        for(Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.println("Age of "+e.getKey()+" is "+e.getValue());
        }
        System.out.println();

        // method - 3
        for(var e : mp.entrySet()) {
            System.out.println("Age of "+e.getKey()+" is "+e.getValue());
        }

         


    }
    public static void main(String[] args) {
        HashMapMethod();
    }
}
