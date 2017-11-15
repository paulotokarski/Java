package data_structure.binary_search;

public class BinarySearch {
    public boolean binarySearch(int n, int ordenedArray[]) {
        int i, j, m;
        boolean found = false;

        i = 0;
        j = ordenedArray.length;
        m = ordenedArray.length / 2;

        while(i <= j && found != true) {
            if(ordenedArray[m] == n)
                found = true;
            else {
                if(n < ordenedArray[m])
                    j = m - 1;
                else
                    i = m + 1;
                m = (i + j) / 2;
            }
        }

        return found;
    }
}