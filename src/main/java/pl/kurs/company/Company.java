package pl.kurs.company;

import pl.kurs.worker.Worker;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Worker> workerList = new ArrayList<>();
    private static List<Company> companyExtension = new ArrayList<>();

    public Company(String name) {
        setName(name);
        companyExtension.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 2 || name.length() > 20) {
            throw new IllegalArgumentException("Company name have not proper length");
        }
        this.name = name;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public static List<Company> getCompanyExtension() {
        return companyExtension;
    }

    public static Double getSumOfSalaries(Company company) {
        double sumOfSalaries = 0;
        for (Worker w : company.getWorkerList()) {
            sumOfSalaries += w.getSalary();
        }
        return sumOfSalaries;
    }
}
