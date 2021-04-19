import java.util.*;


public class Association <K,V> implements Map.Entry<K,V> {
	
	protected K key;
	protected V valor;
	private HashMap<K,V>association;
  
    public Association(K k,V v)    {
        this.key =k;
        this.valor=v;
    }

  
    public Association(K key) {
        this(key,null);
    }
	
	
    public Association() {
		association = new HashMap<K,V>();
    }
    
  
    public boolean equals(Object otro) {
        Association otroAssoc = (Association)otro;
        return getKey().equals(otroAssoc.getKey());
    }
    
    public int hashCode() {
        return getKey().hashCode();
    }
    
   
    public V getValor(){
        return valor;
    }

  
    public K getKey() {
        return key;
    }
    public V setValor(V newValor) {
        V oldValor = valor;
        valor = newValor;
        return oldValor;
    }

    public void put(K key, V valor){
            association.put(key, valor);
	}

	public V get(Object key){
		return association.get(key);
	}

    
    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append("<ComparableAssociation: "")"+getKey()+","+getValor()+")");
        return s.toString();
    }{

}
