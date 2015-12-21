package com.tom;

public class GraduateStudent extends Student{
	//屬性方法會被繼承                          extends 後面一定接類別
	//建立子類別物件前，會先執行副類別建構子
	//父類別無預設建構，故會出錯
	
	int thesis ;
	static int pass = 70;
	
	public GraduateStudent(int math, int chinese, int english, int thesis) {
		super(math, chinese, english); //super只能在第一行
		this.thesis = thesis;
	}

	public GraduateStudent(int english, int thesis) {
		super(english);
		this.thesis = thesis;
	}
	
	@Override  //編譯時(Annotation)標示
	public void print(){
		System.out.print(math+"\t"+chinese+"\t"+english+"\t"+getAverage());
		if(getAverage()<pass)
			System.out.print("*");
		System.out.println("\t"+thesis+(thesis<70?"*":""));	
	}
	 
	/*public GraduateStudent(int math, int chinese, int english) {
		super(math, chinese, english);//呼叫父類別建構函式
		
		thesis = 0;
	}//因為建構函式沒有論文成績，故給初值
	
	public GraduateStudent(int math, int chinese, int english, int thesis){
		super(math, chinese, english);
		this.thesis = thesis;
	}//建構一個有thesis的建構子*/
}
