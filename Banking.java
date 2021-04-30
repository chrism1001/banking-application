import java.util.*;

public class Banking {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome.\nEnter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter banking id: ");
        int id = scan.nextInt();
        scan.nextLine();

        BankingApplication account = new BankingApplication(id, name);
        account.showMenu();
    }
}
