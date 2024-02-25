package Factory_Design_Pattern.withoutPattern;

import Factory_Design_Pattern.WithPattern.DeveloperFactory;
import Factory_Design_Pattern.WithPattern.Software_Debelopers;

public class client {
    public static void main(String[] args) {

        Software_Debelopers techie = DeveloperFactory.createDeveloper("DE");

        techie.work();




    }
}
