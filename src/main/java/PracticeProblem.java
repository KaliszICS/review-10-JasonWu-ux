public class PracticeProblem {

	public static void main(String args[]) {

	}
public static String pyramid(int n) {
    String result = "";
    for (int i = 1; i <= n; i++) {
        
        for (int j = 0; j < n - i; j++) {
            result += " ";
        }
        
        for (int k = 0; k < i; k++) {
                result += "*";
                if (k < i - 1) {
                    result += " ";
                }
        }
        
        if (i < n) {
            result += "\n";
        }
    }
    return result;
}



public static String square(int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            
            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                result += "*";
            } else {
                result += " ";
            }
        }
        if (i < n - 1) {
            result += "\n";
        }
    }
    return result;
}



public static boolean hasLowercase(String str) {
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (Character.isLowerCase(c)) {
            return true; 
        }
    }
    return false; 
}

}
