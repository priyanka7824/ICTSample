package tutorials.basic;

public class Arrays {
	public static void main(String[] args) {
		int x;
		int[] myArray;
		myArray=new int[4];
		x=5;
		myArray[0]=x;
		myArray[1]=3;
   		myArray[2]=0;
   		myArray[3]=1;
   		
   		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

}