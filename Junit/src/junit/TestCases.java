package junit;

public class TestCases {
	public int sum(int a,int b) {
		int result=a+b;
		return result;
	}
	public int charactercheck(String word) {
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a' | word.charAt(i)=='A') {
				count+=1;
			}
		}
		return count;
		
	}
}
