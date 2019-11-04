/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegui;

/**
 *
 * @author Alroy Travail
 */
public class helpCoding {
    public static void main(String[] args) {
        for (int letter = 'a'; letter < 'd'; letter++) {
            for (int num = 0; num < 3; num++) {
                char letterC = (char) letter;
                String letterS = ""+letterC;
                System.out.println(letterS+num+".setText(\"\");");
                System.out.println(letterS+num+".setEnable(true);");
            }
        }
    }
   
}
