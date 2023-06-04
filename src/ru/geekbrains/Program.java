package ru.geekbrains;

import ru.geekbrains.workers.FixedPayment;
import ru.geekbrains.workers.HourlyPayment;
import ru.geekbrains.workers.Worker;

public class Program {
    public static void main(String[] args) {
        Worker[] workers = {
                new HourlyPayment("Пётр", "Петров", "Фронтендер", 500),
                new FixedPayment("Алексей", "Алексеев", "Дизайнер", 100000),
                new FixedPayment("Андрей", "Андреев", "Java junior", 150000),
                new HourlyPayment("Иван", "Иванов", "Бэкэндер", 600),
        };

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
