package test;

import java.util.HashMap;

public class HashMapSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("GK", "aaa");
		hm.put("DF", "bbb");
		hm.put("MF", "ccc");
		hm.put("FW", "ddd");

		String member = hm.get("FW");
		System.out.println(member);

		int size = hm.size();
		System.out.println(size);

		for (String key : hm.keySet()) {
			String value = hm.get(key);
			System.out.println(key + ":" + value);
		}

		String remove = hm.remove("aaa");
		System.out.println(remove);

	}

}
