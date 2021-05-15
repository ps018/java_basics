public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary)
    {
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary)
    {
        this.real += real;
        this.imaginary += imaginary;
    }
     public void add(ComplexNumber number)
     {
        this.imaginary += number.imaginary;
        this.real += number.real;
     }

     public void subtract(double real, double imaginary)
     {
         this.real -= real;
         this.imaginary -= imaginary;
     }

     public void subtract(ComplexNumber number)
     {
         this.imaginary -= number.imaginary;
         this.real -= number.real;
     }

}
