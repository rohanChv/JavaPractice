import java.util.Arrays;

public class PriorityQ {
    int[] heap=new int[10];
    int heapSize=0;

    public void add(int a){
        heap[heapSize]=a;
        heapSize++;
        heapify(heapSize-1);
    }
    public void heapify(int index){
        int parentIndex=(index-1)/2;
        if(index>0 && (heap[parentIndex]<heap[index])){
            swap(parentIndex,index);
            heapify(parentIndex);
        }
    }
    public void swap(int parentIndex,int childIndex){
        int temp=heap[childIndex];
        heap[childIndex]=heap[parentIndex];
        heap[parentIndex]=temp;
    }
    public void remove(){
        int[] newHeap;
        for(int i=0;i<=heapSize;i++){
            if (a==heap[i]){
                heap[i]=null;
            }
            else
                newHeap[i]=heap[i];
        }
        System.out.println(heapSize);
        heapify(heapSize);
    }

    @Override
    public String toString() {
        return "PriorityQ{" +
                "heap=" + Arrays.toString(heap) +
                '}';
    }
}
