class MyHashSet {
    private boolean[][] storage;
    private int buckets;
    private int bucketItems;

    private int hash1(int key){
        return key%buckets;
    }

    private int hash2(int key){
        return key/bucketItems;
    }

    public MyHashSet() {
        this.buckets = 1000;
        this.bucketItems = 1000;
        this.storage = new boolean[1001][];
    }
    
    public void add(int key) {
        int bucket = hash1(key);
        if(storage[bucket] == null){
            if(bucket == 0){
                storage[bucket] = new boolean[bucketItems + 1];
            } else {
                storage[bucket] = new boolean[bucketItems];
            }
        }
        int bucketItem = hash2(key);
        storage[bucket][bucketItem] = true;
    }
    
    public void remove(int key) {
        int bucket = hash1(key);
        if(storage[bucket] == null) return;
        int bucketItem = hash2(key);
        storage[bucket][bucketItem] = false;
    }
    
    public boolean contains(int key) {
        int bucket = hash1(key);
        if(storage[bucket] == null) return false;
        int bucketItem = hash2(key);
        return storage[bucket][bucketItem];
        
    }
}