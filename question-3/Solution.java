public int moreHistoryThanMathAbsences(){
  int count=0;
  for(int i=0; i<historyList.size(); i++){
    for(int j=0; j<mathList.size(); j++){
      if(historyList.get(i).getStudentID().equals(mathList.get(j).getStudentID())){
        if(histRecord.getAbsences()>mathRecord.getAbsences()){
          count++
        }
      }
    }
  }
  return count;
}
