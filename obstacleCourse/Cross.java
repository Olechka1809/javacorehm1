package Javacore.src.homeWork.javacorehm1.obstacleCourse;


import Javacore.src.homeWork.javacorehm1.team.TeamMember;

public class Cross extends Obstacle {

    public Cross(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.run(super.getDifficulty());
    }

}
