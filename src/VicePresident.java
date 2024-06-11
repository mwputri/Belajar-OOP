 class VicePresident extends Manager{
// pewarsan dari field dan method dari class manager
     // override method , jadi sayhello di managr tidak akan di gunakan karena ter override oleh sayhello di vp

     VicePresident(String name){
         super(name);
     }
     void sayHello(String name){
         System.out.println("Hai "+name+", My Name is VP "+this.name);
     }
}
