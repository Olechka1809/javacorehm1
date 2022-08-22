package Javacore.src.homeWork.javacorehm1.obstacleCourse;


import Javacore.src.homeWork.javacorehm1.Status;
import Javacore.src.homeWork.javacorehm1.team.Team;
import Javacore.src.homeWork.javacorehm1.team.TeamMember;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (TeamMember member: team.getMembers()) {
            for (Obstacle obs :obstacles) {
                obs.goChallenge(member);
                if (member.getStatus()== Status.NoPassedDistance){
                    break;
                }
            }
        }
    }

}
