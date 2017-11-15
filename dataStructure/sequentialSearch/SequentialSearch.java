package data_structure.sequential_search;

public class SequentialSearch {
    public boolean sequentialSearch(int n, int array[]) {
        boolean found = false;

        for(int i = 0; i <= array.length - 1; i++) {
            if(n == array[i])
                found = true;
        }

        return found;
    }
}
