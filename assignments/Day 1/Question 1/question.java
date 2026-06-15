import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalClasses = sc.nextInt();
        int attendedClasses = sc.nextInt();
        if(attendedClasses*100>=totalClasses*75){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }        
    }
}