public class Nilai {
    int[] nilai = {15, 5, 46, 46, 22, 37, 33, 7, 17, 49, 19, 13, 10, 3, 45, 10, 12};

    //Pencarian angka sebelum diurutkan
    public int findBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (nilai[mid] == cari) {
                return mid;
            }

            int leftResult = findBinarySearch(cari, left, mid - 1);
            if (leftResult != -1) {
                return leftResult;
            }

            return findBinarySearch(cari, mid + 1, right);
        }

        return -1;
    }

    //Menampilkan semua Nilai
    public void tampilAll(){
        for (int i = 0; i <nilai.length; i++){
            System.out.print(nilai[i] + " ");
        }
    }

    //Pengurutan secara ascending menggunakan Selection Sort
    public void nilaiSelectionSort(){
        for(int i = 0; i<nilai.length; i++){
            int idxMax = i;
            for(int j = i+1; j < nilai.length; j++){
                if (nilai[j] < nilai[idxMax]){
                    idxMax = j;
                }
            }

            // swap 
            int tmp = nilai[idxMax];
            nilai[idxMax] = nilai[i];
            nilai[i] = tmp;
        }
    }

    //Pengurutan secara descending menggunakan Selection Sort
    public void nilaiSelectionSortDes(){
        for(int i = 0; i<nilai.length; i++){
            int idxMax = i;
            for(int j = i+1; j < nilai.length; j++){
                if (nilai[j] > nilai[idxMax]){
                    idxMax = j;
                }
            }

            // swap 
            int tmp = nilai[idxMax];
            nilai[idxMax] = nilai[i];
            nilai[i] = tmp;
        }
    }

    // Searching secara ascending
    public int FindBinarySearchAsc(int cari, int left, int right){
        int mid;
        for(int i = 0; i<nilai.length; i++){
            int idxMax = i;
            for(int j = i+1; j < nilai.length; j++){
                if (nilai[j] < nilai[idxMax]){
                    idxMax = j;
                }
            }

            // swap 
            int tmp = nilai[idxMax];
            nilai[idxMax] = nilai[i];
            nilai[i] = tmp;
        }

        if (right >= left){
            mid = (left + right)/2;
            if (cari == nilai[mid]){
                return mid;
            } else if ( nilai[mid] > cari){
                return FindBinarySearchAsc(cari, left, mid-1);
            } else {
                return FindBinarySearchAsc(cari, mid + 1, right);
            }
        }
        return -1;
    }

    // Searching secara descending
    public int FindBinarySearchDesc(int cari, int left, int right){
        int mid;
        for(int i = 0; i<nilai.length; i++){
            int idxMax = i;
            for(int j = i+1; j < nilai.length; j++){
                if (nilai[j] > nilai[idxMax]){
                    idxMax = j;
                }
            }

            // swap 
            int tmp = nilai[idxMax];
            nilai[idxMax] = nilai[i];
            nilai[i] = tmp;
        }

        if (right >= left){
            mid = (left + right)/2;
            if (cari == nilai[mid]){
                return mid;
            } else if ( nilai[mid] < cari){
                return FindBinarySearchDesc(cari, left, mid-1 );
            } else {
                return FindBinarySearchDesc(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
