import java.util.Arrays;

public class MergeTwoArrays {
	public static int[] mergeTwoArrays(int arr1[],int arr2[]) {
		int size=arr1.length+arr2.length;
		int arr3[]=new int[size];
		int temp=0;
		
		for(int i=0;i<=arr1.length-1;i++) {
			arr3[temp++]=arr1[i];
		}
		for(int i=0;i<=arr2.length-1;i++) {
			arr3[temp++]=arr2[i];
		}
		return arr3;
		
	}
   public static void main(String[] args) {
	int arr1[]= {43,2,5,2};
	System.out.println("first array-->"+Arrays.toString(arr1));
	int arr2[]= {5,7,2,7,2};
	System.out.println("Second Aray-->"+Arrays.toString(arr2));
	
	int arr3[]=mergeTwoArrays(arr1, arr2);
	System.out.println("Merged Array-->"+Arrays.toString(arr3));
}
}
