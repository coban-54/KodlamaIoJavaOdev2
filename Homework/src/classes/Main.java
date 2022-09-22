package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//Deger tip
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2=sayi1;
		sayi1 = 30;
		System.out.println(sayi2);//?10
		
		int[] sayilar1 = new int[]{1,2,3,4,5};
		int[] sayilar2 = new int[]{70,10,30,40,50};
		sayilar2 = sayilar1;
		sayilar1 [0] = 10;
		System.out.println(sayilar2[0]);//10 Arrayler referans tiptir.
	}

}