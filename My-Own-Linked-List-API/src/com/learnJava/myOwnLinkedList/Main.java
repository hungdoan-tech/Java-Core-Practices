package com.learnJava.myOwnLinkedList;

import com.learnJava.myOwnLinkedList.genericLinkedList.GenericLinkedList;
import com.learnJava.myOwnLinkedList.genericLinkedList.GenericNode;


public class Main {
	
	public static void main(String[] args) {
		
// region Test for single linked list and double linked list
//		DoubleLinkedList tempLinkedList = new DoubleLinkedList();
//		tempLinkedList.InsertFirst(5);
//		tempLinkedList.InsertFirst(3);
//		tempLinkedList.InsertLast(6);
//		tempLinkedList.PrintOut();
//		
//		Node node5 = tempLinkedList.FindANode(5);
//		if(node5 != null)
//		{
//			tempLinkedList.InsertAfterP(10, node5);
//		}	
//		tempLinkedList.PrintOut();
//		
//		Node node10 = tempLinkedList.FindANode(10);
//		if(node10 != null)
//		{
//			tempLinkedList.RemoveAfterP(node10);
//		}
//		tempLinkedList.PrintOut();
//		
//		Node node7 = tempLinkedList.FindANode(7);
//		if(node7 != null)
//		{
//			tempLinkedList.InsertAfterP(10, node5);
//		}	
//		tempLinkedList.PrintOut();
//		
//		System.out.println("Head Node: "+ tempLinkedList.getHeadNode().getData());
//		System.out.println("Tail Node: "+ tempLinkedList.getTailNode().getData());
//		tempLinkedList.PrintOut();
// endregion
		

// region Test for single linked list and double linked list
		GenericLinkedList<Integer> tempLinkedList = new GenericLinkedList<Integer>();
		tempLinkedList.InsertFirst(5);
		tempLinkedList.InsertFirst(3);
		tempLinkedList.InsertLast(6);
		tempLinkedList.PrintOut();
		
		GenericNode<Integer> node5 = tempLinkedList.FindANode(5);
		if(node5 != null)
		{
			tempLinkedList.InsertAfterP(10, node5);
		}	
		tempLinkedList.PrintOut();
		
		GenericNode<Integer> node10 = tempLinkedList.FindANode(10);
		if(node10 != null)
		{
			tempLinkedList.RemoveAfterP(node10);
		}
		tempLinkedList.PrintOut();
		
		GenericNode<Integer> node7 = tempLinkedList.FindANode(7);
		if(node7 != null)
		{
			tempLinkedList.InsertAfterP(10, node5);
		}	
		tempLinkedList.PrintOut();
		
		System.out.println("Head Node: "+ tempLinkedList.getHeadNode().getData());
		System.out.println("Tail Node: "+ tempLinkedList.getTailNode().getData());
		tempLinkedList.PrintOut();
// endregion
		
	}
}