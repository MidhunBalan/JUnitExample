package com.junitDemo;

public class StringFunctions {
	public boolean compareString(String first, String second){
		
		if(first.equalsIgnoreCase(second)){
			return true;
		}else{
			return false;
		}
	}
	
	public String concatinateString(String first, String second){
		return first.concat(second);
	}
//	public int[] sampleArray(int [] numbers){
//		
//		int length = numbers.length;
//		int output[] = new int[length];
//		for(int i=0 ; i< length; i++){
//			output[i]= numbers[i]+1;
//		}
//		return output;
//	}
//	
//	public void performance(){
//		for(int i=0; i< 200000000 ; i++){
//			
//		}
//		System.out.println("________Done______");
//	}
//	
//	public void exception(int number){
//		int result = 10/number;
//		System.out.println("Result is"+result);
//	}

}
