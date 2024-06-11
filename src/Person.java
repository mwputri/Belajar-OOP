 class Person {
    // untuk mengakses field buth kata kunci . setelah nama objeknya diikut nama filed
    String name;
    String address;
    final String country = "Indonesia"; //tidak bisa di ubah
     //constructor tida menggunakan void
     Person(String name, String address){
//         name = paramName;
//         address = paramAddress;
         // berikut mrupakan untuk mengatasi shadowing variable, this digunakan untuk memanggil objek saat ini
         this.name = name;
         this.address = address;
     }

     // constructor overloading
     Person(String paramName){
//         name = paramName;
         // memanggil constructor lain
         this(paramName,null);
     }

     Person (){
    this(null,null);
     }

    //method tidak mengeluarkan atau rerun sesuatu
     void sayhello(String paramName){
         System.out.println("Hello "+paramName+", My name is "+name);
     }
}
