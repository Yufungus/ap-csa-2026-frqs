public String getShortenedName(){
  String res="";
  for(int i=0; i<username.length(); i++){
    if(username.charAt(i)=="-"){
      res=res.substring(0,res.length()-1);
    }else{
      res+=username.charAt(i);
    }
  }
  return res;
}
