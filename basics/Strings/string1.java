package Strings;
public class string1
{
    public static void main(String[] args) {
        String name1=" gopinath";
        System.out.println(name1.charAt(3));
        String name2=new String("Naga");
        String name3=new String("NAGA");
        System.out.println(name2.compareToIgnoreCase(name3));
        String name4=new String("CONTENT");
        String name5=new String("CONTENT");
        System.out.println(name4.contentEquals(name5));
        System.out.println("   ");
        String name6=new String("Hii");
        System.out.println(name6.concat(name1));
        System.out.println(name1.endsWith("gopinath"));
        System.out.println(name1.replace('n','a'));
        String name7=new String("Iam the substring of something");
        System.out.println(name7.indexOf("something"));
        System.out.println(name1.length());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name4.equals(name5));

    }
}
