package exercitii_colocviu.Modele_COLOCVIU.Examen2017.Sub3;

class LogEntry {
    String user;
    String date;
    String loginTime;
    String logoutTime;

    public LogEntry(String user, String date, String loginTime, String logoutTime) {
        this.user = user;
        this.date = date;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
    }

    public String getUser() {
        return user;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "user='" + user + '\'' +
                ", date='" + date + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", logoutTime='" + logoutTime + '\'' +
                '}';
    }
}
