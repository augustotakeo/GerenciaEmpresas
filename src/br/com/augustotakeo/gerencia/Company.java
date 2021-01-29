package br.com.augustotakeo.gerencia;

import java.util.Date;

public class Company {
	private static Integer numberOfCompanies = 0;
	
	private String name;
	private Date openingDate;
	private Integer id;
	
	public Company(Date openingDate) {
		this.id = Company.numberOfCompanies++;
		this.openingDate = openingDate;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getId() {
		return id;
	}


}
