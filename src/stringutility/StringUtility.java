
package stringutility;
import java.lang.StringBuilder;
import java.io.PrintStream;
public class StringUtility {

    
    public static String InverznaRec(String rec){
                if (rec == null) {
                    return null;}
                
        return new StringBuilder (rec).reverse().toString().toLowerCase();
    }
    public static boolean isPalindrom(String rec){

        String str = rec.replace(" ","");
        return rec.equalsIgnoreCase(InverznaRec(rec));
    }
    public static boolean isSamoglasnik (char znak){
        if (znak == 'a'|| znak == 'e'||znak == 'i'||znak == 'o'||znak == 'u')
                return true;
                return false;
    }
    
//    public static void svakoTrece(String recenica); {
//    {
//            String recenica;
//                StringTokenizer st = new StringTokenizer(recenica);
//                while (st.hasMoreElements())
//                {
//                    String str = st.nextToken();
//                    if (str.length()>2){
//                        if (isSamoglasnik(str.charAt(2)))
//                    }
//                }
//                    System.out.println(str);
//                                   
//    }
//    
    public static void zameni (int a, int b, PrintStream gde ){
        int c = a;
        a=b;
        b=c;
        gde.println("Zameni a= "+ a);
        gde.println("Zameni b= "+ b);
    }   
    
    
    public static void main(String[] args) {
        int a = 10;
        int b = 55;
        System.out.println("a=" +a+": b = "+b);
        zameni (10, 55, System.out);
        System.out.println("a=" +a+": b = "+b);
        
    }
//        System.out.println(InverznaRec("Nikola"));
//        System.out.println(isPalindrom("ana voli milovana"));
////        System.out.println("");    
//        StringBuilder sb1 = new StringBuilder ("natasa");
//        StringBuilder sb2 = new StringBuilder ("natasa");
//        
//        String
//    }

//       String str = "Nikola";
//       
//       StringBuilder st = new StringBuilder (str);
//    
//
//       System.out.println(st.reverse());
//       
//       System.out.println(st.equal);
//        
//       System.out.println(st.);
//    }
    }
        

