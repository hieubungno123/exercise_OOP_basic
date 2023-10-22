package logicHandle;

import java.util.Scanner;

public class MenuManagementEmployee {
    private final EngineerLogic engineerLogic = new EngineerLogic();
    private final StaffLogic staffLogic = new StaffLogic();
    private final WorkerLogic workerLogic = new WorkerLogic();


    public void run(){
        while (true){
            printMenu();
            int numberChoice = chooseFunction();
            int numberPersonChoice;

            switch (numberChoice){
                case 1: // Thêm cán bộ
                    numberPersonChoice = choosePerson();
                    switch (numberPersonChoice){//Chọn cán bộ
                        case 1://Kỹ sư
                            engineerLogic.inputEngineer();
                            break;
                        case 2://Công nhân
                            workerLogic.inputWorker();
                            break;
                        case 3://Nhân viên
                            staffLogic.inputStaff();
                            break;
                    }
                    break;

                case 2:  //Tìm kiếm cán bộ
                    numberPersonChoice = choosePerson();
                    switch (numberPersonChoice){//Chọn cán bộ
                        case 1://Kỹ sư
                            engineerLogic.searchEngineer();
                            break;
                        case 2://Công nhân
                            workerLogic.searchWorker();
                            break;
                        case 3://Nhân viên
                            staffLogic.searchStaff();
                            break;
                    }
                    break;

                case 3: // Hiển thị thông tin các bán bộ
                    numberPersonChoice = choosePerson();
                    switch (numberPersonChoice){//Chọn cán bộ
                        case 1://Kỹ sư
                            engineerLogic.printEngineer();
                            break;
                        case 2://Công nhân
                            workerLogic.printWorker();
                            break;
                        case 3://Nhân viên
                            staffLogic.printStaff();
                            break;
                    }
                    break;

                case 4:
                    return;
            }

        }

    }

    public void printMenu(){
        System.out.println("------MENU------");
        System.out.println("1.Thêm cán bộ:");
        System.out.println("2.Tìm kiếm cán bộ");
        System.out.println("3.Hiện thị danh sách các cán bộ");
        System.out.println("4.Thoát khỏi chương trình");
    }

    public static int chooseFunction(){
        System.out.print("Vui lòng chọn mục: ");
        int numberChoice;
        do {
            numberChoice = new Scanner(System.in).nextInt();
            if(numberChoice>=1 || numberChoice<=4){
                break;
            }
        }while (true);
            return numberChoice;
    }

    public static int choosePerson(){
        System.out.println("1. Kỹ sư");
        System.out.println("2. Công nhân");
        System.out.println("3. Nhân viên");
        System.out.print("Chọn cán bộ:");
        int numberPerson;
        do {
            numberPerson = new Scanner(System.in).nextInt();
            if(numberPerson>=1 || numberPerson<=3) {
                break;
            }
        }while (true);
        return numberPerson;
    }
}
