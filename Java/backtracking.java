// Q1 Print all the combitnations of the given characters
public class backtracking {
    public static void allcomb(String str, String perm, int idx){
        if(str.length()== 0){
            System.out.println(perm);
            return;
        }
        // looping to choose the starting element.
        for(int i= 0; i<str.length(); i++){
            char currChar= str.charAt(i);  //selecting the first element
            // creating the new string that will be used to push the remaining elemnents/characters after choosing the first element.
            String newStr= str.substring(0,i)+ str.substring(i+ 1);
            // calling the function recursively to choose the next element
            allcomb(newStr, perm+currChar, idx+ 1);
        }
        // time complexity of this function is O(n* n!)  

    }
    public static void main(String args[]){
        // Q1
        String str= "ABC";
        allcomb(str, "",0);
    }
    
}
