import java.util.Scanner;
public class distance2dArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 0;
        for(int i = 1; i<5;i++){
            arr[i] = sc.nextInt();
        }
        for (int i : arr){
            System.out.println(i);
        }

        int[][] output = new int[5][5];
        for(int i = 0; i<5;i++){
            System.out.println(i);
            for(int j = 0;j<5;j++){
                int distance = 0;
                if (i == j){
                    output[i][j] = distance;
                } else if (i>j) {
                    for (int f = i; f>j;f--){
                        distance += arr[f];
                    }
                    output[i][j] = distance;
                } else {
                    for (int f = i+1; f<=j;f++){
                        distance += arr[f];
                    }
                    output[i][j] = distance;
                }
            }
        }
        for (int[] ints : output) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
