public class StringBuild {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Aryan");
        System.out.println(sb);
        //reverse the sentence 
        for(int i= (sb.length()-1); i>= 0; i--){
            System.out.print(sb.charAt(i));
        }

    }
    
}
