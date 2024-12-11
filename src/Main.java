public class Main {
    public static void main(String[] args) {
        Department department = new Department(5);

        Employee emp1 = new Employee(1, "João", 2500.00);
        Employee emp2 = new Employee(2, "Maria", 3000.00);
        Employee emp3 = new Employee(3, "Carlos", 4000.00);

        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);

        System.out.println("Total de funcionários: " + department.getEmployeeCount());
        System.out.println("Total de salários: " + department.getTotalSalary());
        System.out.println("Média de salários: " + department.getAverageSalary());

        int searchId = 2;
        Employee employee = department.getEmployeeByID(searchId);
        if (employee != null) {
            System.out.println("Funcionário encontrado: " + employee.getName());
        } else {
            System.out.println("Funcionário com ID " + searchId + " não encontrado.");
        }
    }
}
