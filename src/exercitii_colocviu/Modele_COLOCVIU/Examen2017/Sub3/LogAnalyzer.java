package exercitii_colocviu.Modele_COLOCVIU.Examen2017.Sub3;

import exercitii_colocviu.Modele_COLOCVIU.Examen2017.Sub2.Log;

import java.util.ArrayList;
import java.util.List;

public class LogAnalyzer {
    List<LogEntry> logs = new ArrayList<>();

    public void readLogsFromFiles(String[] filenames) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for(String filename : filenames) {
            LogReaderThread thread = new LogReaderThread(filename, logs);
            thread.start();
            threads.add(thread);
        }
        for(Thread thread : threads) {
            thread.join();
        }
    }

    public int getUsersNumberOfLogs(String user, String date) {
        int logsCount = 0;
        for(LogEntry log : logs) {
            if(log.getUser().equals(user) && log.getDate().equals(date)) {
                synchronized (logs) {
                    logsCount++;
                }
            }
        }
        return logsCount;
    }
}
