import java.util.Arrays;
import java.util.Scanner;

public class codeString {


    public static boolean ispal(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    public static boolean endsWithVowels(String str){
        char lastchar = Character.toLowerCase(str.charAt(str.length()-1));
        return lastchar=='a' || lastchar=='e' || lastchar=='i' || lastchar=='o' || lastchar=='u';
    }

    public static boolean startsWithVowels(String str){
        char firstchar = Character.toLowerCase(str.charAt(0));
        return firstchar=='a' || firstchar=='e' || firstchar=='i' || firstchar=='o' || firstchar=='u';
    }

    public static String substringPal(String str){
        String longg="";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub = str.substring(i,j);
                if(ispal(sub) && sub.length() > longg.length()){
                    longg = sub;
                }
            }
        }
        return longg;
    }

    public static void unique(String str[]){
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            if(i==0 || !str[i].equals(str[i-1])){
                int count=1;
                for(int j=i+1;j<str.length;j++){
                    if(str[i].equals(str[j])){
                        count++;
                    }
                }
                System.out.println(str[i]+": "+count+" times");
            }
        }
    }

    public static void repeat(String str[]){
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            if(i==0 || !str[i].equals(str[i-1])){
                for(int j=i+1;j<str.length;j++){
                    if(str[i].equals(str[j])){
                        System.out.println(str[i]);
                        // break;
                    }
                }
            }
        }
    }

    public static void removeDuplicates(String str[]){
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            if(i==0 || !str[i].equals(str[i-1])){
                System.out.println(str[i]);
            }
        }
    }

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        // Reverse Word
        // String str = "hello";
        // String rev="";
        // for(int i=str.length()-1;i>=0;i--){
        //     rev += str.charAt(i);
        // }
        // System.out.println(rev);

        // Upper to Lower
        // String str = "My Name Is Aniket";
        // String word = str.replace(" ","");
        // System.out.println(word);
        // for(int i=0;i<word.length();i++){
        //     char ch = word.charAt(i);
        //     if(Character.isUpperCase(ch)){
        //         sb.append(Character.toLowerCase(ch));
        //     }
        //     else{
        //         sb.append(Character.toUpperCase(ch));
        //     }
        // }
        // System.out.println(sb.toString());

        // if space then new line
        // String str = "My Name Is Aniket";
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(str.charAt(i)==' '){
        //         sb.append("\n");
        //     }
        //     else{
        //         sb.append(ch);
        //     }
        // }
        // System.out.println(sb.toString());

        // check string is palindrome
        // String str = "ana";
        // System.out.println(ispal(str));

        // take array of words from user
        // System.out.println("Enter size of array: ");
        // int n = sc.nextInt();
        // System.out.println("Enter Array: ");
        // String str[] = new String[n];
        // for(int i=0;i<str.length;i++){
        //     str[i] = sc.nextLine();
        // }
        // System.out.print("Array is: ");
        // for(int i=0;i<str.length;i++){
        //     System.out.print(str[i]+" ");
        // }

        // check if pal is present in array
        // String str[] = {"Aniket","ana","Arnav","cnc"};
        // for(String st: str){
        //     if(ispal(st)){
        //         System.out.println(st);
        //     }
        // }

        // print words ending by vowels
        // String str[] = {"Aniket","Apple","Banana"};
        // System.out.print("Ends with vowels: ");
        // for(String st: str){
        //     if(endsWithVowels(st)){
        //         System.out.print(st+" ");
        //     }
        // }
        // System.out.println(" ");
        // System.out.print("Strats with Vowels: ");
        // for(String st: str){
        //     if(startsWithVowels(st)){
        //         System.out.print(st+" ");
        //     }
        // }

        // Find longest substring palindrome
        // String str = "banana";
        // System.out.println(substringPal(str));


        // find all longest substring palindrome from array
        // String str[] = {"banana","cana"};
        // for(String st: str){
        //     String longg = substringPal(st);
        //     if(longg.length() > 1){
        //         System.out.println(st+" -> "+longg);
        //     }
        // }

        // Longest word and smallest word
        // String str[]={"Aniket","aa","a"};
        // String longg = str[0];
        // for(String st: str){
        //     if(st.length() > longg.length()){
        //         longg = st;
        //     }
        // }
        // System.out.println(longg);
        // String small = longg;
        // for(String st: str){
        //     if(st.length() < small.length()){
        //         small = st;
        //     }
        // }
        // System.out.println(small);

        // find repeated words
        // String str = "This is aniket. This is arnav.";
        // str = str.toLowerCase().replaceAll("[^a-zA-Z\\s]","");
        // String words[] = str.split("\\s+");
        // System.out.println(Arrays.toString(words));
        // Arrays.sort(words);
        // unique(words);
        // repeat(words);
        // removeDuplicates(words);

        String str = "Hello";
        sb.reverse();
        // str.toString();
        System.out.println(str.toString());


        


        
    }
}
