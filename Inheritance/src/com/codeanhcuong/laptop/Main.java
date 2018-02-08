package com.codeanhcuong.laptop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		No1 no1 = new No1("Asus", "USA" , 200);
		no1.information();
		no1.information(6);
		no1.design();
		
		No2 no2 = new No2("Dell" , "China" , 100);
		no2.information();
		no2.information(7);
		no2.design();
		
		No3 no3 = new No3("Hyper" , "Australia" , 300);
		no3.information();
	    no3.information(5);
	    no3.design();
	}
	

}
