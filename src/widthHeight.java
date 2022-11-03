import java.util.Scanner;
public class widthHeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int[][] arr = new int[height][width];
        for (int i = 0; i<height; i++){
            for (int j = 0; j < width; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] ints : arr) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
