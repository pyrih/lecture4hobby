package pyrih.andrii.entities;

import pyrih.andrii.exceprions.HobbyException;

public class Gym extends Hobby {
    private int sessionsPerWeek;

    public Gym() {
        super();
    }

    public Gym(String name, int spentHours, int sessionsPerWeek) {
        super(name, spentHours);
        this.sessionsPerWeek = sessionsPerWeek;
    }

    public Gym(String name, int spentHours, String description,
               int sessionsPerWeek) {
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
    public String tellAboutHobby(int hours) throws HobbyException {
        if (hours < 0) throw new HobbyException("Spent hours on the hobby is less than 0");
        return super.getName() + ":: Spent time: " + getSpentHours() + " hours, Sessions per week: " + getSessionsPerWeek() + ".";
    }
}
