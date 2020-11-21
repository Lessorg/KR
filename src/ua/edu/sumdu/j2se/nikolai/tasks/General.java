package ua.edu.sumdu.j2se.nikolai.tasks;

public class General extends Human {

    private String firstСomander;
    private String secondComander;

    public General(String name, String firstComanderName, String secondComanderName, int age, boolean canFight){
        super(name,age,canFight);
        firstСomander = firstСomander;
        secondComander = secondComander;
    }
    public void war() throws IllegalArgumentException{
        if (firstСomander == secondComander){
            throw new IllegalArgumentException("Два однакових командира");
        }
        System.out.println("Я генерал " + this.getName());
    }

    public void report() throws IllegalArgumentException{
        if (canFight){
            System.out.println("Я генрал " + this.getName() + " можу воювати");
        }
        else if (!canFight){
            throw new IllegalArgumentException("Що ти робиш серед генералів");
        }
    }
}
