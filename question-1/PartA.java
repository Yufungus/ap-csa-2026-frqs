public Account(String requestedName){
  username=requestedName;
  int x=0;
  if(!Available(username)){
    x++;
    username=requestedName+x;
  }
}
