/*
Given a List of Strings, write a method removeDuplicates that removes duplicate words from the List and returns an ArrayList of all the unique words. The returned ArrayList should be lexically alphabetically.

Input: [Hi, Hello, Hey, Hi, Hello, Hey]

Output: [Hello, Hey, Hi]
*/


public static ArrayList<String> removeDuplicates(List<String> input) {
    ArrayList<String> list = new ArrayList<String>();
    
    for(String s: input){
        if(list.contains(s)){
            continue;
        }else{
            list.add(s);
        }
    }

    Collections.sort(list);
    return list;
}