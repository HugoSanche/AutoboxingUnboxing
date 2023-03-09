import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Integer boxedInt= Integer.valueOf(50); //prefered but not unnecessary
        Integer deprecatedBoxing=new Integer(50); //its deprecated
        int unboxedInt=boxedInt.intValue(); //unnecesary

        //Automatic
        Integer autoBoxed=50;
        int autoUnboxed=autoBoxed;
        
        System.out.println(autoBoxed.getClass().getName());
       // System.out.println(autoUnboxed.getClass().getName()); /not possible

       double resultBoxed=getDoubleObject();
        Double ResutlUnBoxed=getDoublePrimitive();

        /***Working with Autoboxing and unboxing with Arrays***/
        Integer[] wrapperArray=new Integer[5];
        wrapperArray[0]=30;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] character={'a','b','c','d'};
        System.out.println(Arrays.toString(character));

        var list=List.of(1,2,3,4,5);
        System.out.println(list);
    }

    //check recive an int array and return a ArrayList
    private static ArrayList<Integer> returnArrayInteger(int... array ){
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer i:array){
            list.add( i);
        }
        return list;
    }

    private static Integer returnInteger(int i){
        return i;
    } 
    private static int returnInt(Integer i){
        return i;
    }
    private static Double getDoubleObject(){
        return Double.valueOf(200);
    }
    private static double getDoublePrimitive(){
        return 200;
    }
}