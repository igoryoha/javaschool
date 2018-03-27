package Homework5;

public class Aircraft {
    public double maxSpeed; // Glider 65kmh, prop 700kmh, Turbo Jet non hyp 900 kmh, Turbo Jet hyp  2000 kmh
    public boolean canGlide=false;
    public boolean canFlyHypersonic=false;
    public String aircraftType;
    //public enum powerSource {WIND, HUMANPOWER, PROPELLER, JETPOWER}

    public void fly(){
        System.out.println("Flying ...");
            }

            public void printTechdata(){
                System.out.println("Aircraft type: " + aircraftType + ", Aircraft max speed is: " + this.maxSpeed );
            }
}
