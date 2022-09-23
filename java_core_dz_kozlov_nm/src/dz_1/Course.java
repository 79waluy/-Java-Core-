package dz_1;

public class Course {

        String result;
        private int run;
        private int jamp;
        private int swim;


        public Course(int run, int jamp, int swim) {
            this.run = run;
            this.jamp = jamp;
            this.swim = swim;
        }

        public String doIt(Team team){
            result = "������� : "+ team.getName()+ " " + '\n';
            for(Member member: team.getMan()){
                result += "��������: " + member.getName()+ " " + '\n';
                int valueRun = member.getcanRun();
                int valueJamp = member.getcanJamp();
                int valueSwim = member.getcanSwim();
                testRun(valueRun);
                testJamp(valueJamp);
                testSwim(valueSwim);

            }

            return result;
        }

        private void testRun(int valueRun){
            if(valueRun>run) result = result + "��� - �������� "+ '\n';
            else result += "��� - �� ������� "+ '\n';

        }

        private void testJamp(int valueJamp){
            if(valueJamp>jamp) result += "������ - ��������� "+ '\n';
            else result += "������ - �� ��������� "+ '\n';
        }

        private void testSwim(int valueSwim){
            if(valueSwim>swim) result += "�������� - ������� "+ '\n';
            else result += "�������� - �� ������ "+ '\n';
        }

    }


