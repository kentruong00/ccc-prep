public class array2d {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int[] ints : arr){
            for (int i : ints){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
