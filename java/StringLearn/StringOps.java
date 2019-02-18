public class StringOps {
    public static void main(String[] args) {
        String a = "My name is XXXX";
        String b = "My name is XXXX";
        System.out.println("address of a  : " + a  + "  " + System.identityHashCode(a));
        System.out.println("address of b  : " + b  + "  " + System.identityHashCode(b));
        // both a and b are having same address even they are defined twice this is because of string pool
        // In java string is not a group of characters it is and object which consist of a group of characters

        String c = new String(a);
        System.out.println("address of c  : " + c  + "  " + System.identityHashCode(c));
        // here c is will be created in non pool memory that is heap memory and the address of c is different from a and b

        char ch[] = {'s','t','r','i','n','g',' '};
        String d = new String(ch);
        System.out.println("My converted String is : "+d);
        d = d.concat(c);
        // in above step instead of converting the existing String it creates new thread with new address that is why String object is immutable
        System.out.println(d);

        System.out.println("\n----------------Comparision in Strings -----------------\n");
        // java has three ways to compare strings 1 : equals(), 2 : ==(operator), 3 : compareTo() lets see how and where to use them

        // equals method it compares just the content of the string

        System.out.println("Comparing b and c : "+b.equals(c));
        System.out.println("Comparing b and d : "+b.equals(d));
        System.out.println("Comparing c and d : "+c.equals(d));

        String s1="Sachin";
        String s2="SACHIN";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        // == operator compares refernces not values
        String ref1 = "Abhilash";
        String ref2 = "Abhilash";
        String ref3 = new String(ref2);
        String ref4 = "Ratan";
        System.out.println(ref1 == ref2);
        System.out.println(ref1 == ref3);

        // ComparesTo compares the string lexicographically and returns integer .I mean it can be used in sorting. I compares content not refernce

        System.out.println(ref1.compareTo(ref2));
        System.out.println(ref1.compareTo(ref3));
        System.out.println(ref1.compareTo(ref4));

        // String buffer : it can be used if there are multithreading operations .It is thread safe but a little less performance that StringBuilder
        System.out.println("\n---------------String buffer -------------------\n");

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("World");
        System.out.println("address of sb1 before concat : "+System.identityHashCode(sb1));// lets concat ans see weather it change the address
        sb1.append("Java"); // as the string buffer is mutable it appends java to sb1
        System.out.println(sb1);
        System.out.println("addres of sb1 after concat : "+System.identityHashCode(sb1));// address is same after concatenation

        // String builder  : non synchronised dont use if there is multithreading involved. Better performance and immutable
        System.out.println("\n---------------String buildsr -------------------\n");
        StringBuilder sbl1  = new StringBuilder("Hello");
        StringBuilder sbl2 = new StringBuilder("Hello");
        System.out.println("Equals in string builder compare address : "+sbl1.equals(sbl2));
        System.out.println("Content Comparision in sting builder : " + sbl1.toString().equals(sbl2.toString()));







    }
}
