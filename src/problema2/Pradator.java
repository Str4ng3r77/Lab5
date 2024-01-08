package problema2;

public class Pradator extends Animal{
    private String culoare;
    public Pradator(String nume, int varsta, String culoare){
        super(nume,varsta);
        this.culoare=culoare;
    }

    public String getCuloare(){
        return culoare;
    }

    public void setCuloare(){
        this.culoare=culoare;
    }

}
