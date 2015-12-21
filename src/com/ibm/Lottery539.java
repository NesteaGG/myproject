package com.ibm;

import java.util.Random;

public class Lottery539 {
	
	int[] nums = new int[5]; 
	
	public Lottery539(){
		generate();		
	}
	
	public Lottery539(int n1, int n2, int n3, int n4, int n5){
		nums[0] = n1;
		nums[1] = n2;
		nums[2] = n3;
		nums[3] = n4;
		nums[4] = n5;
	}
	
	public Lottery539(int[] nums){
		this.nums = nums ;
	}
	
	protected boolean validate(){
		int[] spots = new int[39];
		for(int i=0;i<5;i++){
			spots[nums[i]-1]=1;
		}
		int sum = 0;
		for(int i=0;i<39;i++){
			sum = sum + spots[i];
		}
		if(sum<5)
			return false;
		else
			return true;
	}
	
	public void generate(){
		
		Random r = new Random();
		int[] spots = new int[40];
		int[] cc = new int[39];
		int tmp = 0;
		
		/*for(int i=0;i<5;i++){
			int n = r.nextInt(39)+1;
			if(spots[n]==1){
				i--;
				//continue;
			}else{
				nums[i] = n;
				spots[n] = 1;
			}
		}*/
		
		for(int i=0;i<39;i++)
			cc[i]=i+1;
		for(int i=0;i<39;i++){
			int n = r.nextInt(39)+1;
				tmp = cc[n];
				cc[n] = cc[i];
				cc[i] = tmp;
		}
		for(int i=0;i<5;i++){
			nums[i] = cc[i] ;
			System.out.print(cc[i]+" ");
		}
	}
	
	public void print(){
		for(int i=0;i<5;i++){
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		/*Lottery539 lot = new Lottery539();
		lot.generate();
		lot.print();*/
		Lottery539 lot = new Lottery539(3, 21, 21, 31, 35);
		System.out.println(lot.validate());
	}

}
