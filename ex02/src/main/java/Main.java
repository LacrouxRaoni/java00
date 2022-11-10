
public class Main {

    public static void main(String[] args) {
        Account[] acc = new Account[8];
        int	[]amounts = { 42, 54, 957, 432, 1234, 0, 754, 16576 };
        for (int i = 0; i < 8; i++){
            acc[i] = new Account(amounts[i]);
        }
        acc[0].displayAccountsInfos();
        for (int i = 0; i < 8; i++){
            acc[i].displayStatus();
        }
        int[] d = { 5, 765, 564, 2, 87, 23, 9, 20 };
        for (int i = 0; i < 8; i++){
            acc[i].makeDeposit(d[i]);
        }
        acc[0].displayAccountsInfos();
        for (int i = 0; i < 8; i++){
            acc[i].displayStatus();
        }

        int []w	= { 321, 34, 657, 4, 76, 275, 657, 7654 };
        for (int i = 0; i < 8; i++){
            acc[i].makeWithdrawal(w[i]);
        }
        acc[0].displayAccountsInfos();
        for (int i = 0; i < 8; i++){
            acc[i].displayStatus();
        }
        for (int i = 0; i < 8; i++){
            acc[i].manualDestructor();
        }
    }
}
