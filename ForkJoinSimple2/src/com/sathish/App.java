package com.sathish;

import java.util.concurrent.ForkJoinPool;

public class App {

	public static void main(String[] args) {
		
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(20000);
		System.out.println( forkJoinPool.invoke(simpleRecursiveAction) );
		
		
	}
}
