import java.util.Scanner;

public class ninth {
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.contains(b)) System.out.print("Match found");
        else System.out.print("Not found");
        sc.close();
}


}
