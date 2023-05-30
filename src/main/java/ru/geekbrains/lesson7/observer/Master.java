package ru.geekbrains.lesson7.observer;

public class Master extends Employee implements Observer {

    public Master(String name) {
        super(name, 8000);
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (this.salary < vacancy.getSalary() && vacancy.getLevel().equals(Level.MASTER)){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - Позиция:%s c зарплатой %f]\n", name, companyName,vacancy.level.toString(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Мастер %s >>> Я найду работу получше! [%s - Позиция:%s c зарплатой %f]\n", name, companyName,vacancy.level.toString(), vacancy.getSalary());
        }
    }
}
