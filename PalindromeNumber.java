package LitCode;


public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isParlindrome(1923));
		/* 11 22 33 44 55 66 
		 * 101, 202, 303, 151, 121, 111, 
		 * 1001, 2002, 1111 
		 * 2112 2772 */
	}
	public static boolean isParlindrome(int x) {
		if(x < 0) {
			return false;
		} else {
		int reversed = x;
		int result = 0;
		while(reversed != 0) {
			int digit = reversed %10;
			result = result*10 + digit;
			reversed /= 10;
		}
		if(result == x) {
			return true;
		} else {
		
		return false;
	}
		}
		}
	
	/*Code explanation: 
	 * to determine if the number x is Parlindrome, at first I was thinking that if x is divisible by 11 then it should be the Parlindrome
	 * But then I also found other cases where x is not divisible by 11 but still can be Parlindrome, for ex, 151, 131
	 * Then I started thinking about doing the reversed of x and compare it with x, if its == then return true, otherwise false
	 * Explanation for the reversing process:
	 * Testing the reverse using 182
	 * create variable to store value of x then use while(reversed != 0 ){
	 * take out the digit by using : int digit = reversed % 10; (it will first print 2)
	 * then we can do result = result *10 + digit; 
	 * that will give us the first digit in the result, in this case, 2 
	 * then we divide reversed by 10 which make the reverse now == 18 and the process carry on, where digit = 8, result = 28, reversed = 1 
	 * then digit = 1, result = 281, reversed = 0 then the loop stop
	 * in this case 281 != 182 then it will return false
	 * 
	 * I also test -151 if its return true, then I have another if else to handle the case where x is negative
	 * }
	 * */
}
