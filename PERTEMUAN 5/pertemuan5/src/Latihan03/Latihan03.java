package Latihan03;

public class Latihan03 {
    String merk, tipe;
    int tahun, top_acceleration, top_power;

    int Tertinggi(int top_acceleration[], int left, int right){
        if(left == right){
            return left;
        } else{
            int mid = (left + right)/2;
            int leftMaxIndex = Tertinggi(top_acceleration, left, mid);
            int rightMaxIndex = Tertinggi(top_acceleration, mid + 1, right);
            if (top_acceleration[leftMaxIndex] > top_acceleration[rightMaxIndex]) {
                return leftMaxIndex;
            } else {
                return rightMaxIndex;
            }
        }
    }

    int Terendah(int top_acceleration[], int left, int right){
        if(left == right){
            return left;
        } else{
            int mid = (left + right)/2;
            int leftMinIndex = Terendah(top_acceleration, left, mid);
            int rightMinIndex = Terendah(top_acceleration, mid + 1, right);
            if (top_acceleration[leftMinIndex] < top_acceleration[rightMinIndex]) {
                return leftMinIndex; 
            } else {
                return rightMinIndex; 
            }
        }
    }

    double rataRata(double top_power[]){
        double total = 0;
        for(int i = 0; i < top_power.length; i++){
            total = total + top_power[i];
        }
        return total/top_power.length;
    }
    
    
}
