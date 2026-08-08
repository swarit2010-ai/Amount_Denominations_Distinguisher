package Run_The_Code.app;
import java.util.*;
public class Code {
    static Scanner sc = new Scanner(System.in);
    public static int input(){
        return sc.nextInt();
    }
    static void denominations(){
        int[] denom = {500,200,100,50,20,10,5,2,1};
        System.out.println("Enter the amount :");
        int amt = input();
        for(int i = 0;i < denom.length;i++){
            System.out.println("The number of " + denom[i] + " notes are " + amt/denom[i]);
            amt%=denom[i];
        }
    }
    public static void main(String[] args) {
        denominations();
        System.out.println("\nPress Enter to exit...");
        sc.nextLine();
        sc.nextLine();
        sc.close();
    }
}