class CountMath{
    public static void main(String[] args){
        String a="aaabbbcccc";
        String result="";
        for(int i=0;i<a.length();i++){
            int count=1;
            while(i+1<a.length()&& a.charAt(i)==a.charAt(i+1)){
                count++;
                i++;
            }
            result+=a.charAt(i);
            if(count>1){
            result+=count;
        }
        }
        
        System.out.print(result);
    }
}