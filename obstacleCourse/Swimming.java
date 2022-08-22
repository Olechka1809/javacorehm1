package Javacore.src.homeWork.javacorehm1.obstacleCourse;

import Javacore.src.homeWork.javacorehm1.team.TeamMember;

public class Swimming extends Obstacle {
    public Swimming(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.swim(super.getDifficulty());
    }
}
