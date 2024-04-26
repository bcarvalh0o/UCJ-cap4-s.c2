 public class clock {
    String time;
     
   void setTime (String t) {
        time = t;
    }

   String getTime (){
        return time;
    }
}

class clockTestDrive{
    public static void main(String[] args) {
         
        clock c = new clock();
    
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time" + tod);
    }
}