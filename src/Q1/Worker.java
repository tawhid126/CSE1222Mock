package Q1;

public class Worker {
    private String name;
    private double salary;


    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }

}
