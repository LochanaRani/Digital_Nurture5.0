public class SingletonTest {

    public static void main(String[] args) {

        // Get Logger instance first time
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        // Get Logger instance second time
        Logger logger2 = Logger.getInstance();
        logger2.log("Application is running.");

        // Check whether both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Only one Logger instance exists.");
        } else {
            System.out.println("Multiple Logger instances exist.");
        }

        // Display hash codes
        System.out.println("Logger1 HashCode: " + logger1.hashCode());
        System.out.println("Logger2 HashCode: " + logger2.hashCode());
    }
}