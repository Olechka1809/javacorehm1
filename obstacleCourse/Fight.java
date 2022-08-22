package Javacore.src.homeWork.javacorehm1.obstacleCourse;


import Javacore.src.homeWork.javacorehm1.team.TeamMember;

public class Fight extends Obstacle {
    public Fight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.fight(super.getDifficulty());
    }
}
