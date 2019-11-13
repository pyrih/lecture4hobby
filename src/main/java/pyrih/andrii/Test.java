package pyrih.andrii;

import org.apache.log4j.Logger;
import pyrih.andrii.entities.Gym;
import pyrih.andrii.entities.Hobby;
import pyrih.andrii.entities.Running;
import pyrih.andrii.entities.Swimming;
import pyrih.andrii.exceprions.HobbyException;

import java.util.Scanner;

public class Test {
    final static Logger logger = Logger.getLogger(Test.class);

    static void printHobby(Hobby h) {
        try {
            System.out.println(h.tellAboutHobby(h.getSpentHours()));
        } catch (HobbyException e) {
            logger.error("Spent hours = " + h.getSpentHours() + "\n"
                    + "Hobby exception: ", e);
            // e.printStackTrace();
        }
    }

    // Как пример оставил, чтобы уровни Info и ниже выводились в консоль и в файл...
    // Можно закомментировать метод и его вызов в методе main.
    public void logMethod(String param) {
        if (logger.isDebugEnabled())
            logger.debug("Debug mode: " + param);

        if (logger.isInfoEnabled())
            logger.info("Info mode: " + param);

        logger.warn("Warn mode: " + param);

        logger.error("Error mode: " + param);

        logger.fatal("Fatal mode: " + param);
    }

    public static void main(String[] args) {
        logger.info("Application have been started...");
        Test test = new Test();
        test.logMethod("params....");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String nameFromKB = scanner.nextLine();
        System.out.println("Enter time spent on your hobby: ");
        int timeFromKB = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number of sessions per week: ");
        int sessionsFromKB = Integer.parseInt(scanner.nextLine());

        Hobby firsHobby = new Running("Running", 200, "Description.", 99.7f);
        Hobby secondHobby = new Swimming("Swimming", 20, "Description..", 5.45);
        Hobby thirdHobby = new Gym(nameFromKB, timeFromKB, sessionsFromKB);

        Hobby[] hobbies = {firsHobby, secondHobby, thirdHobby};
        System.out.println("My hobbies: ");

        for (Hobby hobby : hobbies) {
            printHobby(hobby);
        }
        scanner.close();

        logger.info("Application have been done!");
    }
}
