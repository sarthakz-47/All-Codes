package Conditionals;

public class elseif {
    public static void main(String[] args) {
        // ifelse if okay what is else-if now?
        // else if is used when there are multiple conditions and
        // if one condition satisfies it do not checks else if condition
        // and if not it checks else if condition
        // which is advantageous than if-if conditions where each condition is checked

        int year = 1999;
        if (year < 2000) {
            System.out.println("Milenials");
        } else if (year > 2000 && year < 2025) {
            System.out.println("Gen-Z");
        } else {
            System.out.println("Gen Alpha");
        }
    }
}
