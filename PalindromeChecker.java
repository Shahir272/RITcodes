class isPallindrome
{
    private char[] str; private int i;
    protected isPallindrome(char[] str)
    {
        this.str=str;
    }
    protected boolean allindrome()
    {
        for(i=0;i<(str.length/2);i++)
        {
            if(str[i]==str[str.length-1-i])
            {
                return true;
                
            }
        }
        return false;
    } 
}
public class PalindromeChecker
{
    public static void main (String[] args)
    {
     
        final char[] str={'a','b','m','a','a'};
        final isPallindrome strr= new isPallindrome(str);
        final boolean result = strr.allindrome();
        System.out.println("the result is" + result);
    }
}