package Service;

public class ModulusCalculator
{
    public boolean add(int x){

        if(x==2){
            return true;
        }

        for(int i=2;i<x;i++)
        {

             if(x%i==0){
                return false;
            }

            // lave en forloop der tager modulus i op til input tallet-1
        }
        return true;
    }
}
