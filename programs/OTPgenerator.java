class OTPgenerator
{
	public static void main(String args[])
	{
		int length=4;
		otp1(length);
		//otp2(length);
		//otp3(length);
	}

	static void otp1(int len)//OTP with random() include zero
	{
	   int sum=0;String str="";
	   for(int i=0 ; i<len ;i++)
	   sum=sum*10+(int)Math.floor(Math.random() *10 );

	   if(sum==0)
	   sum+=(int)Math.floor(Math.random() *10 )+1;
	   if(sum>999)//Padding
	   str=""+sum;
	   if(sum<1000 & sum >99)
	   str="0"+sum;
	   if(sum<100 & sum >9)
	   str="00"+sum;
	   if(sum<10)
	   str="000"+sum;

	   System.out.println("OTP : "+str);
	}
	static void otp2(int len)//OTP without zero number
	{
		   int sum=0;String str="";
		   for(int i=0 ; i<len ;i++)
		   sum=sum*10+(int)Math.floor(Math.random() *9 )+1;

		   System.out.println("OTP : "+sum);
	}
	static void otp3(int len)//OTP with array without zero
	{
			   int otp[]=new int[len];
			   System.out.print("OTP : ");
			   for(int i=0 ; i<len ; i++)
			   {
			     otp[i]=(int)Math.floor(Math.random() *9)+1;
			     System.out.print(otp[i]);
		       }
	}
}
