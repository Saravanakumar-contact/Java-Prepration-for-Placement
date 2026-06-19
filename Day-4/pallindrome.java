public static void main(String args[]){
    int n=1221;
    int reversed=0;
    int orginal=n;
    while(n!=0){
        int digit=n%10;
        reversed=reversed*10+digit;
        n/=10;
    }
    
    if(reversed==orginal){
        System.out.println("Pallindrome");
    }
    else{
        System.out.println("Not Pallindrome");
    }
    System.out.println(reversed);
}