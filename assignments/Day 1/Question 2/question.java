import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int packCost = sc.nextInt();
        if(balance>=packCost){
            System.out.println("Recharge Successful");
        }else{
            System.out.println("Insufficient Balance");
        }
        
    }
}