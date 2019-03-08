public class Demo
{
    public static void main(String[] arg)
    {
            Team t1 = new Team();
            Competition c1 = new Competition("C1", "Team1", "Team2", 96);
            Competition c2 = new Competition("C2", "Team3", "Team4", 96);

            t1.setName("TeamABC");
            t1.setTeamerNames("John", "Michael", "Max", "Peter");
            t1.setCompetitions(c1, c2);

            t1.showTeamers();
            System.out.println();
            t1.infoCompetitons();
    }
}