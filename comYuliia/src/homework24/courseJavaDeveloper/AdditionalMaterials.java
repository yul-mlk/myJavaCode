package homework24.courseJavaDeveloper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.io.Serializable;

public class AdditionalMaterials implements Serializable {
    static final long serialVersionUID = 1;
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
        return "courseJavaDeveloper.AdditionalMaterials{" +
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


    public static void main(String[] args) {
        AdditionalMaterials additMat1_1 = new AdditionalMaterials(1.1, 1, "Introduction", RESOURCE_TYPE.BOOK);
        AdditionalMaterials additMat1_2 = new AdditionalMaterials(1.2, 1, "Introduction", RESOURCE_TYPE.VIDEO);
        AdditionalMaterials additMat1_3 = new AdditionalMaterials(1.3, 1, "Introduction", RESOURCE_TYPE.URL);

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
        System.out.println("List of additional materials: \n" + additMatList);
        System.out.println("___________________________________");
        List<AdditionalMaterials> deSerialList;
        File file = new File("comYuliia/src/homework24/courseJavaDeveloper/files/addMat.txt");
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            output.writeObject(additMatList);
            System.out.println("1. Serialization has done");
            deSerialList = (ArrayList) input.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2. Deserialization has done: \n" + deSerialList);
    }
}
