package br.ufc.crateus.eda.st;

public interface Map<K, V> {
	void put(K key, V value);
	V get(K key);
	void remove(K key);
	Iterable<K> keys();
	int size();
}
