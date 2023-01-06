import java.util.Scanner;
public class sumac {
    static int counter = 2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumac(sc.nextInt(), sc.nextInt());
        System.out.println(counter);
    }
    public static void sumac ( int t1, int t2){
        if (t1-t2 > 0)
        {
            counter++;
            sumac(t2,t1-t2);
        }
        return;
    }


}
