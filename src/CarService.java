public class CarService {
    private Employee [] employees;
    private int employeeIndex = 0;

    public CarService() {
        employees =  new Employee[10];
    }

    public void addEmployee(Employee employee) {
        employees[employeeIndex++] = employee;
    }

    public void displayEmployees() {
            for (int i = 0; i <employees.length && employees[i]!=null ; i++) {
                System.out.println("---------------");
              employees[i].display();
                System.out.println("---------------");
            }

        }


}
