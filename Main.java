package Javacore.src.homeWork.javacorehm1;

import Javacore.src.homeWork.javacorehm1.obstacleCourse.Course;
import Javacore.src.homeWork.javacorehm1.obstacleCourse.Cross;
import Javacore.src.homeWork.javacorehm1.obstacleCourse.Fight;
import Javacore.src.homeWork.javacorehm1.obstacleCourse.Swimming;
import Javacore.src.homeWork.javacorehm1.team.Team;
import Javacore.src.homeWork.javacorehm1.team.TeamMember;

public class Main {

    public static void main(String[] args) {
        Team dreamTeam = new Team("Family",
                new TeamMember("Ola", 7),
                new TeamMember("Dima", 6),
                new TeamMember("Kirill", 5),
                new TeamMember("Andrey" ,4));

        Course course = new Course(new Cross(5), new Swimming(5), new Fight(6));
        course.doIt(dreamTeam);

    }
}
