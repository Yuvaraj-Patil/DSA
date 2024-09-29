package IntermediateDSA2;

public class Anagram {
    public static void main(String[] args) {
        String A="cat",B="bat";
        int frequency[]=new int[26];        
        for(int i=0;i<A.length();i++)
        {
            int c=A.charAt(i);
            frequency[c-97]++;
            c=B.charAt(i); 
            frequency[c-97]--;     
        }
        for(int i=0;i<26;i++)
        {
            if(frequency[i]!=0)
            {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
