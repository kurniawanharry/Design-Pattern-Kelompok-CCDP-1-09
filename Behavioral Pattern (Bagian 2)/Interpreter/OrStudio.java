public class OrStudio implements Studio {

    private Studio expr1 = null;
    private Studio expr2 = null;

    public OrStudio(Studio expr1, Studio expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}