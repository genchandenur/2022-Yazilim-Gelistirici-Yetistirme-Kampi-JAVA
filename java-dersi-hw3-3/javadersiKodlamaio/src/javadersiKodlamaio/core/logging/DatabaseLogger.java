package javadersiKodlamaio.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void Log(String data) {
        System.out.println("Logged to database : " + data);
    }
}
