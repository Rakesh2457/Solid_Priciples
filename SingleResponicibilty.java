/**
 *SOLID Principles -
 * SOLID is an acronym for the five object-oriented design
 *
 * S - Single Responsibilty Priciple - A class should have one and only reason to change
 * O - Open Closed Principle         - Objects or Entities open for extension and closed for modification
 * L -
 * I -
 * D -
 */


/**
class AccountService {
    public void openAccount(){
        //1
        System.out.println("Fill Account Details ");
        //2
        System.out.println("Storing account object in database ");
        //3
        System.out.println("send an welcome message");
    }
}
 */

class AccountService {
    AccountRepository repository = new AccountRepository();
    NotificationService notificationService = new NotificationService();
    public void openAccount(){
        //1
        System.out.println("Fill Account Details ");

        repository.create();

        notificationService.sendNotification();
    }
}

class AccountRepository {
    public void create(){
        //2
        System.out.println("Storing account object in database ");
    }
}

class NotificationService{
    public void sendNotification(){
        //3
        System.out.println("send an welcome message");
    }
}

class SingleResponicibilty {
    public static void main(String args[]){

        AccountService service = new AccountService();
        service.openAccount();
    }
}
