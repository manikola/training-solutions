package algorithmscount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankaccounts, int threshold) {
        int count = 0;
        for (BankAccount item : bankaccounts) {
            if (item.getBalance() > threshold) {
                count++;
            }
        }
        return count;


    }
}
