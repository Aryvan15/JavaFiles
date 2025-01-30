// Print all the subsequeces of a string
import java.util.HashSet;
public class recursion3 {
    public static void uniqueseq(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar= str.charAt(idx);
        // choosed 
        uniqueseq(str, idx+1, newString+ currChar, set);

        uniqueseq(str, idx+1, newString, set);
    }
    // Print keypad combinations:
    public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    public static void keyComb(String str, int idx, String Combo){
        if(idx == str.length()){
            System.out.println(Combo);
            return;
        }
        char currChar= str.charAt(idx);
        String mapping = keypad[currChar- '0'];
        for(int i = 0; i<= mapping.length()-1;i++){
            keyComb(str,idx+ 1, Combo+ mapping.charAt(i));
            
        }
        


    }
    public static void main(String args[]){
        // String str= "ccc";
        // HashSet<String> set= new HashSet<>();
        // uniqueseq(str, 0, "", set) ;
        String str1= "312";
        keyComb(str1,0, "");
     }
    
}
