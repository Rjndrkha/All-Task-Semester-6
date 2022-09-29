public class ExampleTypeData{
    public static void main (String args []){

        char bloodType = 'A';
        byte distance = (byte) 130;
        short theNumberOfResidentsInOneVillage = 1025;
        float temperature = 60.50F;
        double weight = 0.5467812345;
        long balance= 150000000;
        int numberDecimal = 0x10;

        System.out.println("Blood Type\t\t\t\t\t\t:" + (byte) bloodType);
        System.out.println("Distance\t\t\t\t\t\t:" + distance);
        System.out.println("The Number Of Residents In One Village\t\t\t:" + theNumberOfResidentsInOneVillage);
        System.out.println("Temperature\t\t\t\t\t\t:" + temperature);
        System.out.println("Weight\t\t\t\t\t\t\t:" + (float) weight);
        System.out.println("Balance\t\t\t\t\t\t\t:" + balance);
        System.out.println("Number Decimal\t\t\t\t\t\t:" + numberDecimal);
    }
}