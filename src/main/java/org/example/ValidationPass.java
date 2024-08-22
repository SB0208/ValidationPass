package org.example;

public class ValidationPass {
    public static void main(String[] args) {

        String pass = "newPass";
        int num = 8;

    }

        public static boolean smallerThanSeven (String pass) {

            if (pass.length() > 7) {
                return false;
            }
            else
              {

                return true;
              }
    }

     public static boolean hasDigit (String pass) {
        char[] chars = pass.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])){
                return true;
            }
        }
        return false;


    }

    public static boolean hasUpperCase (String pass) {
        char[] chars = pass.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])){
                return true;
            }
        }
        return false;
    }

    public static boolean hasLowerCase (String pass) {
        char[] chars = pass.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])){
                return true;
            }
        }
        return false;
    }
 public static boolean safePass  (String pass) {
        String[] blockedPass = {"1234aA","4567Aa","789Aa"};
        for (int i = 0; i < blockedPass.length; i++) {
            if (pass.contains(blockedPass[i])) {
                return false;
            }
        }
        return true;
 }

 public static boolean checkPass (String pass) {
        if (safePass(pass)&& hasUpperCase(pass) && hasLowerCase(pass) && hasDigit(pass) && !smallerThanSeven(pass)) {
            return true;
        }
        return false;
 }




}