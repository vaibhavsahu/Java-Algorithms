//Mobile Game Range Module - Merging Ranges 

public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervalsList) {
    
    ArrayList<Interval> out = new ArrayList<Interval>();
    //if list is empty
    //ArrayList<Interval> list = new ArrayList<Interval>();
    if(intervalsList.size() == 0){
        return intervalsList;
    } else if(intervalsList.size() == 1){//if it has only single element
        return intervalsList;
    } else{
        //use Collections.sort and Comparator
        Collections.sort(intervalsList, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});
		
		//iterate over intervalsList
		Interval prev = intervalsList.get(0);
		for(int i = 1; i < intervalsList.size(); i++){
		    Interval curr = intervalsList.get(i);
		    if(curr.start <= prev.end){
		        prev.end = Math.max(curr.end, prev.end);
		        
		    }else{
		        out.add(prev);
		        prev = curr;
		    }
		}
		out.add(prev);
        }
return out;
}