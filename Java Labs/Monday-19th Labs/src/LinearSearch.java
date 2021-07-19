
public class LinearSearch {
	public int findIndex(char target, char[] data) {
		if (data == null ) return -1;
		int result = -1;
	    for (int i = 0; i < data.length; i++) {
	        char temp = data[i];

	        //test current element against target
	        if (temp == target) {
	            return i;
	        }
	    }
		return result;
	}
	public static void main(String[] args) {
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z' }; 
		
		char letter = 'p';
		
		LinearSearch L = new LinearSearch();
		System.out.println(L.findIndex(letter, letters));

	}

}
