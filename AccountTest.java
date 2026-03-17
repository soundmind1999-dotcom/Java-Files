import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.assertions.assertEquals;

public class AccountTest{
    
    @Test
    public void testThatIDeposit5kIsBalance5k(){

        Account account = new Account();

        account.deposit(5000);
        double expectedBalance = account.getBalance();
        double actualBalance = 5000;






















}
