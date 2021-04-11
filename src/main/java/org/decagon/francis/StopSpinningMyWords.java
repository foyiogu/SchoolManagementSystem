package org.decagon.francis;

public class StopSpinningMyWords {
    public static void main(String[] args) {

    }
    public static String spinWords(String sentence) {
        StringBuilder sb1 = new StringBuilder();
        String ans = "";
        String [] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 5){
                StringBuilder sb = new StringBuilder(arr[i]);
                arr[i] = sb.reverse().toString();
                ans += arr[i] + " ";
            }else{
                ans += arr[i] + " ";
            }
        }

        return ans.trim();
    }
}
