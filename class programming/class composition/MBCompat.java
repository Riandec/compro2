import java.util.Scanner;

class CPU {
    public String model;
    public int clocks;
    public int socket;
    public int memType;
    public boolean valid;
    
    CPU (String model, int clocks, int socket, int memType) {
        this.model = model;
        this.clocks = clocks;
        this.socket = socket;
        this.memType = memType;
        this.valid = isValidSpec(model, clocks, socket, memType);
    }

    boolean isValidSpec(String model, int clocks, int socket, int memType) {
        if (model != null && model.length() > 0 && clocks > 0 && socket > 0 && memType > 0 && memType <= 10) {
            return true;
        } else {
            return false;
        }
    }

    void printInfo() {
        System.out.println(model +"\n"+ clocks +"\n"+ socket +"\n"+ memType +"\n"+ valid);
    }
}

class MainBoard {
    public String model;
    public int socket;
    public int memType;
    boolean valid;

    MainBoard (String model, int socket, int memType) {
        this.model = model;
        this.socket = socket;
        this.memType = memType;
        this.valid = isValidSpec(model, socket, memType);
    }

    boolean isValidSpec(String model, int socket, int memType) {
        if (model != null && model.length() > 0 && socket > 0 && memType > 0 && memType <= 10) {
            return true;
        } else {
            return false;
        }
    }

    void printInfo() {
        System.out.println(model +"\n"+ socket +"\n"+ memType +"\n"+ valid);
    }
}

class Computer {
    MainBoard mb;
    CPU cpu;
    boolean valid;
    
    Computer (CPU cpu, MainBoard mb) {
        this.cpu = cpu;
        this.mb = mb;
        this.valid = isValidCom(mb, cpu);
    }

    boolean isValidCom(MainBoard mb, CPU cpu) {
        if (mb.valid && cpu.valid && mb.socket == cpu.socket && mb.memType == cpu.memType) {
            return true;
        } else {
            return false;
        }
    }

    void printInfo() {
        if (valid) {
            System.out.println(cpu.model +"\n"+ cpu.clocks +"\n"+ mb.model +"\n"+ mb.socket +"\n"+ mb.memType);
        } else {
            System.out.println("Invalid Spec");
            cpu.printInfo();
            mb.printInfo();
        }
        
    }
}

public class MBCompat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int clocks = sc.nextInt();
        int socket = sc.nextInt();
        int memType = sc.nextInt();

        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);
        
        sc.nextLine();
        model = sc.nextLine();
        socket = sc.nextInt();
        memType = sc.nextInt();
        if (model.length() == 0 && socket % 2 == 0) {
            model = null;
        }
        MainBoard mb = new MainBoard(model, socket, memType);
        Computer com = new Computer(cpu, mb);
        com.printInfo();
    }
}
