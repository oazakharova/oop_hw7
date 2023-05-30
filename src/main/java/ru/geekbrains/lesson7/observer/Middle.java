package ru.geekbrains.lesson7.observer;

public class Middle extends Employee implements Observer{


    public Middle(String name) {
        super(name, 60000);
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (this.salary < vacancy.getSalary() && vacancy.getLevel().equals(Level.MIDDLE)){
            System.out.printf("Middle %s >>> Мне нужна эта работа! [%s - Позиция:%s c зарплатой %f]\n", name, companyName,vacancy.level.toString(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Middle %s >>> Я найду работу получше! [%s - Позиция:%s c зарплатой %f]\n", name, companyName,vacancy.level.toString(), vacancy.getSalary());
        }
    }
}
