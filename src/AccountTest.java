import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //read user input
        Scanner input = new Scanner(System.in);

        //create account instance
        Account account = new Account();

        //Display default account info
        System.out.printf("Initial name is %s%n%n",account.getAccountName());

        //Prompt new name
        System.out.println("Please enter an account name: ");
        String accName = input.nextLine();
        account.setAccountName(accName);

        //Display info
        System.out.printf("New name is %s%n%n",account.getAccountName());

    }
}
