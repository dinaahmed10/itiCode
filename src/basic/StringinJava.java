package basic;

public class StringinJava {
	public static void main(String[] args) {
		String greeting = "He\"llo where";
		System.out.println(greeting+"\n"+greeting.length()+"\n"+greeting.charAt(0)
		+"\n"+greeting.compareTo("\"Hello")+"\n"+greeting.toLowerCase()
		+"\n"+greeting.toUpperCase()+"\n"+greeting.indexOf("where")
				);
		//The + operator can be used between strings to combine them. This is called concatenation:
		{	String firstName = "\\John";
		String lastName = "\'Doe";
		System.out.println(firstName + " " + lastName);
		}
		//You can also use the concat() method to concatenate two strings:
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		{
			int x = 10;
			int y = 20;
			int z = x + y;
		    System.out.println(z);
		}
		{
			String x = "10";
			String y = "20";
			String z = x + y; 
		    System.out.println(z);
		}
		{
			String x = "10";
			int y = 20;
			String z = x + y; 
		    System.out.println(z);
		}
		/*
		  \'	'	Single quote
         \"	"	Double quote
         \\	\	Backslash
         
         */ 
		String z = "We are the so-called \"Vikings\" from the north.";
		 System.out.println(z);
		 String txt = "It\'s alright.";
		 System.out.println( txt);
		 
		 
		 /*
		  \n	New Line	
          \r	Carriage Return	 عودة النقل
          \t	Tab	
          \b	Backspace	
          \f	Form Feed
        */
		 String d="llllllllllll";
		 String m="oooooooooooo";
		 System.out.println(d+m);
		 System.out.println(d+"\n"+m);
		 System.out.println(d+"\r"+m);
		 System.out.println(d+"\t"+m);
		 System.out.println(d+"\b"+m);
		 System.out.println(d+"\f"+m);
		 System.out.println(d+"\n"+m);
		 
	}

}
