package Abstract_Factory;

public class Trainee_Factory implements ProfessionFactory{
    @Override
    public Profession getProfession(String str) {

        switch (str){
            case "ENG":
                return new TraineeEngineer();
            case "TEA":
                return  new TraineeTeacher();
            default:
                return null;
        }

    }
}
