package singleResponsibilityPrinciple;

public class PayrollReportGenerator {
    public void generatePayrollReport(Employee employee) {
        System.out.println("Payroll report for " +employee.getName()+ ": " +employee.calculateAnnualSalary());
    }
}
