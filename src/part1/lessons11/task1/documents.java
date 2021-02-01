package part1.lessons11.task1;

 class documents {
     String[] doc =new String[10];



     public String[] getDoc() {
         return doc;
     }

     public void setDoc(String[] doc) {
         this.doc = doc;
         doc[1]= new String(1,"Акт","Отсутствует");

     }
 }
