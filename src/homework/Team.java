package homework;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
    private String name;
    private List<T> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addPlayer(T player) {
        members.add(player);
        System.out.println(player.getName() + " added to team " + name);
    }

    public void listPlayers() {
        System.out.println("Players of team " + name + ":");
        for (T player : members) {
            System.out.println("- " + player.getName());
        }
    }

    public static void main(String[] args) {
        // TODO: Farklı türlerde oyuncu nesneleri oluşturun ve Team sınıfını kullanarak bir takım oluşturun.
        // Takıma oyuncuları ekleyin ve takımın oyuncularını listeyin.

    }
}