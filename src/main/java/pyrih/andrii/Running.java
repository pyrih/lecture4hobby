package pyrih.andrii;

public class Running extends Hobby {
    private float distance;

    Running() {
        super();
        this.distance = distance;
    }

    Running(String name, int spentHours, float distance) {
        super(name, spentHours);
        this.distance = distance;
    }

    Running(String name, int spentHours, String description, float distance) {
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
    public void tellAboutHobby() {
        System.out.println(super.toString() + " , Distance: " + this.getDistance());
    }
}
