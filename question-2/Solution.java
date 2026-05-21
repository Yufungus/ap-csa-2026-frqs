pubic class bottle{
  private double cap;
  private double camt;
  
  public bottle(double c){
    cap=c;    
    camt=c;
  }
  public double updateAmount(double amt){
    camt-=amt;
    if(camt<(cap/4)){
      camt=cap;
    }
    return camt;
  }
}
