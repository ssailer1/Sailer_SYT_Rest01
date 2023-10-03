package tradearea.warehouse;

import tradearea.model.Produkt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Arten {


    public String getData(String inID) {
        String a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        Produkt b = new Produkt(a, "1", "Apfel", "lecker", 1.0, 10, "Stück");
        return b.toString();

    }
}