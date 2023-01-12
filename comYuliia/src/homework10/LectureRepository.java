package homework10;

public class LectureRepository extends EntityRepository{
    private static Lecture[] lectures = new Lecture[3];

    public static void main(String[] args) {
        lectures[0] = new Lecture("Introduction",1);;
        lectures[1] = new Lecture("Classes",2);
        lectures[2] = new Lecture("Methods",3);}

    @Override
    public void getInfo() {
        super.getInfo();
        for (int k = 0; k < lectures.length; k++) {
        System.out.println("Index of array is " + k + ", name is " + LectureRepository.lectures[k].getName() + ", id is " + LectureRepository.lectures[k].getId());
    }}}


/*protected void getEntities(int i) {
        lectures =new Lecture[i];
    }
*/



    /*public void getInfo() {
            for (int k = 0; k < LectureRepository.lectures.length; k++) {
                System.out.println("Index of array is " + k + ", name is " + LectureRepository.lectures[k].getName() + ", id is " + LectureRepository.lectures[k].getId());
            }*/

       /* public static void addLecture() {
            Lecture lecture = new Lecture("Introduction", 1);
            System.out.println("Amount of added lectures is " + Lecture.getCount());}*/















        //getById(1);
       // getInfo();
       // deleteById(1);
        //

        //

        //deleteById(2);


