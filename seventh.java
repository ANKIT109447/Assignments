import java.util.Scanner;

public class seventh {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0) System.out.print("The number is positive");
        else if(n==0) System.out.print("The number is zero");
        else System.out.print("the number is negative");
sc.close();
    }
}
