import java.util.ArrayList;
import java.util.Scanner;

/*
 * String Operations with ArrayList
 * 
 * Create a method which can perform the following operations on two String objects S1 and S2.
 * The output of each operation should be added to an arraylist and the arraylist should be returned.
 * (Assume S2 is of smaller size)
 * 
 * 1. Character in each alternate index of S1 should be replaced with S2
 * 2. If S2 appears more than once in S1, replace the last occurrence of S2 in S1 with the reverse of S2, else return S1+S2
 * 3. If S2 appears more than once in S1, delete the first occurrence of S2 in S1, else return S1
 * 4. Divide S2 into two halves and add the first half to the beginning of S1 and second half to the end of S1.
 *    Note: If there are odd number of letters in S2, then add (n/2)+1 letters to the beginning and the remaining letters to the end.
 * 5. If S1 contains characters that are in S2, change all such characters to *
 */

public class Project6 {

    public static ArrayList<String> performStringOperations(String s1, String s2) {
        ArrayList<String> resultList = new ArrayList<>();

        // Operation 1: Character in each alternate index of S1 replaced with S2
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                op1.append(s2);
            } else {
                op1.append(s1.charAt(i));
            }
        }
        resultList.add(op1.toString());

        // Count occurrences of S2 in S1
        int occurrences = 0;
        int idx = s1.indexOf(s2);
        while (idx != -1) {
            occurrences++;
            idx = s1.indexOf(s2, idx + s2.length());
        }

        // Operation 2: Replace last occurrence of S2 with reverse of S2 if count > 1, else S1 + S2
        if (occurrences > 1) {
            int lastIndex = s1.lastIndexOf(s2);
            String reversedS2 = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, lastIndex) + reversedS2 + s1.substring(lastIndex + s2.length());
            resultList.add(op2);
        } else {
            resultList.add(s1 + s2);
        }

        // Operation 3: Delete first occurrence of S2 in S1 if count > 1, else S1
        if (occurrences > 1) {
            int firstIndex = s1.indexOf(s2);
            String op3 = s1.substring(0, firstIndex) + s1.substring(firstIndex + s2.length());
            resultList.add(op3);
        } else {
            resultList.add(s1);
        }

        // Operation 4: Divide S2 into two halves and attach to beginning and end of S1
        int lenS2 = s2.length();
        int halfLen;
        if (lenS2 % 2 == 0) {
            halfLen = lenS2 / 2;
        } else {
            halfLen = (lenS2 / 2) + 1;
        }
        String firstHalf = s2.substring(0, halfLen);
        String secondHalf = s2.substring(halfLen);
        String op4 = firstHalf + s1 + secondHalf;
        resultList.add(op4);

        // Operation 5: Replace all characters in S1 that appear in S2 with *
        StringBuilder op5 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (s2.indexOf(ch) != -1) {
                op5.append('*');
            } else {
                op5.append(ch);
            }
        }
        resultList.add(op5.toString());

        return resultList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter S1: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter S2: ");
        String s2 = scanner.nextLine();

        ArrayList<String> output = performStringOperations(s1, s2);

        System.out.println("\nOutput:");
        System.out.println(output);

        scanner.close();
    }
}