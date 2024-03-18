public class Film extends Author{
    private String nameMovie;
    private String yearMovie;

    public void setNameMovie(String nameMovie){
        this.nameMovie = nameMovie;
    }
    public String getNameMovie(){
        return this.nameMovie;
    }
    public void setYearMovie(String yearMovie){
        this.yearMovie = yearMovie;
    }
    public String getYearMovie(){
        return this.yearMovie;
    }
    public String Info(){
        return this.getNameAuthor()+" "+
                this.getSurName()+" majacy "+
                this.getYearAuthor()+" lat wyprodukowal "+
                this.getNameMovie()+" w "+
                this.getYearMovie()+" roku.";
    }
}
