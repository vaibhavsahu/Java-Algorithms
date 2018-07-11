	private static boolean checkBalancedParentheses(String input){
		Stack<String> stack = new Stack<String>();
		boolean isBalanaced = false;

		for(int i=0; i < input.length(); i++){
			String str = ""+input.charAt(i);		//store characters as String

			//if opening bracket then push into stack
			if(str.equals("(") || str.equals("[") || str.equals("{")){
				stack.push(str);
			}

			//if closing bracket, pop bracket and compare if its a pair
			if(str.equals(")") || str.equals("]") || str.equals("}")){
				//if stack becomes empty in between then also its not balanced
				if(stack.isEmpty()){
					return false;
				}
				String opening = stack.peek();
				if(str.equals(")") && opening.equals("(")){
					stack.pop();
				}
				if(str.equals("]") && opening.equals("[")){
					stack.pop();
				}
				if(str.equals("}") && opening.equals("{")){
					stack.pop();
				}
			}			
		}
		//if stack is empty at end, then its balanced
		if(input.length() > 0 && stack.isEmpty()){
			isBalanaced = true;
		}

		return isBalanaced;
	}
