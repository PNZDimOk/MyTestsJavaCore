package DesignPatterns.Singleton;

public class MySingleton {
    private static MySingleton mySingleton;
    private static String LogFile="start of Log file. \n\n";

    private MySingleton(){
    }

    public static MySingleton getMySingleton() {
        if (mySingleton==null){
            mySingleton = new MySingleton();
        };
        return mySingleton;
    }

    public void addLogInfo(String s){
        LogFile+=s+"\n";
    }

    public void showLogFile(){
        System.out.println(LogFile);
    }
}
