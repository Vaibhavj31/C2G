import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int orderAmount = sc.nextInt();
        if(orderAmount>=199){
            System.out.println("Free Delivery");
        }else{
            System.out.println("Delivery Charges Applied");
        }
        
    }
}