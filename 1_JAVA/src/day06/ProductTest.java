package day06;
public class ProductTest {
	public static void main(String args[]) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		System.out.println("p1(serial no) " + p1.serialNo);
		System.out.println("p2(serial no) " + p2.serialNo);
		System.out.println("p3(serial no) " + p3.serialNo);
		System.out.println("총갯수  "+Product.count+"개입니다.");  
	}
}
class Product {
	static int count = 0;   
	int serialNo;	        

	{
		++count;
		serialNo = count;
	}

	public Product() {}     
}


