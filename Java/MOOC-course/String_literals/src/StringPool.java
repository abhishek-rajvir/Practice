class StringPool{
	public static void main(String[] args){
		// Created on heap
		String heapStr = new String("I am not in pool");
		// Created in SCP
		String poolStr = "I am not in pool";
		System.out.println(poolStr == heapStr); // false heapStr is not ref to SCP
		heapStr = heapStr.intern(); // heapStr now ref to KP in SCP
		System.out.println(poolStr == heapStr); // true
	}
}