package tradearea.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WarehouseData {
	
	private String warehouseID;
	private String warehouseName;
	private String timestamp;
	private Produkt[] warehouseProdukte;

	/**
	 * Constructor
	 */
	public WarehouseData() {
		
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

		this.warehouseProdukte = new Produkt[8];
		this.warehouseProdukte[0] = new Produkt(this.timestamp,"1", "Apfel", "lecker", 1.0, 10, "Stück");
		this.warehouseProdukte[1] = new Produkt(this.timestamp,"2", "Birne", "lecker", 1.0, 10, "Stück");
		this.warehouseProdukte[2] = new Produkt(this.timestamp, "3", "Banane", "gelb", 2.5, 1, "Stück");
		this.warehouseProdukte[3] = new Produkt(this.timestamp, "4", "Orange", "rund", 1.1, 12, "Stück");
		this.warehouseProdukte[4] = new Produkt(this.timestamp, "5", "Kiwi", "grün und haarig", 1.4, 4, "Stück");
		this.warehouseProdukte[5] = new Produkt(this.timestamp, "6", "Mango", "gelb", 1.0, 10, "Stück");
		this.warehouseProdukte[6] = new Produkt(this.timestamp, "7", "Ananas", "reif", 4.5, 190, "Stück");
		this.warehouseProdukte[7] = new Produkt(this.timestamp, "8", "Erdbeere", "rot", 6.25, 13, "Körbe");

	}
	
	/**
	 * Setter and Getter Methods
	 */
	public String getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public void setWarehouseProdukte(Produkt[] warehouseProdukte) {
		this.warehouseProdukte = warehouseProdukte;
	}

	public Produkt[] getWarehouseProdukte() {
		return warehouseProdukte;
	}

	/**
	 * Methods
	 */

}
