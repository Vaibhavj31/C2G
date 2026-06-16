import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        if(speed<10){
            System.out.println("Slow");
        }else if(speed<=50){
            System.out.println("Average");
        }else{
            System.out.println("Fast");
        }
        
    }
}