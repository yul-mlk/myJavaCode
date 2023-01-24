package homework17;

public class AdditionalMaterials {
    Integer id;
    String name;
    Integer lectureId;
    RESOURCE_TYPE resourceType;

    public AdditionalMaterials(Integer id, String name, Integer lectureId, RESOURCE_TYPE resourceType) {
        this.id = id;
        this.name = name;
        this.lectureId = lectureId;
        this.resourceType = resourceType;
    }

    public AdditionalMaterials(RESOURCE_TYPE resourceType) {
        this.resourceType = resourceType;
    }

    static AdditionalMaterials additMat1_1 = new AdditionalMaterials(1, "Setting up the development environment", 1, RESOURCE_TYPE.URL);
    static AdditionalMaterials additMat1_2 = new AdditionalMaterials(1, "Setting up the development environment", 1, RESOURCE_TYPE.VIDEO);
    static AdditionalMaterials additMat1_3 = new AdditionalMaterials(1, "Setting up the development environment", 1, RESOURCE_TYPE.BOOK);

    static AdditionalMaterials additMat2_1 = new AdditionalMaterials(1, "Variables types", 1, RESOURCE_TYPE.URL);
    static AdditionalMaterials additMat2_2 = new AdditionalMaterials(1, "Variables types", 1, RESOURCE_TYPE.VIDEO);
    static AdditionalMaterials additMat2_3 = new AdditionalMaterials(1, "Variables types", 1, RESOURCE_TYPE.BOOK);

    static AdditionalMaterials additMat3_1 = new AdditionalMaterials(1, "Access modifiers types", 1, RESOURCE_TYPE.URL);
    static AdditionalMaterials additMat3_2 = new AdditionalMaterials(1, "Access modiefiers types", 1, RESOURCE_TYPE.VIDEO);
    static AdditionalMaterials additMat3_3 = new AdditionalMaterials(1, "Access modiefiers types", 1, RESOURCE_TYPE.BOOK);

    public static void resourseTypeInfo(RESOURCE_TYPE resourceType) {
        switch (resourceType) {
            case URL:
                System.out.println("Links with additional materials for lecture 1 " + additMat1_1.resourceType + " https://www.jetbrains.com/idea/");
                System.out.println("Links with additional materials for lecture 2 " + additMat2_1.resourceType + " https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html");
                System.out.println("Links with additional materials for lecture 3 " + additMat3_1.resourceType + " https://www.baeldung.com/java-access-modifiers#:~:text=Simply%20put%2C%20there%20are%20four,and%20default%20(no%20keyword).");
                break;
            case VIDEO:
                System.out.println("Video-additional materials for lecture 1 " + additMat1_2.resourceType + " https://youtu.be/t8T5Qwa5d_o");
                System.out.println("Video-additional materials for lecture 2 " + additMat2_2.resourceType + " https://youtu.be/so1iUWaLmKA");
                System.out.println("Video-additional materials for lecture 3 " + additMat3_2.resourceType + " https://youtu.be/L3N2CyYUR5c");
                break;
            case BOOK:
                System.out.println("Book for lecture 1 " + additMat1_3.resourceType + " Boyarsky, J., & Selikoff, S. (2020). OCP Oracle Certified Professional Java SE 11 Developer Complete Study Guide (1st ed.). Wiley.");
                System.out.println("Book for for lecture 2 " + additMat2_3.resourceType + " Boyarsky, J., & Selikoff, S. (2020). OCP Oracle Certified Professional Java SE 11 Developer Complete Study Guide (1st ed.). Wiley.");
                System.out.println("Book for for lecture 3 " + additMat3_3.resourceType + " Boyarsky, J., & Selikoff, S. (2020). OCP Oracle Certified Professional Java SE 11 Developer Complete Study Guide (1st ed.). Wiley.");
                break;
            default:
                System.out.println("Incorrect");
                break;

        }
    }
}

