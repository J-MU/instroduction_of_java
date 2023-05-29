package designPattern.ISP;

public class ManTestDriver {
    public static void main(String[] args) {
        Army army = new Man();
        army.shoot();
        army.running();

        BoyFriend boyFriend = new Man();
        boyFriend.kiss();
        boyFriend.celebrateAnniversary();

        Employee employee = new Man();
        employee.goToWork();
        employee.work();

        Son son=new Man();
        son.filialPiety();
        son.massage();

//        boyFriend.shoot();
//        boyFriend.running();
    }
}
