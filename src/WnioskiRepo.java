public class WnioskiRepo {

    private Wniosek [] wnioski;
    private int wniosekIndex = 0;

    public WnioskiRepo() {
        wnioski = new Wniosek[10];
    }

    public void addWniosek(Wniosek wniosek){
       wnioski[wniosekIndex++] = wniosek;
    }



   public void wnioskiDisplay(){
       for (int i = 0; i < wnioski.length&& wnioski[i] != null; i++) {
           System.out.println("------------------------------ ");
           wnioski[i].display();
           System.out.println("------------------------------ ");
       }
   }

    public  void replaceStatusWniosek(int id, int status) {
        for (int i = 0; i < wnioski.length && wnioski[i] != null; i++) {

            if (wnioski[i].getId() == id) {
            wnioski[i].setStatus(status);
            }

        }

    }

    public void wniosekStatusDisplay(int id){
        for (int i = 0; i < wnioski.length&& wnioski[i] != null; i++) {
            if (wnioski[i].getId() == id) {
                System.out.println("Status wniosku nr "+ id + " : " + wnioski[i].getStatus());
            }

        }
    }



}
