package br.com.fabribh.fibonacci;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		long[] fib = new long[40];
		int posAtual = 0;
		
		if (fib[posAtual] < fib.length) {
			
			for (int i = 0; i < fib.length; i++) {
				
				if(i < 2) {
					//Fill up the first and second position of array with 0 e 1
					fib[posAtual] = i;
					posAtual++;
					
				}else {
					//He the magic happens - Fill up the rest of array with a sequence of Fibonacci
					fib[posAtual] = (fib[posAtual - 1]) + (fib[posAtual - 2]);
					  posAtual++;
				}
			}
		} 
		
		for (int i = 0; i < fib.length; i++) {
			System.out.println(fib[i]);
		}
	}
}
