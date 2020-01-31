package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") � "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
	}

	public static void main(String[]args) {
    	//foreachloop
   
    	char[] The = {'TTThhheee'};
    	
    	  for (char item: The);
    		   System.out.println(item);
    		
    
    		   
    		   
    		   char[] AAbb = {'AAAAAbbbbbb'}{
    	    	
    	    	  for (char item2: AAbb);
    	    		   System.out.println(item2);
    		   }
    	    		   
    	    		   
    	    		   
    	    		   char[] Hi-There = {'HHHiii---TTThhheeerrreee'}{
    	    	    	
    	    	    	  for (char item3: Hi-There);
    	    	    		   System.out.println(item3);
    	    	    		   
    	    		   }
    	    		   
		
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		return "bert";
		
		reverse String "bert";
		return String "bert";
		
		
	}
	

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		return false;

		boolean result = a < b;
		return true;

		boolean result = b < c;
		return true;

		boolean result = b < a;
		return false;

		int a = 2;
		boolean b = a == 2;

		if (b) {
			System.out.println("It's false");

			int b = 2;
			boolean b = c == 2;

			if (c) {
				System.out.println("It's false");

			}
		}

	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a,) {
		return "n";
		
		string.length 
		remove int n;
	
		
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		return false;
		
		String str = "Dev";
		if str contains" Dev";
		System.out.println("True");
		
		boolean if endsdev return true;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		return -1;
		System.out.println("CCC,DDD,EEE")

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		return 9;
		i =  am
		for int i = 0 i = am ; i ++) {
			
			
		}
		
	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {
		return null;
		
		int 3
		
				if int =%3 return "fizz";
				if int = %5 return "buzz";
				if int % by 3 && 5 return " fizzbuzz";
	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		return 0;
		int 10 = 55;
		int 9 = 72;
		int 14 = 86;
		
		return 86;
		
		
	}

}
