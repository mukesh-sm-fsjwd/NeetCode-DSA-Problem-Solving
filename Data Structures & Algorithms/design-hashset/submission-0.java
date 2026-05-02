class MyHashSet {

    List<Integer> list = null;

    public MyHashSet() {
        list = new ArrayList<>();
    }
    
    public void add(int key) {
        boolean isExists = false;
        for(int num : list){
            if(key == num) isExists = true;
        }
        if(!isExists) list.add(key);
    }
    
    public void remove(int key) {
        //We can use this one or the below
        // boolean isExists = false;
        // for(int num : list){
        //     if(key == num) isExists = true;
        // }
        // if (isExists) list.remove(Integer.valueOf(key));

        list.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        for(int num : list){
            if(key == num) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */