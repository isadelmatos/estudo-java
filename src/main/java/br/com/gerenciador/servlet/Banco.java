package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaDeEmpresas = new ArrayList<Empresa>();
	private static int chaveSequencial = 1;
	
	/*static {
		Empresa empresa1 = new Empresa();
		empresa1.setNome("Alura");
		listaDeEmpresas.add(empresa1);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		listaDeEmpresas.add(empresa2);
	}*/
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		listaDeEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.listaDeEmpresas;
	}
	
	public Empresa getEmpresa(int id) {
		Empresa emp = null;
		
		for (Empresa empresa : listaDeEmpresas) {
			if(empresa.getId() == id) {
				emp = empresa;
				break;
			}
		}
		
		return emp;
	}
	
	public void removerEmpresa(int id) {
		Empresa empresaARemover = this.getEmpresa(id);
		Banco.listaDeEmpresas.remove(empresaARemover);
	}
}
