public class Account {
    private String number="undefined"; // instance variable
    static final String bank = "xyz";

    /**
     * default constructor
     */
    public Account(){
//        System.out.println(String.format("Object %s was created", System.identityHashCode(this)));
        this.number = "0";
    }
    // overloaded constructor
    // Estaticas - bloqueia os objetos
    public Account(String number){
        setNumber(number);
    }
//    private class AccountNumber{
//
//    }
// private lógica interna da classe
    private void validateNumber(String number){
        final String pattern = "\\d+-(\\d|x|X)";
        if(!number.matches(pattern)){
            throw new IllegalArgumentException("Invalid account number");
        }
    }

    /**
     * Getter for account number
     * @return the account number
     */
    public String getNumber(){
        return number;
    }

    /**
     * Setter for account number
     * The account format is formed by two parts separated by hyphen:
     * the first part is composed by at least one digit and the second is composed by a single digit or x or X.
     * e.g. 12345-x 12345-8 12345-X 3-0
     * @param number number to set in the account
     */

    // variável local - parametro e dentro função
    public void setNumber(String number){
        validateNumber(number);
        this.number = number;
    }
    public String toString(){
//        return "I am an object of an incomplete class. My identity is: " +
//                System.identityHashCode(this);
        return "src.Account number: " + number + "\n" + "Bank: " + Account.bank;
    }
//    public static void main(String[] args) {
//        src.Account account = new src.Account();
//        // Hashcode - memoria heap
//        System.out.println(account);
//    }

}
