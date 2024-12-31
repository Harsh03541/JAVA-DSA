public class index {

    public void pattern() {
        char ch = '*';
        int arr[] = {3,5,6,4,8};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void substring() {
        StringBuffer str = new StringBuffer("abcd");
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j < str.length() + 1; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }

    public static void  pro() {
        int[] myNum = {10, 20, 30, 40, 50};
        int i = 0;
        // int j = j + 1;
        while (i < myNum.length) {
            
        }
    }

    public static void main(String[] args) {
        index i = new index();
        i.pattern();
        System.out.println();
        i.substring();
    }
}
