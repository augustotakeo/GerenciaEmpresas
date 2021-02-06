package br.com.augustotakeo.gerencia;

public class Collaborator {
	
	private String name;
	private String cpf;
	private String role;
	private double salary;
	
	public Collaborator(String name, String cpf, String cargo, double salario) {
		this.name = name;
		this.cpf = cpf;
		this.role = cargo;
		this.salary = salario;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getCargo() {
		return role;
	}

}
