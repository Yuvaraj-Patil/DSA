public class longestPalindrome {
    public static void main(String[] args) {
        String A="cdabbazy";
        int n=A.length(),start=-1,end=-1,longPalLen=-1;
        for(int i=0;i<n;i++)
        {
            int oddL=i,oddR=i,oddPal;
            while(oddL>=0 && oddR<n && A.charAt(oddL)==A.charAt(oddR))
            {
                oddL--;
                oddR++;
            }
            oddPal=(--oddR)-(++oddL)+1;
            if(oddPal> longPalLen)
            {
                longPalLen=oddPal;
                start=oddL;
                end=oddR+1;
            }
        }
        for(int i=0;i<n-1;i++)
        {
            int oddL=i,oddR=i+1,oddPal;
            while(oddL>=0 && oddR<n && A.charAt(oddL)==A.charAt(oddR))
            {
                oddL--;
                oddR++;
            }
            oddPal=(--oddR)-(++oddL)+1;
            if(oddPal> longPalLen)
            {
                longPalLen=oddPal;
                start=oddL;
                end=oddR+1;
            }
        }
        System.out.println(A.substring(start,end));  
    }    
}
