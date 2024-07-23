public class convertRomanToInt {
    static int value(char r)
    {
        switch (r) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
    static int romanToInt(String s)
    {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = value(s.charAt(i + 1));
                if (current >= next) {
                    total += current;
                } else {
                    total -= current;
                }
            } else {
                total += current;
            }
        }
        return total;

    }
    public static void main(String[] args) {
        String romanNumeral = "MCMXC"; // Example: MCMXC is equivalent to 1990
        int result = romanToInt(romanNumeral);
        System.out.println("Integer value of " + romanNumeral + " is: " + result);
        }
       
}
