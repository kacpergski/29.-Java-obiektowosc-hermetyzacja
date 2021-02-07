public class Wniosek {
    private int id;
    private String nameAndSurname;
    private int typeOfPBoard;
    private int status;


    public Wniosek(int id, String nameAndSurname, int typeOfPBoard, int status) {
        this.id = id;
        this.nameAndSurname = nameAndSurname;
        this.typeOfPBoard = typeOfPBoard;
        this.status = status;
    }

    public void display() {
        System.out.println("Numer wniosku: " + id);
        System.out.println("Imie i nazwisko: " + nameAndSurname);
        System.out.println("Rodzaj tablicy: " + typeOfPBoard);
        System.out.println("Status: " + status);

    }
    public int getId() {
        return id;
    }

    public  void setStatus (int status) {

        this.status = status;
    }

    public int getStatus() {
        return status;
    }

}
