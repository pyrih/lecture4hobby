package pyrih.andrii;

public class Hobby {
    private String name;
    private int spentHours;
    private String description;

    private boolean isRelevantNow; // true
    private char hobbyPriority; // A B C D E F
    private byte difficulty; // 1-10
    private float averageHoursPerDay;
    private double spentMoney;
    private short scheduledHours;

    private long id;


    public Hobby() {
    }

    public Hobby(String name, int spentHours) {
        this.name = name;
        this.spentHours = spentHours;
        this.description = "no description";
    }

    public Hobby(String name, int spentHours, String description) {
        this.name = name;
        this.spentHours = spentHours;
        this.description = description;
    }

    public Hobby(String name, int spentHours, String description, boolean isRelevantNow, char hobbyPriority, byte difficulty, float averageHoursPerDay, double spentMoney, short scheduledHours, long id) {
        this.name = name;
        this.spentHours = spentHours;
        this.description = description;
        this.isRelevantNow = isRelevantNow;
        this.hobbyPriority = hobbyPriority;
        this.difficulty = difficulty;
        this.averageHoursPerDay = averageHoursPerDay;
        this.spentMoney = spentMoney;
        this.scheduledHours = scheduledHours;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpentHours() {
        return spentHours;
    }

    public void setSpentHours(int spentHours) {
        this.spentHours = spentHours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRelevantNow() {
        return isRelevantNow;
    }

    public void setRelevantNow(boolean relevantNow) {
        isRelevantNow = relevantNow;
    }

    public char getHobbyPriority() {
        return hobbyPriority;
    }

    public void setHobbyPriority(char hobbyPriority) {
        this.hobbyPriority = hobbyPriority;
    }

    public byte getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(byte difficulty) {
        this.difficulty = difficulty;
    }

    public float getAverageHoursPerDay() {
        return averageHoursPerDay;
    }

    public void setAverageHoursPerDay(float averageHoursPerDay) {
        this.averageHoursPerDay = averageHoursPerDay;
    }

    public double getSpentMoney() {
        return spentMoney;
    }

    public void setSpentMoney(double spentMoney) {
        this.spentMoney = spentMoney;
    }

    public short getScheduledHours() {
        return scheduledHours;
    }

    public void setScheduledHours(short scheduledHours) {
        this.scheduledHours = scheduledHours;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", spentHours=" + spentHours +
                ", description='" + description + '\'' +
                ", isRelevantNow=" + isRelevantNow +
                ", hobbyPriority=" + hobbyPriority +
                ", difficulty=" + difficulty +
                ", averageHoursPerDay=" + averageHoursPerDay +
                ", spentMoney=" + spentMoney +
                ", scheduledHours=" + scheduledHours +
                ", id=" + id +
                '}';
    }

    public void tellAboutHobby() {
        System.out.println(this.toString());
    }
}
