package day05;

public class Test03 {
	public static void main(String[] args) {
		Time t1 = new Time();
		t1.setHour(14);
		t1.setSecond(20);
		t1.print();
	}
}

class Time{
	private int hour;
	private int second;
	private boolean am;
		
	public boolean isAm() {
		return hour < 12;
	}
	public void setAm(boolean am) {
		this.am = am;
	}
	public void setHour(int hour){
		if(hour>=0 && hour<=23)
		       this.hour = hour;
	}
	public int getHour(){
		return hour;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void print() {
		System.out.printf("[%2d�떆 %2d遺�] %n",this.hour,this.second);
	}
}




