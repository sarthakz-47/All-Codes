public class typeConversion {
    public static void main(String[] args) {
        // Type Conversion:
        // when one type of data is converted to other type of data
        // but, type conversion is possible only when:
        // 1:Type Compatible
        // 2:Destination type > Source type

        int a = 25;
        long b = a;
        System.out.println(b);
        // here int and long are compatible both stores integers
        // and long(destination) > int(source)

        // double x = 3314.34;
        // float y = x;
        // System.out.println(y);
        // here float and double are compatible but,
        // float(destination) < double(source)
        // which will throw error

        // String name = "sarthak";
        // boolean condition = name;
        // here both data types are not compatible to each other
        // which will throw error

        // the basic structure follows:
        // byte->short->int->float->long->double

    }
}
