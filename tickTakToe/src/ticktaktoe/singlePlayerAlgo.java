/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticktaktoe;

/**
 *
 * @author Ruchi
 */

public class singlePlayerAlgo {
    private int check[][];
    private int content[][]=new int[3][3];
    
    
    public singlePlayerAlgo(){
        //content={1,1,1}{0,1,0}{0,0,1};
        content[0][0]=0;
        content[0][1]=0;
        content[0][2]=0;
        content[1][0]=0;
        content[1][1]=0;
        content[1][2]=0;
        content[2][0]=0;
        content[2][1]=0;
        content[2][2]=0;
        
        
        
    }
    
    public void print(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(content[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public boolean checkPosition(int row,int column){
        if(getContent()[row][column]==0||getContent()[row][column]==1){
            return true;
        }
        else{
            return false;
        }
    }
    public void setCaptain(int row,int column){
        content[row][column]=5;
    }
     
    public void setSuperman(int row,int column){
        content[row][column]=1;
    }
    
    public String checkWin(){
        int checkVar=0;
        int checkVar2=0;
        int checkVar3=0;
        int checkVar4=0;
        for (int i = 0; i < 3; i++) {
            checkVar=0;
            checkVar2=0;
            int j;
            for (j = 0; j < 3; j++) {
                checkVar=checkVar+getContent()[i][j];
                checkVar2=checkVar2+getContent()[j][i];
            }
            checkVar3=checkVar3+getElement(i, (j-1)-i);
            checkVar4=checkVar4+getElement(i,i);
//            System.out.println("checkVar "+checkVar);
//            System.out.println("checkVar2 "+checkVar2);
            if(checkVar==15||checkVar2==15||checkVar3==15||checkVar4==15){
                return "captain";
            }
            if(checkVar==3||checkVar2==3||checkVar3==3||checkVar4==3){
                return "superman";
            }
        }
        return "loose";
        
    }
    
    public int autoPlay(){
        int tempi=0;
        int tempj=0;
        
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                if(this.getElement(i,j)==0){
                    content[i][j]=5;
                    tempi=i;
                    tempj=j;
                
                if("loose".equals(this.checkWin())){
//                    if(this.autoPlay()==1){
//                        tempi=i;
//                        tempj=j;
//                    }
                    content[i][j]=0;
                }
                else{
                    System.out.println("true");
                    this.print();
                    return 1;
                }
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                if(this.getElement(i,j)==0){
                    content[i][j]=1;
                    tempi=i;
                    tempj=j;
                
                if("loose".equals(this.checkWin())){ 
                    content[i][j]=0;
                }
                else{
                    System.out.println("true");
                    this.print();
                    content[i][j]=5;
                    return 1;
                }
                }
            }
        }
        
        if(autoPlaySpecial())
        {
            
        }
        else{
        content[tempi][tempj]=5;
        System.out.println("false");
        this.print();
        }
        return 0;
    }
    
    public boolean autoPlaySpecial(){
        
        if(content[0][0]==1||content[0][2]==1||content[2][0]==1||content[2][2]==1){
              if(content[1][1]==0){
              content[1][1]=5;
              return true;
              }
        }
        return false;
    }

    /**
     * @return the content
     */
    public int[][] getContent() {
        return content;
    }
    
    public int getElement(int i,int j){
        return content[i][j];
    }
}
