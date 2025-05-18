public class mostFrequentElement {
    public static void main(String[] args) {
        String str = "aabcdddd";
        int [] freq = new int[256];
        char mostFreq = '\0';
        int maxFreq = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
            if(freq[ch]>maxFreq){
                maxFreq = freq[ch];
                mostFreq = ch;
            }
        }
        System.out.println(mostFreq);
    }
}
