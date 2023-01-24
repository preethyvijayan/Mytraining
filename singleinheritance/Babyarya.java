package singleinheritance;

public class Babyarya extends Father {

	public static void main(String[] args) {
		System.out.println("Features of Baby arya ");
		Babyarya obj=new Babyarya();
		obj.color();
		obj.hair();
		obj.height();

	}
	public void height()
	{
		System.out.println("160 cm");
	}

}
