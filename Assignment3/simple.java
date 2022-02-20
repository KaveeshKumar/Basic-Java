class simple {
  public static void main(String[] args) {

    // create an object of Scanner class

    double  p = 1000.50; // P =Principal amount
    
    double  r = 8;   //  r  =Annual interest rate

    double  n = 2;  //  n =Term of loan, in years
    
    double t = 3; //   t=Number of years interest is applied

    double si = ( p * r * n) / 100; // si = simple intrest
    
    double ci = p * (Math.pow((1 + r/100), (t * n))) - p;
    
    
    

    System.out.println("Principal: " + p);
    System.out.println("Interest Rate: " + r);
    System.out.println("Time Duration: " + n);
    System.out.println("Simple Interest: " + si);
    System.out.println("Compound Interest: "+ ci);
  }
}