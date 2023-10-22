package entity;

import statics.MajorType;

import java.util.Scanner;

public class Engineer extends Person{
    public static int AUTO_ID=10000;
    private MajorType majorType;
    private  int id;

    public Engineer() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public MajorType getMajorType() {
        return majorType;
    }

    public void setMajorType(MajorType majorType) {
        this.majorType = majorType;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                " name='" + name + '\'' +
                ", id=" + id + '\'' +
                ", majorType=" + majorType + '\'' +
                ", age=" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        System.out.print("Nhập tên kỹ sư: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Chọn 1 trong các ngành sau: ");
        System.out.println("1.Công nghệ thông tin");
        System.out.println("2.Kế toán");
        System.out.println("3.Viễn thông");
        System.out.println("4.Quản trị kinh doanh");
        System.out.print("Nhập ngành: ");
        int type = new Scanner(System.in).nextInt();
        switch (type){
            case 1:
                this.setMajorType(majorType.INFORMATION_TECHNOLOGY);
            case 2:
                this.setMajorType(majorType.ACCOUNTING);
            case 3:
                this.setMajorType(majorType.TELECOMMUNICATION);
            case 4:
                this.setMajorType(majorType.BUSINESS_ADMINISTRATION);
        }
        System.out.print("Nhâp tuổi: ");
        this.setAge(new Scanner(System.in).nextInt());
        System.out.print("Nhập giới tình: ");
        this.setSex(new Scanner(System.in).nextLine());
        //new Scanner(System.in).nextLine();
        System.out.print("Nhập địa chỉ: ");
        this.setAddress(new Scanner(System.in).nextLine());
    }

    public void showEnginner(){
        System.out.println("Id kỹ sư: " + this.id);
        System.out.println("Họ và tên: " + this.name);
        System.out.println("Ngành: " + this.majorType);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Gioi tinh: " + this.sex);
        System.out.println("Địa chỉ: " +this.address);
        System.out.println();
    }
}
