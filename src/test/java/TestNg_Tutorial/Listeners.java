package TestNg_Tutorial;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
 
	 public void onTestStart(ITestResult result)
	 {  
	 // TODO Auto-generated method stub  
	 }  
	   
	 public void onTestSuccess(ITestResult result) 
	 
	 {  
	 //System.out.println("Successfully executed the listeners");
	 }  
	   
	 public void onTestFailure(ITestResult result) {  
	 // TODO Auto-generated method stub  
		 System.out.println("failed executed the listeners");
	 }  
	   
	 public void onTestSkipped(ITestResult result) {  
	 // TODO Auto-generated method stub  
	
	 }  
	   
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	 // TODO Auto-generated method stub  
	
	 }  
	   
	 public void onStart(ITestContext context) {  
	 // TODO Auto-generated method stub  
	 }  
	   
	 public void onFinish(ITestContext context) {  
	 // TODO Auto-generated method stub  
	 }   
 
	
}
