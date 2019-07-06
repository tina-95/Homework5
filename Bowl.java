public class Bowl {
    private int bowlV;
    public int foodInBowl=0;

    Bowl (int bowlV){
        this.bowlV=bowlV;
    }

  public boolean fillFood(int foodInBowl){

        if(this.foodInBowl + foodInBowl<=this.bowlV){
            this.foodInBowl = this.foodInBowl+foodInBowl;
            return true;
      } else {
            System.out.println("положи меньше еды.");
            return false;
        }


    }
        public void info(){
        System.out.println("В миске " + this.foodInBowl + " единиц еды.");
    }

}

