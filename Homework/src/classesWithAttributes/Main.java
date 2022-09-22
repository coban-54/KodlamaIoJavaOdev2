package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product =  new Product(); //Bu parametresiz constructor
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(4000);
		product.setStockAmount(3);
		
		Product product2 = new Product(3,"Fotoğraf Makinesi","Güzel bir makine",1000,2);//Bu parametreli constructor
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		productManager.Add2(2, "", "", 2, 2);//Hatalı kullanıp iş methodu paramaetreye bağlı.
		productManager.Add(product2);
	}

}
