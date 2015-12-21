package com.ibm;

import java.util.Scanner;
//java.lang.* 不用import

public class Person {
	float weight;
	float height;
	//instance variable 實例變數
	//屬性
	
	public Person(float weight, float height){
		this.weight = weight ;
		this.height = height ;
	}//建構函式，平常不會打，會隱藏，預設有
	//可以有很多建構函式，但不可有相同變數型態或個數
	//區域變數
	
	public Person(){
		
	}
	
	public Person (String name){
		
	}
	
	public String advice(){
		float bmi = bmi();
		String msg ;
		
		if(bmi<16){
			msg = "多吃點" ;
		}else{
			if(bmi>25){
				msg = "少吃點" ;
			}else{
				msg = "正常" ;
			}
		}
		return msg ;
	}
	
	public float bmi(){
		float bmi = weight/(height*height);
		bmi = ((int)(bmi*100))/100.0f;
		return bmi;
	}
	
	public void sayHello(){
		System.out.println("HELLO");
		//system 類別
		//out 屬性
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);//取得輸入來源(鍵盤)
		
		System.out.print("請輸入體重:");
		//String line = scanner.nextLine();//scanner身上的方法
		//System.out.println(line);
		//float w = Float.parseFloat(line);
		float w = scanner.nextFloat();
		
		System.out.print("請輸入身高:");
		//line = scanner.nextLine();
		//System.out.println(line);
		//float h = Float.parseFloat(line);
		float h = scanner.nextFloat();
		
		Person p = new Person(w,h);//呼叫建構子
		//Person P 參照(Reference)資料型態
		//新增一個person類別的物件
		
		System.out.println(p.bmi());
		p.sayHello();
		//p.weight = 65.6f;
		//p.height = 1.7f;
		//float bmi = p.bmi();
		int n=5 ;
		int m=7 ;
		
		System.out.println((n>m)?n:m);
		
		System.out.println(n>>1);
		System.out.println(n++);
		//n先印，再++ (後置)
		System.out.println(++n);
		//System.out.println(3+(n++));
		System.out.println(p.advice());
		System.out.println("abc"+m);
		//int遇字串會轉成字串
	}
}
