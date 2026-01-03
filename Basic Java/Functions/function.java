package Functions;

public class function {

    public static void printMsg() {
        // What is a function?
        // Function is a reusable block of code whihch is used to perform a specefic
        // task
        // like a tv remote there are specefic buttons for specefic task
        // we can call a function multiple times

        // lets build a fuction for printing a msg that will print msg when it is called
        // syntax: public static <return type> <func name> (parameters){
        // return statement
        // }
        // here we have created a function with void which returns void means nothing
        // other than msg

        System.out.println("This is the messege!");
    }

    public static void main(String[] args) {
        // function is always called in main method
        // we will call that function here and it will print the messege
        // calling the function:
        printMsg();
    }
}
