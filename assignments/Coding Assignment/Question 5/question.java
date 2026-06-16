import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        if(color.equals("Red")){
            System.out.println("Stop");
        }else if(color.equals("Yellow")){
            System.out.println("Wait");
        }else{
            System.out.println("Go");
        }
        
    }
}