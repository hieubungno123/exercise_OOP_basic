package logicHandle;

import entity.Staff;

import java.util.Scanner;

public class StaffLogic {
    private Staff staffs[] = new Staff[100];

    public Staff[] getStaffs() {
        return staffs;
    }

    public void inputStaff(){
        System.out.print("Số nhân viên mới: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhân viên thứ "+(i+1)+": ");
            Staff staff = new Staff();
            staff.inputInfo();
            savaStaff(staff);
            System.out.println();
        }

    }

    public void savaStaff(Staff staff){
        for (int i = 0; i < this.staffs.length; i++) {
            if(staffs[i] == null){
                staffs[i]=staff;
                break;
            }
        }
    }

    public void printStaff(){
        for (int i = 0; i < this.staffs.length; i++) {
            if(staffs[i]!=null){
                System.out.println("Nhân viên thứ: "+(i+1)+": ");
                staffs[i].showStaff();
            }
        }
    }

    public void searchStaff(){
        System.out.print("Nhap idStaff can tim: ");
        int staffID = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.staffs.length; i++) {
            if (staffs[i]!=null && staffs[i].getId()==staffID) {
                staffs[i].showStaff();
                return;
            }
        }
        System.out.println("Khong tim thay");
    }
}
