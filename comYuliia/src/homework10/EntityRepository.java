package homework10;

import java.util.Arrays;

public class EntityRepository {
    static int count;

    public static SuperEntity[] entities = new SuperEntity[4];

    public EntityRepository() {
        count++;
    }

    public SuperEntity[] getEntities() {
        return entities;
    }

    public void getInfo() {
        for (int k = 0; k < entities.length; k++) {
            System.out.println("Index of array is " + k + ", name is " + entities[k].getName() + ", id is " + entities[k].getId());
        }
    }

    protected void addEnt() {
        SuperEntity entity4 = new SuperEntity();
        System.out.println("Amount of added entities is " + count);
    }

    protected void getById(int id) {
        for (int j = 0; j < entities.length; j++) {
            SuperEntity entity4 = entities[j];
            if (entities[j].getId() == id) {
                System.out.println(entity4);
            }
        }
    }

    protected boolean deleteById(int id) {
        for (int l = 0; l < entities.length; l++) {
            if (entities[l].getId() == id) {
                entities[l] = null;
               return true;
            }
        }
        return false;
    }
}




