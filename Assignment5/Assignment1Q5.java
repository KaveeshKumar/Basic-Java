import java.util.Scanner;
public class Assignment1Q5{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Please enter your Ctc");
		int ctc = sc.nextInt();
		System.out.print("your income tax is :"+TaxAmount.calculateTaxAmount(ctc));
	}
}

 
