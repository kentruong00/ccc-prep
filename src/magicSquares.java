import java.util.Scanner;
public class magicSquares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        int count = 0;
        boolean start = true;
        boolean flag = true;
        int[][] magic = new int[height][width];
        for(int i = 0; i<width;i++){
            for (int j = 0;j<height;j++){
                magic[i][j] = sc.nextInt();
            }
        }
        for(int[] arr : magic){
            int counter = 0;
            for (int i:arr) {
                counter += i;
            }
            System.out.println(counter);
            if(start){
                    count = counter;
                    start = false;
            }else{
                if (count != counter){
                        flag = false;
                        System.out.println(counter);
                        break;
                    }
            }
        }
        if(flag){
            for(int i = 0;i<width;i++) {
                int counter = 0;
                for (int j = 0; j < height; j++) {
                    counter += magic[j][i];
                }
                System.out.println(counter);
                if(counter != count){
                    flag = false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
