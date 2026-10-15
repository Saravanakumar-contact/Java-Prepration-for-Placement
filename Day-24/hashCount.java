class hashCount{
     static String Ash(String str){
        StringBuilder hash=new StringBuilder();
        StringBuilder result=new StringBuilder();
        for(char ch:str.toCharArray()){
        if(ch=='#'){
            hash.append(ch);
        }
        else{
            result.append(ch);
        }}
        return hash.append(result).toString();
    }
    public static void main(String[] args){
       String str="#saravana#kumar#developer";
        System.out.print(Ash(str));
    }
}