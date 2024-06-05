package exercitii_colocviu.Modele_COLOCVIU.Examen2017.Sub2;

import java.util.Objects;

public class Log {
    private String user;
    private String date;
    private long login_time;
    private long logout_time;

    public Log(String date, String user, long login_time, long logout_time) {
        this.date = date;
        this.user = user;
        this.login_time = login_time;
        this.logout_time = logout_time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getLogin_time() {
        return login_time;
    }

    public void setLogin_time(long login_time) {
        this.login_time = login_time;
    }

    public long getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(long logout_time) {
        this.logout_time = logout_time;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "date='" + date + '\'' +
                ", user='" + user + '\'' +
                ", login_time=" + login_time +
                ", logout_time=" + logout_time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return login_time == log.login_time && logout_time == log.logout_time && Objects.equals(user, log.user) && Objects.equals(date, log.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, date, login_time, logout_time);
    }
}
