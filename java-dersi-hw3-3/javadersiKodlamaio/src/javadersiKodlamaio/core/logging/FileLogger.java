package javadersiKodlamaio.core.logging;

public class FileLogger implements Logger{

    @Override
    public void Log(String data) {
        System.out.println("Logged to file : " + data);
    }
}
