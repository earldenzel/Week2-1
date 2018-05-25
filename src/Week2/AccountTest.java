package Week2;

public class AccountTest {
    public static void main(String[] args) {
        /*
        //read user input
        Scanner input = new Scanner(System.in);

        //create account instance
        Week2.Account account = new Week2.Account("Earl Perez");

        //Display default account info
        System.out.printf("Initial name is %s%n%n",account.getAccountName());

        //Prompt new name
        System.out.println("Please enter an account name: ");
        String accName = input.nextLine();
        account.setAccountName(accName);

        //Display info
        System.out.printf("New name is %s%n%n",account.getAccountName());
        */

        Account account1 = new Account("Earl Perez", 1000);
        Account account2 = new Account("Earl Denzel Perez", -7.50);

        System.out.printf("%s balance: $%.2f%n", account1.getAccountName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getAccountName(), account2.getBalance());

    }
}
