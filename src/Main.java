public class Main {
    public static void main(String[] args) {
        String[][] annaSchedule = {{"monday", "cry"} , {"tuesday", "cheat on your husband"}, {"wednesday", "throw yourself under a train"}};
        String[][] annaSchedule2 = {{"thursday", "cry"} , {"friday", "cheat on your husband"}, {"saturday", "throw yourself under a train"}};

        Human mother = new Human("Anna", "Karenina", 1849, 105, annaSchedule);
        Human father = new Human("Alexei", "Karenin", 1829);
        Human father2 = new Human("Alexei", "Vronsky", 1853);
        Human mother2 = new Human("Anna", "Karenina", 1849, 105, annaSchedule2);

        Family family = new Family(mother, father);

        Human son = new Human("Sergei", "Karenin", 1869);
        Human daughter = new Human("Annie", "Karenina", 1876);
        family.addChild(son);
        family.addChild(daughter);

        String[] habits = {"bark to the postman", "eat whatever you see", "broke the vase"};
        Pet pet = new Pet("Dog", "Qəzənfər", 13, 31, habits);
        String[] habits2 = {"bark to the postman", "eat whatever you see", "broke the window"};
        Pet pet2 = new Pet("Dog", "Namiq", 13, 69, habits2);
        family.setPet(pet);

        mother.setFamily(family);
        father.setFamily(family);
        son.setFamily(family);

//        System.out.println(family);
//        System.out.println("Family consists of " + family.countFamily()  + " people\n");
//
//        daughter.greetPet();
//        son.describePet();
//        son.feedPet(false);
//        System.out.println();
//
//        family.deleteChild(son);
//        System.out.println(family);
//        System.out.println("Family consists of " + family.countFamily()  + " people\n");
//
//        System.out.println(mother.equals(mother2));
//        System.out.println(pet.equals(pet2));
    }
}
