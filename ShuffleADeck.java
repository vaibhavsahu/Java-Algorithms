private static int[] shuffleCards(int[] cards){
		for(int i=0; i<;52; i++){
			int rand = new Random().nextInt(52-i)+i;
			int temp = cards[i];
			cards[i] = cards[rand];
			cards[rand] = temp;
		}
		return cards;
	}
