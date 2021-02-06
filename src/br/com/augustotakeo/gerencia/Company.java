package br.com.augustotakeo.gerencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Company {
	private static Integer numberOfCompanies = 0;
	
	private static List<Company> companies = new ArrayList();
	
	private String name;
	private Date openingDate;
	private String owner;
	private String cnpj;
	private Integer numCollaborator;
	private List<Collaborator> collaborators = new ArrayList();
	
	public Company(String name, Date openingDate, String owner, String cnpj, Integer numCollaborator) {
		this.name = name;
		this.openingDate = openingDate;
		this.owner = owner;
		this.cnpj = cnpj;
		this.numCollaborator = numCollaborator;
		
		companies.add(this);
	}
	
	public void addCollaborator(Collaborator collaborator) {
		collaborators.add(collaborator);
	}
	
	

}
