package dz_1;

public class Member {
    private String name;
    private int canRun;
    private int canJamp;
    private int canSwim;


    public Member(String name, int canRun, int canJamp, int canSwim) {
        this.name = name;
        this.canRun = canRun;
        this.canJamp = canJamp;
        this.canSwim = canSwim;
    }

    public String getName() {
        return name;
    }

    public int getcanRun() {
        return canRun;}
    public int getcanJamp() {
            return canJamp;}
            public int getcanSwim () {
                return canSwim;
            }
        }