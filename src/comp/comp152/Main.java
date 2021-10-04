package comp.comp152;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var inNetworkDoctors = new ArrayList<doctor>();
        inNetworkDoctors.add(new doctor("Pricey University", 400));
        inNetworkDoctors.add(new Surgeon("Childrens hospital", "fancy uni", 1000));
        var sickPatient = new person("Stu Dent");
        var sickPatient2 = new person(("Some Body"));
        var picker = new Random();
        var choice = picker.nextInt(inNetworkDoctors.size());


    }
}
