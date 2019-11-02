package pyrih.andrii.entities;

import pyrih.andrii.exceprions.HobbyException;

public class Running extends Hobby {
    private float distance;

    public Running() {
        super();
    }

    public Running(String name, int spentHours, float distance) {
        super(name, spentHours);
        this.distance = distance;
    }

    public Running(String name, int spentHours, String description, float distance) {
        super(name, spentHours, description);
        this.distance = distance;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public String tellAboutHobby(int hours) throws HobbyException {
        if (hours < 0) throw new HobbyException("Spent hours on the hobby is less than 0");
        return super.getName() + ":: Spent time: " + getSpentHours() + " hours, Distance: " + getDistance() + " km.";
    }
}
