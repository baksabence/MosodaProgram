package hu.szamalk.Modell;

public class Mosoda {
    private Ruha[] ruha;
    private int maxRuhaSzam;

    public Mosoda() {
        this(5);
    }

    public Mosoda(int db){
        ruha = new Ruha[db];
    }

    public void bevesz(Ruha ruhak) {
        maxRuhaSzam = 0;
        if (maxRuhaSzam < ruha.length){
            ruha[maxRuhaSzam++] = ruhak;
            System.out.println(ruhak.getTulaj() + " ruháját sikeresen bevettük.");
        }else{
            System.out.println("A mosoda megtelt.");
        }

    }

    public Ruha kiad(String tulaj){
        for (int i = 0; i < maxRuhaSzam; i++) {
            if (ruha[i] != null && ruha[i].getTulaj().equals(tulaj)){
                System.out.println("A ruhád: " + ruha[i] + ", sikeresen kiadásra került");
                ruha[i] = null;
            }
        }

        return kiad(tulaj);
    }

    public void mos(){
        for (int i = 0; i < maxRuhaSzam; i++) {
            ruha[i].setTiszta(true);
            System.out.println("A ruhák kimosva");
        }

    }


}
