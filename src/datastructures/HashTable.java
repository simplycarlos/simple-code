package datastructures;

public class HashTable {
	HashEntry[] table;
	private int size;
	int[] keys;
	
	HashTable(int size){
		table = new HashEntry[size];
		this.size = size;
		
		this.keys = new int[size];
		for(int i=0;i<keys.length;i++){
			this.keys[i]=-1;
		}
		
	}
	
	public int hash(){
		int key;
		boolean found = false;
		do{
			key = (int)(Math.random()*size);
			
			for(int k:keys){
				if(k==key){
					found = true;
					break;
				}
			}
		}
		while(found);
	
		return key; 
	}
	
	public void put(int data){
		int key = hash();
		HashEntry he = new HashEntry(key,data);
		table[key] = he;
		for(int i=0;i<keys.length;i++){
			if(keys[i]==-1){
				keys[i] = key;
				break;
			}
		}
	}
	
	public void remove(int key){
		table[key]=null;
		for(int i=0;i<keys.length;i++){
			if(keys[i]==key){
				keys[i] = -1;
				break;
			}
		}
	}
	
	public HashEntry search(int data){
		for(int key:keys){
			if(table[key].value==data)
				return table[key];
		}
		return null;
	}
}
