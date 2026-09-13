public class Studetns {
    private int id;
    private String name;
    private float marks;
    
    public Studetns(int id, String name , float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getName(){
        return  this.name;
    }

    public int getId(){
        return  this.id;
    }

    public void setMarks(float marks){
        this.marks = marks;
    }

    public void getMarks(){
        System.out.println(this.marks);
    }
}
