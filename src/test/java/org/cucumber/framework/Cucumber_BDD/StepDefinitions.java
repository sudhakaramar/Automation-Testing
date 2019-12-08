package org.cucumber.framework.Cucumber_BDD;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class StepDefinitions {
	
	
	

	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br=new BufferedReader(new java.io.FileReader("abc.txt"));
		
		BufferedReader br1=new BufferedReader(new java.io.FileReader("def.txt"));
		
		PrintWriter pw=new PrintWriter(new File("output.txt"));
		
		String s=br.readLine();
		
		boolean flag=true;
		
		while(s!=null)
		{
         String s1=br1.readLine();
        
         while(s1!=null)
         {
        	 if(s.equals(s1))
        	 {
        		 flag=false;
        		 break;
        	 }
        	 br1.readLine();
         }
         if(flag==true)
        	 pw.write(s);
         
		}
		
	pw.flush();	
	pw.close();
	br.close();
	br1.close();
	}  
	
	
	
	}
	
	



