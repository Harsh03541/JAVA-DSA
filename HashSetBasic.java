import java.util.*;
class HashSetBasic {
    
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Harsh");
        st.add("Kanu");
        System.err.println(st);                         // [Harsh, Kanu]
        System.err.println(st.contains("Harsh"));       // true
        System.err.println(st.size());                  // 2
        System.err.println(st.remove("Harsh"));         // true
        System.err.println(st);                         // [Kanu]
        System.err.println(st.contains("Harsh"));       // false
        System.err.println(st.size());                  // 1
        
    }
}