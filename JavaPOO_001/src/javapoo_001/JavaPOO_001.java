package javapoo_001;
import javapoo_001.model.Cat;
public class JavaPOO_001 {
    public static void main(String[] args) {
        
        Cat c = new Cat();
        
        c.setName("tom");
        c.setAge("2");
        c.setColor("Orange");
        c.setGender("Male");
        c.setWeight("3");
        
        //System.out.println("O gato " +c.getName()+" tem "+ c.getAge()+" anos");
        
        //System.out.println(c.printCat());
        
        System.out.println(c.toString());
    }

}
