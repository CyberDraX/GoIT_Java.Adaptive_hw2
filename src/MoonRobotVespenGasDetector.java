public class MoonRobotVespenGasDetector {

    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid){
        return acidValue >= minAcid && acidValue <= maxAcid;
    }

    public boolean isDensityOk(int density){
        return density >= 1000 && density <= 5000 ^ density >= 10000 && density <= 15000;
    }

    public boolean isTemperatureOk(boolean cold){
        return !cold;
    }

    public boolean isGroundOkForVespenGas (int acidValue, int minAcid, int maxAcid, int density, boolean cold){
        return isAcidOk(acidValue, minAcid, maxAcid) ^ isDensityOk(density) ^ isTemperatureOk(cold);
    }

    public static void main(String[] args) {
        MoonRobotVespenGasDetector moonRobotVespenGasDetector = new MoonRobotVespenGasDetector();

        //Should be true
        System.out.println("moonRobotVespenGasDetector.isAcidOk(100,50,150) = " + moonRobotVespenGasDetector.isAcidOk(100, 50, 150));

        //Should be true
        System.out.println("moonRobotVespenGasDetector.isDensityOk(1500) = " + moonRobotVespenGasDetector.isDensityOk(1500));

        //Should be false
        System.out.println("moonRobotVespenGasDetector.isDensityOk(30000) = " + moonRobotVespenGasDetector.isDensityOk(30000));

        //Should be true
        System.out.println("moonRobotVespenGasDetector.isTemperatureOk(false) = " + moonRobotVespenGasDetector.isTemperatureOk(false));

        //Should be true
        System.out.println("moonRobotVespenGasDetector.isGroundOkForVespenGas(120, 75, 150, 7500, false) = " + moonRobotVespenGasDetector.isGroundOkForVespenGas(120, 75, 150, 7500, false));
    }
}