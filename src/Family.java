import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }
    public void addChild(Human child) {
        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
        child.setFamily(this);
    }

    public boolean deleteChild(Human[] children, int index) {
        if (index >= children.length) {
            System.out.println("You are trying to delete a child that doesn't exist");
            return false;
        }
        if (index < 0) {
            System.out.println("Invalid index");
            return false;
        }
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i == index) {
                children[i].setFamily(null);
                continue;
            }
            newChildren[j] = children[i];
            j++;
        }
        children = newChildren;
        return true;
    }

    public int countChildren() {
        return (2 + children.length);
    }
    // Getters
    public Human getMother() {
        return mother;
    }
    public Human getFather() {
        return father;
    }
    public Human[] getChildren() {
        return children;
    }
    public Pet getPet() {
        return pet; }

    // Setters

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public void setChildren(Human[] children) {
        this.children = children;
    }


    @Override
    public String toString() {
        return String.format("Family{mother=%s, father=%s, children=%s, pet=%s}",
                mother, father, Arrays.toString(children), pet);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Family family)) {
            return false;
        }
        Family familyObj = (Family) obj;
        if (!Objects.equals(mother, familyObj.mother)) return false;
        if (!Objects.equals(father, familyObj.father)) return false;
        if (!Arrays.equals(children, familyObj.children)) return false;
        return Objects.equals(pet, familyObj.pet);
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (mother != null) {
            result = 31 * result + mother.hashCode();
        };
        if (father != null) {
            result = 31 * result + father.hashCode();
        }
        if (pet != null) {
            result = 31 * result + pet.hashCode();
        }
       return (31 * result + Arrays.hashCode(children));
    }

}
