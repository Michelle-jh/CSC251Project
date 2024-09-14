import java.util.Scanner;

public class Project_Michelle_Jhonson
{
   public static void main(String[] args)
   {
   
      Scanner keyboard = new Scanner(System.in);
      Policy policy = new Policy();//creating object for policy class
      
      //variables being declared
      int policyNum;
      int policyAge;
      String policyProviderName;
      String policyFName;
      String policyLName;
      String policyHStatus;
      double policyHHeight;
      double policyHWeight;
      double bodyMassIndex;
      double totalAmount;
      
      //asking the user of the program to input necessary values
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      policyProviderName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      policyFName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      policyLName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      policyAge = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      policyHStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      policyHHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      policyHWeight = keyboard.nextDouble();

      //seting all the inputs for the policy objects 
      policy.setPolicyNumber(policyNum);
      policy.setPolicyName(policyProviderName);
      policy.setPolicyHolderFName(policyFName);
      policy.setPolicyHolderLName(policyLName);
      policy.setPolicyHolderAge(policyAge);
      policy.setPolicySmokeStatus(policyHStatus);
      policy.setPolicyHolderHeight(policyHHeight);
      policy.setPolicyHolderWeight(policyHWeight);
      
      //calculating the BMI and the total amount with additional fees
      bodyMassIndex = policy.getBmi();
      totalAmount = policy.calcPolicyPrice(bodyMassIndex, policyHStatus, policyAge);
      
      //displaying the information about the policy
      System.out.println(" ");      
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getPolicyName());
      System.out.println("Policyholder's First Name: " + policy.getPolicyHolderFName());
      System.out.println("Policyholder's Last Name: " + policy.getPolicyHolderLName());
      System.out.println("Policyholder's Age: " + policy.getPolicyHolderAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getPolicySmokeStatus());
      System.out.println("Policyholder's Height: " + policy.getPolicyHolderHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getPolicyHolderWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", bodyMassIndex);
      System.out.printf("Policy Price: $ %.2f\n", totalAmount); 
   }
}