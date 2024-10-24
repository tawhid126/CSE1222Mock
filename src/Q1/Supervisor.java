package Q1;

public class Supervisor extends Worker {
    private String divisionName;

    public Supervisor(String name, double salary, String divisionNamed) {
        super(name, salary);
        this.divisionName = divisionNamed;
    }

    @Override
    public String toString() {
        return "Supervisor{" +super.toString() + " {divisionName='" + divisionName + '\'' + '}';
    }
}
