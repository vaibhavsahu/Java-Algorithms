//Find the Maximum Number of Repetitions 

public static int getMaxRepetition(int[] a) {
    
HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

int len = a.length;


//update the map based on array elements and their counts
for(int i = 0; i < len; i++){
    if(map.containsKey(a[i])){
        int val = map.get(a[i]);
        val = val + 1;
        map.put(a[i], val);
    }else{
        map.put(a[i], 1);
    }
}

//iterate the map
Iterator iterator = map.entrySet().iterator();
int max = 0;
int key = 0;
while (iterator.hasNext()) {
    Map.Entry me2 = (Map.Entry)iterator.next();
    int val = (int)me2.getValue();
    if(val > max){
        max = val;
        key = (int)me2.getKey();
    }
} 

return key;


    
}