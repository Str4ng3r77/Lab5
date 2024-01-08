package problema2;

public class Prada extends Animal{
    private double kilograme;
    public Prada(String nume, int varsta, double kilograme){
        super(nume,varsta);
        this.kilograme=kilograme;
    }

    public double getkg(){
        return kilograme;
    }

    public void setkg(){
        this.kilograme=kilograme;
    }

}