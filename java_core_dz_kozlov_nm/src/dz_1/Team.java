package dz_1;

public class Team {
    private String name;
    private Member[] man;

    public Team(String name, Member[] man) {
        this.name = name;
        this.man = man;
    }

    public String getName() {
        return name;
    }

    public Member[] getMan() {
        return man;
    }
}
