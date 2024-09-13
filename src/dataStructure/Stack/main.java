package dataStructure.Stack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack Stack1=new Stack(5);
		Stack1.Push(54);
		Stack1.Push(18);
		Stack1.Push(21);
		Stack1.Push(81);
		Stack1.Push(66);
		Stack1.Push(66);
		Stack1.printStack();
		System.out.println("lastElement : "+Stack1.lastElement());
		System.out.println("fristElement : "+Stack1.fristElement());
		System.out.println("minElement : "+Stack1.minElement());
		System.out.println("maxElement : "+Stack1.maxElement());
		System.out.println("countOddElement : "+Stack1.countOddElement());
		System.out.println("countEvenElement : "+Stack1.countEvenElement());
		System.out.println("totalElements : "+Stack1.totalElement());
		System.out.println("totalOddElement : "+Stack1.totalOddElement());
		System.out.println("totalEvenElement : "+Stack1.totalEvenElement());
		Stack1.Pop();
		Stack1.printStack();
		System.out.println("lastElement : "+Stack1.lastElement());
		System.out.println("minElement : "+Stack1.minElement());
		Stack1.Pop();
		Stack1.Pop();
		Stack1.printStack();
		System.out.println("lastElement : "+Stack1.lastElement());
		System.out.println("fristElement : "+Stack1.fristElement());
		Stack1.Pop();
		Stack1.Pop();
		Stack1.Pop();
		Stack1.Pop();

	}

}
