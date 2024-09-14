public class Policy
{
   //data fields or attributes
   private int policyNumber;
   private String policyName;
   private String policyHolderFName;
   private String policyHolderLName;
   private int policyHolderAge;
   private String policySmokeStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   /**
   no-arg constructor that initializes the policy attributes
   */
   public Policy()
   {
      policyNumber = 0;
      policyName = "  ";
      policyHolderFName = "  ";
      policyHolderLName = "  ";
      policyHolderAge = 0;
      policySmokeStatus = "  ";
      policyHolderHeight = 0;
      policyHolderWeight = 0;
   }
   
    /**
   Constructor that initializes attributes to the value of the argument it is 
   @param policyNum is the policy number
   @param policyProviderName is the policy provider name 
   @param policyFName is holders first name
   @param policyLName is holders last name
   @param policyAge the holders age
   @param policyHStatus is the holders smoking status
   @param policyHHeight the height of the holder
   @param policyHWeight the weight of the holder
   */

   public Policy(int policyNum, String policyProviderName, String policyFName, String policyLName, int policyAge, String policyHStatus, double policyHHeight, double policyHWeight)
   {
      policyNumber = policyNum;
      policyName = policyProviderName;
      policyHolderFName = policyFName;
      policyHolderLName = policyLName;
      policyHolderAge = policyAge;
      policySmokeStatus = policyHStatus;
      policyHolderHeight = policyHHeight;
      policyHolderWeight = policyHWeight;
   }
   // setter and getter methods 
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public void setPolicyNumber(int policyNum)
   {
      policyNumber = policyNum;
   }
   
   public String getPolicyName()
   {
      return policyName;
   }
   
   public void setPolicyName(String policyProviderName)
   {
      policyName = policyProviderName;
   }
   
   public String getPolicyHolderFName()
   {
      return policyHolderFName;
   }
   
   public void setPolicyHolderFName(String policyFName)
   {
      policyHolderFName = policyFName;
   }
   
   public String getPolicyHolderLName()
   {
      return policyHolderLName;
   }
   
   public void setPolicyHolderLName(String policyLName)
   {
      policyHolderLName = policyLName;
   }
   
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   public void setPolicyHolderAge(int policyAge)
   {
      policyHolderAge = policyAge;
   }
   
   public String getPolicySmokeStatus()
   {
      return policySmokeStatus;
   }
   public void setPolicySmokeStatus(String policyHStatus)
   {
      policySmokeStatus = policyHStatus;
   }
   
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   public void setPolicyHolderHeight(double policyHHeight)
   {
      policyHolderHeight = policyHHeight;
   } 
   
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   
   public void setPolicyHolderWeight(double policyHWeight)
   {
      policyHolderWeight = policyHWeight;
   }
   /*
   calculates the BMI
   */
   public double getBmi()
   {
      double bmi =(policyHolderWeight * 703)/(policyHolderHeight* policyHolderHeight);
      return bmi;
   }
   /*
   calculates the total policy price along with additional fees 
   @param bmi is the claculation of the body mass index
   @param holders somker status 
   @param the holders age
   */
   public double calcPolicyPrice(double bmi, String policyHStatus, int policyAge)
   {
      double totalAmt = 600;
      
      if(policyAge > 50)
      {
         totalAmt += 75;
      }
      
      if(policyHStatus.equalsIgnoreCase("Smoker"))
      {
         totalAmt += 100;
      }
      
      if (bmi > 35)
      {
         double additionalFee =(bmi-35)*20;
         totalAmt += additionalFee;
      }
      return totalAmt;
   }
}