public class palindromeChecker {
    public static boolean check(String str){
        if(str.length()==0){
            return false;
        }
        int s = 0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "naman";
        System.out.println(check(str));
    }
}
