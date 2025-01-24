package controller;

import java.time.LocalDate;
import java.util.List;

import bll.EmployeBLL;
import bo.Employe;
import exceptions.EmployeException;

public class TestPatternDAO {
	public static void main(String[] args) {
		EmployeBLL employeBLL = new EmployeBLL();
		
		//DELETE
		employeBLL.delete(13);

		
		//INSERT
		try {
			Employe employe = employeBLL.insert("Bosapin", "Edmond", LocalDate.of(1987, 5, 23), LocalDate.now(), 2000F);
			System.out.println("Insertion réussie :");
			System.out.println(employe);
		} catch (EmployeException e) {
			System.err.println("La création de l'employé à échoué :");
			System.err.println(e.getMessage());
		}
		
		//SELECT
		//List<Employe> employes = employeBLL.select();
		//System.out.println(employes.toString().replace("[", "").replace(", ", "").replace("]", ""));
		
		List<Employe> employes = employeBLL.select();
		for (Employe current : employes) {
			System.out.print(current);
		}
		
		//UPDATE
		Employe firstOne = employes.get(0);
		firstOne.setNom("Tournera");
		firstOne.setSalaire(5200F);
		try {
			employeBLL.update(firstOne);
		} catch (EmployeException e) {
			System.err.println("La mise à jour de l'employé à échoué :");
			System.err.println(e.getMessage());
		}
		
		//SELECT AGAIN (to show updated line)
		employes = employeBLL.select();
		for (Employe current : employes) {
			System.out.print(current);
		}
	}
}
