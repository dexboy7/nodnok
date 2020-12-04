public class Nod_Nok {
    public static int NOD(int numb1, int numb2){

        if (numb2 == 0)
            return numb1;
        else
            return NOD(numb2, numb1 % numb2);
    }
    public static int NOK(int numb1, int numb2, int NOD){
        return numb1/NOD*numb2;
    }
}
