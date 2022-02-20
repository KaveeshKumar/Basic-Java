class Bubblesort{
	public static int[] bubbleSort(int arr[]) {
		int n = arr.length, i ,j , temp;
		for (i=0; i<n; i++) {
			for (j = i+1; j<n; j++) {
				if (arr[j] < arr[i]) {
					temp =arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		return arr;
	}
	public static void printArray(int arr[])
	{
		int i,size = arr.length;
		for (i=0;i<size;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}


