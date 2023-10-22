package logicHandle;

import entity.Worker;

import java.util.Scanner;

public class WorkerLogic {
    private Worker[] workers = new Worker[100];

    public Worker[] getWorkers() {
        return workers;
    }

    public void inputWorker(){
        System.out.print("Số công nhân mới: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhân viên thứ "+(i+1)+": ");
            Worker worker = new Worker();
            worker.inputInfo();
            saveWorker(worker);
            System.out.println();
        }
    }

    public void saveWorker(Worker worker){
        for (int i = 0; i < this.workers.length; i++) {
            if(workers[i]==null){
                workers[i] = worker;
                break;
            }
        }
    }

    public void printWorker(){
        for (int i = 0; i < this.workers.length; i++) {
            if(workers[i]!=null){
                System.out.println("Công nhân thứ: " + (i+1)+": ");
                workers[i].showWorker();
            }
        }
    }

    public void searchWorker(){
        System.out.print("Nhap idworker muon tim: ");
        int workerID = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.workers.length; i++) {
            if(workers[i]!=null && workers[i].getId()==workerID)
                workers[i].showWorker();
            return;
        }
        System.out.println("Khong tim thay");
    }

}
