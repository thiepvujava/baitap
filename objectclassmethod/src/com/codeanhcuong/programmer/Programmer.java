package com.codeanhcuong.programmer;

public class Programmer {

	private String name;
	private String programmingLanguage;
	private String job;
	  
	public Programmer(String name, String programmingLanguage, String job) {
		this.name = name;
		this.programmingLanguage = programmingLanguage;
		this.job = job;
	}
	
	public void information() {
		System.out.println("Name:" + name);
		System.out.println("programmingLanguage: " + programmingLanguage);
		System.out.println("job: " + job);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Programmer No1 = new Programmer("John" , "PHP" , "WebDeveloper");
No1.information();

Programmer No2 = new Programmer("Mark" , "Java" , "AndroidDeveloper");
No2.information();

Programmer No3 = new Programmer("Clark" , "Python" , "ebDeveloper");
No3.information();
	}

}
