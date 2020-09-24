package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();		
		
		System.out.println("=== TEST 1: seller by findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller by findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> sellers = sellerDao.findSellerByDepartment(department);
		
		for(Seller slr : sellers) {
			System.out.println(slr);
		}
		
		System.out.println("\n=== TEST 3: seller by findAll ===");
		List<Seller> sllrs = sellerDao.findAll();
		for(Seller slr : sllrs) {
			System.out.println(slr);
		}
		
		
		

	}

}
