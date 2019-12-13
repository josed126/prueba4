public class DividirPalabras {
    public static void main (String[] args){
        int space = args.toString();
        
        String first2 = args.substring(space + 1);
        String first = args.substring(0,1);
        String Total = first + ", " + first2;
        return Total;
    }
}