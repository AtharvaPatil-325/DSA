public class Complex {
    
    static void constantTime(){
        int [] array={1,3,23,5};
    System.out.println(array[1]);
}

static void linearTime(){
    int []array = {2,55,66,77,88,44,6};
    for(int i=0;i<array.length;i++){
        System.out.print((i+1)+ "time \t");
        System.out.println(array[i]+" ");
    }
}

static void quadraticTime(){
    int []array = {2,55,66,77,88,44,6};
    for(int i=1;i<array.length;i++){
            System.out.print((i*i)+ "time \t");
            System.out.println(array[i]+" ");
        
    }
}

public static void main(String[] args) {
    quadraticTime();
}
}