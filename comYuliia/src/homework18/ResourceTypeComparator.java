package homework18;

import java.util.Comparator;

public class ResourceTypeComparator implements Comparator<AdditionalMaterials> {

    @Override
    public int compare(AdditionalMaterials o1, AdditionalMaterials o2) {
        return o1.resourceType.compareTo(o2.resourceType);
        /*int result = o1.resourceType.compareTo(o2.resourceType);
        return result;*/

    }
}

