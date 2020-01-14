package Prescriptions;



public class Medicine {
    String name;
    int Qty;
    String Dosage;


    public Medicine(String name, int Qty, String Dosage) {
        this.name = name;
        this.Qty = Qty;
        this.Dosage = Dosage;
    }

    public Medicine(String name, int Qty) {
        this.name = name;
        this.Qty = Qty;
    }


    //Getters
    public int getQty() {
        return Qty;
    }

    public String getName() {
        return name;
    }

    public String getDosage() {
        return Dosage;
    }

    //Setters
    public int setQty() {
        return Qty;
    }

    public String setName()  {
        return name;
    }

    public String setDosage() {
        return Dosage;
    }



}


