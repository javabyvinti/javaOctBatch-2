package com.bmpl.inheritance;

// method overriding --> features are available --> in parent
// overriding --> method name and method parameters and method return all must be same
//  access specifier --> either same or either of large scope
// inheritance is must for overriding

// overloading 
// (requirement changed but data is same or logic is same) and 
//overriding (when logic needs to be changed or modified)--> 

class University{
	//final int value = 90;	
	/*final*/ void mbaCourse(){
		System.out.println("Mandatory syllabus for MBA");
	}
	
	void mcaCourse(){
		System.out.println("Mandatory syllabus for MCA");
	}
}

class BPIT extends University{
	
	@Override	// --> annotation
	void mbaCourse(){
		System.out.println("Some Addedd topics");
	}

	@Override
	void mcaCourse() {
		super.mcaCourse();
	}
	
}

class MAIT extends University{
	
	@Override
	public void mcaCourse(){
		super.mcaCourse();
		System.out.println("Some Added topics");
	}
}


public class Overriding {

	public static void main(String args[]){
		MAIT mait = new MAIT();
		mait.mcaCourse();
	}
	
}
