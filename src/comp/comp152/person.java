package comp.comp152;

public class person {
    private String Name;
    public person(String Name){
        this.Name = Name;
    }

    public void getTreated(){
        System.out.println(" My name is " + Name + "and I feel so much better");
    }

    public void payBill(double bill){
        System.out.println("Ouch, I needed to pay a bill of " + bill);
    }


}
