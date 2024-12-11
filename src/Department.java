public class Department {
    private Employee[] employees;
    private int lastAddedEmployeeIndex = -1;

    public Department(int capacity) {
        employees = new Employee[capacity];
    }

    public void addEmployee(Employee e) {
        if (lastAddedEmployeeIndex + 1 < employees.length) {
            employees[++lastAddedEmployeeIndex] = e;
        } else {
            System.out.println("Não é possível adicionar mais funcionários. Departamento cheio.");
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getEmployeeCount() {
        return lastAddedEmployeeIndex + 1;
    }

    public Employee getEmployeeByID(int empId) {
        for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
            if (employees[i] != null && employees[i].getId() == empId) {
                return employees[i];
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0;
        for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
            }
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        int count = getEmployeeCount();
        return count > 0 ? getTotalSalary() / count : 0;
    }
}
