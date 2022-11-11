import java.time.LocalDateTime;

public class Account {

    private int	_nbDeposits;
    private int _nbWithdrawals;
    private static int _accountIndex = 0;
    private int _amount;
    private static int _nbAccount = 0;
    private static int _totalAmount = 0;
    private static int totalNbDeposits = 0;
    private static int _totalNbWithdraws = 0;
    void setIndexToZero(){
        if (_accountIndex == 8)
            _accountIndex = 0;
    }
    public Account(int initialDeposit) {
        _totalNbWithdraws = 0;
        this._amount = initialDeposit;
        _totalAmount += _amount;
        _nbAccount++;

        _displayTimestamp();
        System.out.println("index:" + _accountIndex + ";amount:" + this._amount + ";created");
        _accountIndex++;
    }

    void manualDestructor()
    {
        _displayTimestamp();
        setIndexToZero();
        System.out.println("index:" + _accountIndex + ";amount:" + this._amount + ";closed");
        _accountIndex++;
    }

    void displayAccountsInfos(){
        _displayTimestamp();
        System.out.println("accounts:" + _nbAccount + ";total:" + _totalAmount + ";deposit:" + totalNbDeposits + ";withdraws:" + _totalNbWithdraws);
    }

    void makeDeposit( int deposit ){
        int p_amount = _amount;
        _amount += deposit;
        _totalAmount += deposit;
        _nbDeposits = 1;
        totalNbDeposits += _nbDeposits;
        _displayTimestamp();
        setIndexToZero();
        System.out.println("index:" + _accountIndex + ";p_mount:" + p_amount + ";deposit:" + deposit + ";amount:" + _amount + ";nb_deposits:" + _nbDeposits);
        _accountIndex++;
    }

    void makeWithdrawal(int withdraw){
        if (_amount < withdraw)
        {
            setIndexToZero();
            _displayTimestamp();
            System.out.println("index:" + _accountIndex + ";p_mount:" + _amount + ";withdrawal:refused");
        }
        else
        {
            int p_amount = _amount;
            _amount -= withdraw;
            _totalAmount -= withdraw;
            _nbWithdrawals = 1;
            _totalNbWithdraws += _nbWithdrawals;
            _displayTimestamp();
            setIndexToZero();
            System.out.println("index:" + _accountIndex + ";p_mount:" + p_amount + ";withdrawal:" + withdraw + ";amount:" + _amount + ";nb_withdrawals:" + _nbWithdrawals);
        }
        _accountIndex++;
    }

    public void displayStatus()
    {
        _displayTimestamp();
        setIndexToZero();
        System.out.println("index:" + _accountIndex + ";amount:" + this._amount + ";deposit:" + this._nbDeposits + ";withdraw:" + _nbWithdrawals);
        _accountIndex++;
    }
    private void _displayTimestamp() {
        LocalDateTime lDT = LocalDateTime.now();
        System.out.print("[" +
                lDT.getYear() +
                lDT.getMonthValue() +
                lDT.getDayOfMonth() +
                "_" +
                lDT.getHour() +
                lDT.getMinute() +
                lDT.getSecond() +  "] ");
    }
}
