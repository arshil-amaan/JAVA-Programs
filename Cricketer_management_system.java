import java.util.*;

class Cricketer {
    private int cricketerId;
    private int matchesPlayed;
    private int totalRuns;
    private String cricketerName;
    private String team;

    Cricketer(int cricketerId, int matchesPlayed, int totalRuns, String cricketerName, String team) {
        this.cricketerId = cricketerId;
        this.matchesPlayed = matchesPlayed;
        this.totalRuns = totalRuns;
        this.cricketerName = cricketerName;
        this.team = team;
    }

    // getters
    public int getCricketerId() {
        return cricketerId;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public String getTeam() {
        return team;
    }

    // setters
    public void setCricketerId(int cricketerId) {
        this.cricketerId = cricketerId;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}

public class Cricketer_management_system {
    public static Cricketer findCricketerWithMinimumMatchesPlayed(Cricketer[] cricketers) {
        int min = Integer.MAX_VALUE;
        Cricketer result = null;
        for (int i = 0; i < cricketers.length; i++) {
            if (cricketers[i].getMatchesPlayed() < min) {
                min = cricketers[i].getMatchesPlayed();
                result = cricketers[i];
            }
        }
        return result;
    }

    public static Cricketer searchCricketerById(Cricketer[] cricketers, int id) {
        for (int i = 0; i < cricketers.length; i++) {
            if (cricketers[i].getCricketerId() == id) {
                return cricketers[i];
            }
        }
        System.out.println("No Cricketer Found with id : " + id);
        return null;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Cricketer[] cricketers = new Cricketer[n];
        for (int i = 0; i < cricketers.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();
            Cricketer player = new Cricketer(a, b, c, d, e);
            cricketers[i] = player;
        }
        int id = sc.nextInt();

        Cricketer minMatchPlayedPlayer = findCricketerWithMinimumMatchesPlayed(cricketers);
        System.out.println("minimum matches "+minMatchPlayedPlayer.getCricketerId() + " " + minMatchPlayedPlayer.getCricketerName());
        
        Cricketer searchedCricketer = searchCricketerById(cricketers, id);

        if(searchedCricketer != null){
            System.out.println("searched cricketer "+searchedCricketer.getCricketerId() + " " + searchedCricketer.getCricketerName());
        }
        sc.close();
    }
}
