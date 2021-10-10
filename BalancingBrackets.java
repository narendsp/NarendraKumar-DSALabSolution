package com.greatlearning.main;

import java.util.Stack;

public class BalancingBrackets {
	private static boolean isBalanced( String bracketExpression ) {
		Stack stack = new Stack();
		
		// iterate i : 0 -> end of string
			// c = String character at i - use charAt( i )
	
		for (int i=0; i < bracketExpression.length(); i++) {
			Character c = bracketExpression.charAt( i );
			
			// check if c is '(', '{', '['
			if( c == '(' || c == '{' || c == '[' ) {
				// push to stack
				stack.push( c );
			} else { // else		
				// Aside: if stack is empty -> error
				if( stack.isEmpty() ) {
					return false;
				}
		
		
				// pop from the stack (d)
				Character d = (Character) stack.pop();
				// check if c is the closing bracket for d
				if( c == '}' && d != '{' || ( c == ')' && d != '(' ) || ( c == ']' && d != '[' ) ) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}
	
	public static void main( String[] args ) {
		String bracketExpression = "([[{}]])";
		
		if( isBalanced( bracketExpression ) ) {
			System.out.println( "Balanced" );
		} else {
			System.out.println( "Not Balanced" );
		}
	}
}
