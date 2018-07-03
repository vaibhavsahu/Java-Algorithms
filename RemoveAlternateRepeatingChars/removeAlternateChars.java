//Remove Alternate Duplicate characters from a char array you should do it in Place.
// Like keeping only, the odd occurrences of each character.

public static void removeAlternateDuplicates(String str,int n){
	int letters [256];
	int i = 0;
	int index=0;
	for(i=0;i<;256;i++)
		letters[i]=0;
	for(i=0; i<n;i++){
		char lowerCase = str[i];
		if(str[i] >= 65 && str[i] <= 90){
			lowerCase +=('a' - 'A');
		}
		if(letters[lowerCase] == 0){
			letters[lowerCase]++;
			str[index++]=str[i];
		}else{
			letters[lowerCase]--; // We want to Alternate
		}
	}
	while(index < i){
		str[index++]= 0;
	}
}
public static void main(String [] args){
	String str ="aAaBbBcCcdefgFGZzzzO";
   removeAlternateDuplicates(str,20);
  System.out.println(str);
	
	return 0;


}