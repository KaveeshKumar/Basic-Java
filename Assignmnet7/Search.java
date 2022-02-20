 class Search {
	 public static boolean Search(int[] arr, int valuetosearch) {
		boolean t = false;
		for(int i: arr) {
			if (i==valuetosearch) {
				t = true;
				break;
			}
		}
		return t;
	 }

}
