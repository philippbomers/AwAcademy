package Philipp_Training.Philipp_Woche4.Classes_And_Objects.Autos;

public class AutosMain {
    public static void main(String[] args) {
        AutosLogik piasKaputterToyota = new AutosLogik("Toyota", "Yaris");
        piasKaputterToyota.setFarbe("Weiss und günstig");
        piasKaputterToyota.setPs(150);
        piasKaputterToyota.setDiesel(false);
        System.out.println("Pias Auto: "+piasKaputterToyota);

        AutosLogik eliasGolf5 = new AutosLogik("VW", "Golf 5");
        eliasGolf5.setFarbe("Schwarz");
        eliasGolf5.setAutomatik(true);
        eliasGolf5.setDiesel(true);
        System.out.println("\n\nElias Auto: "+eliasGolf5);
    }
}
