package hu.szamalk.Modell;

public class Ing extends Ruha{
    private double szinIntenzitas;

    public Ing(String tulaj) {
        super(tulaj);
        this.szinIntenzitas = 100;
    }

    public void setSzinIntenzitas(double szinIntenzitas) {
        this.szinIntenzitas = szinIntenzitas;
    }

    public double getSzinIntenzitas() {
        return szinIntenzitas;
    }


    public void setTiszta(boolean tiszta){
        super.setTiszta(tiszta);
        this.szinIntenzitas *= 0.97;
    }


    @Override
    public String toString() {
        String os = super.toString();
        return os + "Ing{" +
                "szinIntenzitas=" + szinIntenzitas +
                ", tiszta=" + tiszta +
                '}';
    }


}
