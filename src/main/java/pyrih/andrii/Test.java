package pyrih.andrii;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1
        Hobby firsHobby = new Hobby();
        firsHobby.setName("Running");
        firsHobby.setSpentHours(200);
        firsHobby.setDescription("I run in the morning on long distance.");

        //2
        Hobby secondHobby = new Hobby("Swimming", 20);

        //3 Как вариант можно реализовать через цикл используя метод hasNextLine() класса Сканнер
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String nameFromKB = scanner.nextLine();

        System.out.println("Enter time spent on your hobby: ");
        int timeFromKB = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter description: ");
        String descrFromKB = scanner.nextLine();

        // явно НЕ СОЗДАВАЛ объект со всеми полями, поэтому при выводе на экран значения незаполненных полей будут по умолчанию
        Hobby thirdHobby = new Hobby(nameFromKB, timeFromKB, descrFromKB);

        Hobby[] hobbies = {firsHobby, secondHobby, thirdHobby};
        System.out.println("My hobbies: ");
        for (Hobby hobby : hobbies) {
            hobby.tellAboutHobby();
        }

        scanner.close();
    }
}
