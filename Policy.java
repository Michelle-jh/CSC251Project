public class Policy
{
   //data fields or attributes
   private int policyNumber;
   private String policyName;
   
   //creating a reference variable
   private PolicyHolder policyHolder;
   
   /**
   no-arg constructor that initializes the policy attributes
   */
   public Policy()
   {
      policyNumber = 0;
      policyName = "  ";
      policyHolder = new PolicyHolder();
   }
   
    /**
      Constructor that initializes attributes to the value of the argument it is 
      @param policyNum is the policy number
      @param policyProviderName is the policy provider name 
   */

   public Policy(int policyNum, String policyProviderName, PolicyHolder pHolder)
   {
      policyNumber = policyNum;
      policyName = policyProviderName;
      policyHolder = pHolder;
   }
   /**
      the getPolicyNumber retrieves the value of the policy number field
      @return the policy number 
   */ 
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   /**
      the setPolicyNumber method updates the value of the policy number field
      @param the policy number 
   */
   public void setPolicyNumber(int policyNum)
   {
      policyNumber = policyNum;
   }
   /**
      the getPolicyName retrieves the string value of the policy name field
      @return the policy name 
   */
   public String getPolicyName()
   {
      return policyName;
   }
   /**
      the setPolicyName method updates the string value of the policy name field
      @param the policy name 
   */
   public void setPolicyName(String policyProviderName)
   {
      policyName = policyProviderName;
   }
   /**
      the getPolicyHolder() this method uses refrence variable of the policyholder class
      @return the policy holder class 
   */
   public PolicyHolder getPolicyHolder()
   {
      return policyHolder;
   }
   /**
      the getPolicyHolder() this method uses refrence variable of the policyholder class
      @param the policy holder class 
   */
   public void setPolicyHolder(PolicyHolder pHolder)
   {
      policyHolder = pHolder;
   }
   /*
      calculates the total policy price along with additional fees 
      @param bmi is the claculation of the body mass index
      @param holders somker status 
      @param the holders age
      @return the total amount of policy price
   */
   public double calcPolicyPrice()
   {
      double totalAmt = 600;
      final int POLICY_AGE = 50;
      final int BMI_NUM =35;
      double bmi = policyHolder.getBmi();
      
      if(policyHolder.getPolicyHolderAge() > POLICY_AGE)
      {
         totalAmt += 75;
      }
      
      if(policyHolder.getPolicySmokeStatus().equalsIgnoreCase("Smoker"))
      {
         totalAmt += 100;
      }
      
      if (bmi > BMI_NUM)
      {
         double additionalFee =(bmi-35)*20;
         totalAmt += additionalFee;
      }
      return totalAmt;
   }
   public String toString()
   {
      return "Policy Number: " + policyNumber + "\n" +
             "Policy Name: " + policyName + "\n" +
             "Policy Holder:\n" + policyHolder.toString();
   }
}