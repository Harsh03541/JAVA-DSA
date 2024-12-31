import java.util.HashMap;

public class MaxFreqHashMap {
    
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,2,3,3,4,4,5,5,5,5,5,5,5,5,6,6,7,8};
        HashMap<Integer, Integer> freq = new HashMap<>(); 

        for(int el : arr) {
            if(!freq.containsKey(el)) {
                freq.put(el, 1);
            }
            else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());

        // Find max frequency : 
        // 1st mthd - 
        
        int maxFreq = 0, ansKey = -1;
        // for(var e : freq.entrySet()) {
        //     if(e.getValue() > maxFreq) {
        //         maxFreq = e.getValue();
        //         ansKey = e.getKey();
        //     }
        // }

        // 2nd mthd - 
        for(var key : freq.keySet()) {
            if(freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.println(ansKey + " has max frequency and it occurs " + maxFreq + " times");
    }
}
