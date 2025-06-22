public class UserActionSimulator {
    private String username;
    public UserActionSimulator(String username) {
        this.username = username;
    }
    public void performActions() {
        Logger logger = Logger.getInstance();
        logger.log(username + " logged in.");
        logger.log(username + " uploaded a file.");
        logger.log(username + " logged out.");
    }
}
