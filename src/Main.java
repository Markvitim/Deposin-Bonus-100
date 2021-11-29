import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        float currentAccount = 100F;
        float addAmount = 1150F;
        float totalAccount;
        if (addAmount > 1000) {
            totalAccount = currentAccount + (int) ( addAmount / 100) + addAmount;
        } else {
            totalAccount = currentAccount + addAmount;
        }
        System.out.println(totalAccount);
    }
}
