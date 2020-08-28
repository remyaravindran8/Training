package com.example.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Supplier {
	private int Sid;
	private String Sname;
	private String material;
	@Autowired//searches by type
	@Qualifier("Manufacturer1")//searches by name
	//supplier needs an instance of manufacturer
	private Manufacturer manufacturer;
	public int getSid() {
		return Sid;
	}
	public Supplier() {
		System.out.println("object created"); 
		}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void show()
	{
		System.out.println("In show");
		manufacturer.compile();
	}
	
	
}
