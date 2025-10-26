package study;

public class Merge_ArraySorted_Non_Decreasing {

	public static void main(String[] args) {
		int[] arr1= {23,34,45,56};
		int[] arr2= {12,34,67,99};
		 int[] merged = mergeArrays(arr1, arr2);
		 System.out.println("Merged array of arr1 and arr2 in non-decreasing order is: ");
		 for(int i=0;i<merged.length;i++) {
		 System.out.print(merged[i]+"\t");
		 }

	}
	public static int[] mergeArrays(int[] arr1,int[] arr2) {
		int len= arr1.length + arr2.length;
		int[] result= new int[len];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length ) {
			if(arr1[i]<=arr2[j]) {
				result[k]=arr1[i];
				k++;i++;
			}else {
				result[k]=arr2[j];
				j++;k++;
			}
			
		}
		
	    while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
		
	}

}
