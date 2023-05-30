package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random;
    private String nameCompany;
    private double maxSalary;



    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    /**
     * TODO: Доработать метод, компания должна генерировать объект "Вакансия" и передавать
     *  объект в агенство.
     * Поиск сотрудника
     */
    private Vacancy generateVacancy(double salary, Level level) {
        return new Vacancy(salary, level);
    }

    public void needEmployee(){
        double salary = random.nextDouble(3000, maxSalary);
        int levelIndex = random.nextInt(0, Level.values().length);
        jobAgency.sendOffer(nameCompany, generateVacancy(salary, Level.values()[levelIndex]));
    }

}
