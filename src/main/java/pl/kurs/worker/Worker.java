package pl.kurs.worker;

import pl.kurs.company.Company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Worker {
    private String name;
    private String surname;
    private Double salary;
    private Company company;
    private static List<Worker> workerExtension = new ArrayList<>();

    public Worker(String name, String surname, Double salary, Company company) {
        this.name = name;
        this.surname = surname;
        setSalary(salary);
        this.company = company;
        workerExtension.add(this);
        company.getWorkerList().add(this);
    }

    public static boolean isNameCorrect(String name) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
        return pattern.matcher(name).matches();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary+500;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;


    }

    public static List<Worker> getWorkerExtension() {
        return workerExtension;
    }


}
