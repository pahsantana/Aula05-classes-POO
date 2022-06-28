public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("1234-9");
        Account a2 = new Account("5678-x");
        Account a3 = new Account("3-0");
        Account a4 = new Account();
        //System.out.println(src.Account.bank);

        // override
        System.out.println(a1);
        System.out.println(a2);
        //Account.bank = "abc";
        System.out.println(a3);
        System.out.println(a4);
    }
}
