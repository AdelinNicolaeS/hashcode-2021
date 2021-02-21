import java.util.ArrayList;

public class Output {
    private int numberOfTeams = 0;
    private ArrayList<Team> teams = new ArrayList<>();

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }

    @Override
    public String toString() {
        String out = "";
        out += numberOfTeams + "\n";
        for (Team team : teams) {
            out += team.getNumberOfMembers() + " ";
            for (Pizza pizza : team.getPizzas()) {
                out += pizza.getId() + " ";
            }
            out += "\n";
        }
        return out;
    }
}
