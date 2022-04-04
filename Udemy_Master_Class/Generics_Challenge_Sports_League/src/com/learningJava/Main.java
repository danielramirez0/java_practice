package com.learningJava;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> nfl = new League<>("NFL");

        Team<FootballPlayer> raiders = (new Team<>("Raiders"));
        Team<FootballPlayer> dolphins = (new Team<>("Dolphins"));
        Team<FootballPlayer> chargers = (new Team<>("Chargers"));
        Team<FootballPlayer> rams = (new Team<>("Rams"));

        nfl.add(raiders);
        nfl.add(dolphins);
        nfl.add(chargers);
        nfl.add(rams);

        raiders.matchResult(dolphins, 31, 21);
        raiders.matchResult(chargers, 31, 21);
        raiders.matchResult(rams, 31, 21);
        rams.matchResult(dolphins, 31, 21);
        rams.matchResult(chargers, 31, 21);

        Team<BaseballPlayer> cubs = (new Team<>("Chicago Cubs"));

//        nfl.add(cubs);

        nfl.showLeagueTable();


        // AVOID USING RAW TYPES (i.e. not specifying the type as parameter)
        BaseballPlayer bob = new BaseballPlayer("Bob");
        SoccerPlayer beck = new SoccerPlayer("Beck");

        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(bob); // unchecked warning because no T is defined
        rawTeam.addPlayer(beck);// unchecked warning because no T is defined

        nfl.add(rawTeam); // unchecked warning because no T is defined

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(raiders); // no warning
        rawLeague.add(new Team<BaseballPlayer>("Baseball Player Team")); // no warning
        rawLeague.add(rawTeam); // no warning


        League reallyRaw = new League<>("Really raw");
        reallyRaw.add(raiders); // unchecked warning because no T is defined
        reallyRaw.add(new Team<BaseballPlayer>("Another Baseball team"));
        reallyRaw.add(rawTeam); // unchecked warning because no T is defined


        // This will compile, but will run into errors when starting actually run other methods in testing, production or elsewhere.

        // By Using generics (above) you can identify errors at compile time and not in production or elsewhere.
    }
}
