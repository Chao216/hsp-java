import com.aalto.Dog;

public class usePackage {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Jenny","White",2,3.9);
        com.lut.Dog dog2 = new com.lut.Dog("Toni",3);

        System.out.println(dog2);
        System.out.println(dog1);

    }


}
