class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        // super digunakan untuk override pada parent class
        return super.getCorner();
    }
}
