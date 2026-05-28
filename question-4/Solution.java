public int getPointsForRow(int targetRow){
  int psum=0;
  String color = board[targetRow][0].getColor;
  for(int i=0; i<board[targetRow].length;i++){
    psum+=[targetRow][i].getPoints;
    if(!board[targetRow][i].getColor().equals(color){
      return psum*2;
    }
    return psum;
}
