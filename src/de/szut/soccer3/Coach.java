package de.szut.soccer3;

public class Coach extends Person {

    private int experience;

    public Coach(String name, int age, int experience) {
        super(name, age);
        this.experience = validate(experience);
    }

    public int getExperience () {
        return experience;
    }
    public void setExperience (int experience) {
        this.experience = validate(experience);
    }

    public int validate(int value) {
        //return value < 1 ? 1 : value > 10 ? 10 : value;
        if (value < 1) {
            return 1;
        }
        else if (value > 10) {
            return 10;
        }
        return value;
    }

    @Override
        public String toString() {
            return "\nCoach\n" +
                "Name: " + this.name +
                "\nAge: " + this.age +
                "\nExperience: " + this.experience;
    }
}
