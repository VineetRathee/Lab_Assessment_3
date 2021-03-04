package com.traineeApp.model.dao;

public class Trainee {
	private int id;
	private String name;
	private String branch;
	private Double percentage;
	public Trainee() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Trainee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", branch=");
		builder.append(branch);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append("]");
		return builder.toString();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public Trainee(int id, String name, String branch, Double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
	}
	public Trainee(String name, String branch, Double percentage) {
		super();
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
	}
	
	

}
