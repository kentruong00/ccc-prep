import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int floor = 0;
        int ceil = arr.length;
        while (true){
            int index = (floor + ceil)/2;
            if (arr[index] == target) {
                System.out.println("The index of " + target + " is " + index);
                break;
            } else if (arr[index] < target ) {
                floor = index;
            } else if (arr[index] > target)  {
                ceil = index;
            }
        }

    }
}
