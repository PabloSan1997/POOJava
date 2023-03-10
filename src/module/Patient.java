package module;



public class Patient extends Users {

    private String birthday;
    private double weight;
    private double height;
    private String blood;

   public Patient(String name, String email){
        super(name,email);
        //Mas instrucciones

    }

    // 54.5
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 54.5 Kg. String
    public String getWeight(){
        return this.weight + " Kg.";
    }


    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\n Weight: " +getWeight()+ "\n Height "+getHeight()+"\nBlood"+blood;
    }

    @Override
    public void showDataUser() {
        System.out.print("No se que onda");
    }
}
