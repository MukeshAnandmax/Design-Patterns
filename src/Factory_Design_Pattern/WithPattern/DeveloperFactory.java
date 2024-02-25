package Factory_Design_Pattern.WithPattern;

public class DeveloperFactory {

    public static Software_Debelopers createDeveloper( String str){

        switch (str){
            case "BE":
                return new BackendDev();
            case "FE":
                return  new FromntEndDEv();
            case "DE":
                return  new Designer();
            case "FSD":
                return  new FullStackDev();
            default:
                return  null;
        }
    }
}
