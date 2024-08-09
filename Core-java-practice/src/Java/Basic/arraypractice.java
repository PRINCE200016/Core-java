package Java.Basic;

public class arraypractice {

	public static void main(String[] args) { 
		
/*	float [] marks  = {45.7f, 22.1f, 10.3f, 50.2f, 70.5f};
	float sum = 0;
	for (float element:marks) {
		sum= sum+element;
		
	}
System.out.println("the sum of float is : "+sum);
*/
		// problem num 2 ( present in the array or not )
		float [] marks  = {45.7f, 22.1f, 10.3f, 50.2f, 70.5f};
		float num = 45.7f;
		boolean isInArray = false;
		for (float element:marks) {
			if (num==element) {
				isInArray = true;
				break;
			}
			
		}
		if(isInArray) {
	System.out.println(" the value is present in this Array");
		}
		else {
			System.out.println("the value is not present in Array");
		}
	}

}
