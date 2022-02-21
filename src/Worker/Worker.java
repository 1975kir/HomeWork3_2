package Worker;

public class Worker {
    public String fullname;
    public String post;
    public String email;
    public String phone;
    public String salary;
    public int age;

    public void info() {
        System.out.println("ФИО: " + fullname + "Должность: " + post + "Возраст: " + age + "Почта: " + email + "Телефон: " + phone + "Зарплата: " + salary);
    }
}
