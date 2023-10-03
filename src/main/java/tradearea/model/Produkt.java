package tradearea.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produkt {
        private String timestamp;
        private String produktID;
        private String produktName;
        private String produktBeschreibung;
        private double produktPreis;
        private int produktAnzahl;

        private String produktEinheit;

        public Produkt(){
            this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        }
        public Produkt(String timestamp, String produktID, String produktName, String produktBeschreibung, double produktPreis, int produktAnzahl, String produktEinheit){
            this.timestamp = timestamp;
            this.produktID = produktID;
            this.produktName = produktName;
            this.produktBeschreibung = produktBeschreibung;
            this.produktPreis = produktPreis;
            this.produktAnzahl = produktAnzahl;
            this.produktEinheit = produktEinheit;
        }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getProduktID() {
            return produktID;
        }
        public void setProduktID(String produktID) {
            this.produktID = produktID;
        }
        public String getProduktName() {
            return produktName;
        }
        public void setProduktName(String produktName) {
            this.produktName = produktName;
        }
        public String getProduktBeschreibung() {
            return produktBeschreibung;
        }
        public void setProduktBeschreibung(String produktBeschreibung) {
            this.produktBeschreibung = produktBeschreibung;
        }
        public double getProduktPreis() {
            return produktPreis;
        }
        public void setProduktPreis(double produktPreis) {
            this.produktPreis = produktPreis;
        }
        public int getProduktAnzahl() {
            return produktAnzahl;
        }
        public void setProduktAnzahl(int produktAnzahl) {
            this.produktAnzahl = produktAnzahl;
        }
        public String getProduktEinheit() {
            return produktEinheit;
        }
        public void setProduktEinheit(String produktEinheit) {
            this.produktEinheit = produktEinheit;
        }

        @Override
        public String toString() {
            return String.format("timestamp,Produkt Info: ID = %s, Name = %s, Beschreibung = %s, Preis = %s, Anzahl = %s, Einheit = %s, timestamp = %s", produktID, produktName, produktBeschreibung, produktPreis, produktAnzahl, produktEinheit);
        }
}
