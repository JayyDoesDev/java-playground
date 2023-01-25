
public class Main {
    // w
    public static void main(String[] args) {
    	String name = "John";
        int number = 1;
        float deci = 19.99f;
        char letter = 'B';
        boolean trueFalse = true; 
        doMath();
        getRandomNumber(30);
        compareInteger(13, 2);
        array();
     //   whileFun(500);
    	System.out.println(name + number + deci + letter + trueFalse);
        System.out.println("Hello World");
    }

    public static void doMath() {
        int mat = 50000;
        int mat2 = 600000;
        System.out.println(mat + mat2);
    }

    public static int getRandomNumber(int number) {
        return (int)(Math.random() * number);      
    } 

    public static boolean compareInteger(int number, int number2) {
        if (number >= number2) {
            System.out.println(number + " is bigger or equal to " + number2);
            return true;
        } else {
            System.out.println(number + " is not bigger or equal to " + number2);
            return false;
        }
    }

    public static void whileFun(int number) {
        int fakeIndex = 0;
        // Do/while loop (do can be used here as well)
        while (0 < number) {
            System.out.println(fakeIndex);
            fakeIndex++;
        }
    }

    public static void eachElement() {
        String[] sources = {"github", "something", "ok"};
        for (String i : sources) {
            System.out.println(i);
        }
    }

    public static void array() {
        String[] socialMedias = {"twitter", "instagram", "snapchat"};
        // for loop
        for (int i = 0; i < socialMedias.length; i++) {
            System.out.println(socialMedias[i]);
        }
    }

}