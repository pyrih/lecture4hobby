package pyrih.andrii;

public class Swimming extends Hobby{
    private double pace;

    Swimming() {
        super();
    }

    Swimming(String name, int spentHours, double pace) {
        super(name, spentHours);
        this.pace = pace;
    }

    Swimming(String name, int spentHours, String description, double pace) {
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
    public String toString() {
        return "Swimming{" +
                "pace=" + pace +
                '}';
    }

    @Override
    public void tellAboutHobby() {
        System.out.println(super.toString() + " " + this.toString());
    }
}
