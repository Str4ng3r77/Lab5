package problema1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String args[]){
        System.out.println("Introduceti numarul de angajati: ");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            var employee = citire(i);
            employees.add(employee);
        }
        employees.forEach(employee -> {
            System.out.println(employee.calculateMonthlyIncome());
        });
    }

    private static Employee citire(int x) {
        System.out.printf("Numele angajatului %d este : %n", x);
        var nameaux = in.next();
        System.out.printf("Email'ul angajatului %d este : %n", x);
        var emailaux = in.next();
        System.out.printf("Tariful orar al angajatului %d este : %n", x);
        var hourRateaux = in.nextFloat();
        System.out.printf("Orele lucrate ale angajatului %d sunt : %n", x);
        var capacityaux = in.nextFloat();
        System.out.printf("Zilele libere ale angajatului %d sunt : %n", x);
        var freeDaysaux = in.nextShort();
        var employee = new Employee(nameaux, emailaux, hourRateaux, capacityaux, freeDaysaux);
        return employee;
    }
}

