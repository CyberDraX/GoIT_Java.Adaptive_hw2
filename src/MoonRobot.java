public class MoonRobot {

    public boolean canOvercomeHole(int holeDepth, int batteryPercent){
        return holeDepth < 34 || batteryPercent > 67;
    }

    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();

        //Should be false
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));
    }
}
