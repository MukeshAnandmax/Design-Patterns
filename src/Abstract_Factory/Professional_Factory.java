package Abstract_Factory;

public class Professional_Factory implements ProfessionFactory{
    @Override
    public Profession getProfession(String str) {

        switch (str){
            case "ENG":
                return new Engineer();
            case "TEA":
                return  new Teacher();
            default:
                return null;
        }

    }
}
