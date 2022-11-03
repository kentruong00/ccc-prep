import java.util.Scanner;
public class array2d {
    public static void main(String[] args){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int i = 0; i < arr.length; i++){
            for (int x = 0; x < arr[i].length; x++){
                System.out.print(arr[i][x] + " ");
            }
            System.out.println();
        }
    }
}
