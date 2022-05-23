package com;

public class StringJava {

    public void arrayString()   //CreatingString
{
	String Alpha="java";//creating string by Java string literal    
    char ch[]={'s','t','r','i','n','g','s'};    
    String Beta=new String(ch);//converting char array to string    
    String Gamma=new String("example");//creating Java string by new keyword    
    System.out.println(Alpha);    
    System.out.println(Beta);    
    System.out.println(Gamma);    
}

 
    public void stringCompare()                 //StringComparison
{

      String sum1="hello";  
      String sum2="hello";  
      String sum3="meklo";  
      String sum4="hemlo";  
      String sum5="flag";  
      System.out.println(sum1.compareTo(sum2));   //0 because both are equal  
      System.out.println(sum1.compareTo(sum3));   //-5 because "h" is 5 times lower than "m"  
      System.out.println(sum1.compareTo(sum4));   //-1 because "l" is 1 times lower than "m"  
      System.out.println(sum1.compareTo(sum5));   //2 because "h" is 2 times greater than "f"  
}



    public void stringByChar() {                   //FetchingStringByCharacter
	    String str = "Welcome to Javatpoint portal";      
        int strLength = str.length();      
        // Fetching first character  
         System.out.println("Character at 0 index is: "+ str.charAt(0));      
        // The last Character is present at the string length -1 index  
         System.out.println("Character at last index is: "+ str.charAt(strLength-1));      
    }  

    
    
    public String getFullName(String strFirstName, String strLastName) {          //ConcatFullName
    	String strFullName = strFirstName+" ".concat(strLastName);
    	//strFirstName+" "+strLastName;
    	
    	return strFullName;
    }
    


   public String getCompanyName(String strCompanyName ) {        //PrintCompanyName
	   return strCompanyName;
   }


   

   
   public void stringContains()       //search the sequence of characters in this string
   {
	   String strName = "Software testing is the process of finding errors in the developed product";
	   System.out.println(strName.contains("is the process"));
	   System.out.println(strName.contains("developed product"));
	   System.out.println(strName.contains("Software development"));
   }
   
   
   public void endString()         //SearchIfStringEndsWith.com
   {
	   String strcome = "Welcome to MakeMyTrip.com";
	   if(strcome.endsWith(".com")) {
		   System.out.println("String ends with .com");
	   } else
	   {
		   System.out.println("It does not ends with .com");
	   }
   }



  public String verifyWordInCompany(String strCompanyName) {
	  String strArray[] = strCompanyName.split(" ");
	  for(String string : strArray) {
		  if(string.equals("Technologies")) {
			  break;
		  }
	  }
	   return strCompanyName;
		  }
  }
