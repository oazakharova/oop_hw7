package ru.geekbrains.lesson7.observer;

public class Student extends Employee implements Observer {

    public Student(String name) {
        super(name, 5000);
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        if (this.salary < vacancy.getSalary() && vacancy.getLevel().equals(Level.STUDENT)) {
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - Позиция:%s c зарплатой %f]\n", name, companyName,vacancy.level.toString(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        } else {
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - Позиция:%s c зарплатой %f]\n", name, companyName,vacancy.level.toString(), vacancy.getSalary());
        }
    }
}
