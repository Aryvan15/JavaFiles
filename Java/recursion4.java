import java.util.*;
// advanced recursion problem
public class recursion4 {
    //Q1 print all the combinations of the given string
    public static void printPerm(String str, String Permutation){
        if(str.length()== 0){
            System.out.println(Permutation);
            return;
        }
        for(int i= 0; i< str.length(); i++){
            char CurrChar= str.charAt(i);
            String newString= str.substring(0,i)+ str.substring(i+1);
            printPerm(newString, Permutation+ CurrChar);

        }
    }

    // Q2 count total paths in a maze to move from (0,0)to (n,m)
    public static int countPaths(int i, int j, int n, int m){
        if(i== n || j== m){
            return 0;
        }
        if(i== n-1 && j == m-1){
            return 1;
        }
        // downward
        int down= countPaths(i+ 1, j, n, m);
        // right
        int right= countPaths(i, j+ 1, n, m);
        return down+ right;

    }

    //Q3- Place tiles of size 1*m in a floor of size n*m
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n< m){
            return 1;
        }
        // vertically placed
        int vertPlacement= placeTiles(n-m, m);
        // horizontally placed
        int horPlacement= placeTiles(n-1, m);

        return vertPlacement + horPlacement;
    }
    // Q4 Find the number of ways in which you can invite n people to your party, single or in pairs
    public static int invite(int n){
        if(n<= 1){
            return 1;
        }
        // single
        int single= invite(n-1);
        // pairs
        int pairs= (n-1)*invite(n-2);
        return single+ pairs;
    }
    // Q5 Print all the subsets of a set of first n natural numbers
    public static void printsum(ArrayList<Integer> subset){
        for(int i= 0; i<= subset.size()-1;i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findsubsets(int n, ArrayList<Integer> subset){
        if(n== 0){
            printsum(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findsubsets(n-1, subset);

        // add nhi hoga
        subset.remove(subset.size()- 1);
        findsubsets(n-1, subset);
    }
    
    public static void main(String args[]){
        // Q1
        String str="abc";
        printPerm(str, "");
        // Q2
        int n= 3, m= 3;
        int totalPaths= countPaths(0, 0, n, m);
        System.out.println("The toal paths are: "+totalPaths);
        // Q3
        int totalways= placeTiles(4,3);
        System.out.println("The total ways to place tiles is: "+totalways);
        // Q4
        int guests= 4;
        int ways= invite(guests);
        System.out.println("The no of ways you can invite single or in pairs is: "+ways);
        // Q5
        int n1= 3;
        ArrayList<Integer>subset= new ArrayList<>();
        findsubsets(n1, subset);


    }
    
}
