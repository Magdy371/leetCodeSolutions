public class OrderPair<K,V> implements Pair<K, V>
{
  public K key;
  public V value;
  public OrderPair(){}
  public OrderPair(K key, V value)
  {
    this.key = key;
    this.value = value;
  }
  public K getKey(){return key;}
  public V getValue(){return value;}
}
