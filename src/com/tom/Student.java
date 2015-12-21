package com.tom;

public class Student {
	int math;
	int chinese;
	int english;
	//static int pass = 60 ;//類別層級的變數(類別變數 屬性) 共用變數 只有一份
	static final int pass = 60 ; //不可變更
	
	//檢查三種變數
	public Student (int math, int chinese, int english){
		this.math = math;
		this.chinese = chinese;
		this.english = english ;
	}//建構子
	
	public Student(){
		
	}
	
	public Student(int english){
		//this.english = english ;
		this(0, 0, english);//呼叫自己身上的建構子
	}
	
	public int getAverage(){
		int avg = (math+chinese+english)/3 ;
		return avg ;
	}//方法

	public void print(){
		System.out.print(math+"\t"+chinese+"\t"+english+"\t"+getAverage());
		if(getAverage()<pass)
			System.out.println("*");
		else
			System.out.println();	
	}
	
	public static void main(String[] args) {
				
		Student stu1 = new Student(60, 44, 77);//用類別生出一個物件
		Student stu2 = new Student(35, 77, 66);
		
		Student stu3 = new Student() ;
		
		//Student.pass = 55;
		stu1.print();
		stu2.print();
		//System.out.println(stu.getAverage());
		System.out.println(Math.max(5, 6));
		
		GraduateStudent gstu = new GraduateStudent(55, 77, 66, 90);
		gstu.print();
	}

}