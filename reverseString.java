public class reverseString{
public static void main(String[] args) {
    String str="the sky is blue";
    StringBuilder ans=new StringBuilder();
        int start=str.lastIndexOf(" "),end=str.length();
        while(start>=0)
        {
            ans.append(str.substring(start+1,end)+' ');
            end=start;
            start=str.lastIndexOf(" ",end-1);
        }
        ans.append(str.substring(0,end));
        System.out.println(ans);  
}
}