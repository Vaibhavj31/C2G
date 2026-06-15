import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean letter= false;
        boolean digit = false; 
        boolean space = false;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z' || ch>='A' && ch<='Z'){
                letter = true;
            }else if(ch>='0' && ch<= '9'){
                digit=true;
            }else if(ch==' '){
                space = true;
            }
        }
        if(s.length()>=8&&letter && digit && !space){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
        
    }
}