package pyrih.andrii;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Hobby firsHobby = new Running("Running", 200, "Description.", 113.7f);
        Hobby secondHobby = new Swimming("Swimming", 20, "Description..", 5.45);

        //3 Как вариант можно реализовать через цикл используя метод hasNextLine() класса Сканнер
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String nameFromKB = scanner.nextLine();

        System.out.println("Enter time spent on your hobby: ");
        int timeFromKB = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter number of sessions per week: ");
        int sessionsFromKB = Integer.parseInt(scanner.nextLine());

        Hobby thirdHobby = new Gym(nameFromKB, timeFromKB, sessionsFromKB);

        Hobby[] hobbies = {firsHobby, secondHobby, thirdHobby};
        System.out.println("My hobbies: ");
        for (Hobby hobby : hobbies) {
            hobby.tellAboutHobby();
        }

        scanner.close();
    }
}
