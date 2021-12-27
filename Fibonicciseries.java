class Fibonicciseries{
	public static void main(String args[]){

  	int a=0,b=1, c=2;
         long num=100;
      for(int i=2;i<=num;i++){
          
  		a=b;
		b=c;
		c=a+b;
	System.out.println(b);
   		}
	}
}
