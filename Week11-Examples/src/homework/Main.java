package homework;

public class Main {
    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("Ronaldo");
        FootballPlayer footballPlayer1 = new FootballPlayer("Messi");

        BasketballPlayer basketballPlayer = new BasketballPlayer("Kobe");
        BasketballPlayer basketballPlayer1 = new BasketballPlayer("Lebron");

        Team<FootballPlayer> fbFutbol = new Team<>("Fb Futbol");
        fbFutbol.addPlayer(footballPlayer);
        fbFutbol.addPlayer(footballPlayer1);
        fbFutbol.listPlayers();

        Team<BasketballPlayer> fbBasket = new Team<>("Fb Basket");
        fbBasket.addPlayer(basketballPlayer);
        fbBasket.addPlayer(basketballPlayer1);
        fbBasket.listPlayers();



    }
}
