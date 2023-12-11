import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int account_number;
        int beginning_balance;
        int total_of_all_items_charged_this_month;
        int total_of_credits_applied_to_the_acc_this_month;
        int allowed_credit_limit;

        System.out.print("Enter account number: ");
        account_number = input.nextInt();

        System.out.print("Enter balance at beginning of the month: ");
        beginning_balance = input.nextInt();

        System.out.print("Enter total items charged by customer this month: ");
        total_of_all_items_charged_this_month = input.nextInt();

        System.out.print("Enter total of all credits applied to the customer account this month: ");
        total_of_credits_applied_to_the_acc_this_month = input.nextInt();

        System.out.print("Enter allowed credit limit: ");
        allowed_credit_limit = input.nextInt();

        float new_balance = beginning_balance + total_of_all_items_charged_this_month - total_of_credits_applied_to_the_acc_this_month;

        if (new_balance > allowed_credit_limit){
            System.out.println("Credit limit exceeded");
        }
        System.out.printf("new balance is: %.2g%n", new_balance);
    }
}
