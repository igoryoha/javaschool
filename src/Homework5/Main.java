package Homework5;

public class Main {
    public static void main(String[] args) {

        RegularGlider glider1 = new RegularGlider();
glider1.canGlide=true;
glider1.maxSpeed=65;
glider1.canFlyHypersonic=false;
glider1.aircraftType="Regular Glider";
//System.out.println(glider1.canGlide);
glider1.printTechdata();


        PropellerAirplane propeller1 = new PropellerAirplane();
        propeller1.canGlide=true;
        propeller1.maxSpeed=700;
        propeller1.canFlyHypersonic=false;
        propeller1.aircraftType="Propellered Airplane";
       // System.out.println(glider1.canGlide);
        propeller1.printTechdata();

        JetPlane jet1 = new JetPlane();
        //System.out.println("Jet1 can glide? " + jet1.canGlide);
        //.canGlide=true;
        jet1.maxSpeed=900;
        jet1.canFlyHypersonic=false;
        jet1.aircraftType="Jet airplane";
       // System.out.println(jet1.canGlide);
        jet1.printTechdata();

        JetPlaneHypersonic jethyp1 = new JetPlaneHypersonic ();
       // System.out.println("JetHyp can glide? " + jethyp1.canGlide);
        //.canGlide=true;
        jethyp1.maxSpeed=2000;
        jethyp1.canFlyHypersonic=true;
        jethyp1.aircraftType="Hypersonic Jet airplane";
        //System.out.println(jethyp1.canGlide);
        jethyp1.printTechdata();


    }
}
