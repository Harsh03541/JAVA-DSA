class uniquePattern {
    public static int power(int base, int exp) {
        int result = 1;
        for(int i=0; i<exp; i++) {
            result *= base;
        }
        return result;
    }
    public  static void pattern(int n) {
        for(int i=1; i <=n; i++) {
            for(int j=1; j <= power(2, i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int n = 4;
        pattern(n);
    }
}