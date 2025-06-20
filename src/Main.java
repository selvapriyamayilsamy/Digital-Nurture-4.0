public class Main {
    public static void main(String[] args) {
        UserActionSimulator user1 = new UserActionSimulator("Manager");
        UserActionSimulator user2 = new UserActionSimulator("HR");
        UserActionSimulator user3 = new UserActionSimulator("Team leader");
        UserActionSimulator user4 = new UserActionSimulator("employee");
        user1.performActions();
        user2.performActions();
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        if (logger1 == logger2)
            System.out.println("Singleton check passed: Same Logger instance used");
        else
            System.out.println("Singleton check failed: Different instances found");
    }
}
