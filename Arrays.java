package ARRAY;

public class Arrays {
    int [] arr;
    public Arrays(int sizeofarr){
        arr=new int[sizeofarr];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert (int location,int element){
        try{
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=element;
                System.out.println("element enter success fully");
            }else{
                System.out.println("location is already filled");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

}
