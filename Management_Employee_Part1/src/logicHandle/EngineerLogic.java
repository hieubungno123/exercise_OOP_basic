package logicHandle;

import entity.Engineer;

import java.util.Scanner;

public class EngineerLogic {
    private Engineer[] engineers = new Engineer[100];

    public Engineer[] getEngineers(){
        return engineers;
    }

    public void inputEngineer(){
        System.out.print("Có bao nhiêu kỹ sư mới: ");
        int number = new Scanner(System.in).nextInt();
        for(int i=0;i<number;i++){
            System.out.println("Kỹ sư thứ " +(i+1)+" :");
            Engineer engineer = new Engineer();
            engineer.inputInfo();
            saveEngineer(engineer);
            System.out.println();
        }
    }

    public void saveEngineer(Engineer engineer){
        for(int i=0;i<this.engineers.length;i++){
            if(engineers[i]==null){
                engineers[i]=engineer;
                break;
            }
        }
    }

    public void printEngineer(){
        for (int i = 0; i < this.engineers.length; i++) {
            if(engineers[i]!=null){
                System.out.println("Người thứ " + (i+1) +" :");
                engineers[i].showEnginner();

            }
        }
    }

    public void searchEngineer(){
        System.out.print("Nhap idEngineer can tim: ");
        int engineerID = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.engineers.length; i++) {
            if(engineers[i]!=null && engineers[i].getId()==engineerID)
                engineers[i].showEnginner();
            return;
        }
        System.out.println("Khong tim thay");
    }

}
