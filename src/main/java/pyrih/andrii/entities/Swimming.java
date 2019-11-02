package pyrih.andrii.entities;

import pyrih.andrii.exceprions.HobbyException;

public class Swimming extends Hobby {
    private double pace;

    public Swimming() {
        super();
    }

    public Swimming(String name, int spentHours, double pace) {
        super(name, spentHours);
        this.pace = pace;
    }

    public Swimming(String name, int spentHours, String description, double pace) {
        super(name, spentHours, description);
        this.pace = pace;
    }

    public double getPace() {
        return pace;
    }

    public void setPace(double pace) {
        this.pace = pace;
    }

    @Override
    public String tellAboutHobby(int hours) throws HobbyException {
        if (hours < 0) throw new HobbyException("Spent hours on the hobby is less than 0");
        return super.getName() + ":: Spent time: " + getSpentHours() + " hours, Pace: " + getPace() + "min/km.";
    }
}
