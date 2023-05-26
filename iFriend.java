import java.util.*;
import java.time.LocalDate;

class iFriend {
	public static String [] contactIdArray =  new String [0];
	public static String [] nameArray =  new String [0];
	public static String [] phoneNumberArray =  new String [0];
	public static String [] companyArray =  new String [0];
	public static double [] salaryArray =  new double [0];
	public static String [] birthdayArray =  new String [0];
	public static int idNum = 1001;

//-----------------------------------------------Sort by Name--------------------------------------------------------

	public static void sortbyName(){
		Scanner input = new Scanner (System.in);
		boolean sorted;
		for(int i=0; i<nameArray.length;i++){
			sorted = false;
			for(int j=0;j<(nameArray.length-1)-i;j++){
				if(nameArray[j].compareTo(nameArray[j+1]) > 0){
					String temp = nameArray[j];
					nameArray[j]=nameArray[j+1];
					nameArray[j+1]=temp;
					
					String temp2 = contactIdArray[j];
					contactIdArray[j]=contactIdArray[j+1];
					contactIdArray[j+1]=temp2;
					
					String temp3 = phoneNumberArray[j];
					phoneNumberArray[j]=phoneNumberArray[j+1];
					phoneNumberArray[j+1]=temp3;
					
					String temp4 = companyArray[j];
					companyArray[j]=companyArray[j+1];
					companyArray[j+1]=temp4;
					
					double temp5 = salaryArray[j];
					salaryArray[j]=salaryArray[j+1];
					salaryArray[j+1]=temp5;
					
					String temp6 = birthdayArray[j];
					birthdayArray[j]=birthdayArray[j+1];
					birthdayArray[j+1]=temp6;
					
					sorted =true;
					}
				
				}
				if(!sorted){
					break;
					}
				}
		
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                        List Contact by Name                                                  |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		
		
						
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("|  Contact ID\t|\t Name   \t|\tPhone Number\t|\t Company  \t|\tSalary   \t|\tBirth Day   |");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		
		for(int i=0;i<nameArray.length;i++){
				System.out.println("|   " + contactIdArray[i]+"   \t|\t "+ nameArray[i] +"  \t|\t "+ phoneNumberArray[i]+" \t|\t  "+ companyArray[i]+"  \t|\t "+ salaryArray[i]+ " \t|\t"+ birthdayArray[i] + "  | ");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
			}
		
		System.out.println("\n");
		System.out.print("Do you want to go Home Page ?(Y/N) : ");
			String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						homePage();
						}else{
							clearConsole();
							listContacts();
							}
		
		}
		
//-----------------------------------------------Sort by Salary--------------------------------------------------
	public static void sortbySalary(){
		Scanner input = new Scanner (System.in);
		boolean sorted;
		for(int i=0; i<nameArray.length;i++){
			sorted = false;
			for(int j=0;j<(nameArray.length-1)-i;j++){
				if(salaryArray[j]>(salaryArray[j+1])){
					double temp = salaryArray[j];
					salaryArray[j]=salaryArray[j+1];
					salaryArray[j+1]=temp;
					
					String temp2 = contactIdArray[j];
					contactIdArray[j]=contactIdArray[j+1];
					contactIdArray[j+1]=temp2;
					
					String temp3 = phoneNumberArray[j];
					phoneNumberArray[j]=phoneNumberArray[j+1];
					phoneNumberArray[j+1]=temp3;
					
					String temp4 = companyArray[j];
					companyArray[j]=companyArray[j+1];
					companyArray[j+1]=temp4;
					
					String temp5 = nameArray[j];
					nameArray[j]=nameArray[j+1];
					nameArray[j+1]=temp5;
					
					String temp6 = birthdayArray[j];
					birthdayArray[j]=birthdayArray[j+1];
					birthdayArray[j+1]=temp6;
					
					sorted =true;
					}
				
				}
				if(!sorted){
					break;
					}
				}
		
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                        List Contact by Salary                                                |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		
		
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("|  Contact ID\t|\t Name   \t|\tPhone Number\t|\t Company  \t|\tSalary   \t|\tBirth Day   |");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		
		for(int i=0;i<nameArray.length;i++){
				System.out.println("|   " + contactIdArray[i]+"   \t|\t "+ nameArray[i] +"  \t|\t "+ phoneNumberArray[i]+" \t|\t  "+ companyArray[i]+"  \t|\t "+ salaryArray[i]+ " \t|\t"+ birthdayArray[i] + "  | ");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
			}
			
		System.out.println("\n");
		System.out.print("Do you want to go Home Page ?(Y/N) : ");
			String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						homePage();
						}else{
							clearConsole();
							listContacts();
							}
		
		
		}
//-----------------------------------------Sort by Birthday--------------------------------------------------
	
	public static void sortbyBirthday(){
		Scanner input = new Scanner (System.in);
		boolean sorted;
		for(int i=0; i<birthdayArray.length;i++){
			sorted = false;
			for(int j=0;j<(birthdayArray.length-1)-i;j++){
				if(birthdayArray[j].compareTo(birthdayArray[j+1]) > 0){
					String temp = birthdayArray[j];
					birthdayArray[j]=birthdayArray[j+1];
					birthdayArray[j+1]=temp;
					
					String temp2 = contactIdArray[j];
					contactIdArray[j]=contactIdArray[j+1];
					contactIdArray[j+1]=temp2;
					
					String temp3 = phoneNumberArray[j];
					phoneNumberArray[j]=phoneNumberArray[j+1];
					phoneNumberArray[j+1]=temp3;
					
					String temp4 = companyArray[j];
					companyArray[j]=companyArray[j+1];
					companyArray[j+1]=temp4;
					
					double temp5 = salaryArray[j];
					salaryArray[j]=salaryArray[j+1];
					salaryArray[j+1]=temp5;
					
					String temp6 = nameArray[j];
					nameArray[j]=nameArray[j+1];
					nameArray[j+1]=temp6;
					
					sorted =true;
					}
				
				}
				if(!sorted){
					break;
					}
				}
		
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                        List Contact by Birthday                                              |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		
		
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("|  Contact ID\t|\t Name   \t|\tPhone Number\t|\t Company  \t|\tSalary   \t|\tBirth Day   |");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		
		for(int i=0;i<nameArray.length;i++){
				System.out.println("|   " + contactIdArray[i]+"   \t|\t "+ nameArray[i] +"  \t|\t "+ phoneNumberArray[i]+" \t|\t  "+ companyArray[i]+"  \t|\t "+ salaryArray[i]+ " \t|\t"+ birthdayArray[i] + "  | ");
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
			}
			
		System.out.println("\n");
		System.out.print("Do you want to go Home Page ?(Y/N) : ");
			String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						homePage();
						}else{
							clearConsole();
							listContacts();
							}
		
		
		}
	
	
//------------------------------------------------Delete----------------------------------------------------
	public static void deleteExistingContact(int index){
		for(int i=index; i<nameArray.length-1; i++){
			contactIdArray[i] = contactIdArray[i+1];
			nameArray[i] = nameArray[i+1];
			phoneNumberArray[i] = phoneNumberArray[i+1];
			companyArray[i] = companyArray[i+1];
			salaryArray[i] = salaryArray[i+1];
			birthdayArray[i] = birthdayArray[i+1];
			
			}
		contactIdArray=decreasedStringArray(contactIdArray);
		nameArray=decreasedStringArray(nameArray);
		phoneNumberArray=decreasedStringArray(phoneNumberArray);
		companyArray=decreasedStringArray(companyArray);
		salaryArray=decreasedDoubleArray(salaryArray);
		birthdayArray=decreasedStringArray(birthdayArray);
		}
	
//--------------------------------------------Search Contact----------------------------------------------	
	public static int searchContact(String detail){
		for(int i=0;i<nameArray.length;i++){
			if( (nameArray[i].equalsIgnoreCase(detail)) || (phoneNumberArray[i].equalsIgnoreCase(detail)) ){
					return i;
				
				}
			
			}return -1;
		
		
		}

//------------------------------------------Is Valid Birth Day---------------------------------------------

public static boolean isInvalidBirthday(String birthDay){
	        LocalDate currentDate = LocalDate.now();
            LocalDate date = LocalDate.parse(birthDay);
          
            if(date.isAfter(currentDate)){
				return true;
				}else{
					return false;
					}
	}
	
//----------------------------------------Is Valid Phone Number--------------------------------------------
public static boolean isNotValid(String number){
		if((number.charAt(0)!='0') || ( number.length() != 10) ){
			return true;
			}else{
				return false;
				}
	
	} 	
	
	
//------------------------------------------Extend Arrays--------------------------------------------------

public static String[] extendStringArray(String [] arr, String x){
	String [] temp = new String [arr.length+1];
	for(int i=0;i<arr.length;i++){
		temp[i]=arr[i];
		}
		temp[temp.length-1]=x;
		arr = temp;
		return temp;
	}	
	
	
	public static double[] extendDoubleArray(double [] arr, double x){
	double [] temp = new double [arr.length+1];
	for(int i=0;i<arr.length;i++){
		temp[i]=arr[i];
		}
		temp[temp.length-1]=x;
		arr = temp;
		return arr;
	}	
	
//------------------------------------------Decreased Arrays--------------------------------------------------
public static String[] decreasedStringArray(String [] arr){
	String [] temp = new String [arr.length-1];
	for(int i=0;i<temp.length;i++){
		temp[i]=arr[i];
		}
		
		arr = temp;
		return temp;
	}
	
	
public static double[] decreasedDoubleArray(double [] arr ){
	double [] temp = new double [arr.length-1];
	for(int i=0;i<temp.length;i++){
		temp[i]=arr[i];
		}
		
		arr = temp;
		return arr;
	}	
	
//---------------------------------------Clear the Command Line-------------------------------------------

 
	public final static void clearConsole() {
 try {
 final String os = System.getProperty("os.name");
 if (os.contains("Windows")) {
 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
 } else {
     System.out.print("\033[H\033[2J");
     System.out.flush();
}
} catch (final Exception e) {
e.printStackTrace();

}
}
	
//----------------------------------------------Home Page--------------------------------------------------

	public static void homePage(){
		System.out.println("");
		System.out.println("\t\t\t\t\t/$$ /$$$$$$$$ /$$$$$$$  /$$$$$$ / $$$$$$$$  /$$   /$$  /$$$$$$$");
		System.out.println("\t\t\t\t\t|__/| $$_____/| $$_ $$|_    $__/| $$______/| $$$ |  $$|  $$__   $$");
		System.out.println("\t\t\t\t\t /$$| $$      | $$ \\ $$ |	| $$       | $$  | $$$|  $$   \\ $$   ");
		System.out.println("\t\t\t\t\t| $$| $$$$    | $$$$$$/ |  $$   | $$$$     | $$ $$  $$|  $$    |$$");
		System.out.println("\t\t\t\t\t| $$| $$_/    | $$_  $$ |  $$   | $$_/     | $$   $$$$|  $$    |$$");
		System.out.println("\t\t\t\t\t| $$| $$      | $$ \\ $$ |  $$   | $$       | $$\\   $$$|  $$    |$$");
		System.out.println("\t\t\t\t\t| $$| $$      | $$ | $$/$$$$$$  | $$$$$$$$ | $$ \\   $$|  $$$$$$$/");
		System.out.println("\t\t\t\t\t|__/ |__/     |__/ |__/|______/ |_________/|__/  \\___/|________/");
		
	System.out.println("\n");
	 String heading = "  -----  ----  -  -  -----    -      -----  -----   ----         -----   ----       ------          -        -   -   -----   -----   -----    ----         \n"+
                      " |      |    | |\\ |    |    /___\\   |         |   |             |     |  |____|   |    ____       /___\\      |\\  |     |        /   | ____   |    |      \n"+
                      " |   	|    | | \\|    |   /     \\  |         |   -----         |     |  |   \\    |   |____      /     \\     | \\ |     |       /    |        |----           \n"+
                      "  -----	 ----  -  -    -  -       -  -----    -   _____|         -----   |    \\   | ______ /    _       _    _   _   _____    _____  _____   |    \\             \n";
        System.out.print(heading);
        System.out.println("\n");
        System.out.println("====================================================================================================================================================");
        
        System.out.print("\t\t[1] ADD Contacts ");
        System.out.println("\t\t\t[2] UPDATE Contacts \n ");
		System.out.print("\t\t[3] DELETE Contacts ");
		System.out.println("\t\t\t[4] SEARCH Contacts \n ");
		System.out.print("\t\t[5] LIST Contacts ");
		System.out.println("\t\t\t[6] Exit ");
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n");
		System.out.print("Enter an option to continue -> ");
		int option = input.nextInt();
		
		clearConsole();
		
		switch (option) {
			
			case 1 : addContacts();break;
			case 2 : updateContacts();break;
			case 3 : deleteContacts();break;
			case 4 : searchContacts();break;
			case 5 : listContacts();break;
			case 6 : exit();break;
			default: System.out.println ("Invalid Input..");
			
			}
		
		
	}
		public static void main(String args[]){
			homePage();
			
			}
			
//----------------------------------------------ADD Contacts--------------------------------------------------
	public static void addContacts(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                        ADD Contact to the list                                               |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		
		String contactId = "C"+idNum;
		System.out.println(" "+contactId);
		System.out.println("=======");
		idNum++;
		
		contactIdArray=extendStringArray(contactIdArray,contactId);
		
		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.print("Name			: ");
		String name = input.next();
		nameArray=extendStringArray(nameArray,name);
		
		System.out.print("Phone Number		: ");
		String number = input.next();
		while(isNotValid(number)){
			System.out.println("\t Invalid phone number...\n");
			System.out.print("Do you want to add phone number again ? (Y/N) : ");
			String answer = input.next();
			String option = "Y";
					if(answer.equalsIgnoreCase(option)){
							System.out.print("\033[4A");
							System.out.print("\033[0J");
							System.out.print("Phone Number		: ");
							number = input.next();
						}else{
							clearConsole();
							homePage();
							break;
							
							}
			}
		phoneNumberArray=extendStringArray(phoneNumberArray,number);
		
				
				
		System.out.print("Company Name		: ");
		String company = input.next();
		companyArray=extendStringArray(companyArray,company);
		
		System.out.print("Salary			: ");
		double Salary = input.nextDouble();
		while(Salary<0){
			System.out.println("\t Invalid salary...\n");
			System.out.print("Salary			: ");
			 Salary = input.nextDouble();
			}
		salaryArray=extendDoubleArray(salaryArray,Salary);
		
		System.out.print("B' Day(YYYY-MM-DD)	: ");
		String birthDay = input.next();
		while(isInvalidBirthday(birthDay)){
				System.out.println("\t Invalid birth day...\n");
			System.out.print("Do you want to add birthday again ? (Y/N) : ");
			String answer = input.next();
			String option = "Y";
					if(answer.equalsIgnoreCase(option)){
							System.out.print("\033[4A");
							System.out.print("\033[0J");
							System.out.print("B' Day(YYYY-MM-DD)	: ");
							birthDay = input.next();
						}else{
							clearConsole();
							homePage();
							break;
							}
						}
		birthdayArray=extendStringArray(birthdayArray,birthDay);
		
		System.out.println("");
		System.out.println("\t Contact has been added successfully.. \n");
		System.out.print("Do you want to add another contact ? (Y/N) : ");
		String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						addContacts();
						}else{
							clearConsole();
							homePage();
							}
		
	}
//----------------------------------------------UPDATE Contacts--------------------------------------------------
	public static void updateContacts(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                                  UPDATE Contact                                              |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");

	Scanner input = new Scanner(System.in);
 System.out.print("Search Contact by Name or Phone Number - ");
 String detail = input.next();
	
	int index = searchContact(detail);
		if(index == -1){
			System.out.println ("Entered Name/Contact Number not in the system, Please try again with different Name/Contact Number..");
				clearConsole();
				updateContacts();
			}else{
				System.out.println("\n");
				System.out.println("Contact ID		: "+contactIdArray[index]);
				System.out.println("Name			: "+nameArray[index]);
				System.out.println("Phone Number		: "+phoneNumberArray[index]);
				System.out.println("Company Name		: "+companyArray[index]);
				System.out.println("Salary			: "+salaryArray[index]);
				System.out.println("B'Day(YYYY-MM-DD)	: "+birthdayArray[index]);
				
				
				}
				System.out.println("\n");
		
		System.out.println("What do you want to update..... \n");
		
		System.out.println("\t[1] Name ");
        System.out.println("\t[2] Phone Number  ");
		System.out.println("\t[3] Company Name ");
		System.out.println("\t[4] Salary  ");
		
		System.out.print("\n");
		System.out.print("Enter an option to continue : ");
		System.out.print("");
		int option = input.nextInt();
		System.out.print("\033[3A");
		System.out.print("\033[0J");
		
		switch (option) {
			
			case 1 : updateName(index);break;
			case 2 : updatePhoneNumber(index);break;
			case 3 : updateCompanyName(index);break;
			case 4 : updateSalary(index);break;
			default: System.out.println ("Invalid Input..");
		}
	}
		
//---------------------------------Update Name-------------------------------------
	public static void updateName(int index){
		Scanner input = new Scanner(System.in);
		System.out.print("\n");
		System.out.println(" Update Name ");
		System.out.println("==============");
		System.out.println("\n");
		System.out.print("Input new name - ");
		String newName = input.next();
		
		nameArray[index] = newName;
		System.out.print("\n");
		System.out.println("\t Contact has been update successfully.. \n");
		System.out.print("Do you want to update another contact (Y/N) : ");
		
		String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						updateContacts();
						}else{
							clearConsole();
							homePage();
							}
	
	}
//---------------------------------Update Phone Number-------------------------------------
	public static void updatePhoneNumber(int index){
		Scanner input = new Scanner(System.in);
		System.out.print("\n");
		System.out.println(" Update Phone Number ");
		System.out.println("=====================");
		System.out.println("\n");
		System.out.print("Input new Phone Number - ");
		String newNumber = input.next();
		while(isNotValid(newNumber)){
			System.out.println("\t Invalid phone number...\n");
			System.out.print("Do you want to add phone number again ? (Y/N) : ");
			String answer = input.next();
			String option = "Y";
					if(answer.equalsIgnoreCase(option)){
							System.out.print("\033[3A");
							System.out.print("\033[0J");
							System.out.print("Phone Number		: ");
							newNumber = input.next();
						}else{
							clearConsole();
							homePage();
							break;
							
							}
			}
		
		phoneNumberArray[index] = newNumber;
		
		System.out.print("\n");
		System.out.println("\t Contact has been update successfully.. \n");
		System.out.print("Do you want to update another contact (Y/N) : ");
		
		String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						updateContacts();
						}else{
							clearConsole();
							homePage();
							}
	
	}
	
//---------------------------------Update Company Name-------------------------------------
	public static void updateCompanyName(int index){
		Scanner input = new Scanner(System.in);
		System.out.print("\n");
		System.out.println(" Update Company Name ");
		System.out.println("=====================");
		System.out.println("\n");
		System.out.print("Input New Company Name - ");
		String newCompany = input.next();
		
		companyArray[index] = newCompany;
		
		System.out.print("");
		System.out.println("\t Contact has been update successfully.. \n");
		System.out.print("Do you want to update another contact (Y/N) : ");
		
		String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						updateContacts();
						}else{
							clearConsole();
							homePage();
							}
	
	}
	
	//---------------------------------Update Salary-------------------------------------
	public static void updateSalary(int index){
		Scanner input = new Scanner(System.in);
		System.out.print("\n");
		System.out.println(" Update Salary ");
		System.out.println("==================");
		System.out.println("\n");
		System.out.print("Input New Salary - ");
		double newSalary = input.nextInt();
		
		
		salaryArray[index] = newSalary;
		
		System.out.print("\n");
		System.out.println("\t Contact has been update successfully.. \n");
		System.out.print("Do you want to update another contact (Y/N) : ");
		
		String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						updateContacts();
						}else{
							clearConsole();
							homePage();
							} 
	
	}
	
	//---------------------------------DELETE Contacts-------------------------------------
		public static void deleteContacts(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                                  DELETE Contact                                              |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		
		
	Scanner input = new Scanner(System.in);
	String detail;
 System.out.print("If search Contact by Name enter : 1 ,If search Contact by Phone Number enter : 2  -> ");
 int ele = input.nextInt();
 System.out.println("\n");
 if(ele==2){
	 System.out.print("Enter phone number :  ");
	 detail = input.next();
	 while(isNotValid(detail)){
			System.out.println("\t Invalid phone number...\n");
			System.out.print("Do you want to add phone number again ? (Y/N) : ");
			String answer = input.next();
			String option = "Y";
					if(answer.equalsIgnoreCase(option)){
							System.out.print("\033[3A");
							System.out.print("\033[0J");
							System.out.print("Phone Number		: ");
							detail = input.next();
						}else{
							clearConsole();
							deleteContacts();
							break;
							
							}
					}
	 
				}else{
						System.out.print("Enter name :  ");
						detail = input.next();
						
					}
				int index = searchContact(detail);
			if(index == -1){
			System.out.println ("Entered Name/Contact Number not in the system, Please try again with different Name/Contact Number..");
			System.out.println("\t Press any key to continue...");
			String key = input.next();
				clearConsole();
				deleteContacts();
			}else{
				System.out.println("\n");
				System.out.println("Contact ID		: "+contactIdArray[index]);
				System.out.println("Name			: "+nameArray[index]);
				System.out.println("Phone Number		: "+phoneNumberArray[index]);
				System.out.println("Company Name		: "+companyArray[index]);
				System.out.println("Salary			: "+salaryArray[index]);
				System.out.println("B'Day(YYYY-MM-DD)	: "+birthdayArray[index]);
				
				}	
		System.out.println("\n");
		System.out.print("Do you want to delete this contact?  (Y/N) : ");
		
		String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						deleteExistingContact(index);
						System.out.println("\n");
						System.out.print("\t Customer has been deleted successfully...\n");
						System.out.println("\n");
						System.out.print("Do you want to delete another contact? (Y/N) : ");
						String answer2 = input.next();
						String option2 = "Y";
						if(answer2.equalsIgnoreCase(option2)){
							clearConsole();
							deleteContacts();
							}else{
								homePage();
								}
						}else{
							clearConsole();
							deleteContacts();
							}
	}

//------------------------------------SEARCH contacts----------------------------------------
	
	public static void searchContacts(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                                  SEARCH Contact                                              |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
	
			
	Scanner input = new Scanner(System.in);
	String detail;
 System.out.print("If search Contact by Name enter : 1 ,If search Contact by Phone Number enter : 2  -> ");
 int ele = input.nextInt();
 System.out.println("\n");
 if(ele==2){
	 System.out.print("Enter phone number :  ");
	 detail = input.next();
	 while(isNotValid(detail)){
			System.out.println("\t Invalid phone number...\n");
			System.out.print("Do you want to add phone number again ? (Y/N) : ");
			String answer = input.next();
			String option = "Y";
					if(answer.equalsIgnoreCase(option)){
							System.out.print("\033[3A");
							System.out.print("\033[0J");
							System.out.print("Phone Number		: ");
							detail = input.next();
						}else{
							clearConsole();
							homePage();
							break;
							
							}
					}
	 
				}else{
						System.out.print("Enter name :  ");
						detail = input.next();
						
					}
				int index = searchContact(detail);
				System.out.print("\n");
			if(index == -1){
			System.out.println ("Entered Name/Contact Number not in the system, Please try again with different Name/Contact Number..");
			System.out.print("\n");
			System.out.print("Do you want to search again ? (Y/N) :  ");
			String answer = input.next();
				String option = "Y";
					if(answer.equalsIgnoreCase(option)){
							clearConsole();
							searchContacts();
							
						}else{
							clearConsole();
							homePage();
						}
			
				clearConsole();
				searchContacts();
			}else{
				System.out.println("\n");
				System.out.println("Contact ID		: "+contactIdArray[index]);
				System.out.println("Name			: "+nameArray[index]);
				System.out.println("Phone Number		: "+phoneNumberArray[index]);
				System.out.println("Company Name		: "+companyArray[index]);
				System.out.println("Salary			: "+salaryArray[index]);
				System.out.println("B'Day(YYYY-MM-DD)	: "+birthdayArray[index]);
				
				}	
		System.out.println("\n");
		System.out.print("Do you want to search another contact? (Y/N) : ");
						String answer2 = input.next();
						String option2 = "Y";
						if(answer2.equalsIgnoreCase(option2)){
							clearConsole();
							searchContacts();
							}else{
								clearConsole();
								homePage();
								}
	}
//------------------------------------LIST Contacts--------------------------------

	public static void listContacts(){
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		System.out.println ("                     |                                                  List Contact                                                |");
		System.out.println ("                     +--------------------------------------------------------------------------------------------------------------+");
		
		System.out.println("\n");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t[1] Sorting by Name ");
        System.out.println("\t[2] Sorting by Salary  ");
		System.out.println("\t[3] Sorting by Birthday ");
		
		System.out.print("\n");
		System.out.print("Enter an option to continue : ");
		int option = input.nextInt();
		clearConsole();
		System.out.print("\n");
		
		switch (option) {
			
			case 1 : sortbyName();break;
			case 2 : sortbySalary();break;
			case 3 : sortbyBirthday();break;
			default: System.out.println ("Invalid Input..");
		}

		}
	public static void exit(){
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want to exit from the system ? (Y/N) : ");
			String answer = input.next();
					String option = "Y";
					if(answer.equalsIgnoreCase(option)){
						clearConsole();
						}else{
							clearConsole();
							homePage();
							}
		
		
		
		}
		
}
