package homework18;

import java.util.Comparator;

public class LectureIdComparator implements Comparator<AdditionalMaterials> {

    @Override
    public int compare(AdditionalMaterials o1, AdditionalMaterials o2) {
        if (o1.lectureId == o2.lectureId) {
            return 0;
        } else if (o1.lectureId < o2.lectureId) {
            return -1;
        } else {
            return 1;
        }
        //return additMat1.lectureId.compareTo(additMat2.lectureId);
    }}
