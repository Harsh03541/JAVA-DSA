class armstrongNumberWithoutUsingAnyPreDefinedMethod {
    
    public static boolean isArmstrong(int num) {

        int original = num;
        int ans = 0;
        int length = len(num);
        while(num != 0) {
            int rem = num % 10;
            ans += power(rem, length);
            num/=10;
        }
        return (ans == original);
    }
    
    public  static int len(int num) {
        int length = 0;
        while(num != 0) {
            int rem = num % 10;
            if(rem > 0) {
                length++;
                num /= 10;
            }
            else {
                return length;
            }
        }
        return length;
    }
    public static int power(int base, int exp) {
        int result = 1;
        for(int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {

        int num = 153;
        System.out.println("Result : " +  isArmstrong(num));

    }
}