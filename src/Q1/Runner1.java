package Q1;

import java.util.Scanner;

public class Runner1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Supervisor name : ");
        String name = sc.next();

        System.out.print("Supervisor salary : ");
        double salary  = sc.nextDouble();

        System.out.print("Supervisor divisionNamed : ");
        String divisionNamed = sc.next();

        Director dr = new Director( name ,  salary , divisionNamed);
        System.out.println(dr);
    }
}
