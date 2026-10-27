import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int account = 12000;
        System.out.println("your account has" + " "+ account);

        System.out.println("to add money +\nto remove money -\nto see balence %");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                
                System.out.println("enter your ammount to add");
                int add = sc.nextInt();
                account = account + add;
                System.out.println("your account balence has"+" "+account);
                break;
            case '-':
                System.out.println("enter how many money you want");
                int sub = sc.nextInt();
                    if(sub > account){
                    System.out.println("you do not have that much account");
                    }else{
                    account = account - sub;
                    System.out.println("your account balence has"+" "+account);
                    }
                break;
            case '%':
                System.out.println("you have balence of"+" " + account);
        }
    }
}