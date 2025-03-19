

public class KonstruktoryUserTest {

    public static void main(String[] args) {
        
        // KonstruktoryUser user = new KonstruktoryUser();
        KonstruktoryUser user = new KonstruktoryUser("Kazek", "hello");
        
        // user.username = "Michael";
        // user.password = "QWERTY";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }

}
