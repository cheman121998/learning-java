package com.ctmman.training;

public class Generic {
	public static void main(String[] args) {
		Dictionary<String, String> d = new Dictionary<String, String>("Study", "hoc");
		String english = d.key;
		String vietnamese = d.value;
		System.out.println(english + ":" + vietnamese);
	}
}
class Dictionary<K, V> {
    public K key;
    public V value;

    public Dictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }
}