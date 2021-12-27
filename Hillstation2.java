class Hillstation2{
		public static void main(String []hill){ 
			System.out.println("main() started");
			int num=0;
			for(int i=0;i<hill.length;i++){
			
				if(num==8){
				System.out.println();
				num = 0;
				}
		hill[0] = "skanadagiri hills ";
		System.out.print(hill[i]+"\t");
		num = num+1;

		}
	}
}
				
				