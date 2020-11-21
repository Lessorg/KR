package ua.edu.sumdu.j2se.nikolai.tasks;

public class Commander extends Human {
    private String firstSolider;
    private String secondSolider;
    private String general;

    public Commander(String name, String firstSoliderName, String secondSoliderName, String generalName, int age, boolean canFight){
        super(name,age,canFight);
        firstSolider = firstSoliderName;
        secondSolider = secondSoliderName;
        general = generalName;
    }
    public void war() throws IllegalArgumentException{
        if (firstSolider == secondSolider){
            throw new IllegalArgumentException("Два однакових солдати");
        }
        System.out.println("Я командир " + this.getName() + " перебуваю в підпорядкуванні " + general);
    }

    public void report() throws IllegalArgumentException{
        if (canFight){
            System.out.println("Я командир " + this.getName() + " можу воювати");
        }
        else if (!canFight){
            throw new IllegalArgumentException("Що ти робиш серед командирів");
        }
    }
}
