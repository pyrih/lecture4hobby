package pyrih.andrii;

public abstract class Hobby {
    private String name;
    private int spentHours;
    private String description;

    public Hobby() {
    }

    public Hobby(String name, int spentHours) {
        this.name = name;
        this.spentHours = spentHours;
        this.description = "no description";
    }

    Hobby(String name, int spentHours, String description) {
        this.name = name;
        this.spentHours = spentHours;
        this.description = description;
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

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", spentHours=" + spentHours +
                ", description='" + description + '\'' +
                '}';
    }

    public abstract void tellAboutHobby();
}

