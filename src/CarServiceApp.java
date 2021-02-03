import java.util.Scanner;

public class CarServiceApp {
    public static void main(String[] args) {

        int option;
        Scanner scanner = new Scanner(System.in, "UTF-8");
        CarService carService = new CarService();
        do {
            System.out.println("-------------Car Service app--------------");
            System.out.println("1 - add employee");
            System.out.println("2 - display employee");
            System.out.println("3 - add task");
            System.out.println("100 - STOP");
            //System.out.println("1 - add employee");


            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();

                    Employee employee = new Employee(name, age);
                    carService.addEmployee(employee);
                    break;
                case 2:
                   carService.displayEmployees();
                    break;
                case 3:
                    carService.displayEmployees();
                    break;

            }
        } while (option!=100);
        scanner.close();

    }

}
