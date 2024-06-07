public class Graph03 {
    int vertex;
    DoubleLinkedList03 list[];

    public Graph03(int v){
        vertex = v;
        list = new DoubleLinkedList03[v];
        for(int i = 0; i < v; i++){
            list[i] = new DoubleLinkedList03();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }
    

    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex; i++){
            //inDegree
            for(int j = 0; j < list[i].size(); j++){
                if(list[i].get(j) == asal){
                    ++totalIn;
                }
            }
            //outDegree
            for(k = 0; k <list[asal].size(); k++){
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char)('A'+ asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char)('A'+ asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char)('A'+ asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception{
        for(int i = 0; i < vertex; i++){
            if(i==tujuan){
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges(){
        for(int i = 0; i < vertex; i++){
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception{
        for(int i = 0; i < vertex; i++){
            if(list[i].size() > 0){
                System.out.print("Gedung " + (char)('A' + i) + " terhubung dengan ");
                for(int j = 0; j <list[i].size() ; j++){
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void sejalur(int asal, int tujuan) throws Exception {
        if (asal < 1 || asal > vertex || tujuan < 1 || tujuan > vertex) {
            System.out.println("Gedung tidak valid.");
            return;
        }
    
        boolean cektetangga = Math.abs(tujuan - asal) == 1 || Math.abs(tujuan - asal) == -1;
        
        if (cektetangga) {
            boolean bertetangga = false;
            for (int i = 0; i < list[asal - 1].size(); i++) {
                if (list[asal - 1].get(i) == tujuan) {
                    bertetangga = true;
                    break; 
                }
            }
            
            if (!bertetangga) {
                System.out.print("Gedung " + (char)('A' + asal - 1) + " dan " + (char)('A' + tujuan - 1) + " bertetangga");
            } else {
                System.out.print("Gedung " + (char)('A' + asal - 1) + " dan " + (char)('A' + tujuan - 1) + " tidak bertetangga");
            }
        } else {
            System.out.print("Gedung " + (char)('A' + asal - 1) + " dan " + (char)('A' + tujuan - 1) + " tidak bertetangga");
        }
    }

    public void updateJarak(int asal, int tujuan, int jarak) {
        list[asal].updateJarak(tujuan, jarak);
    }

    public void cekGraph(int asal, int tujuan) throws Exception {
        if (asal < 1 || asal > vertex || tujuan < 1 || tujuan > vertex) {
            System.out.println("Gedung tidak valid.");
            return;
        }
    
        boolean found = false;
        for (int i = 0; i < list[asal-1].size(); i++) {
            if (list[asal-1].get(i) == tujuan - 1) {
                found = true;
                break;
            }
        }
    
        if (found) {
            System.out.println("Edge dari Gedung " + (char)('A' + asal - 1) + " ke Gedung " + (char)('A' + tujuan - 1) + " ada.");
        } else {
            System.out.println("Edge dari Gedung " + (char)('A' + asal - 1) + " ke Gedung " + (char)('A' + tujuan - 1) + " tidak ada.");
        }
    }

    public int hitungEdge() {
        int edgeCount = 0;
        for (int i = 0; i < vertex; i++) {
            edgeCount += list[i].size();
        }
        return edgeCount;
    }
    
}
