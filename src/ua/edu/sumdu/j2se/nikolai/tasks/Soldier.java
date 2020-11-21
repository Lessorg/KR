package ua.edu.sumdu.j2se.nikolai.tasks;

public class Soldier extends Human {
    private String commanderName;

    public Soldier(String name, String commanderName, int age, boolean canFight){
        super(name,age,canFight);
        this.commanderName = commanderName;
    }

    public Soldier(String name, String commanderName, int age){
        super(name,age);
        this.commanderName = commanderName;
    }

    public Soldier(String name, int age, boolean canFight){
        super(name,age,canFight);
        this.commanderName = "Дільниці командир відсутній";
    }

    public void war() throws IllegalArgumentException{
        if (commanderName == "Дільниці командир відсутній"){
            throw new IllegalArgumentException("Не знайден командир");
        }
        System.out.println("Я " + this.getName() + " перебуваю в підпорядкуванні " + commanderName);
    }

    public void report() throws IllegalArgumentException{
        if (canFight){
            System.out.println("Я солдам " + this.getName() + " можу воювати");
        }
        else if (!canFight){
            throw new IllegalArgumentException("Що ти робиш серед солдатів");
        }
    }
}
