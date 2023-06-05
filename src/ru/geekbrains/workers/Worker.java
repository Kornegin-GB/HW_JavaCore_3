package ru.geekbrains.workers;

public abstract class Worker implements Comparable<Worker> {
    protected String name; // Имя работника
    protected String surname; // Фамилия работника
    protected String post; // Должность работника
    protected int salary; // Среднемесячная зароботная плата

    abstract int averageMonthlySalary();

    @Override
    public String toString() {
        return name + " " + surname + " заработал " + averageMonthlySalary();
    }

    @Override
    public int compareTo(Worker work) {
        if (this.salary == work.salary) {
            return this.name.compareTo(work.name);
        } else {
            return this.salary - work.salary;
        }
    }

}
