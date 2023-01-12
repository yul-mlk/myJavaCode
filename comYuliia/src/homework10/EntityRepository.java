package homework10;

import java.util.Arrays;

public class EntityRepository {
    int getId;
    String getName;
    static int count;

    public static EntityRepository[] entities = new EntityRepository[4];

    public EntityRepository[] getEntities() {
        return entities;
    }

    public EntityRepository(int getId, String getName) {
        this.getId = getId;
        this.getName = getName;
        count++;

    }

    public EntityRepository() {

        count++;
    }

    public EntityRepository(int getId) {
        this.getId = getId;
        count++;
    }

    public void getInfo() {
        for (int k = 0; k < entities.length; k++) {
            //System.out.println(EntityRepository.entities);
            System.out.println("Index of array is " + k + ", name is " + entities[k].getName + ", id is " + entities[k].getId);
        }


        public void addEnt() {
            EntityRepository entity4 = new EntityRepository();
            System.out.println("Amount of added entities is " + count);
        }


        /*public void getById(int id){
            for (int j = 0; j < entities.length; j++) {
                EntityRepository entity4 = entities[j];
                if (entities[j].getId == id) {
                    System.out.println(entity4);
                }
            }*/


            public void deleteById(int id){
                for (int l = 0; l < entities.length; l++) {
                    EntityRepository entity5 = entities[l];
                    if (entities[l].getId == 2) {
                        entities[l] = null;
                        System.out.println(Arrays.toString(EntityRepository.entities));

                    }
                }
            }
        }
    }



/*EntityRepository entity = new EntityRepository();
    EntityRepository entity1 = new EntityRepository();
    EntityRepository entity2 = new EntityRepository();
    public static void main(String[] args) {
      entities[0] = entity;
      entities[1] = entity1;
      entities[2] = entity2;*/



    /*protected void getEntities(int i) {
        entities = new EntityRepository[i];
    }*/

   /*public static void getInfo() {
        for (int k = 0; k < LectureRepository.getLectures().length; k++) {
            System.out.println("Index of array is " + k + ", name is " + LectureRepository.getLectures()[k].getName() + ", id is " + LectureRepository.getLectures()[k].getId());*/

    /*public static void getInfo() {
        for (int k = 0; k < entities.length; k++) {
            System.out.println("Index of array is " + k + ", name is " + entities[k] + ", id is " + entities[k]);
        }*/

    /*protected static void addLecture() {
            Lecture lecture = new Lecture("Introduction", 1);
            System.out.println("Amount of added lectures is " + Lecture.getCount());*/


/*public static void getById(int id) {
        for (int j = 0; j < LectureRepository.getLectures().length; j++) {
            Lecture lecture4 = LectureRepository.getLectures()[j];
            if (LectureRepository.getLectures()[j].getId() == id) {
                System.out.println(lecture4);}*/


/*public static boolean deleteById(int id) {
        for (int l = 0; l < LectureRepository.getLectures().length; l++) {
            Lecture lecture4 = LectureRepository.getLectures()[l];
            if (LectureRepository.getLectures()[l].getId() == id) {
                LectureRepository.getLectures()[l] = null;
                return true;
                return false;
            System.out.println(LectureRepository.getLectures().toString());}}*/

/*public static void deleteById(int id) {
        for (int l = 0; l < LectureRepository.getLectures().length; l++) {
            Lecture lecture4 = LectureRepository.getLectures()[l];
            if (LectureRepository.getLectures()[l].getId() == id) {
                LectureRepository.getLectures()[l] = null;
                System.out.println(LectureRepository.getLectures().toString());
            }*/

