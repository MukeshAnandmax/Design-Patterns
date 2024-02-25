package Abstract_Factory;

public class AbstractFActory {

    public static ProfessionFactory isTraineeOrProfessional(boolean isTrainee){

        if(isTrainee){
            return new Trainee_Factory();
        }

        return new Professional_Factory();
    }
}
