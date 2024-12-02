package hu.szamalk.Modell;

public class Ruha {
    private String tulaj;
    protected boolean tiszta;

    public Ruha(String tulaj) {
        this.tulaj = tulaj;
        this.tiszta = false;
    }

    public String getTulaj() {
        return tulaj;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }
    public boolean isTiszta() {
        return tiszta;
    }


    @Override
    public String toString() {
        return "Ruha{" +
                "tulaj='" + tulaj + '\'' +
                ", tiszta=" + tiszta +
                '}';
    }
}
