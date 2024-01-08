package problema2;

public class Main {
    public static void main(String[] args) {
        Pradator pradator = new Pradator("urs",5,"alb");
        Prada prada = new Prada("peste",1,1);

        System.out.println("Tip pradator: "+pradator.getName());
        System.out.println("Varsta pradator: "+pradator.getVarsta());
        System.out.println("Culoare pradator: "+pradator.getCuloare());

        System.out.println("Tip prada: "+prada.getName());
        System.out.println("Varsta prada: "+prada.getVarsta());
        System.out.println("Greutate prada: "+prada.getkg());
    }
}