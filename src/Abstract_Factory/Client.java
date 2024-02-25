package Abstract_Factory;

public class Client {
    public static void main(String[] args) {

        ProfessionFactory traineeOrProfessional = AbstractFActory.isTraineeOrProfessional(false);
        Profession eng = traineeOrProfessional.getProfession("ENG");
        eng.Work();

    }
}
