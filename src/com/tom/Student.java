package com.tom;

public class Student {
	int math;
	int chinese;
	int english;
	//static int pass = 60 ;//���O�h�Ū��ܼ�(���O�ܼ� �ݩ�) �@���ܼ� �u���@��
	static final int pass = 60 ; //���i�ܧ�
	
	//�ˬd�T���ܼ�
	public Student (int math, int chinese, int english){
		this.math = math;
		this.chinese = chinese;
		this.english = english ;
	}//�غc�l
	
	public Student(){
		
	}
	
	public Student(int english){
		//this.english = english ;
		this(0, 0, english);//�I�s�ۤv���W���غc�l
	}
	
	public int getAverage(){
		int avg = (math+chinese+english)/3 ;
		return avg ;
	}//��k

	public void print(){
		System.out.print(math+"\t"+chinese+"\t"+english+"\t"+getAverage());
		if(getAverage()<pass)
			System.out.println("*");
		else
			System.out.println();	
	}
	
	public static void main(String[] args) {
				
		Student stu1 = new Student(60, 44, 77);//�����O�ͥX�@�Ӫ���
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