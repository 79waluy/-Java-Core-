package dz_1;

public class Winner {
    public static void main(String[] args) {
    Member[] member = new Member[4];
        member[0] = new Member("����� 1", 2500, 5, 1000 );
        member[1] = new Member("����� 2", 3000, 2, 500);
        member[2] = new Member("����� 3", 3500, 4, 1200);
        member[3] = new Member("����� 4", 5000, 5, 900);
    Team team = new Team("N 1", member);

    Course course = new Course(3000,3,800);
    String result = course.doIt(team);
    System.out.println(result);

}
}
