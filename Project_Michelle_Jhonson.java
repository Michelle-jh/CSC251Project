import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Project_Michelle_Jhonson
{
   public static void main(String[] args) throws IOException
   {
      ArrayList<Policy> policies = new ArrayList<>();
      int smokerNum = 0;
      int nonSmokerNum = 0;
         
      
      File file = new File("PolicyInformation.txt");
      
      if (!file.exists())
      {
         System.out.println("Unable to open file. ");
         System.exit(0);
      }

      Scanner inputFile = new Scanner(file);//opening file
      
      
      //use a loop to process all the contents of the file
      while(inputFile.hasNext())
      {
         int policyNum = inputFile.nextInt();
         inputFile.nextLine();
         String policyProviderName = inputFile.nextLine();
         String policyFName = inputFile.nextLine();
         String policyLName = inputFile.nextLine();
         int policyAge = inputFile.nextInt();
         inputFile.nextLine();
         String policyHStatus = inputFile.nextLine(); 
         double policyHHeight = inputFile.nextDouble();
         double policyHWeight = inputFile.nextDouble();
         inputFile.nextLine();
         
         //creating policy object
         Policy policy = new Policy(policyNum, policyProviderName, policyFName, policyLName, policyAge, policyHStatus, policyHHeight, policyHWeight);
         policies.add(policy);
         
         //keeping track of the smokers and non-smokers 
         if(policyHStatus.equalsIgnoreCase("Smoker"))
         {
            smokerNum++;
         }
         else
         {
            nonSmokerNum++;
         }

      }
      
      inputFile.close();//closes the file after all the policies 
      
      //displaying the information for the policies 
      for(Policy policy : policies)
      {
         double bmi = policy.getBmi();
         double totalAmount = policy.calcPolicyPrice(bmi, policy.getPolicySmokeStatus(), policy.getPolicyHolderAge());
         
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getPolicyName());
         System.out.println("Policyholder's First Name: " + policy.getPolicyHolderFName());
         System.out.println("Policyholder's Last Name: " + policy.getPolicyHolderLName());
         System.out.println("Policyholder's Age: " + policy.getPolicyHolderAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getPolicySmokeStatus());
         System.out.println("Policyholder's Height: " + policy.getPolicyHolderHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getPolicyHolderWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", bmi);
         System.out.printf("Policy Price: $%.2f\n\n", totalAmount);
      }
      
      // Display number of smokers and non-smokers
      System.out.println("Number of Smokers: " + smokerNum);
      System.out.println("Number of Non-Smokers: " + nonSmokerNum);
         
   }
}
