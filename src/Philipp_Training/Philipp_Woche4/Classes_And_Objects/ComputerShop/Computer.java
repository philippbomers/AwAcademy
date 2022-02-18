package Philipp_Training.Philipp_Woche4.Classes_And_Objects.ComputerShop;

public class Computer {
    private String manufacturerName,
            type,
            graphicCard,
            operatingSystem;
    private int cpuMhz,
            screenSizeInches,
            ramGb,
            hddGb;
    private byte numberOfUsbPorts;
    private double purchasingPrice,
            sellingPrice;
    private boolean preInstalledOs;

    public Computer(String manufacturerName, int screenSizeInches, boolean preInstalledOs) {
        this.manufacturerName = manufacturerName;
        this.screenSizeInches = screenSizeInches;
        this.preInstalledOs = preInstalledOs;
    }

    public String getManufacturerName() {
        if(manufacturerName==null)
            return "Unbekannt";
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getType() {
        if(type==null)
            return "Unbekannt";
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCpuMhz() {
        return this.cpuMhz;
    }

    public void setCpuMhz(int cpuMhz) {
        this.cpuMhz = cpuMhz;
    }

    public int getScreenSizeInches() {
        return this.screenSizeInches;
    }

    public void setScreenSizeInches(int screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public int getRamGb() {
        return this.ramGb;
    }

    public void setRamGb(int ramGb) {
        this.ramGb = ramGb;
    }

    public int getHddGb() {
        return this.hddGb;
    }

    public void setHddGb(int hddGb) {
        this.hddGb = hddGb;
    }

    public byte getNumberOfUsbPorts() {
        return this.numberOfUsbPorts;
    }

    public void setNumberOfUsbPorts(byte numberOfUsbPorts) {
        this.numberOfUsbPorts = numberOfUsbPorts;
    }

    public String isPreInstalledOs() {
        String installedOs;
        if (this.preInstalledOs) {
            installedOs = "Vorinstalliert";
            if (this.getOperatingSystem() != null)
                installedOs+=" ("+this.getOperatingSystem()+")";
        }else
            installedOs = "Nicht vorhanden";

        return installedOs;
    }

    public void setPreInstalledOs(boolean preInstalledOs) {
        this.preInstalledOs = preInstalledOs;
    }

    public String getGraphicCard() {
        if(this.graphicCard==null)
            return "Unbekannt";
        return this.graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public double getPurchasingPrice() {
        return this.reduceDecimals(purchasingPrice);
    }

    public void setPurchasingPrice(double purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public double getSellingPrice() {
        return this.reduceDecimals(sellingPrice);
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getProfit(){
        return this.reduceDecimals(this.purchasingPrice-this.sellingPrice);
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double reduceDecimals(double value) {
        return Math.round(Math.pow(10.0, 2) * value) / Math.pow(10.0, 2);
    }

    public String toString(){
        return  "Kaufpreis: "+this.getPurchasingPrice()+" Euro"+
                "\nVerkaufspreis: "+this.getSellingPrice()+ "Euro"+
                "\nGewinn: "+this.getProfit() +" Euro"+
                "\nHersteller: "+this.getManufacturerName()+
                "\nComputertyp: "+this.getType()+
                "\nGrafikkarte: "+this.getGraphicCard()+
                "\nProzessorgeschwindigkeit: "+this.getCpuMhz()+ " MHZ"+
                "\nBildschirndiagonale: "+this.getScreenSizeInches()+ " Zoll"+
                "\nArbeitsspeicher: "+this.getRamGb()+ " Gigabyte"+
                "\nFestplattenspeicher: "+this.getHddGb()+ " Gigabyte"+
                "\nAnzahl der USB-Ports: "+this.getNumberOfUsbPorts()+
                "\nBetriebssystem: "+this.isPreInstalledOs()
                ;
    }
}
