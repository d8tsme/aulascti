package model;

public class Computador {
	private int id;
	private String processador;
	private String tamRAM;
	private String tamHD;
	
	public Computador(int id, String processador, String tamRAM, String tamHD) {
		this.id = id;
		this.processador = processador;
		this.tamRAM = tamRAM;
		this.tamHD = tamHD;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getProcessador(){
		return processador;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public String getTamRAM() {
		return tamRAM;
	}
	
	public void setTamRAM(String tamRAM) {
		this.tamRAM = tamRAM;
	}
	
	public String getTamHD() {
		return tamHD;
	}
	
	public void setTamHD(String tamHD) {
		this.tamHD = tamHD;
	}
}
