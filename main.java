package lab1;


import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String args[]) {

        Character character1 = new Character.Builder().withName("Character1").withHealth(10).withAttack(5).build();
        Character character2 = new Character.Builder().withName("Character2").withHealth(20).withAttack(6).build();
        Character character3 = new Character.Builder().withName("Character3").withHealth(30).withAttack(7).build();
        Character character4 = new Character.Builder().withName("Character4").withHealth(40).withAttack(8).build();
        Character character5 = new Character.Builder().withName("Character5").withHealth(50).withAttack(9).build();
        Character character6 = new Character.Builder().withName("Character6").withHealth(60).withAttack(10).build();
        Character character7 = new Character.Builder().withName("Character7").withHealth(70).withAttack(11).build();
        List<Character>list1=new ArrayList<Character>();
        list1.add(character1);
        list1.add(character2);
        list1.add(character3);
        list1.add(character4);
        list1.add(character5);
        list1.add(character6);
        list1.add(character7);
        Game obj= new Game.Builder().withGameName("Game1").withDeveloper("Developer1").withList(list1).build();
        System.out.println(obj);

        ;
    }
}
