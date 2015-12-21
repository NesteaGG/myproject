package com.tom;

public class GraduateStudent extends Student{
	//�ݩʤ�k�|�Q�~��                          extends �᭱�@�w�����O
	//�إߤl���O����e�A�|����������O�غc�l
	//�����O�L�w�]�غc�A�G�|�X��
	
	int thesis ;
	static int pass = 70;
	
	public GraduateStudent(int math, int chinese, int english, int thesis) {
		super(math, chinese, english); //super�u��b�Ĥ@��
		this.thesis = thesis;
	}

	public GraduateStudent(int english, int thesis) {
		super(english);
		this.thesis = thesis;
	}
	
	@Override  //�sĶ��(Annotation)�Х�
	public void print(){
		System.out.print(math+"\t"+chinese+"\t"+english+"\t"+getAverage());
		if(getAverage()<pass)
			System.out.print("*");
		System.out.println("\t"+thesis+(thesis<70?"*":""));	
	}
	 
	/*public GraduateStudent(int math, int chinese, int english) {
		super(math, chinese, english);//�I�s�����O�غc�禡
		
		thesis = 0;
	}//�]���غc�禡�S���פ妨�Z�A�G�����
	
	public GraduateStudent(int math, int chinese, int english, int thesis){
		super(math, chinese, english);
		this.thesis = thesis;
	}//�غc�@�Ӧ�thesis���غc�l*/
}
