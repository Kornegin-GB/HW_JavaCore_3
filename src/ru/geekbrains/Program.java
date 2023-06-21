package ru.geekbrains;

import java.util.Arrays;

import ru.geekbrains.workers.ArrayWorker;
import ru.geekbrains.workers.FixedPayment;
import ru.geekbrains.workers.HourlyPayment;
import ru.geekbrains.workers.Worker;

public class Program {
    public static void main(String[] args) {

        // Реализация из класса Worker
        Worker[] workers = {
                new HourlyPayment("Пётр", "Петров", "Фронтендер", 500),
                new FixedPayment("Алексей", "Алексеев", "Дизайнер", 100000),
                new FixedPayment("Андрей", "Андреев", "Java junior", 150000),
                new HourlyPayment("Иван", "Иванов", "Бэкэндер", 600),
        };

        for (Worker worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        Arrays.sort(workers);

        for (Worker worker : workers) {
            System.out.println(worker);
        }

        System.out.println();

        // Реализация из класса ArrayWorker
        Worker[] arrWork = new ArrayWorker().creatArrayWorker();

        for (Worker workerArr : arrWork) {
            System.out.println(workerArr);
        }

        System.out.println();
        Arrays.sort(arrWork);

        for (Worker workerArr : arrWork) {
            System.out.println(workerArr);
        }
    }
}
