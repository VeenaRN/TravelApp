package coms.SampleRestApiApp.entities;

public class Product {
	private int prdno;
	private String pname;
	private int stock;
	private float cost;
	public int getPrdno() {
		return prdno;
	}
	public void setPrdno(int prdno) {
		this.prdno = prdno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Product(int prdno, String pname, int stock, float cost) {
		super();
		this.prdno = prdno;
		this.pname = pname;
		this.stock = stock;
		this.cost = cost;
	}
	
	

}
