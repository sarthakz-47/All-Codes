public class typeCasting {
    public static void main(String[] args) {
        // Type Casting:
        // we forces java to convert data even if data is lost during the process
        // if we want to convert a data which must be in compatible mode
        // we can foreceflly cast the data using other datatype

        float pi = 3.14f; // here the value contain 3.14
        int pi_numeric = (int) pi; // here it is forcing float value to convert in int format
                                   // even if there is lossy conversions
        System.out.println(pi_numeric);

        double number = 233434.223;
        long number_x = (long) number;
        System.out.println(number_x);

        // same logic applies here.
        // In short: Type Casting means forcefull type conversion even in loss of data.

    }
}
