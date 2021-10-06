package comp.comp152;

public class doctor {
    protected String AlmaMater;
    private double fee;

    public doctor(String MedSchool, double fee){
        AlmaMater = MedSchool;
        this.fee = fee;
    }

    public void treatPatient(person patient){
        System.out.println("The Doctor says take two of these and call the office in the morning");
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
    @Override
    public String toString(){
        return "Doctor: \nMed School: " + AlmaMater+"\nFee:" + fee;
    }

    @Override
    public boolean equals(Object other){
        if (!(other instanceof doctor)){
            return false;

        }
        doctor otherDoctor = (doctor) other;
        var isSame = this.fee == otherDoctor.fee && this.AlmaMater.equals(otherDoctor.AlmaMater);
        return isSame;
    }
}
