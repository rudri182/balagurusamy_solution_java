import java.util.*;

class Rupee_Paise
{
	double rps ;
	int ps;
	
	public int paise()
	{
		ps = rps * 100;
		return ps ;
	}
}

class Main
{
	public static void main(String args[])
	{
		Rupee_Paise obj = new Rupee_Paise();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of rupees :");
		int p = sc.nextDouble();
		obj.paise();
		System.out.println("Rupees :" +p);
		sc.close();
		
	}
}
