package ru.geekbrains.workers;

public class HourlyPayment extends Worker {

    public HourlyPayment(String name, String surname, String post, int salary) {
        this.name = name;
        this.surname = surname;
        this.post = post;
        this.salary = salary;
    }

    @Override
    public int averageMonthlySalary() {
        return (int) 20.8 * 8 * salary;
    }

}
