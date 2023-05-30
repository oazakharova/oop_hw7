package ru.geekbrains.lesson7.observer;

public class Vacancy {

    Level level;
    double salary;

    public Vacancy(double salary, Level level) {
        this.salary = salary;
        this.level = level;
    }

    public Vacancy() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
