public class PolicyHolder
{
   //data fields or attributes
   private String policyHolderFName;
   private String policyHolderLName;
   private int policyHolderAge;
   private String policySmokeStatus;
   private double policyHolderHeight;
   private double policyHolderWeight;
   
   /**
   no-arg constructor that initializes the policy holder attributes
   */
   public PolicyHolder()
   {
      policyHolderFName = "  ";
      policyHolderLName = "  ";
      policyHolderAge = 0;
      policySmokeStatus = "  ";
      policyHolderHeight = 0;
      policyHolderWeight = 0;
   }
   
    /**
      Constructor that initializes attributes to the value of the argument it is  
      @param policyFName is holders first name
      @param policyLName is holders last name
      @param policyAge the holders age
      @param policyHStatus is the holders smoking status
      @param policyHHeight the height of the holder
      @param policyHWeight the weight of the holder
   */

   public PolicyHolder(String policyFName, String policyLName, int policyAge, String policyHStatus, double policyHHeight, double policyHWeight)
   {
      policyHolderFName = policyFName;
      policyHolderLName = policyLName;
      policyHolderAge = policyAge;
      policySmokeStatus = policyHStatus;
      policyHolderHeight = policyHHeight;
      policyHolderWeight = policyHWeight;
   }
   /**
      the getPolicyHolderFName retrieves the string value of the policy customers first name field
      @return the policy customers first name 
   */
   public String getPolicyHolderFName()
   {
      return policyHolderFName;
   }
   /**
      the setPolicyHolderFName method updates the string value of the policy customer first name field
      @param the policy customer first name 
   */
   public void setPolicyHolderFName(String policyFName)
   {
      policyHolderFName = policyFName;
   }
   /**
      the getPolicyHolderLName retrieves the string value of the policy customers last name field
      @return the policy customers last name 
   */
   public String getPolicyHolderLName()
   {
      return policyHolderLName;
   }
   /**
      the setPolicyHolderLName method updates the string value of the policy customer last name field
      @param the policy customer last name 
   */
   public void setPolicyHolderLName(String policyLName)
   {
      policyHolderLName = policyLName;
   }
   /**
      the getPolicyHolderAge retrieves the value of the policy customers age field
      @return the policy customers age 
   */
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   /**
      the setPolicyHolderAge method updates the value of the policy customer age field
      @param the policy customer age 
   */

   public void setPolicyHolderAge(int policyAge)
   {
      policyHolderAge = policyAge;
   }
   /**
      the getPolicySmokeStatus retrieves the string value of the policy customers smoking status
      @return the policy customers somking status 
   */
   public String getPolicySmokeStatus()
   {
      return policySmokeStatus;
   }
   /**
      the setPolicySmokeStatus method updates the string value of the policy customers smoking status
      @param the policy customers smoking status
   */
   public void setPolicySmokeStatus(String policyHStatus)
   {
      policySmokeStatus = policyHStatus;
   }
   /**
      the getPolicyHolderHeight retrieves the value of the policy customers height
      @return the policy customers height 
   */
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   /**
      the setPolicyHolderHeight method updates the  value of the policy customers height
      @param the policy customers height
   */
   public void setPolicyHolderHeight(double policyHHeight)
   {
      policyHolderHeight = policyHHeight;
   } 
   /**
      the getPolicyHolderWeight retrieves the value of the policy customers weight
      @return the policy customers weight 
   */
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
   /**
      the setPolicyHolderWeight method updates the  value of the policy customers weight
      @param the policy customers weight
   */
   public void setPolicyHolderWeight(double policyHWeight)
   {
      policyHolderWeight = policyHWeight;
   }
   /*
      The getBmi method calculates the BMI
      @return the customers bmi
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
      @return the total amount of policy price
   */
   public double calcPolicyPrice()
   {
      double totalAmt = 600;
      final int POLICY_AGE = 50;
      final int BMI_NUM =35;
      double bmi = getBmi();
      
      if(policyHolderAge > POLICY_AGE)
      {
         totalAmt += 75;
      }
      
      if(policySmokeStatus.equalsIgnoreCase("Smoker"))
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
      return "First Name: " + policyHolderFName + "\n" +
             "Last Name: " + policyHolderLName + "\n" +
             "Age: " + policyHolderAge + "\n" +
             "Smoking Status: " + policySmokeStatus + "\n" +
             "Height: " + policyHolderHeight + "\n" +
             "Weight: " + policyHolderWeight + "\n" +
             "BMI: " + String.format("%.2f",getBmi()) + "\n" +
             "Policy Price: " + String.format("%.2f",calcPolicyPrice());
   }
}