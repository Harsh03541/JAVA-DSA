import java.util.*;

class SpiralTraversal {

    public static void spiral(int arr[][], int row, int col) {
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0, right = col - 1;
        int top = 0, botton = row - 1;

        while(left <= right && top <= botton) {
            for(int i = left; i <= right; i++) {
                ans.add(arr[top][i]);
            }
            top++;
            for(int i = top; i <= botton; i++) {
                ans.add(arr[i][right]);
            }
            right--;
            if(top <= botton) {
                for(int i = right; i >= left; i--) {
                    ans.add(arr[botton][i]);
                }
                botton--;
            }
            if(left <= right) {
                for(int i = botton; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        printANS(ans);
    }
    
    public static void printANS(ArrayList<Integer> ans) {
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void print(int arr[][]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();   
            }
        }
         sc.close();            // Close the scanner to prevent resource leaks
        print(mat);
        System.out.println("Spiral traversal: ");
        spiral(mat, row, col);
    }
}