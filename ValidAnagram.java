import java.util.HashMap;
class  ValidAnagram {
    public static HashMap<Character, Integer> makeFreqMap (String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {

            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)) {
                mp.put(ch, 1);
            }
            else {
                mp.put(ch, mp.get(ch) + 1);
            }
        }
        return mp;
    }
        public static  boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) {
                return false;
            }
            HashMap<Character, Integer> mp1 = makeFreqMap(s);
            HashMap<Character, Integer> mp2 = makeFreqMap(t);

            return mp1.equals(mp2);
        }
        public static void main(String[]args) {
            String s = "anagram";
            String t = "nagaram";

            boolean  res = isAnagram(s, t);
            System.err.println("res : "  + res);
            
        }
}






// import java.util.HashMap;

// class ValidAnagram {
//     public static HashMap<Character, Integer> makeFreqMap(String str) {
//         HashMap<Character, Integer> mp = new HashMap<>();
//         for (int i = 0; i < str.length(); i++) {
//             Character ch = str.charAt(i);
//             mp.put(ch, mp.getOrDefault(ch, 0) + 1);
//         }
//         return mp;
//     }

//     public static boolean isAnagram(String s, String t) { // Made static
//         if (s.length() != t.length()) { // Fixed condition
//             return false;
//         }
//         HashMap<Character, Integer> mp1 = makeFreqMap(s);
//         HashMap<Character, Integer> mp2 = makeFreqMap(t);

//         return mp1.equals(mp2);
//     }

//     public static void main(String[] args) {
//         String s = "anagram";
//         String t = "nagaram";

//         boolean res = isAnagram(s, t);
//         System.err.println("res : " + res);
//     }
// }
