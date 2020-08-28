package com.example.Training;
import org.springframework.stereotype.Component;

//import com.example.Training.Override;

@Component("Manufacturer1")
public class Manufacturer {
	private int Mid;
	private String Mname;
	private String location;
	public int getMid() {
		return Mid;
	}
	public void setMid(int mid) {
		Mid = mid;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Manufacturer [mid=" + Mid + ", mname=" + Mname + ", location=" + location + "]";
	}
	public void compile()
	{
		System.out.println("In Manufacturer");
	}
}
