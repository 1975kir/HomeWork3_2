import Worker.Worker;
import java.util.Scanner;

public class HomeWork3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker Wkr1 = new Worker();
        Wkr1.fullname = "Иван Сергеевич Иванов";
        Wkr1.post = "Инженер";
        Wkr1.email = "Ivan@mail.ru";
        Wkr1.phone = "666555";
        Wkr1.salary = "50000";
        Wkr1.age = Integer.parseInt("60");

        Worker Wkr2 = new Worker();
        Wkr1.fullname = "Дмитрий Захарович Сидоров";
        Wkr1.post = "Бухгалтер";
        Wkr1.email = "Dima@mail.ru";
        Wkr1.phone = "777888";
        Wkr1.salary = "55000";
        Wkr1.age = Integer.parseInt("50");

        Worker Wkr3 = new Worker();
        Wkr1.fullname = "Виталий Иванович Петров";
        Wkr1.post = "Сварщик";
        Wkr1.email = "Vital@mail.ru";
        Wkr1.phone = "888999";
        Wkr1.salary = "60000";
        Wkr1.age = Integer.parseInt("30");

        Worker[] Workers = new Worker[3];
        Workers[0] = Wkr1;
        Workers[1] = Wkr2;
        Workers[2] = Wkr3;

        for (int i = 0; i < Workers.length; i++) {
            if (Workers[i].age > 40) {
               Workers[i].info();
            }

        }


    }


}

