package oops_practical;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

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

        // toString()
        String str = sb.toString();
        System.out.println("String: " + str);
    }
}
