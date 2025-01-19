// Intermediate level Questions
public class recursion2 {
    // Q1- Tower of Hanoi
    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if(n== 1){
            System.out.println("Transfer "+ n +" from "+source+ " to "+ destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("Transfer "+ n+ " from "+helper+ " to "+ destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
    // Q2- print string in reverse
    public static void getRev(int indx, String str){
        if(indx == 0){
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        getRev(indx-1, str);
    }
    //Q3- check the first and last occurance of the given character
    // first initialize static variables;
    public static int first= -1;
    public static int last = -1;
    public static void findOccurence(int inx, String str, char element){
        if (inx== str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar= str.charAt(inx);
        if(currChar== element){
            if(first == -1){
                first = inx;
            }
            else{
                last = inx;
            }
        }
        findOccurence(inx+ 1, str, element);

    }
    // Q4- Check if an array is sorted(strictly increasing)
    public static boolean isSorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]< arr[idx+1]){
            return isSorted(arr, idx+ 1);
        }
        else{
            return false;
        }
    }
    // Q5- Move all x's to the end of the string
    public static void rmvx(String str,int idx, int count, String newString){
        if(idx == str.length()){
            for(int i= 0; i< count; i++){
                newString += 'x';
            }
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count ++;
            rmvx(str, idx+1, count, newString);
        }
        else{
            newString+= currChar;
            rmvx(str, idx+1, count, newString);
        }
    }
    //Q6-  Remove duplicates from the string
    public static boolean[] map= new boolean[26];

    public static void removeDuplicates(String str, int index, String newString){
        String newStr= str.toUpperCase();
        if(index== str.length()){
            System.out.println(newString);
            System.out.println(newStr);
            return;
        }
        char currChar= str.charAt(index);
        if(map[currChar-'a']== false){  
            newString += currChar;
            map[currChar- 'a']= true;
            removeDuplicates(str, index+1, newString);
        }
        else{
            removeDuplicates(str, index+1, newString);
        }
    }
    // Q8- Print all the subsequence of the given string  "Important for all the competitive coding/Interview"
    public static void subsequence(String str, int idx, String newStr){
        if(idx== str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar= str.charAt(idx);
        // Choosed
        subsequence(str, idx+1, newStr+ currChar);
        // not choosed
        subsequence(str, idx+1, newStr);
    }



        
    public static void main(String args[]){
        // Q1
        // int n= 2;
        // towerOfHanoi( n,"S","H","D");
        // Q2
        // String str= "aryan";
        // Q3
        // getRev(str.length()-1,str);
        // Q4
        // findOccurence(0, str, 'a');
        // Q5
        // int arr[]= {1,3,2,5};
        // System.out.println(isSorted(arr, 0));
        // Q6
        // String string= "Axrxyxaxnx";
        // String newstring = "";
        // rmvx(string,0,0,newstring);
        // Q7
        // String str= "aruyan";
        // removeDuplicates(str, 0, "");
        // Q8
        String str= "abc";
        subsequence(str, 0, "");
    }
    
}

