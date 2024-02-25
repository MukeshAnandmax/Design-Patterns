package Abstract_Factory;

public class AbstractFactoryClient {
    public static void main(String[] args) {

        ProfessionFactory traineeOrProfessional = AbstractFActory.isTrainee(true);
        Profession eng = traineeOrProfessional.getProfession("TEA");
        eng.Work();

    }
}
