class notsufficientmoney extends Exception 
{
    double amount;
    notsufficientmoney(double amt)
    {
        amount=amt;
    }
    
}
