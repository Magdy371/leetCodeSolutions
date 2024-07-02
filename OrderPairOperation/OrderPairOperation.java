public class OrderPairOperation
{
  public static void main(String[] args)
  {
    Pair<String, Integer> p0 = new OrderPair<String, Integer>("Magdy", 23);
    Pair<String, Integer> p1 = new OrderPair<String, Integer>("Eva", 23);
    OrderPair<String, Integer> p2 = new OrderPair<>("Even", 8);
    //OrderedPair<String, String>  p3 = new OrderedPair<>("hello", "world");
    System.out.println(p0.getKey()+ " " + p0.getValue());
  }
}
