import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.lang.Object;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Student {
    private String firstName;
    private String lastName;
    private int peopleSoftId;
    private String classStanding;
    private String emailId;
    private String addressLine; //change back to an int and remove the gui portion of the code
    private String city;
    private String state;
    private int zipcode;
    private static int count = 0;
    public void getInfo(){
            System.out.println("Enter your First Name: ");
            Scanner firstNameInp = new Scanner(System.in);
            firstName = firstNameInp.nextLine();
//        firstName = JOptionPane.showInputDialog("Enter your first name:");
            while(!firstName.matches("[a-zA-Z]+")){
                System.out.println("Invalid entry, Please try again");
//                firstName = JOptionPane.showInputDialog("Enter your first name:");
                System.out.println("Enter your First Name: ");
                Scanner firstNameInp2 = new Scanner(System.in);
                firstName = firstNameInp2.nextLine();
            }

        System.out.println("Enter your Last Name: ");
        Scanner lastNameInp = new Scanner(System.in);
        lastName = lastNameInp.nextLine();
//        lastName = JOptionPane.showInputDialog("Enter your last name:");
        while(!lastName.matches("[a-zA-Z]+")){
            System.out.println("Invalid entry, Please try again!");
//            firstName = JOptionPane.showInputDialog("Enter your last name:");
            System.out.println("Enter your Last Name: ");
            Scanner lastNameInp2 = new Scanner(System.in);
            lastName = lastNameInp2.nextLine();
        }

        System.out.println("Enter your PeopleSoft ID: ");
        Scanner peopleSoftInp = new Scanner(System.in);
        peopleSoftId = peopleSoftInp.nextInt();
//        peopleSoftId = JOptionPane.showInputDialog("Enter you PeopleSoft ID");
        int peopleSoftLen = String.valueOf(peopleSoftId).length(); //gets the number of digits
        String numCheck = String.valueOf(peopleSoftId);

        while((!(peopleSoftLen <=7 || numCheck.matches("[0-9]")))){
            System.out.println("Invalid entry, Please enter 7 numbers or less.");
//            peopleSoftId = JOptionPane.showInputDialog("Enter you PeopleSoft ID");
            System.out.println("Enter you PeopleSoft ID: ");
            Scanner peopleSoftInp2 = new Scanner(System.in);
            peopleSoftId = peopleSoftInp2.nextInt();
            peopleSoftLen = String.valueOf(peopleSoftId).length();
        }

        System.out.println("Enter your standing class. freshmen, sophomore, junior, or senior: ");
        Scanner classStandingInp = new Scanner(System.in);
        classStanding = classStandingInp.nextLine();
//        peopleSoftId = JOptionPane.showInputDialog("Enter you standing class. Freshman, sophomore, junior or senior");
        while(!(classStanding.equals("freshmen") || classStanding.equals("sophomore") || classStanding.equals("junior") || classStanding.equals("senior"))){
            System.out.println("Invalid entry, please enter a valid class rank");
//            peopleSoftId = JOptionPane.showInputDialog("Enter you standing class. Freshman, sophomore, junior or senior");
            System.out.println("Enter your standing class. freshmen, sophomore, junior, or senior: ");
            Scanner classStandingInp2 = new Scanner(System.in);
            classStanding = classStandingInp2.nextLine();
        }

        System.out.println("Enter your Email: ");
        Scanner emailIdInp = new Scanner(System.in);
        emailId = emailIdInp.nextLine();
//        emailId = JOptionPane.showInputDialog("Enter you Email: ");
        while(!emailId.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            System.out.println("Invalid entry, Please try again!");
//            emailId = JOptionPane.showInputDialog("Enter you Email: ");
            System.out.println("Enter your Email: ");
            Scanner emailIdInp2= new Scanner(System.in);
            emailId = emailIdInp2.nextLine();
        }

        System.out.println("Enter your Street Address: ");
        Scanner addressLineInp = new Scanner(System.in);
         addressLine = addressLineInp.nextLine();
//        addressLine = JOptionPane.showInputDialog("Enter your Street Address: ");
        while (!addressLine.matches("^(?:[Pp][Oo]\\s[Bb][Oo][Xx]|[0-9]+)\\s(?:[0-9A-Za-z\\.'#]|[^\\S\\r\\n])+")){
            System.out.println("Invalid entry!, try again");
//            addressLine = JOptionPane.showInputDialog("Enter your Street Address: ");
            System.out.println("Enter Address:");
            Scanner addressLineInp2 = new Scanner(System.in);
            addressLine = addressLineInp2.nextLine();
        }

        System.out.println("Enter your city: ");
        Scanner cityInp = new Scanner(System.in);
        city = cityInp.nextLine();
//        city = JOptionPane.showInputDialog("Enter your city: ");
        while(!city.matches("[a-zA-Z]+")){
            System.out.println("Invalid entry, Please try again");
//            city = JOptionPane.showInputDialog("Enter your city: ");
            System.out.println("Enter your City: ");
            Scanner cityInp2 = new Scanner(System.in);
            city = cityInp2.nextLine();
        }


        System.out.println("Enter your state: ");
        Scanner stateInp = new Scanner(System.in);
        state = stateInp.nextLine().toUpperCase();
//        state = JOptionPane.showInputDialog("Enter your state: ");
        boolean key = true;
        while(key){
            String [] stateArray = {"AK","AL","AR","AZ","CA","CO","CT","DC","DE","FL","GA","HI","IA","ID","IL","IN","KS","KY","LA","MA","MD","ME","MI","MN","MO","MS","MT","NC","ND","NE","NH","NJ","NM","NV","NY","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VA","VT","WA","WI","WV","WY"};
            boolean stateCheck = Arrays.stream(stateArray).anyMatch(state::equals);
            while(!(stateCheck)){
                System.out.println("Invalid state, please try again");
//                state = JOptionPane.showInputDialog("Enter your state: ");
                System.out.println("Enter your state:");
                Scanner stateInp2 = new Scanner(System.in);
                state = stateInp2.nextLine().toUpperCase();
                stateCheck = Arrays.stream(stateArray).anyMatch(state::equals);
            }
            break;
        }

        System.out.println("Enter your Zipcode: ");
        Scanner zipCodeInp = new Scanner(System.in);
        zipcode = zipCodeInp.nextInt();
//        zipcode = JOptionPane.showInputDialog("Enter your zipcode: ");
        int ZipCodeLen = String.valueOf(zipcode).length();
        String ZipCodeCheck = String.valueOf(zipcode);
        while((!(ZipCodeLen == 9 || ZipCodeCheck.matches("[0-9]")))){
            System.out.println("Invalid entry, exactly 9 numbers");
            System.out.println("Enter your Zipcode");
//        zipcode = JOptionPane.showInputDialog("Enter your zipcode: ");
            Scanner zipCodeInp2 = new Scanner(System.in);
            zipcode = zipCodeInp2.nextInt();
            ZipCodeLen = String.valueOf(zipcode).length();

        }
    }

    public void displayInfo(){
        System.out.println("Students Details, Department of ILT");
        System.out.println("Name: " +firstName+" "+lastName);
        System.out.println("PeopleSoft ID: "+peopleSoftId);
        System.out.println("Class Standing: "+classStanding);
        System.out.println("Email: "+emailId);
        System.out.println("Address: "+addressLine+", "+city+", "+state+", "+zipcode);
        System.out.println("Number of student:" + Student.Count());
    }

    public static int Count(){
        count = count+1;
        return count;
    }
}
