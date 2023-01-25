package myproject.device;

import myproject.Human;
import myproject.Salleable;

import java.net.URL;
import java.util.List;


public class Phone extends Device implements Salleable {
    private static final String DEFAULT_SERVER = "https://pobierzsecostamxddddddd.com/";
    private static final String DEFAULT_PROTOCOL = "https";
    private static final String DEFAULT_wersja_apki = "1.0";

    public Double Value;
    public Human owner;
    public String showPhone(){
        return "Producer: "+producer+", Model: "+model+", Value: "+Value;
    }
    public Phone(String model, String producer, Double value) {
        super(model, producer, model1, producer1);
        Value = value;
    }
    @Override
    public void turnOn() {
        System.out.println("Telefon się włącza");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller != this.owner){
            System.out.println("Ktoś tu szykuje scam!");
            return;
        }
        if(buyer.getCash() < price){
            System.out.println("Ktoś tu szykuje scam!");
            return;
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        this.owner = buyer;
        System.out.println("Gratuluje zakupu!");
    }
    public void installAnnApp(String appName) {
        System.out.println("Instaluje " + appName + " wersja_apki " + DEFAULT_wersja_apki + "pobierz z serwera" + DEFAULT_SERVER + " using " + DEFAULT_PROTOCOL + " protokół " + this.model + " " + this.producer);
    }
    public void installAnnApp(String appName, String appwersja_apki) {
        System.out.println("Instaluje " + appName + " wersja_apki " + appwersja_apki + "pobierz z serwera" + DEFAULT_SERVER + " using " + DEFAULT_PROTOCOL + " protokół " + this.model + " " + this.producer);
    }
    public void installAnnApp(String appName, String appwersja_apki, String serverAddress) {
        System.out.println("Instaluje " + appName + " wersja_apki " + appwersja_apki + "pobierz z serwera" + serverAddress + " using " + DEFAULT_PROTOCOL + " protokół " + this.model + " " + this.producer);
    }
    public void installAnnApp(List<String> appNames) {
        String appNameList = String.join(", ", appNames);
        System.out.println("Instaluje " + appNameList + " wersja_apki " + DEFAULT_wersja_apki + "pobierz z serwera" + DEFAULT_SERVER + " using " + DEFAULT_PROTOCOL + " protokół " + this.model + " " + this.producer);
    }
    public void installAnnApp(URL appURL) {
        System.out.println("Instaluje apk z url " + appURL + " on " + this.model + " " + this.producer);
    }
}
