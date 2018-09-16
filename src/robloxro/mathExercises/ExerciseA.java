package robloxro.mathExercises;
/*
Given xy+yz+zx=<given number> find all possible values for the number xyz
* */


public class ExerciseA {
    public static void main(String[] args) {
        int inputNumber;
        if ((args.length<1) || (args[0]==null))
        {
            System.out.println("Please introduce an integer as result of xy+yz+zx\n");
            return;
        }else
        {
            try{
                inputNumber = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println(args[0]+" is not a number.Please introduce an integer as result of xy+yz+zx\n");
                return;
            }
        }
        System.out.println("Number provided is "+inputNumber+"\n");
        int numberOfCombinations=0;
        boolean found=false;
        for (int xy=10; xy<100;xy++)
            for (int yz=10; yz<100;yz++)
                for (int zx=10; zx<100;zx++)
                {
                    if ((xy/10==zx%10) && (xy%10==yz/10) && (yz%10==zx/10) && (xy+yz+zx==inputNumber))
                    {
                        System.out.println("xy="+xy+",yz="+yz+",zx="+zx+"\n");
                        found=true;
                        numberOfCombinations++;
                    }
                }
        System.out.println(found?"We found "+numberOfCombinations+" combinations.":"There is no combination to match the input number "+inputNumber);
    }
}
