package model;

public class Computer {
	private int hd;
	private int ram;
	private String ip;
	private Computer next;
	private Computer previus; 
	
	
	public Computer (int hdx, int ramx, String ipx){
		hd = hdx;
		ram = ramx;
		ip = ipx;
	}

	public int getHd() {
		return hd;
	}

	public void setHd(int hd) {
		this.hd = hd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Computer getNext() {
		return next;
	}

	public void setNext(Computer next) {
		this.next = next;
	}

	public Computer getPrevius() {
		return previus;
	}

	public void setPrevius(Computer previus) {
		this.previus = previus;
	}
}
