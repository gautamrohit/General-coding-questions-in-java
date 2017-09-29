import java.util.*;
public class Reverse_2_Strings {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n!=0){
            String s1,s2;
            s1=scan.next();
            s2=scan.next();
            s1+=s2;
            List<Character> ls=new LinkedList<Character>();
            char ch[]=s1.toCharArray();
            for(char c: ch){
                ls.add(c);
            }
            Collections.reverse(ls);
            StringBuffer sb=new StringBuffer(ls.size());
            for(Character c: ls){
                sb.append(c);
            }
            System.out.println(sb);
            n--;
        }
    }
}
