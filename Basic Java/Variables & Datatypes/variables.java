public class variables {
    public static void main(String[] args) {
        // Variables is the term used in java which are changable entities
        // for example:
        int number = 10;
        // here int -> datatype
        // number -> variable
        number = 5;
        System.out.println(number);
        // we can use that variable name to print out data stored in that variable

        // there are rules in defining variables names like:
        // 1.variable name can only start with alphabate or _ or $ sign
        // 2.variable name cannot be started with number
        // 3.variables are case sensitive num!=NUM
        // 4.cannot contain any white spaces and special characters
        // 5.cannot be reserved word (static,void,etc.)

        // Always try to give meanigfull names to variables like:
        float pi = 3.14f;
        String name = "Sarthak";

        System.out.println(pi);
        System.out.println(name);
    }
}
