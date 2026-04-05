package Lesson22;

public class SwitchDemo {
    static void main() {
        System.out.println(getWinner(280,320,340,580));
    }

    public static String getWinner(int gryffindorPoints,
                                   int slyserinPoint,
                                   int ravenclawPoint,
                                   int hufflepufPoint) {
        int maxPoints = Math.max(Math.max(Math.max(gryffindorPoints, slyserinPoint), ravenclawPoint), hufflepufPoint);
        String returnWinner;
        if (maxPoints==gryffindorPoints){
            returnWinner = "Gryffindor";
        } else if (maxPoints==slyserinPoint){
            returnWinner = "Slyserin";
        } else if (maxPoints==ravenclawPoint) {
            returnWinner = "Ravenclaw";
        } else {
            returnWinner = "Hufflepuf";
        }

        switch (returnWinner) {
            case "Gryffindor":
                return "Gryffindor";
            case "Slyserin":
                return "Slyserin";
            case "Ravenclaw":
                return "Ravenclaw";
            default:
                return "Hufflepuf";
        }

    }

}
