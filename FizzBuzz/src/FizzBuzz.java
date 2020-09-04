
public class FizzBuzz {

	public String check(int number) {
		String Result="";
		
		if(number % 3 == 0) {
			Result += "Fizz";
		}
		else {
			int fizz = 3;
			int x = number;
			while(x > 0) {
				if(x % 10 == fizz) {
					Result += "Fizz";
				}
				x /= 10;
			}
		}
		
		if(number % 5 == 0) {
			Result += "Buzz";
		}
		else {
			int buzz = 5;
			int x = number;
			while(x > 0) {
				if(x % 10 == buzz) {
					Result += "Buzz";
				}
				x /= 10;
			}
		}
		
		if(Result.isEmpty()) {
			Result+=number;
		}
		return Result;
	}

}
