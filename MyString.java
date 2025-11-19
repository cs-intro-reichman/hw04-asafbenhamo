public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String s = "";
        for(int i =0 ; i<str.length();i++){
             char c = str.charAt(i);
            if( c >= 'A' && c <= 'Z')  s = s + (char) (c + 32);
            else s= s + c;
           ;
        }
        return s;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        String g = "";
        if (str2.length()==0) return true;
        if (str1.length()<str2.length()) return false;
        if (str1.equals(str2) == true) return true;
        int i=0;
         while ((str1.charAt(0)!=str2.charAt(i)))  { 
            str1= str1.substring(1, str1.length());
            if (str1.length()==0) return false;
         }
            for(int p=0 ; p<str2.length();p++)
            {
                if (str1.charAt(p)==str2.charAt(p)) g = g + str1.charAt(p);
            }
        
        if (str2.equals(g)== true) return true;
       else return false;
    }
}
