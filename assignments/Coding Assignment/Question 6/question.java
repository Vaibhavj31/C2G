import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentData = sc.nextInt();
        int newPackData = sc.nextInt();
        int carry;
        if(currentData<=2){
            carry=currentData;
        }else{
            carry=2;
        }
        int FinalData = carry + newPackData;
        System.out.println(FinalData);
        
    }
}