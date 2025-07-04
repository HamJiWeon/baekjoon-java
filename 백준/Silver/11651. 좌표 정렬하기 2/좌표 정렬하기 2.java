import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] arr = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[1] == b[1]) {
                    return Integer.compare(a[0], b[0]);
                }
                
                return Integer.compare(a[1], b[1]);
            }
        });
        
        for (int[] arrNum : arr) {
            System.out.println(arrNum[0] + " " + arrNum[1]);
        }
    }
}