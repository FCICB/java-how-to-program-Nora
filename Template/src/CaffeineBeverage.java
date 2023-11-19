public abstract class CaffeineBeverage {
    final void prepareReciepe(){
        boilwater();
        brew();
        pourIncoup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
   void  boilwater(){
        System.out.println("boiling water");
    }
   void pourIncoup(){
       System.out.println("poring into cup");
   }

}
