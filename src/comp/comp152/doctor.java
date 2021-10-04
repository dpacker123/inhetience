package comp.comp152;

public class doctor {
    protected String AlmaMater;
    private double fee;

    public doctor(String MedSchool, double fee){
        AlmaMater = MedSchool;
        this.fee = fee;
    }

    public void treatPatient(person patient){
        System.out.println("Place holder for treat patient");
        patient.getTreated();


    }
    public double billPatient(person patient){
        patient.payBill(fee);
        return fee;
    }
    public double billPatient(boolean isMedicare, GovernmentProgram program){
        if (isMedicare)
            return fee/2;
        return fee;
    }
}
