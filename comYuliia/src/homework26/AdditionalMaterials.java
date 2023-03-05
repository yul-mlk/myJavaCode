package homework26;

import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

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

    public Integer getLectureId() {
        return lectureId;
    }

    public RESOURCE_TYPE getResourceType() {
        return resourceType;
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
        System.out.println("List of additional materials: ");
        additMatList.forEach(System.out::println);
        System.out.println("____________");
        additMatList.stream().filter(additionalMaterials -> additionalMaterials.getLectureId().equals(1)).
                forEach(resultAdditionalMaterialsById -> System.out.println("List of additional materials to lecture 1: " + resultAdditionalMaterialsById));
        System.out.println("___________");
        additMatList.stream().filter(additionalMaterials -> additionalMaterials.getLectureId().equals(2)).
                forEach(resultAdditionalMaterialsById -> System.out.println("List of additional materials to lecture 2: " + resultAdditionalMaterialsById));
        System.out.println("___________");
        additMatList.stream().filter(additionalMaterials -> additionalMaterials.getLectureId().equals(3)).
                forEach(resultAdditionalMaterialsById -> System.out.println("List of additional materials to lecture 3: " + resultAdditionalMaterialsById));
    }
}
