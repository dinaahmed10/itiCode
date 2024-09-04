package basic;

public class dataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3+"\n");

		
		String greeting = "Hello World";
		System.out.println(greeting);
		
		
		///////////////boolean////////////
		boolean b1 =true;
		boolean b2 =false;
		boolean b3 =2<3;
		boolean b4 =2>3;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		String str1="true";
		String str2="false";
		String str3="Something";
		boolean bool1=Boolean.parseBoolean(str1);
		boolean bool2=Boolean.parseBoolean(str2);
		boolean bool3=Boolean.parseBoolean(str3);
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		
		
		
	}

}
