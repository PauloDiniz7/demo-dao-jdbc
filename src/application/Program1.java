package application;

import java.util.List;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program1 {
	public static void main(String[] args) {
		
	// criando um departamento (1, Books) e um vendedor (id = 21, Bob,...)	
	/*	Department obj = new Department (1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj );
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
						
		System.out.println(obj);	
		System.out.println("-------------------------");
		System.out.println(seller);	  */

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		//obter o vendedor de codigo (id) igual a 3
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

		//obter o vendedor do departamento igual a 2
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department (2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		//obter a relação de todos os vendedores classificados por nome
		System.out.println("\n=== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		//fazer uma inserção na tabela Seller
		System.out.println("\n=== TEST 4: seller insert ====="); 
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department); 
		sellerDao.insert(newSeller); 
		System.out.println("Inserted! New id = " + newSeller.getId()); 		 	 

	}
}
