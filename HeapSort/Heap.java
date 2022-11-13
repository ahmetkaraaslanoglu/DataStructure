public class Heap {
    int a[];
    int heapSize;

    public Heap(int []a){
        this.a =a;
        heapSize = a.length;
    }
    public int Left(int i){return 2*i+1;}
    public int Right(int i){return 2*i+2;}

    public void Max_heapify(int i){
        int left = Left(i);
        int right = Right(i);
        int largest = i;

        if (left<heapSize  && a[left] > a[largest]){
            largest=left;
        }
        if (right< heapSize && a[right]>a[largest]){
            largest = right;
        }
        if (largest != i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            Max_heapify(largest);
        }
    }

    public void print(){
        System.out.print("[");
        for (int i =a.length-1;i>0;i--){
            System.out.print(a[i]);
            if (i!=1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void Build_Max_Heap(){
        for (int i =(a.length/2)-1;i>=0;i--){
            Max_heapify(i);
        }
    }

    public void HeapSort(){
        Build_Max_Heap();
        for (int i = a.length-1; i>0;i--){
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            heapSize--;
            Max_heapify(0);
        }
    }

    public static void main(String[]args){
        int array [] = {20,30,40,80,14,20,65,34,8};
        Heap heap = new Heap(array);
        heap.HeapSort();
        heap.print();
    }
}
