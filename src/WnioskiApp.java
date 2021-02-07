import java.util.Scanner;

public class WnioskiApp {

    public static void main(String[] args) {
        int option=0;
        int id = 1;
        Scanner scanner = new Scanner(System.in, "UTF-8");
        WnioskiRepo wnioskiRepo = new WnioskiRepo();  //obiekt
        do {
            System.out.println("1 - Złóż wniosek");
            System.out.println("2 - Zmień status wniosku (1 - w trakcie, 2 - do odbioru)");
            System.out.println("3 - Sprawdz status wniosku (1 - w trakcie, 2 - do odbioru)");
            System.out.println("4 - Wyświetl wnioski");
            System.out.println("9 - Zamknij program");

            option = scanner.nextInt();
            scanner.nextLine();


        switch (option){

            case 1:
                System.out.println("Podaj imie i nazwisko");
                String name = scanner.nextLine();

                System.out.println("Podaj opcje tablcy: 1- zabytowa, 2 -kwadratowa, 3 - inna");
                int typeOfPBoard = scanner.nextInt();
                scanner.nextLine();

                Wniosek wniosek = new Wniosek(id++, name,typeOfPBoard,1);
                wnioskiRepo.addWniosek(wniosek);
                break;
            case 2:
                System.out.println("Podaj nr wniosku");
                id = scanner.nextInt();
                System.out.println("Podaj nowy status wniosku");
                int status = scanner.nextInt();
                scanner.nextLine();

                wnioskiRepo.replaceStatusWniosek(id,status);//set dla obiektu wnioskirepo

                break;
            case 3:

                System.out.println("Podaj nr wniosku");
                id = scanner.nextInt();
                scanner.nextLine();

                wnioskiRepo.wniosekStatusDisplay(id);//set dla obiektu wnioskirepo

                break;
            case 4:

                wnioskiRepo.wnioskiDisplay();


                break;
        }

        }while(option!=9);

    }
}
