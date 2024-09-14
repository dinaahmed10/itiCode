package dataStructure.linkedList.Stack;

public class mainStackLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackLinkedList Stack=new stackLinkedList();
		Stack.Push(5);
		Stack.Push(8);
		Stack.Push(3);
		Stack.Push(10);
		Stack.Push(2);
		Stack.Push(6);
		Stack.display();
		System.out.println("Last element : "+Stack.lastElement());
		Stack.Pop();
		Stack.Pop();
		Stack.display();
		System.out.println("Frist element : "+Stack.fristElement());
		System.out.println("Last element : "+Stack.lastElement());

	}

}
