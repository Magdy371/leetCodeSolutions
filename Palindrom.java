public class Palindrom
{
  public static void main(String[] args)
  {
    int num = 454;
    int r , sum=0, temp;
    temp=num;
    while(num>0)
    {
      r = num % 10;
      sum = (sum*10)+r;
      num=num/10;
    }
    if(temp==sum)
      System.out.println(temp+ " is a Palindrom.");
    else
      System.out.println(temp+ " is not a Palindrom.");
  }
}
