
public class NUCLEUSSOFTWARES {

    public static void main(String[] args) {
        int a=1,b=1,c=1;
        System.out.println(b);
        System.out.println(c);
        for(int i=0;i<31;i++){
            if(i<16){
                c=a+b;
                a=b;
                b=c;
                System.out.println(c);
                //System.out.println("a="+a+"b="+b);
                
            }
            else{
                b=c;
                c=a;
                a=b-a;
                System.out.println(a);
                //System.out.println("a="+a+"b="+b);
            }
        }
    }
    
}
/*
1
1
2
3
5
8
13
21
34
55
89
144
233
377
610
987
1597
2584
987
610
377
233
144
89
55
34
21
13
8
5
3
2
1
*/