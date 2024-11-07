package com.home.basedOnString;

/**
 * @author rasmirap
 **/
public class ReverseAstringWithoutChangingSpacePosition {
    static String givenString = "I am a IT professional";

    //Expected output : l an o is sefeorpITamaI
    public static void main(String[] args) {
        //This will reverse the string and remove all the spaces
        StringBuilder sb = new StringBuilder(givenString.replaceAll("\\s", ""));
        sb.reverse();
        int i = 0;
        //This will update the space ' ' at the correct position
        for (char ch : givenString.toCharArray()) {
            if (ch == ' ') {
                sb.insert(i, " ");
            }
            i++;
        }
        System.out.println("Output : " + sb.toString());
    }

}
