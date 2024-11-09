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
         
         // Create PolicyHolder object
         PolicyHolder policyHolder = new PolicyHolder(policyFName, policyLName, policyAge, policyHStatus, policyHHeight, policyHWeight);         
         
         //creating policy object
         Policy policy = new Policy(policyNum, policyProviderName, policyHolder);
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
         System.out.println(policy);
      }
      
      // Display number of smokers and non-smokers
      System.out.println("");

      System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
      System.out.println("Number of Smokers: " + smokerNum);
      System.out.println("Number of Non-Smokers: " + nonSmokerNum);
         
   }
}
