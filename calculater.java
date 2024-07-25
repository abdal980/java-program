import java.util.Scanner;

public class calculater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.println("enter number");
        int button = sc.nextInt();
        //input two variable
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter secend number");
        int b = sc.nextInt();
         int result=0;
        switch (button) {
            case 1: result = a+b;
            System.out.println(a+" + "+b+" = "+result);
                
                break;
            case 2:result = a-b;
                System.out.println(a+" - "+b+" = "+result);
                break;
            case 3: result = a*b;
            System.out.println(a+" * "+b+" = "+result);
                break;
            case 4: result=a/b;
            System.out.println(a+" / "+b+" = "+result);
            break;
            default:
            System.out.println("enter valied number");
                break;
        }
    }
}