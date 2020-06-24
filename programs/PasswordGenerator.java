class PasswordGenerator
{
	public static void main(String args[])
	{
		int length=8;
		pwd1(length);
		pwd2(length);
	}
	static void pwd1(int len)//Array of int using UNICODE
	{
		String p[] = new String[len];
		int alpha[]={65,66,67,68,69,70,71,72,73,74,75
		,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90
		,97,98,99,100,101,102,103,104,105,106,107
		,108,109,110,111,112,113,114,115,116,117
		,118,119,120,121,122};
		char sc[]={'!','@','#','$','%','^','&','*','_','=','+','-','/','.','?','>','<'};
		int option=0;

		System.out.print("PASSWORD :  ");
	    for(int i=0 ; i<len ;i++)
	    {
	      option=(int)Math.floor(Math.random()*3);

	      if(option == 0)p[i]=""+(int)Math.floor(Math.random()*10);

	      if(option == 1)p[i]=""+(char)alpha[(int)Math.floor(Math.random()*52)];

	      if(option == 2)p[i]=""+(char)sc[(int)Math.floor(Math.random()*17)];

	      //System.out.print(p[i]);   //no use of loop
	     }
	       for(int i=0 ; i<len ;i++)
	          System.out.print(p[i]);
    }

     static void pwd2(int len)//Array of Strings
     {
		 String num ="0123456789";
		 String alpha="abcdefghijklmnopqrstuvwxyz";
		 String Alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String schars="!@#$%^&*_=+-/.?><";
		 String p="";
		 int option=0;

		 System.out.println("");
		 System.out.print("PASSWORD :  ");
		 	    for(int i=0 ; i<len ;i++)
		 	    {
	              option=(int)Math.floor(Math.random()*4);

	              if(option == 0)p+=""+num.charAt( (int)Math.floor(Math.random()*10) );

				  if(option == 1)p+=""+alpha.charAt( (int)Math.floor(Math.random()*25) );

				  if(option == 2)p+=""+Alpha.charAt( (int)Math.floor(Math.random()*25) );

				  if(option == 3)p+=""+schars.charAt( (int)Math.floor(Math.random()*17) );
	            }
	            System.out.print(p);

	 }

}