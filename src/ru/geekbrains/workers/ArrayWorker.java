package ru.geekbrains.workers;

public class ArrayWorker {
    public Worker[] creatArrayWorker() {
        Worker[] workers = {
                new HourlyPayment("Пётр", "Петров", "Фронтендер", 500),
                new FixedPayment("Алексей", "Алексеев", "Дизайнер", 100000),
                new FixedPayment("Андрей", "Андреев", "Java junior", 150000),
                new HourlyPayment("Иван", "Иванов", "Бэкэндер", 600),
        };
        return workers;
    }
}
