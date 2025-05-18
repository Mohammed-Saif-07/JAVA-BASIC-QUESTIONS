public class palindromeCounter {
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
        String str = "abc";
        int count = 0;
        for(int i = 0;i<str.length();i++){
            for(int j = i;j<str.length();j++){
                String ans = str.substring(i, j+1);
                if(check(ans)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
