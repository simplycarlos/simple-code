package datastructures;

public class HashTest {

	public static void main(String[] args) {
		HashTable table = new HashTable(128);
		
		System.out.println("Inserting data...");
		table.put(1);
		
		System.out.println("Searching table...");
		HashEntry h = table.search(1);
		System.out.println(h.key+" key found and "+h.value+" value found.");
		
		System.out.println("Inserting data...");
		table.put(3);
		
		System.out.println("Searching table...");
		h = table.search(3);
		System.out.print(h.key+" key found and "+h.value+" value found.");
	}
}
