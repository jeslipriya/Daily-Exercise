class ThisKeyword {
    private String name;
    private int age;

    
    public ThisKeyword(String name, int age) {
        this.name = name;  
        this.age = age;
    }

    
    public void display() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }

    public static void main(String[] args) {
        ThisKeyword s1 = new ThisKeyword("Jesli", 17);  
        s1.display();  
    }
}
