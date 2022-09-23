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
            result = "Команда : "+ team.getName()+ " " + '\n';
            for(Member member: team.getMan()){
                result += "Участник: " + member.getName()+ " " + '\n';
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
            if(valueRun>run) result = result + "Бег - пробежал "+ '\n';
            else result += "Бег - не добежал "+ '\n';

        }

        private void testJamp(int valueJamp){
            if(valueJamp>jamp) result += "Прыжок - допрыгнул "+ '\n';
            else result += "Прыжок - не допрыгнул "+ '\n';
        }

        private void testSwim(int valueSwim){
            if(valueSwim>swim) result += "Плавание - проплыл "+ '\n';
            else result += "Плавание - не доплыл "+ '\n';
        }

    }


