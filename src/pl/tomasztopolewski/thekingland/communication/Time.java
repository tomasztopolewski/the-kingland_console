package pl.tomasztopolewski.thekingland.communication;

public class Time {
    private int startTimeMil; //początkowy czas w milisekundach
    private int currentTimeMil; //aktualny czas  w milisekundach
    private int time; //zliczony czas w grze
    private int[] timeInTab = new int[2];
    private int absolutiveTimeOfGames; //caly zliczony czas w grze


    public Time() {
        downloadStartTimeMil();
        this.currentTimeMil = 0;
        this.time = 0;
        this.absolutiveTimeOfGames = 0;
    }
    /*public Time() {
        this.startTimeMil = 0;
        this.currentTimeMil = 0;
        this.time = 0;
        this.absolutiveTimeOfGames = 0;
    }*/
    public Time(int time, int absolutiveTimeOfGames) {
        this.startTimeMil = 0;
        this.currentTimeMil = 0;
        this.time = time;
        this.absolutiveTimeOfGames = absolutiveTimeOfGames;
    }

//////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////

    public void setStartTimeMil(int startTimeMil) {
        this.startTimeMil = startTimeMil;
    }
    public void setStartTimeMil() {
        this.startTimeMil = getCurrentTimeMil();
    }
    public int getStartTimeMil() {
        return this.startTimeMil;
    }
    public void downloadStartTimeMil() {
        this.startTimeMil = (int) System.currentTimeMillis();
    }

    public void setDownloadedTimeMil(int currentTimeMil) {
        this.currentTimeMil = currentTimeMil;
    }
    public int getCurrentTimeMil() {
        return this.currentTimeMil;
    }
    public void downloadCurrentTimeMil() {
        this.currentTimeMil = (int) System.currentTimeMillis();
    }

    public int getTime() {
        return time;
    }

    public void calcTimeSec() {
        int differenceTimeMil = this.currentTimeMil - this.startTimeMil;
        int time = differenceTimeMil / 1000;
        time -= this.time;
        this.time += time;
    }

    public String getActualTime() {
        downloadCurrentTimeMil();
        calcTimeSec();
        int min = 0, time = this.time;

        while (time >= 60) {
            min++;
            time -= 60;
        }

        return min + " min " + time + " sec";
    }
}

// Tomasz Topolewski