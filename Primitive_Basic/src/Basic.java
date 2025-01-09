public class Basic {
    public static void main(String[] args) {
        double inr=85.67;
        double euro=1.09;
        double pound=1.5;
        double rmb=8.33;
        char dollarSymbol='\u0024';
        char rupeeSybmol='\u20B9';
        char euroSymbol='\u20AC';
        char poundSymbol='\uFFE1';
        char rmbSymbol='\u00A5';
        System.out.println(dollarSymbol+"1"+" = "+rupeeSybmol+inr);
        System.out.println(dollarSymbol+"1"+" = "+euroSymbol+euro);
        System.out.println(dollarSymbol+"1"+" = "+poundSymbol+pound);
        System.out.println(dollarSymbol+"1"+" = "+"CN"+rmbSymbol+rmb);
    }
}
