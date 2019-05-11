package br.com.decolar.entities;

import java.util.ArrayList;
import java.util.List;

public class VooDto {
	private String requestid;
	private List<Voo> voos;
	
	public VooDto() {
		voos = new ArrayList<>();
	}
	
	public VooDto(String requestid, List<Voo> voos) {
		this.requestid = requestid;
		this.voos = voos;
	}

	public String getRequestid() {
		return requestid;
	}

	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

	public List<Voo> getVoos() {
		return voos;
	}

	public void setVoos(List<Voo> voos) {
		this.voos = voos;
	}
}