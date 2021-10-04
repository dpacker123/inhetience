package comp.comp152;

import java.util.Random;

public class GovernmentProgram {
    private String programType;

    public GovernmentProgram(){
        String[] types = {"Medicare", "Medicaide", "VA", "ObamaCare", "CongressCare"}; //creating an array
        var numberPicker = new Random();
        var pick = numberPicker.nextInt(5); // creating a random number picker between 1 and 5
        programType = types[pick];

    }

    public void payBill(double bill){
        if (programType.equals("CongressCare"))
            System.out.println(programType + "just paid bill of " +bill*3);
        else
            System.out.println(programType + "Just paid bill of " + bill);

    }
}
