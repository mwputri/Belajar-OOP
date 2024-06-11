public class PersonApps {
    public static void main(String[] args) {
        // cara membuat objek
        var person1 = new Person("Mw Putri Meilinia", "Jakarta pusat");
//        person1.name = "Mw Putri Meilinia";
//        person1.address = "Jakarta Pusat";
//        di atas tidak usahdi gunakan karena person sudah di deklasai dngan paramname dan param address

        System.out.println(person1.name);
        System.out.println(person1.address);
        //karena coutery mengunakan final field jadi tidak bisa di ubah atau dimasukan variable, kalau dimasukan akan eror
        System.out.println(person1.country);


        Person person2 = new Person("uti");
        person2.sayhello("Putri");

        Person person3;
        person3 = new Person();
        // hasilnya "my name is null" karena name dalam person tidak di deklarasikan mangkanya nilainya null
        person2.sayhello("eza");
    }
}
