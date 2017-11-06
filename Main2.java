import java.util.Scanner;

public class Main2 {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if(year>=1000&&year<=9999){
            if((year%4==0 && year%100!=0)||year%400==0){
                System.out.println("Bissextile Year");
            }else{
                System.out.println("Common Year");
            }
        }
    }
}
