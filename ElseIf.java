import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        if(age <26){
            System.out.println("adult 26");
        }
        if(age >18){
            System.out.println("adult");
        }
        if(age >18){
            System.out.println("elseif 18");
        }
        if(age > 24){
            System.out.println("elseif 24");
        }
        else{
            System.out.println("else");
        }


    }
}
