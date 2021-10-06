package comp.comp152;

public class Surgeon extends doctor{
    private String hospital;

    public Surgeon(String hospital, String medSchool, double fee){
        super(medSchool, fee);//super must be in the first line of code
        this.hospital = hospital;
    }

    @Override
    public void treatPatient(person patient){
        System.out.println("Surgeon who graduated from " + AlmaMater + "doing surgery at " + hospital);
        super.treatPatient(patient);
    }
}
