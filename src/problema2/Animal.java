package problema2;

public class Animal {
    private String nume;
    private int varsta;

    public Animal(String nume, int varsta){
        this.nume=nume;
        this.varsta=varsta;
    }

    public String getName() {
        return nume;
    }

    public void setName(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
}