package ru.geekbrains.workers;

public class FixedPayment extends Worker {

    public FixedPayment(String name, String surname, String post, int salary) {
        this.name = name;
        this.surname = surname;
        this.post = post;
        this.salary = salary;
    }

    @Override
    public int averageMonthlySalary() {
        return salary;
    }

}
