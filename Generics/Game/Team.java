package Generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipantInTeam(T participant){
        participantList.add(participant);
        System.out.println("dobavlen uchastnik v komandu "+name+" po imeni "+ participant.getName());
    }

    public void playWith(Team<T> team){
        String winnerGame;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i==0){
            winnerGame = this.name;
        } else {
            winnerGame=team.name;
        }
        System.out.println("Viigrala konamda "+winnerGame);
    }
}
