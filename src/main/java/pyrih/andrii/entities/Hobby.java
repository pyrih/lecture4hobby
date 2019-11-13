package pyrih.andrii.entities;

import pyrih.andrii.exceprions.HobbyException;

public abstract class Hobby {
    private String name;
    private int spentHours;
    private String description;

    public Hobby() {
    }

    /**
     * @param name
     * @param spentHours
     */
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

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
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

    public abstract String tellAboutHobby(int hours) throws HobbyException;
}

