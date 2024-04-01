package Strings;

public class string2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("gopinath");
        StringBuffer sb2=new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("field marshall");
        System.out.println(sb);
        sb.delete(0, 4);
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
        sb.insert(1,"gopi");
        System.out.println(sb);
        sb.setLength(20);
        sb.ensureCapacity(100);
        sb.isEmpty();
        sb2=sb.reverse();
        String s1=sb.toString();
        String s2=sb2.toString();
        System.out.println(s1.equals(s2));     
    }
}
