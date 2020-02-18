package application;

//import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
//import model.entities.Department;
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

		//obter o vendedor de codigo (id) igual a 3
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}
}
