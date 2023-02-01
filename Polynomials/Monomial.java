public class Monomial
{
    double coefficient;
    int exponent;
    
    public void Monomial(double coeff, int exp)
    {
        coefficient = coeff;
        exponent = exp;
    }
    
    public double getCoefficient()
    {
        return coefficient;
    }
    
    public int getExponent()
    {
        return exponent;
    }
}
