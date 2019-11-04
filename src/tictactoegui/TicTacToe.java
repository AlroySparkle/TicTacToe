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
public class TicTacToe {

    private int array[][]= new int [3][3];
    //to check if any player won
    public boolean isWin(){
        for (int col = 0; col < 3; col++) {//vertical check
            if(isEmptyVertical(col))
                continue;
            else if(array[0][col]==array[1][col]&&array[1][col]==array[2][col])
               return true;
        }//end for
        for (int row = 0; row < 3; row++) {//horizontal check
            if(isEmptyHorizontal(row))
                continue;
            else if(array[row][0]==array[row][1]&&array[row][1]==array[row][2])
               return true;
        }//end for
        
        //cross check \
        if(array[0][0]==array[1][1]&&array[1][1]==array[2][2]&&array[0][0]!=0)
            return true;
        
        //cross check /
        if(array[2][0]==array[1][1]&&array[1][1]==array[0][2]&&array[2][0]!=0)
            return true;
        
        return false;
    }// end isWin
    
    //to be sure if there is empty space horizontal
    public boolean isEmptyHorizontal(int row){
        for (int col = 0; col < 3; col++) {
            if(array[row][col]==0){
                return true;
            }
        }//end for
        
        return false;
    }//end isEmptyHorizontalc 
    
    //to be sure there is no vertical is empty
    public boolean isEmptyVertical(int col){
        for (int row = 0; row < 3; row++) {
            if(array[row][col]==0){
                return true;
            }
        }//end for
        return false;
    }//end isEmptyVertical
    
    //add variable to the array
    public void add(int row,int col,int player){
        //value in array 0 is empty
        array[row][col]=player+1;
        printArray();
    }
    
    //clear array
    public void newGame(){
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                array[row][col]=0;
            }
        }
    }
    
    //get array for PvC move
    public int[][] getArray() {
        return array;
    }
    
    //just to check the array
    public void printArray(){
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(array[row][col]+" ");
            }
            System.out.println("");
        }
        System.out.println("------------");
    }
    
}//end class
