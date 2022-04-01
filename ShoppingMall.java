interface BankCard{
    public void doTransaction(long amount);
}


class CreditCard implements BankCard{
    public void doTransaction(long amount){
        System.out.println("Transaction using Credit Card");
    }
}

class DebitCard implements BankCard{
    public void doTransaction(long amount){
        System.out.println("Transaction using Debit Card");
    }
}
public class ShoppingMall {
    private BankCard bankCard;
    public ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String args[]){
        BankCard bankCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}
