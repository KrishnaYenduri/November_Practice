package com.spring.boot.mini.jsp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "MOBILE")

public class Mobile {

	@Id
	@JsonProperty("id")
	private int id;

	@JsonProperty("model")
	private String model;

	@JsonProperty("brand")
	private String brand;

	@JsonProperty("intMem")
	private String intMem;

	@JsonProperty("isDualSim")
	private boolean isDualSim;

	public Mobile() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mobile(int id, String model, String brand, String intMem, boolean isDualSim) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.intMem = intMem;
		this.isDualSim = isDualSim;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getIntMem() {
		return intMem;
	}

	public void setIntMem(String intMem) {
		this.intMem = intMem;
	}

	public boolean isDualSim() {
		return isDualSim;
	}

	public void setDualSim(boolean isDualSim) {
		this.isDualSim = isDualSim;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", model=" + model + ", brand=" + brand + ", intMem=" + intMem + ", isDualSim="
				+ isDualSim + "]";
	}
}
