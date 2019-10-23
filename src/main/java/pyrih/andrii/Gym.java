package pyrih.andrii;

public class Gym extends Hobby{
    private int sessionsPerWeek;

    Gym() {
        super();
    }

    Gym(String name, int spentHours, int sessionsPerWeek) {
        super(name, spentHours);
        this.sessionsPerWeek = sessionsPerWeek;
    }

    Gym(String name, int spentHours, String description, int sessionsPerWeek) {
        super(name, spentHours, description);
        this.sessionsPerWeek = sessionsPerWeek;
    }

    public int getSessionsPerWeek() {
        return sessionsPerWeek;
    }

    public void setSessionsPerWeek(int sessionsPerWeek) {
        this.sessionsPerWeek = sessionsPerWeek;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "sessionsPerWeek=" + sessionsPerWeek +
                '}';
    }

    @Override
    public void tellAboutHobby() {
        System.out.println(super.toString() + " " + this.toString());
    }
}
