package comp.comp152;

public class doctor {
    protected String AlmaMater;
    private double fee;

    public void treatPatient(person patient){
        System.out.println("Place holder for treat patient");
        

    }
    public double billPatient(person patient){
        return fee;
    }
    public double billPatient(boolean isMedicare, GovernmentProgram program){
        if (isMedicare)
            return fee/2;
        return fee;
    }
}
