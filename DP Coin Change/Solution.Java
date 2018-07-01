Dynamic Programming: Coin Change Problem Using Memoization

Use Recursion and Memoization:

// Money: a long number
// Array of Denominations: 0.25¢, 0.10¢, 0.05¢, 0.01¢
// Index - what denominations are we going to include

Public Class Solution{
	Public static void main(String[] args){
		

		}



	Public static long makeChange(int [] coins, int money, int index, HashMap<String, long > memo){
		//base cases
		if (money == 0)
			Return 1;
			
		if(index >= coins.length)
			Return 0;
		String keys = money+”-”+index;
		IF(memo.contains(memo.get(keys))
			Return memo.get(key);
}

		Int amountwithcoins = 0;
		Long ways = 0;
		while(amountwithmoney < = money){
			Int balance = money-amountwithmoney;
			ways+=makeChange(coins, balance, index+1, memo)
			amountwithcoins+=coins[index];
			}
		memo.put(keys, ways);
Return ways;
}	
		
