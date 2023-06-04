package ru.geekbrains.workers;

public abstract class Worker {
    protected String name; // Имя работника
    protected String surname; // Фамилия работника
    protected String post; // Должность работника
    protected int salary; // Среднемесячная зароботная плата

    abstract int averageMonthlySalary();

    @Override
    public String toString() {
        return name + " " + surname + " заработал " + averageMonthlySalary();
    }

    public int getSalary() {
        return salary;
    }

}
