package com;
import java.io.*;
import java.lang.Exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class WithExceptionHandling {

//	public static void main(String[] args) {
//		   try{  
			      //code that may raise exception  
			   	  //int data=100/0; // ArithmeticException
			      //String s=null;  // NullPointerException
			      //System.out.println(s.length());
			   	  //String s="abc";  
			   	  //int i=Integer.parseInt(s); //NumberFormatException 
			   	  //int a[]=new int[5];  
			   	  //a[10]=50; //ArrayIndexOutOfBoundsException
//		   }catch(ArithmeticException e){
//				   System.out.println(e);
//		   }   
//			   System.out.println("outside of exception handling");  
		
		//multiple catch
//		try{    
//            int a[]=new int[5];    
//            int b = 30/0;
//            a[5]=b;    
//           }    
//           catch(ArithmeticException e)  
//              {  
//               System.out.println("Arithmetic Exception occurs");  
//              }    
//           catch(ArrayIndexOutOfBoundsException e)  
//              {  
//               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
//              }    
//           catch(Exception e)  
//              {  
//               System.out.println("Parent Exception occurs ");  
//              }             
//           System.out.println("rest of the code"); 
		
		//nested try
//		 try{  
//			    try{  
//			     System.out.println("going to divide");  
//			     int b =39/0;  
//			    }catch(ArithmeticException e){System.out.println(e);}  
//			   
//			    try{  
//			    int a[]=new int[5];  
//			    a[5]=4;  
//			    }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
//			     
//			    System.out.println("other statement");  
//			  }catch(Exception e){System.out.println("handled");}  
//			  
//			  System.out.println("normal flow..");
		
		//finally with or without exception handling
		
//		 try{  
//			   int data=25/0;  
//			   System.out.println(data);
//			}catch(NullPointerException e){
//			}catch(ArithmeticException e){
//				  System.out.println(e);
//			}finally{
//				System.out.println("finally block is always executed");
//			}  
//			  System.out.println("rest of the code...");  
		
		//FileNotFoundException
		
//		try {
//			FileReader fl = new FileReader("C:\\Users\\Faris\\Desktop\\TXT DOCS\\ISMAI.txt");
//			int i = fl.read();
//			while(i != -1) {
//			System.out.println((char)i);
//			}
//			fl.close();
//		}catch(Exception e){
//			System.out.println(e);
//		}
//   }
		
	// throws
		
//	public static void method() throws FileNotFoundException {  
//		  
//        FileReader file = new FileReader("C:\\Users\\Faris\\Desktop\\TXT DOCS\\ISMAI.txt");  
//        BufferedReader fileInput = new BufferedReader(file);  
//  
//      
//       throw new FileNotFoundException();  
//      
//    }    
//    public static void main(String args[]){  
//        try  
//        {  
//            method();  
//        }   
//        catch (Exception e)   
//        {    
//        	System.out.println(e);
//        }  
//        System.out.println("rest of the code...");    
//  }  
	
//	}
}
