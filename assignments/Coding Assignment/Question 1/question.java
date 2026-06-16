import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int battery = sc.nextInt();
        if(battery<20){
            System.out.println("Charge Soon");
        }else{
            System.out.println("Battery OK");
        }
        
    }
}