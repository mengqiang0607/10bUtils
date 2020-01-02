package com.bw.test;

public class Book {
	private Integer id;
	private Double price;
	private String bname;
	private String btime;
	public Book(Integer id, Double price, String bname, String btime) {
		super();
		this.id = id;
		this.price = price;
		this.bname = bname;
		this.btime = btime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtime() {
		return btime;
	}
	public void setBtime(String btime) {
		this.btime = btime;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", bname=" + bname + ", btime=" + btime + "]";
	}

	
	
}
