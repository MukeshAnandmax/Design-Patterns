package Factory_Design_Pattern.WithPattern;

public class client {
    public static void main(String[] args) {


        Software_Debelopers techie = DeveloperFactory.createDeveloper("FSD");

        techie.work();

    }
}
