package hu.szamalk;

import hu.szamalk.Modell.Ing;
import hu.szamalk.Modell.Mosoda;
import hu.szamalk.Modell.Ruha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda();
        mosoda.bevesz(new Ruha("rokarudi"));
        mosoda.bevesz(new Ruha("ede"));
        mosoda.bevesz(new Ruha("feri"));
        mosoda.bevesz(new Ing("feri ingben"));
        mosoda.mos();



        //Ruha ruha2 = new Ruha("Rudi");
        //        Ruha ruha3 = new Ruha("Róka");
    }
}