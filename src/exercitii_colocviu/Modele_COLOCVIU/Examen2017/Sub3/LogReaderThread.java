package exercitii_colocviu.Modele_COLOCVIU.Examen2017.Sub3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class LogReaderThread extends Thread {
    String filename;
    List<LogEntry> logs;

    public LogReaderThread(String filename, List<LogEntry> logs) {
        this.filename = filename;
        this.logs = logs;
    }

    @Override
    public void run() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String linie;
            while((linie = bufferedReader.readLine()) != null) {
                String parts[] = linie.split(",");
                if(parts.length == 4) {
                    synchronized (logs) {
                        logs.add(new LogEntry(parts[0], parts[1], parts[2], parts[3]));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}