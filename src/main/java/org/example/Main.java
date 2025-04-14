package org.example;



public class Main {
    public static void main(String[] args) {
        String my_string="ihrhbakrfpndopljhygc";
        int m=4;
        int c=2;
        char[][] result = new char[my_string.length()/m][m];

        for(int i=0; i<result.length; i++) {
            for(int j=0; j< m; j++) {
                result[i][j]= my_string.charAt(m*i+j);
            }
        }

        char[] result2 = new char[result.length];

        for(int i=0; i<result.length; i++) {
            result2[i] = result[i][c-1];
        }
        System.out.println(result2);
    }
}