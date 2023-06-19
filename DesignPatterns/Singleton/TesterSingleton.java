package DesignPatterns.Singleton;

public class TesterSingleton {
    public static void main(String[] args) {
        MySingleton mySingleton1 = MySingleton.getMySingleton();
        MySingleton mySingleton2 = MySingleton.getMySingleton();
        MySingleton mySingleton3 = MySingleton.getMySingleton();
        System.out.println(mySingleton1);
        System.out.println(mySingleton2);
        System.out.println(mySingleton3);

        mySingleton1.addLogInfo("log from singleton1");
        mySingleton2.addLogInfo("log from singleton2");
        mySingleton3.addLogInfo("log from singleton3");

        mySingleton1.showLogFile();
        mySingleton2.showLogFile();
        mySingleton3.showLogFile();
    }
}
