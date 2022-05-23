package com;

public class Array
{
	public void singleD()            //SingleDimentionalArray
  {
	int a[]=new int[5];//declaration and instantiation  
	a[0]=10;//initialization  
	a[1]=20;  
	a[2]=70;  
	a[3]=40;  
	a[4]=50;  
	//traversing array  
	for(int i=0;i<a.length;i++)//length is the property of array  
	System.out.println(a[i]);  
	
	}

	
	
	
  	public void array1()            //SingleDimentionalArray
  	{
  		int a[]={33,3,4,5};//declaration, instantiation and initialization  
  	//printing array  
  	for(int i=0;i<a.length;i++)//length is the property of array  
  	System.out.println(a[i]);  
  	}
  	
  	
  	
  	
  	public void multiD()           //MultiDimentionalArray
  	{
  		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
  	//printing 2D array  
  	for(int i=0;i<3;i++){  
  	 for(int j=0;j<3;j++){  
  	   System.out.print(arr[i][j]+" ");  
  	 }  
  	 System.out.println();  
  	}  
  	}

  	
  	
  	
  	public void findArrayDoWhileLoop()       //FindingArrayUsingDoWhileLoop
  	{
  		String strArray[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Satureday"};
  		int intCounter=0;
  		
  		do {
  			if(strArray[intCounter].equals("Thursday")) {
  				System.out.println("Thursday is present");
  				break;
  			}
  		      intCounter++;
  	}
      while(strArray.length>intCounter);
  	}

  	
  	
  	
  	public void findArrayForEachLoop()          //FindingArrayUsingForEachLoop
  	{
  		String strArray[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Satureday"};
  		int intCounter=0;
  		
  		for(String string : strArray) {
  			if(string.equals("Thursday")) {
  				System.out.println("Friday is present");
  				break;
  			}
  		}
  	}
}