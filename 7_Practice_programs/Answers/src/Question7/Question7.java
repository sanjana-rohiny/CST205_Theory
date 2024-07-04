package Question7;

public class Question7 {
	static String dBase[][] = {{"1001", "Ashish", "01/04/2009", "e", "R&O", "20000", "8000", "3000"},
			{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
			{"1003", "Rahul",  "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
			{"1004", "Chahat", "12/11/2008", "r", "Front Desk", "12000", "6000", "2000"},
			{"1005", "Ranjan", "12/11/2008", "m", "Engg", "50000", "20000", "20000"}};


	static String daEmployee[][] = {{"e", "Engineer", "20000"},
			{"c", "Consultant", "32000"},
			{"k", "Clerk", "12000"},
			{"r", "Receptionist", "15000"},
			{"m", "Manager", "40000"}};

	public static void main(String args[]) {		
		if (args.length == 0) {
			System.out.println("Employee id missig: return...!");
			return;
		}

		String deptCode = ""; int eIndex = -1;
		for( int i=0; i<5; i++) {
			if (dBase[i][0].equals(args[0])) {
				deptCode = dBase[i][3]; 
				eIndex = i;
				break;
			}
		}
		if (eIndex < 0) {
			System.out.println("There is no employee with employee id " + args[0]);
			return;
		}

		int daIndex = -1;
		for (int i=0; i<5; i++) {
			if (daEmployee[i][0].equals(deptCode)) {
				daIndex = i;
				break;
			}
		}

		int netSal = Integer.parseInt(dBase[eIndex][5]) +
				Integer.parseInt(dBase[eIndex][6]) +
				Integer.parseInt(daEmployee[daIndex][2]) - 
				Integer.parseInt(dBase[eIndex][7]);

		System.out.println("Emp no" + " Emp Name " + " Department" + " Designation " + " Salary");
		System.out.println(dBase[eIndex][0] +"\t" + dBase[eIndex][1] +"\t" + 
				dBase[eIndex][4] + "\t" + daEmployee[daIndex][2] + "\t" + netSal);
	}
}
