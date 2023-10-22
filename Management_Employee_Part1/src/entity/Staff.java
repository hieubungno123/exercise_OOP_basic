package entity;

import statics.JobType;

import java.util.Scanner;

public class Staff extends Person{
    public static int AUTO_ID = 10000;
    private JobType jobType;
    private int id ;

    public Staff() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                " name='" + name + '\'' +
                ", id=" + id + '\'' +
                ", jobType=" + jobType + '\'' +
                ", age=" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }



    @Override
    public void inputInfo() {
        System.out.print("Nhập tên nhân viên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Chọn 1 trong các công việc sau: ");
        System.out.println("1. Lập trình viên");
        System.out.println("2. Sale");
        System.out.println("3. Thiết kế");
        System.out.println("4. Quản lý");
        System.out.print("Nhập cộng việc: ");
        int type = new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setJobType(jobType.DEVELOPER);
            case 2:
                this.setJobType(jobType.SALE);
            case 3:
                this.setJobType(jobType.DESIGNER);
            case 4:
                this.setJobType(jobType.MANAGER);

        }
        System.out.print("Nhập tuổi: ");
        this.setAge(new Scanner(System.in).nextInt());
        System.out.print("Nhập giới tình: ");
        this.setSex(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.setAddress(new Scanner(System.in).nextLine());
    }

    public void showStaff(){
        System.out.println("ID: " + this.id);
        System.out.println("Tên nhân viên: " + this.name);
        System.out.println("Công việc: "  +this.jobType);
        System.out.println("Tuổi " + this.age);
        System.out.println("Gioi tinh: "+this.sex);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println();
    }
}
