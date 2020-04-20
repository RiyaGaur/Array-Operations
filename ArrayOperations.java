public class ArrayOperations {
    int[] data;
    int size;
    int end;
    int flag=0;
    public ArrayOperations(int size){
        this.size=size;
        data=new int[this.size];
        end=0;
    }
    public void  insert(int element){
        data[end]=element;
        end++;
    }
    public boolean isempty(){
        boolean response=false;
        if(end==0){
            return true;
        }
        return response;
    }
    public int delete(){
        int temp=0;
        if(!isempty()) {
            temp = data[end-1];
            end--;
        }
        return temp;
    }
    public void tranverse(){
        for (int i = 0; i <data.length ; i++) {
            System.out.println(data[i]);
        }
    }
    public void search(int element){
        for (int i = 0; i <data.length ; i++) {
            if(data[i]==element) {
                System.out.println(element +" is at "+i+" position");
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println(element+" not found");
        }
    }

    public static void main(String[] args) {
        ArrayOperations a=new ArrayOperations(4);
        a.insert(10);
        a.insert(20);
        a.insert(30);
        a.insert(40);
        a.tranverse();
        System.out.println(a.delete()+" removed from array.");
        a.search(20);
    }
}
