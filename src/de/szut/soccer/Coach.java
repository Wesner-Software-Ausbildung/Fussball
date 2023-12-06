package de.szut.soccer;

public class Coach {
    private String name;
    private int age;
    private int experience;

    public Coach(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = validate(experience) ;
    }

    public String getName(){

        return name;
    }
    public void setName (String name) {

        this.name = name;
    }
    public int getAge() {

        return age;
    }
    public void setAge (int age) {

        this.age = age;
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
                "name: " + this.name +
                "\nage: " + this.age +
                "\nexperience: " + this.experience;
    }
}
