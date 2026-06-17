// import java.util.*;
package DSA_Rev;

class Main {
      public static void main(String[] args) {
            // 1.How to create:
            String str = "Sarthak";
            String str1 = new String("Jadhav");

            // 2.How to print:
            System.out.println("String 1: " + str);
            System.out.println("String 2: " + str1);

            // 3.How to take input:
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter Input String: ");
            // String str2 = sc.nextLine();
            // System.out.println("You entered: "+str2);

            // 4.String length function:
            System.out.println("length of string 1 is: " + str1.length());

            // 5.How to concatenate string: str1 + str2
            System.out.println(str + " " + str1);

            // 6.How to get ith character from the string:
            // **Method: str.charAt(int);
            for (int i = 0; i < str.length(); i++) {
                  System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
            for (int i = 0; i < str.length(); i++) {
                  if (str.charAt(i) == 'h') {
                        System.out.println("char found at idx: " + i);
                  }
            }

            // 7.How to comapre two strings:
            String ex1 = "abc"; // string pool
            String ex2 = "abc"; // string pool
            String ex3 = new String("abc"); // new->heap
            if (ex1 == ex2) {
                  System.out.println("same"); // true;
            } else {
                  System.out.println("not same");
            }

            if (ex1 == ex3) {
                  System.out.println("same");
            } else {
                  System.out.println("not same"); // true;
            }
            // because ex3 created new string in heap memory not in string pool

            // to compare the string wtih new keyword
            // **Method: str1.euqals(str2);
            boolean res = ex1.equals(ex3);
            System.out.println(res); // true;

            // 8.How to get substring:
            // **Method: str.substring(start,end);
            // where end in excluded start is included
            String sub = "Hello";
            System.out.println(sub.substring(0, 2));
            System.out.println(sub.substring(2));

            // 9.to check wheather the string contains a substring:
            // **Method: str.contains("str");
            String cont = "Sarthak Jadhav";
            System.out.println(cont.contains("Jad"));
            System.out.println(cont.contains("abc"));

            // 10.to find the index of current char in string:
            // **Method: str.indexOf('char');
            String idof = "Hello Wolrd";
            System.out.println(idof.indexOf('o')); // returns first occurance only

            // 11.when to split the string afte a delimeter
            // for ex. after , or after space_
            // **Method: str.split("delimeter");
            String s = "apple,banana,mango";
            String[] fruits = s.split(",");
            for (String nums : fruits) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            String s2 = "a.b.c";
            String[] arr = s2.split("\\.");
            for (String nums : arr) {
                  System.out.print(nums + " ");
            }
            System.out.println();

            // 12.when we need to replce existing char or substring with another char or
            // substring:
            // **Method: str.replace("str","str") || ('ch','ch');
            String rep = "I love you";
            System.out.println(rep.replace("love", "hate"));

            String rep2 = "bandi";
            System.out.println(rep2.replace('b', 'r'));

            // 13.how to convert strings to arrays:
            // **Method: str.toCharArray();
            String nums = "Sarthak Vilas Jadhav";
            char[] name = nums.toCharArray();
            for (char x : name) {
                  System.out.print(x + " ");
            }
            System.out.println();

            // Topic: StringBiulder
            // 1.creation:
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("Shweta");
            // StringBuilder sb3 = new StringBuilder(50);

            // 2.how to print:
            System.out.println(sb);
            System.out.println(sb2);

            // Methods:
            StringBuilder ex = new StringBuilder("Hello Java");
            // 1.append(string ||int||bool)-> add data at end
            sb2.append(" Gupta");
            System.out.println(sb2); // Shweta Gupta
            sb2.append(" " + 143);
            System.out.println(sb2); // Shweta Gupta 143

            // 2.insert(idx,str||char)-> add data at specefic idx
            ex.insert(5, "_"); // Hello_ Java
            System.out.println(ex);

            // 3.delete(int,int)-> deletes char in specefic range
            ex.delete(7, 11); // Hello_
            System.out.println(ex);

            // 4.replace(idx,idx)-> replace a range of characters.
            ex.replace(0, 4, "Fello");
            System.out.println(ex);

            // 5.reverse()-> reverse the string
            ex.reverse();
            System.out.println(ex);

            // 6.length()-> length of the string
            System.out.println(ex.length());

            // 7.charAt()->
            System.out.println(ex.charAt(1));

            // 7.1 setCharAt()->
            ex.setCharAt(1, 'a');
            System.out.println(ex);

            // 7.2 deleteCharAt()->
            ex.deleteCharAt(1);
            System.out.println(ex);

            // 8.toString() -> converts sb to str
            System.out.println(ex.toString());

            // Questions by AC:
            // 1.Check if string is palindrome:
            String pal = "racecar";
            int start = 0;
            int end = pal.length() - 1;

            while (start <= end) {
                  if (pal.charAt(start) == pal.charAt(end)) {
                        start++;
                        end--;
                  } else {
                        System.out.println("not palindrome");
                        return;
                  }
            }
            System.out.println("Palindrome");

            // 2.Print largest string:
            String[] forex = { "apple", "banana", "zebra" };
            String largest = forex[0];
            for (int i = 0; i < forex.length; i++) {
                  if (forex[i].compareToIgnoreCase(largest) > 0) {
                        largest = forex[i];
                  }
            }
            System.out.println(largest);

            // 3.convert letters to uppercase:
            String ex4 = "my name is shweta";
            StringBuilder sb3 = new StringBuilder("");

            sb3.append(Character.toUpperCase(ex4.charAt(0)));
            for (int i = 1; i < ex4.length(); i++) {
                  if (ex4.charAt(i) == ' ' && i < ex4.length() - 1) {
                        sb3.append(" ");
                        i++;
                        sb3.append(Character.toUpperCase(ex4.charAt(i)));
                  } else {
                        sb3.append(ex4.charAt(i));
                  }
            }
            System.out.println(sb3.toString());
      }

      public void theory() {
            /*
             * 1. String (Immutable)
             * String s = "Hello";
             * s = s + " World";
             * System.out.println(s);
             * 
             * What happens:
             * "Hello" object created.
             * "Hello World" new object created.
             * Old object remains in memory until garbage collected.
             * So every modification creates a new object.
             */

            /*
             * 2. StringBuilder (Fast)
             * StringBuilder sb = new StringBuilder("Hello");
             * sb.append(" World");
             * System.out.println(sb);
             * 
             * Output:
             * Hello World
             * 
             * Here, the same object is modified. No new string object is created each time.
             * 
             * Good for:
             * for(int i = 0; i < 1000; i++) {
             * sb.append(i);
             * }
             */

            /*
             * 3. StringBuffer (Thread Safe)
             * StringBuffer sb = new StringBuffer("Hello");
             * sb.append(" World");
             * System.out.println(sb);
             * 
             * Output:
             * Hello World
             * 
             * Works like StringBuilder, but methods are synchronized:
             * 
             * public synchronized StringBuffer append(String str)
             * This makes it safe when multiple threads access the same object.
             */

            /*
             * Interview Answer (1 line)
             * String → Immutable.
             * StringBuilder → Mutable, faster, not thread-safe.
             * StringBuffer → Mutable, thread-safe, slightly slower.
             * 
             * Simple Example
             * String str = "Java";
             * str += " Programming"; // New object
             * 
             * StringBuilder sb1 = new StringBuilder("Java");
             * sb1.append(" Programming"); // Same object
             * 
             * StringBuffer sb2 = new StringBuffer("Java");
             * sb2.append(" Programming"); // Same object + thread safe
             */

      }
}