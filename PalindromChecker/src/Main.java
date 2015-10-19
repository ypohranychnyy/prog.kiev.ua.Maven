/**
 * Created by sisense on 9/30/15.
 */
public class Main {
    public static void main(String[] args) {
//        PalindromeChecker checker = new PalindromeChecker();
//        String str1 = "mom";
//        String str2 = "testing";
//
//        checker.isPalindrome(str1);
//
//        if (checker.isPalindrome(str1)) {
//            System.out.println(str1 + " is palindrom");
//
//        } else
//            System.out.println(str1 + " is not palindrom");
        Cat Murzik = new Cat("Murzik", "grey", 2, true);
        System.out.println("Age - "+Murzik.getAge());
        System.out.println("Color - "+Murzik.getColor());
        System.out.println("Name - "+Murzik.getName());

        Murzik.voice();

        Cat Barsik = new Cat("Barsik", "White", 3, true);
        Cat Murka = new Cat("Murka", "black", 4, false);
        Cat Nika = new Cat("Nika", "red", 3, false);

        Murzik.makelove(Barsik);
        Murzik.makelove(Murka);
        Murka.makelove(Nika);
        Cat myNewCat = Murzik.makelove(Murka);
        System.out.println(myNewCat.getName());
        myNewCat.setName("Kitty");
        myNewCat.setColor("black");
        System.out.println(myNewCat.getName());
        System.out.println(myNewCat.getColor());
        System.out.println(myNewCat.getAge());
        System.out.println(myNewCat.isSex());

    }
}
