class OddCount{
	
	public static void main(String[] args){
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		int result = getOddCount(numbers);
		System.out.println(result);
	}
	static int getOddCount(int[] arr){
		int count = 0;
		for(int num : arr){
			if(num % 2 != 0){
				count++;
			}
		}
		return count;
	}
}