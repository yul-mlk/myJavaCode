package homework30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdditionalMaterials {
    Double id;
    Integer lectureId;
    String lectureName;
    RESOURCE_TYPE resourceType;

    public AdditionalMaterials(Double id, Integer lectureId, String lectureName, RESOURCE_TYPE resourceType) {
        this.id = id;
        this.lectureId = lectureId;
        this.lectureName = lectureName;
        this.resourceType = resourceType;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Integer getLectureId() {
        return lectureId;
    }

    public void setLectureId(Integer lectureId) {
        this.lectureId = lectureId;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public RESOURCE_TYPE getResourceType() {
        return resourceType;
    }

    public void setResourceType(RESOURCE_TYPE resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "AdditionalMaterials{" +
                "id=" + id +
                ", lectureId=" + lectureId +
                ", lectureName='" + lectureName + '\'' +
                ", resourceType=" + resourceType +
                '}';
    }

    public static void main(String[] args) {
        AdditionalMaterials additMat1_1 = new AdditionalMaterials(1.1, 1, "Intoduction", RESOURCE_TYPE.BOOK);
        AdditionalMaterials additMat1_2 = new AdditionalMaterials(1.2, 1, "Intoduction", RESOURCE_TYPE.VIDEO);
        AdditionalMaterials additMat1_3 = new AdditionalMaterials(1.3, 1, "Intoduction", RESOURCE_TYPE.URL);

        AdditionalMaterials additMat2_1 = new AdditionalMaterials(2.1, 2, "Variables", RESOURCE_TYPE.BOOK);
        AdditionalMaterials additMat2_2 = new AdditionalMaterials(2.2, 2, "Variables", RESOURCE_TYPE.VIDEO);
        AdditionalMaterials additMat2_3 = new AdditionalMaterials(2.3, 2, "Variables", RESOURCE_TYPE.URL);

        AdditionalMaterials additMat3_1 = new AdditionalMaterials(3.1, 3, "Access modifiers", RESOURCE_TYPE.BOOK);
        AdditionalMaterials additMat3_2 = new AdditionalMaterials(3.2, 3, "Access modifiers", RESOURCE_TYPE.VIDEO);
        AdditionalMaterials additMat3_3 = new AdditionalMaterials(3.3, 3, "Access modifiers", RESOURCE_TYPE.URL);
        List<AdditionalMaterials> additMatList = new ArrayList<>();
        additMatList.add(additMat3_1);
        additMatList.add(additMat3_3);
        additMatList.add(additMat3_2);
        additMatList.add(additMat2_2);
        additMatList.add(additMat1_1);
        additMatList.add(additMat1_3);
        additMatList.add(additMat1_2);
        additMatList.add(additMat2_1);
        additMatList.add(additMat2_3);
        //System.out.println("List of additional materials: \n" + additMatList);

        //30.2
        additMatList = additMatList.stream().sorted((x, y) -> x.getLectureName().compareTo(y.getLectureName()))
                .collect(Collectors.toList());
        System.out.println("By lecture name: " + additMatList);
        System.out.println("____");
        additMatList = additMatList.stream().sorted((x, y) -> x.getLectureId().compareTo(y.getLectureId()))
                .collect(Collectors.toList());
        System.out.println("By lecture Id: " + additMatList);

    /*System.out.println("____");
    List <String> resultList = additMatList.stream()
            .map(adMat->adMat.getLectureName())
            .sorted()
            .collect(Collectors.toList());
    System.out.println(resultList);*/

    }
}

