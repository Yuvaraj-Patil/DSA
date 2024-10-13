import java.util.HashSet;

public class ColorfullNum {
    public static void main(String[] args) {
        int A=23;
        HashSet<Integer> hs=new HashSet();
        int currNum=0,p=1;
        while(A!=0)
        {
            int d=A%10;
            currNum=currNum*10+d;
            if(currNum<10)
                p=currNum;
            else
                p*=currNum;
            if(hs.contains(p))
                System.out.println(0);
            else 
                hs.add(currNum);              
            A=A/10;
        }
    }
}
