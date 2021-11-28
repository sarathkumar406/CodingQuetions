import java.util.*;
class GenerateNew
{
	public static void main(String[] args) 
	{
		Deque<String> list = new LinkedList<>();
		list = generateParenthesis(2);
		System.out.println(list);
	}

	public static Deque<String> generateParenthesis(int n) {
    Deque<String> linkedList = new LinkedList<>();
    linkedList.add("");
	System.out.println(linkedList.peek().length());
	System.out.println(linkedList.size());
    while (linkedList.peek().length() != 2 * n) {
        String s = linkedList.pop();
		System.out.println("s ---->> "+s);
		System.out.println("s ---->> "+s.length());
		System.out.println("s ---->> "+s.isEmpty());
        if (s.isEmpty()) {
            linkedList.add("()");
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
					System.out.println("ss------->>>  "+s);
                    String t = s.substring(0, i + 1) + "()" + s.substring(i + 1);
                    if (!linkedList.contains(t)) {
                        linkedList.add(t);
                    }
                }
            }
            linkedList.add(s + "()");
        }
		System.out.println("------->>> "+linkedList.peek().length());
    }
    return linkedList;
	}
}
