package com.ibm;

import java.util.Scanner;
//java.lang.* ����import

public class Person {
	float weight;
	float height;
	//instance variable ����ܼ�
	//�ݩ�
	
	public Person(float weight, float height){
		this.weight = weight ;
		this.height = height ;
	}//�غc�禡�A���`���|���A�|���áA�w�]��
	//�i�H���ܦh�غc�禡�A�����i���ۦP�ܼƫ��A�έӼ�
	//�ϰ��ܼ�
	
	public Person(){
		
	}
	
	public Person (String name){
		
	}
	
	public String advice(){
		float bmi = bmi();
		String msg ;
		
		if(bmi<16){
			msg = "�h�Y�I" ;
		}else{
			if(bmi>25){
				msg = "�֦Y�I" ;
			}else{
				msg = "���`" ;
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
		//system ���O
		//out �ݩ�
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);//���o��J�ӷ�(��L)
		
		System.out.print("�п�J�魫:");
		//String line = scanner.nextLine();//scanner���W����k
		//System.out.println(line);
		//float w = Float.parseFloat(line);
		float w = scanner.nextFloat();
		
		System.out.print("�п�J����:");
		//line = scanner.nextLine();
		//System.out.println(line);
		//float h = Float.parseFloat(line);
		float h = scanner.nextFloat();
		
		Person p = new Person(w,h);//�I�s�غc�l
		//Person P �ѷ�(Reference)��ƫ��A
		//�s�W�@��person���O������
		
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
		//n���L�A�A++ (��m)
		System.out.println(++n);
		//System.out.println(3+(n++));
		System.out.println(p.advice());
		System.out.println("abc"+m);
		//int�J�r��|�ন�r��
	}
}
