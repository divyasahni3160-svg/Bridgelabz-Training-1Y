//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    Calculator sum =(a,b) ->a+b;
             sum.calculate(1,5);
    Calculator sub=(a,b) ->a-b;
    Calculator prod=(a,b) ->a*b;
    Calculator div=(a,b) ->a/b;
    XYZ.calculate(sum,1,5);
    System.out.println(sum.calculate(9,1));
    System.out.println(sub.calculate(9,1));
    System.out.println(prod.calculate(9,1));
    System.out.println(div.calculate(9,1))  ;
}