package EmailApplication;

public class EmailApplication {
    public static void main(String[] args) {
        Email user1 = new Email("Demo", "User");

        System.out.println(user1.showInfo());
    }
}