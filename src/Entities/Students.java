package Entities;

public class Students {

    public String name;
    public double noteT1;
    public double noteT2;
    public double noteT3;
    public String result;


    public String resultPass(){
        double r = this.noteT1 + this.noteT2 + this.noteT3 ;

        if(r >= 60){
            this.result = "Final note: " + r + "\nStudent " + this.name + "pass!!";

            return this.result;

        }   else {
            double failed = 60 - r;
            this.result = "Final note: " + r + "\nStudent " + this.name + " Failed!" + "\n" + failed + " points to go";

            return this.result;
        }

    }
}
