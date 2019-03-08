public class Competition
{
	
    private String competitionName;
    private String winningTeam;
    private String runnerupTeam;
    private int year;

    public Competition()
    {
        this.competitionName = "";
        this.winningTeam = "";
        this.runnerupTeam = "";
        this.year = 0;
    }

    public Competition(String name, String team1, String team2, int year)
    {
        this.competitionName = name;
        this.winningTeam = team1;
        this.runnerupTeam = team2;
        this.year = year;
    }

    public void setName(String name)
    {
        this.competitionName = name;
    }

    public void setTeam1(String name)
    {
        this.winningTeam = name;
    }

    public void setTeam2(String name)
    {
        this.runnerupTeam = name;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getName()
    {
        return this.competitionName;
    }

    public String getTeam1()
    {
        return this.winningTeam;
    }

    public String getTeam2()
    {
        return this.runnerupTeam;
    }

    public int getYear()
    {
        return this.year;
    }
}