public class Cat extends Animal {



    private int fullness;
    private boolean hungry;

    public Cat (int fullness){

        this.fullness =fullness;

    }




        public void info(){
            if (this.hungry=true) {
                System.out.println(" объелся.");
            }else{
                System.out.println(" в животике пусто.");

            }
        }

        public boolean eat(Bowl bowl1){
            if (bowl1.foodInBowl>=this.fullness) {
                bowl1.foodInBowl = bowl1.foodInBowl - this.fullness;
                this.hungry=true;
                return true;
            }else{
                this.hungry=false;
                System.out.println(" в миске недостаточно еды.");
                return false;

            }
        }

}
