package ua.edu.sumdu.j2se.nikolai.tasks;

public abstract class Human implements Capable_To_Fight{

    private String name;
    private int age;
    public boolean canFight;

    protected Human(String name, int age, boolean canFight) {
       this.name=name;
       this.age=age;
       this.canFight=canFight;
    }

    protected Human(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
