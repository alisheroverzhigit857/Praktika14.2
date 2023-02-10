public class Main {
    public static void main(String[] args) {
        Combain combain = new Combain("New Holland TC5.30",2020.12, "Yellow",20000);
        System.out.println("Combain: "+combain+ combain.toStart()+combain.toStop());
        BMV bmv = new BMV("X7",2022.01,"Blue",100000);
        System.out.println("Marka: "+bmv+bmv.toStart()+bmv.toStop());
        Traktor traktor =new Traktor("Ka700",1967,"Yellow", 10000);
        System.out.println("traktor: "+traktor+traktor.toStart()+traktor.toStop());
        Mersedes mersedes = new Mersedes("C220",1996,"Black",5000);
        System.out.println("Mersedes: "+mersedes+mersedes.toStart()+mersedes.toStop());
        HondaFit hondaFit = new HondaFit("Honda fit", 2017,"White",4000);
        System.out.println("Honda fit: "+hondaFit+hondaFit.toStart()+hondaFit.toStop());
    }
}