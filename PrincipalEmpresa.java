package Agregacao;

public class PrincipalEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa empresa = new Empresa ("SENAI");
		Departamento departamento = new Departamento ( "RH");
		
		System.out.println("Empresa é:"+empresa.getNome()+ "\nDepartamento:" +departamento.getNome());
		}


	}

