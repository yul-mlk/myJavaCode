package homework18;

import java.util.*;

public class AdditionalMaterials implements Comparable<AdditionalMaterials> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdditionalMaterials that = (AdditionalMaterials) o;
        return Objects.equals(id, that.id) && Objects.equals(lectureId, that.lectureId) && Objects.equals(lectureName, that.lectureName) && resourceType == that.resourceType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lectureId, lectureName, resourceType);
    }

    @Override
    public int compareTo(AdditionalMaterials o) {
        // return this.id - anotherStud.id;
        if (this.id == o.id) {
            return 0;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        AdditionalMaterials additMat1_1 = new AdditionalMaterials(1.1, 1, "Intoduction", RESOURCE_TYPE.URL);
        AdditionalMaterials additMat1_2 = new AdditionalMaterials(1.2, 1, "Intoduction", RESOURCE_TYPE.VIDEO);
        AdditionalMaterials additMat1_3 = new AdditionalMaterials(1.3, 1, "Intoduction", RESOURCE_TYPE.BOOK);

        AdditionalMaterials additMat2_1 = new AdditionalMaterials(2.1, 2, "Variables", RESOURCE_TYPE.URL);
        AdditionalMaterials additMat2_2 = new AdditionalMaterials(2.2, 2, "Variables", RESOURCE_TYPE.VIDEO);
        AdditionalMaterials additMat2_3 = new AdditionalMaterials(2.3, 2, "Variables", RESOURCE_TYPE.BOOK);

        AdditionalMaterials additMat3_1 = new AdditionalMaterials(3.1, 3, "Access modifiers", RESOURCE_TYPE.URL);
        AdditionalMaterials additMat3_2 = new AdditionalMaterials(3.2, 3, "Access modifiers", RESOURCE_TYPE.VIDEO);
        AdditionalMaterials additMat3_3 = new AdditionalMaterials(3.3, 3, "Access modifiers", RESOURCE_TYPE.BOOK);
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
        System.out.println("List of additional materials before sorting: \n" + additMatList);
        System.out.println("___________________________________");

        int a = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("To sort additional materials by id, input 1!");
            System.out.println("To sort additional materials by id (number) of the lecture, input 2!");
            System.out.println("To sort additional materials by resource type (URL, VIDEO, BOOK), input 3!");
            System.out.println("To exit - press 0!");

            a = scanner.nextInt();

            switch (a) {
                case 1:
                    Collections.sort(additMatList);
                    System.out.println("List of additional materials after sorting by id: \n" + additMatList);
                    System.out.println("___________________");
                    break;
                case 2:
                    Collections.sort(additMatList, new LectureIdComparator());
                    System.out.println("List of additional materials after sorting by lectureId: \n" + additMatList);
                    System.out.println("___________________");
                    break;
                case 3:
                    Comparator resourceTypeComparator = Comparator.comparing(AdditionalMaterials::getResourceType);
                    Collections.sort(additMatList, resourceTypeComparator);
                    System.out.println("List of additional materials after sorting by resource type: \n" + additMatList);
                    System.out.println("___________________");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect number. Try again");
            }
        } while (a != 0);
    }
}



