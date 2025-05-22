public class Product1{
	int id;
	double price;
	public Product1(int id,double price){
		this.id=id;
		this.price=price;
	}
	public Boolean isSame(Product1 p){
		return this.id==p.id;
	}
	public void test(){
		System.out.println("Product Id:"+id+"\t Product Price:"+price);
	}
	
	public static void main(String[] args){
		Product1 p1=new Product1(300,4000);
		Product1 p2=new Product1(900,8000);
		p1.test();
		p2.test();
		if(p1.isSame(p2)){
			System.out.println("Both Products are Same");
		}else{
			System.out.println("Both products are not Same");
		}
	}
}