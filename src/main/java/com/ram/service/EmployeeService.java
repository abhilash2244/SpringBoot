package com.ram.service;

public class EmployeeService {
	public static String initService() {
		System.out.println("in service");
		return "Hello world from service";
	}

	public static String fibanocci(int num) {
		
		 int n1=0,n2=1,n3,i,count=num;    
		 String series;
		 series = n1+" "+n2;
		 System.out.print(n1+" "+n2);
		 for(i=2;i<count;++i) 
		 {    
		  n3=n1+n2;  
		  series = series + " "+n3;
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		return series;
	}

}
