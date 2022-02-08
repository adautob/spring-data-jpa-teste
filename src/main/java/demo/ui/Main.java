package demo.ui;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.entities.Product;
import demo.services.ProductService;

public class Main {

	public static void main(String[] args) {
		
		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			ProductService productService = (ProductService) ctx.getBean("productService");
			
			for (Product product : productService.findAll()) {
				
				System.out.println("Id: " + product.getId());
				System.out.println("Name: " + product.getName());
				System.out.println("Price: " + product.getPrice());
				System.out.println("================");
				
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao iniciar");
			e.printStackTrace();
		}

	}

}
