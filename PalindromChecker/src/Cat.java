import java.util.Random;

/**
 * Created by sisense on 9/30/15.
 */
public class Cat {
    private String name;
    private String color;
    private int age;
    private boolean sex;

    public Cat(String name, String color, int age, boolean sex) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }
    public boolean isSex(){
        return sex;
    }
    public void setSex(boolean sex){
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void voice(){
        System.out.println("Murrr-murrr");
    }

    public Cat makelove(Cat anotherCat){
        if (this.isSex() == true && anotherCat.isSex() ==true){
            System.out.println(this.getName()+ " "+anotherCat.getName()+" R fighting");
            return null;
        }
        if (this.isSex() == false && anotherCat.isSex() ==false) {
            System.out.println("Ha-ha");
            return null;
        }
        if (this.isSex()!=anotherCat.isSex()){
            Random rn = new Random();
            Cat myLittleCat = new Cat ("","",0, rn.nextBoolean());
            System.out.println("New cat created!");
            return myLittleCat;
        }
        return null;

    }


}
