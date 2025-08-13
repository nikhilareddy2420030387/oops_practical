package oops_practical;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // append(String str)
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert(int offset, String str)
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // replace(int start, int end, String str)
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);

        // delete(int start, int end)
        sb.delete(6, 10);
        System.out.println("After delete: " + sb);

        // deleteCharAt(int index)
        sb.deleteCharAt(2);
        System.out.println("After deleteCharAt: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // charAt(int index)
        System.out.println("charAt(2): " + sb.charAt(2));

        // setCharAt(int index, char ch)
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt: " + sb);

        // length()
        System.out.println("Length: " + sb.length());

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // ensureCapacity(int minCapacity)
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // substring(int start)
        System.out.println("Substring from index 2: " + sb.substring(2));

        // substring(int start, int end)
        System.out.println("Substring (2, 5): " + sb.substring(2, 5));

        // setLength(int newLength)
        sb.setLength(5);
        System.out.println("After setLength(5): " + sb);

        // toString()
        String str = sb.toString();
        System.out.println("String: " + str);
    }
}
